package de.staatsbibliothek.berlin.hsp.messaging.activitystreams.api.model.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * @author konrad.eichstaedt@sbb.spk-berlin.de on 04.06.2020.
 * @version 1.0
 */
public class ActivityStreamsDokumentTypTest {

  @Test
  void testCreation() {

    ActivityStreamsDokumentTyp typ = ActivityStreamsDokumentTyp.BESCHREIBUNG;

    assertNotNull(typ);
  }

  @Test
  void testValueFrom() {
    String type = "KOD";
    String typeSmall = "kod";
    String typeFailure = "asasd";

    assertEquals(ActivityStreamsDokumentTyp.KOD, ActivityStreamsDokumentTyp.valueFrom(type));
    assertEquals(ActivityStreamsDokumentTyp.KOD, ActivityStreamsDokumentTyp.valueFrom(typeSmall));
    assertNull(ActivityStreamsDokumentTyp.valueFrom(typeFailure));
  }

  @Test
  void testToString() {

    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.KOD;

    assertEquals("KOD", activityStreamsDokumentTyp.toString());
  }

  @Test
  void testCountValues() {
    assertEquals(8, ActivityStreamsDokumentTyp.values().length);
  }

  @Test
  void testCheckForBeziehung() {
    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.BEZIEHUNG;

    assertEquals("BEZIEHUNG", activityStreamsDokumentTyp.toString());
  }

  @Test
  void testCheckForDigitalisat() {
    ActivityStreamsDokumentTyp activityStreamsDokumentTyp = ActivityStreamsDokumentTyp.DIGITALISAT;

    assertEquals("DIGITALISAT", activityStreamsDokumentTyp.toString());
  }
}
