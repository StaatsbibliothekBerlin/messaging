package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.impl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.ActivityStreamObjectTag;
import de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums.ActivityStreamObjectTagId;
import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 29.05.2020.
 * @version 1.0
 */
public class HSPActivityStreamObjectTagTest {

  @Test
  void testCreation() {

    ActivityStreamObjectTag activityStreamObjectTag = new HSPActivityStreamObjectTag("String",
        ActivityStreamObjectTagId.INTERN_EXTERN, "Inter extern Name");

    assertEquals("INTERN_EXTERN", activityStreamObjectTag.getId());

    assertEquals("String", activityStreamObjectTag.getType());

    assertEquals("Inter extern Name", activityStreamObjectTag.getName());


  }
}
