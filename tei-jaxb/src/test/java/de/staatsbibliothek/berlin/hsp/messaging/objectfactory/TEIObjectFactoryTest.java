package de.staatsbibliothek.berlin.hsp.messaging.objectfactory;

import static java.nio.file.Files.newInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.bind.JAXBException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.tei_c.ns._1.TEI;
import org.tei_c.ns._1.Title;

/**
 * @author pc
 * @since 31.03.20
 */
class TEIObjectFactoryTest {

  @Test
  void testUnmarshal() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> allTei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(1, allTei.size());
    TEI tei = allTei.get(0);
    List<Title> titles = tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles();
    assertEquals(1, titles.size());
    String title = titles.get(0).getContent().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" ", "", ""));
    assertNotNull(title);
    assertFalse(title.isEmpty());
  }

  @Test
  void testUnmarshalTEI() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> tei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));

    Assertions.assertTrue(tei.size() == 1);

    List<Title> titles = tei.get(0).getTeiHeader().getFileDesc().getTitleStmt().getTitles();
    assertEquals(1, titles.size());
    String title = titles.get(0).getContent().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" ", "", ""));
    assertNotNull(title);
    assertEquals(
        "Beschreibung von Cod. Guelf. 36.23 Aug. 2° (Die illuminierten Handschriften der Herzog August Bibliothek. Teil 1: 6. bis 12. Jahrhundert, beschrieben von Stefanie Westphal (in Bearbeitung))",
        title);


  }

  @Test
  void testUnmarshalCorpus() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "Berlin_test.xml");
    List<TEI> allTei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(12, allTei.size());
    TEI tei = allTei.get(0);
    List<Title> titles = tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles();
    assertEquals(1, titles.size());
    String title = titles.get(0).getContent().stream()
        .map(String::valueOf)
        .collect(Collectors.joining(" ", "", ""));
    assertNotNull(title);
    assertFalse(title.isEmpty());
  }

  @Test
  void testMarshal() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> allTei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
    assertNotNull(allTei);
    assertEquals(1, allTei.size());
    TEI tei = allTei.get(0);
    assertEquals(1, tei.getTeiHeader().getFileDesc().getTitleStmt().getTitles().size());

    String teiAsXML = TEIObjectFactory.marshal(tei);
    assertNotNull(teiAsXML);
    assertTrue(teiAsXML.startsWith("<?xml version=\"1.0\""));
  }

  @Test
  void testUnmarshalMarshal() throws IOException, JAXBException {

    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal_Equals.xml");

    assertEquals(Files.readString(teiFilePath, StandardCharsets.UTF_8).replaceAll("\\s+", ""),
        TEIObjectFactory.marshal(TEIObjectFactory.unmarshal(newInputStream(teiFilePath)).get(0))
            .replaceAll("\\s+", ""));
  }
}
