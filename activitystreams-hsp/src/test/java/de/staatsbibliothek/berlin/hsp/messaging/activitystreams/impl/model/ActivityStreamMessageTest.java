package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model;

import static de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.ActivityStreamMessage.ActivityStreamVersion;
import static java.nio.file.Files.newInputStream;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStream;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamBuilder;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamAction;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamObjectTagId;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamsDokumentTyp;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.mapper.ObjectMapperFactory;
import de.staatsbibliothek.berlin.hsp.messaging.objectfactory.TEIObjectFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tei_c.ns._1.TEI;

/**
 * @author piotr.czarnecki@sbb.spk-berlin.de
 * @since 01.04.20
 */
class ActivityStreamMessageTest {

  private static final Logger log = LoggerFactory.getLogger(ActivityStreamMessageTest.class);

  @ParameterizedTest
  @ValueSource(booleans = {true, false})
  public void testSendTEI(boolean compressed) throws IOException, JAXBException, ActivityStreamsException {
    Path teiFilePath = Paths.get("../tei-jaxb/src", "test", "resources", "tei", "tei-msDesc.xml");
    List<TEI> allTei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(1, allTei.size());
    TEI tei = allTei.get(0);
    String allTitels = tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles()
        .stream()
        .map(t -> String.valueOf(t.getContent().get(0)))
        .collect(Collectors.joining(", ", "{", "}"));
    log.info("Titel: {}", allTitels);

    final String uuid = UUID.randomUUID().toString();
    LocalDateTime published = LocalDateTime.now();
    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(compressed)
        .withContent(tei)
        .withType(ActivityStreamsDokumentTyp.KOD)
        .withUrl("http://localhost")
        .withId("1")
        .withGroupId("beschreibung1")
        .build();

    final ActivityStreamBuilder activityStreamBuilder = ActivityStream.builder()
        .withId(uuid)
        .withType(ActivityStreamAction.ADD)
        .addObject(activityStreamObject)
        .withPublished(published)
        .withActorName("Piotr Czarnecki")
        .withTargetName("tei-msDesc_Westphal.xml");

    final ActivityStream message = activityStreamBuilder.build();
    final Optional<String> messageString = serialize(message);
    assertTrue(messageString.isPresent());
    String json = messageString.get();
    log.info("JSON Length= {}", json.length());
    log.info(json);
    final ActivityStreamMessage stream = ObjectMapperFactory.getObjectMapper()
        .readValue(json, ActivityStreamMessage.class);
    final ActivityStreamsDokumentTyp type = stream.getObjects().get(0).getType();
    assertSame(ActivityStreamsDokumentTyp.KOD, type);

    assertFalse(stream.getObjects().isEmpty());

    final List<TEI> kodObj = TEIObjectFactory
        .unmarshal(new ByteArrayInputStream(stream.getObjects().get(0).getContent()));

    assertEquals(kodObj.get(0).getTeiHeader().getFileDesc().getTitleStmt().getTitles().size(),
        tei.getTeiHeader().getFileDesc()
            .getTitleStmt().getTitles().size());

    assertEquals(published, stream.getPublished());

    log.info("Generated TEI Document length= {}", TEIObjectFactory.marshal(kodObj.get(0)).length());
  }

  @Test
  public void deserializeKafkaMesssage() throws IOException, ActivityStreamsException, JAXBException {
    Path kafkaTestMessagePath = Paths.get("src", "test", "resources", "kafka-tei-activity.json");
    String messageStr = Files.readString(kafkaTestMessagePath);
    final ActivityStream stream = ObjectMapperFactory.getObjectMapper()
        .readValue(messageStr, new TypeReference<>() {
        });
    assertNotNull(stream);
    List<ActivityStreamObject> objects = stream.getObjects();
    for (ActivityStreamObject object : objects) {
      List<TEI> content = TEIObjectFactory
          .unmarshal(new ByteArrayInputStream(object.getContent()));
      assertNotNull(content.get(0));
    }

    ActivityStreamMessage activityStreamMessage = ObjectMapperFactory.getObjectMapper()
        .readValue(messageStr, ActivityStreamMessage.class);
    assertNotNull(activityStreamMessage);

    assertEquals(ActivityStreamVersion.V1_0.toString(), activityStreamMessage.getVersion());
  }

  private static Optional<String> serialize(final Object obj) {
    try {
      return of(ObjectMapperFactory.getObjectMapper().writeValueAsString(obj));
    } catch (final JsonProcessingException ex) {
      return empty();
    }
  }

