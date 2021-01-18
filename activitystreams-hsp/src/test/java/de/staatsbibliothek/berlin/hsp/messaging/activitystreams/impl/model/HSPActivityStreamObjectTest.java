package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.exceptions.ActivityStreamsException;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObject;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamObjectTagId;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamsDokumentTyp;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 29.05.2020.
 * @version 1.0
 */
public class HSPActivityStreamObjectTest {

  @Test
  void testCreation() throws ActivityStreamsException {

    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
        .withCompressed(true)
        .withType(ActivityStreamsDokumentTyp.KOD)
        .withUrl("http://localhost")
        .withId("1")
        .withMediaType("text/xml")
        .withGroupId("beschreibung1")
        .withContent("Test".getBytes())
        .withTag(List.of(new HSPActivityStreamObjectTag("type1", ActivityStreamObjectTagId.DEACTIVATE_HSP_FORMAT_VALIDATION, "name1"), new HSPActivityStreamObjectTag("type2", ActivityStreamObjectTagId.INTERN_EXTERN, "name2")))
        .build();

    assertEquals("1", activityStreamObject.getId());

    assertEquals("beschreibung1", activityStreamObject.getGroupId());

    assertEquals(ActivityStreamsDokumentTyp.KOD, activityStreamObject.getType());

    assertEquals("text/xml", activityStreamObject.getMediaType());

    StringBuilder tagContent = new StringBuilder();

    activityStreamObject.getTag().forEach(hspActivityStreamObjectTag -> {
      tagContent.append(hspActivityStreamObjectTag.toString());
      tagContent.append("  ");
    });

    String expectedString = "HSPActivityStreamObjectTag{type='type1', id='DEACTIVATE_HSP_FORMAT_VALIDATION', name='name1'}  HSPActivityStreamObjectTag{type='type2', id='INTERN_EXTERN', name='name2'}  ";
    String actualString = tagContent.toString();
    assertEquals(expectedString, actualString);

    assertEquals(true, activityStreamObject.isCompressed());

  }
}
