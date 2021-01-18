package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStream;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamAction;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamObjectTagId;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamsDokumentTyp;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.ActivityStreamMessage;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.HSPActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model.HSPActivityStreamObjectTag;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 28.05.2020.
 * @version 1.0
 */
public class ObjectMapperFactoryTest {

  @Test
  void testSerialization() throws ActivityStreamsException, JsonProcessingException {

    ActivityStream message = createActivityStreamMessage();

    ObjectMapper mapper = ObjectMapperFactory.getObjectMapper();

    String messagestring = mapper.writeValueAsString(message);

    Assertions.assertEquals(
        "{\"@type\":\"hspmessage\",\"@context\":null,\"id\":\"123\",\"action\":\"ADD\",\"version\":\"1.0\",\"published\":\"2020-05-20T00:00:00\",\"summary\":null,\"objects\":[{\"@type\":\"hspobject\",\"id\":\"1\",\"groupId\":\"beschreibung1\",\"name\":null,\"version\":null,\"compressed\":false,\"type\":\"KOD\",\"url\":\"http://localhost\",\"tag\":[{\"@type\":\"hspobjecttag\",\"type\":\"type1\",\"id\":\"DEACTIVATE_HSP_FORMAT_VALIDATION\",\"name\":\"name1\"},{\"@type\":\"hspobjecttag\",\"type\":\"type2\",\"id\":\"DEACTIVATE_HSP_FORMAT_VALIDATION\",\"name\":\"name2\"}],\"mediaType\":\"text/xml\",\"content\":\"VGVzdA==\"}],\"actor\":{\"@type\":\"hspactor\",\"type\":null,\"id\":null,\"name\":\"Konrad Eichstädt\",\"url\":null},\"target\":{\"@type\":\"hsptarget\",\"id\":\"123\",\"name\":null,\"type\":null}}",
        messagestring);
  }

  private ActivityStream createActivityStreamMessage() throws ActivityStreamsException {
    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(false)
        .withContent("Test")
        .withType(ActivityStreamsDokumentTyp.KOD)
        .withUrl("http://localhost")
        .withId("1")
        .withMediaType("text/xml")
        .withGroupId("beschreibung1")
        .withTag(List.of(new HSPActivityStreamObjectTag("type1", ActivityStreamObjectTagId.DEACTIVATE_HSP_FORMAT_VALIDATION, "name1"),new HSPActivityStreamObjectTag("type2", ActivityStreamObjectTagId.DEACTIVATE_HSP_FORMAT_VALIDATION, "name2")))
        .build();

    return ActivityStream
        .builder()
        .withId("123")
        .withType(ActivityStreamAction.ADD)
        .withPublished(LocalDateTime.of(2020, 5, 20, 0, 0, 0))
        .withActorName("Konrad Eichstädt")
        .addObject(activityStreamObject)
        .build();
  }

  @Test
  void testDeserializationWithMissingAttribute() throws JsonProcessingException {

    final String JSON = "{\"@type\":\"hspmessage\",\"@context\":null,\"id\":\"123\",\"action\":\"ADD\",\"version\":\"1.0\",\"published\":\"2020-05-20T00:00:00\",\"summary\":null,\"objects\":[{\"@type\":\"hspobject\",\"id\":\"1\",\"groupId\":\"beschreibung1\",\"name\":null,\"version\":null,\"compressed\":false,\"type\":\"KOD\",\"url\":\"http://localhost\",\"tag\":[{\"@type\":\"hspobjecttag\",\"type\":\"type1\",\"id\":\"DEACTIVATE_HSP_FORMAT_VALIDATION\",\"name\":\"name1\"},{\"@type\":\"hspobjecttag\",\"type\":\"type2\",\"id\":\"DEACTIVATE_HSP_FORMAT_VALIDATION\",\"name\":\"name2\"}],\"mediaType\":\"text/xml\",\"content\":\"VGVzdA==\"}],\"actor\":{\"@type\":\"hspactor\",\"type\":null,\"id\":null,\"name\":\"Konrad Eichstädt\",\"url\":null},\"target\":{\"@type\":\"hsptarget\",\"id\":\"123\",\"name\":null,\"type\":null}}";

    ObjectMapper mapper = ObjectMapperFactory.getObjectMapper();
    mapper.findAndRegisterModules();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    ActivityStream message = mapper.readValue(JSON, ActivityStreamMessage.class);

    Assertions.assertNotNull(message);
  }
}
