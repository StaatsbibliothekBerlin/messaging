package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 05.06.2020.
 * @version 1.0
 */
public class ActivityStreamActionTest {

  @Test
  void testToString() {

    ActivityStreamAction activityStreamAction = ActivityStreamAction.UPDATE;

    assertEquals("UPDATE", activityStreamAction.toString());
  }

  @Test
  void testValueFrom() {
    String action = "UPDATE";
    String actionSmall = "update";
    String actionFailure = "asasd";

    assertEquals(ActivityStreamAction.UPDATE, ActivityStreamAction.valueFrom(action));
    assertEquals(ActivityStreamAction.UPDATE, ActivityStreamAction.valueFrom(actionSmall));
    assertNull(ActivityStreamAction.valueFrom(actionFailure));

  }
}