  @ParameterizedTest
  @ValueSource(booleans = {true, false})
  void testCreateMessageWithStringContent(boolean compressed) throws ActivityStreamsException {

    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(compressed)
        .withContent("Test")
        .withType(ActivityStreamsDokumentTyp.KOD)
        .withUrl("http://localhost")
        .withId("1")
        .withGroupId("beschreibung1")
        .withMediaType("text/xml")
        .withTag(List.of(new HSPActivityStreamObjectTag("type1", ActivityStreamObjectTagId.INTERN_EXTERN, "name1"),new HSPActivityStreamObjectTag("type2", ActivityStreamObjectTagId.INTERN_EXTERN, "name2")))
        .build();

    ActivityStream message = ActivityStream
        .builder()
        .withId(UUID.randomUUID().toString())
        .withType(ActivityStreamAction.ADD)
        .withPublished(LocalDateTime.now())
        .withActorName("Konrad Eichstädt")
        .addObject(activityStreamObject)
        .build();

    assertNotNull(message.getId());

    assertEquals(ActivityStreamAction.ADD, message.getAction());

    message.addObject(activityStreamObject);

    assertEquals(activityStreamObject, message.getObjects().get(0));

    assertEquals("Test", new String(message.getObjects().get(0).getContent(), StandardCharsets.UTF_8));

    assertEquals("text/xml", message.getObjects().get(0).getMediaType());

    assertEquals(ActivityStreamVersion.V1_0.toString(), message.getVersion());
  }

  @ParameterizedTest
  @ValueSource(booleans = {true, false})
  void testCreateMessageWithByteContent(boolean compressed) throws ActivityStreamsException {

    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(compressed)
        .withType(ActivityStreamsDokumentTyp.KOD)
        .withUrl("http://localhost")
        .withId("1")
        .withGroupId("beschreibung1")
        .withContent("Test".getBytes())
        .withTag(List.of(new HSPActivityStreamObjectTag("type1", ActivityStreamObjectTagId.INTERN_EXTERN, "name1"),new HSPActivityStreamObjectTag("type2", ActivityStreamObjectTagId.INTERN_EXTERN, "name2")))
        .build();

    ActivityStream message = ActivityStream
        .builder()
        .withId(UUID.randomUUID().toString())
        .withType(ActivityStreamAction.ADD)
        .withPublished(LocalDateTime.now())
        .withActorName("Konrad Eichstädt")
        .addObject(activityStreamObject)
        .build();

    assertNotNull(message.getId());

    assertEquals(ActivityStreamAction.ADD, message.getAction());

    message.addObject(activityStreamObject);

    assertEquals(activityStreamObject, message.getObjects().get(0));

    assertEquals("Test", new String(message.getObjects().get(0).getContent(), StandardCharsets.UTF_8));

    assertEquals(ActivityStreamVersion.V1_0.toString(), message.getVersion());
  }

  @Test
  void testActionGet() throws ActivityStreamsException {

    ActivityStream message = ActivityStream
        .builder()
        .withId(UUID.randomUUID().toString()).build();

    assertNotNull(message);

    assertNull(message.getAction());

    message = ActivityStream
        .builder()
        .withId(UUID.randomUUID().toString()).withType(ActivityStreamAction.REMOVE).build();

    assertNotNull(message.getAction());

    assertEquals(ActivityStreamAction.REMOVE, message.getAction());
  }

  @Test
  void testActionSet() throws ActivityStreamsException {

    ActivityStream message = ActivityStream
        .builder()
        .withId(UUID.randomUUID().toString()).build();

    message.setAction(null);

    assertNull(message.getAction());
  }

  @Test
  void testBuildWithoutType() throws ActivityStreamsException {

    assertThrows(NullPointerException.class, () -> ActivityStreamObject.builder()
        .withId(UUID.randomUUID().toString()).build());
  }

  @Test
  void testgetType() throws ActivityStreamsException {

    ActivityStreamObject object = ActivityStreamObject.builder()
        .withId(UUID.randomUUID().toString()).withType(ActivityStreamsDokumentTyp.KOD).build();
    assertNotNull(object.getType());
    assertEquals(ActivityStreamsDokumentTyp.KOD, object.getType());
  }

  @Test
  void testgetBeziehungsType() throws ActivityStreamsException {

    ActivityStreamObject object = ActivityStreamObject.builder()
        .withId(UUID.randomUUID().toString()).withType(ActivityStreamsDokumentTyp.BEZIEHUNG).build();
    assertNotNull(object.getType());
    assertEquals(ActivityStreamsDokumentTyp.BEZIEHUNG, object.getType());
  }
}
