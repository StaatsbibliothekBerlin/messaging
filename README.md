# Handschriftenportal Messaging API
<sub><sub>Maintainer: IDM 2.2</sub></sub>  
<br/>
<br/>
**Inhalt:**  
[1. Einführung und Ziele ](#1-einf%C3%BChrung-und-ziele)<br/>
[1.1 Aufgabenstellung](#11-aufgabenstellung)<br/>
[1.2 Qualitätsziele ](#12-qualit%C3%A4tsziele)<br/>
[1.3 Projektbeteiligte ](#13-projektbeteiligte-stakeholder)        
[2. Randbedingungen ](#2-randbedingungen)<br/>
[3. Kontextabgrenzung](#3-kontextabgrenzung)<br/>
[4. Lösungsstrategie](#4-l%C3%B6sungsstrategie)<br/>
[5. Baustein](#5-bausteinsicht)<br/>
[6. Laufzeitsicht](#6-laufzeitsicht)<br/>
[7. Verteilungssicht](#7-verteilungssicht)<br/>
[8. Betrieb und Wiederherstellung](#8-betrieb-und-wiederherstellung)<br/>
[8.1 Ansprechpartner , Service Level](#81-ansprechpartner-service-level)<br/>
[8.2 Installation / Konfiguration](#82-installation-konfiguration)<br/>
[9. Entwurfsentscheidungen](#9-entwurfsentscheidungen)<br/>
[10. Qualitätsziele](#10-qualit%C3%A4tsziele)<br/>
[11. Risiken und technische Schulden](#11-risiken-und-technische-schulden)<br/>
[12. Glossar](#12-glossar)<br/>
[13. Release Notes](#13-release-notes)<br/>

# 1. Einführung und Ziele #

Zielstellung dieses Projektes ist es, die Kommunikation zwischen allen Softwarekomponenten im Handschriftenportalprojekt zu vereinheitlichen. Dazu wird eine Apache Message entsprechende dem 
W3C Schema [Activity Stream W3C Standard](https://www.w3.org/TR/activitystreams-core/) aufgebaut. Diese Java Bibliothek muss von jeder Softwarekomponente im Projekt verwendet werden, sobald eine
Message basierte Kommunikation mit einer anderen Softwarekomponente notwendig ist. Die fachlichen Inhalte werden auf Basis einer TEI XML strukturiert. 

Die Vereinheitlichung einer Message hat zum Ziel, die Kommunikation zwischen den einzelnen Modulen zu stabilisieren und den Wartungsaufwand langfristig zu minimieren. 
Zusätzlich soll gewährleistet werden, dass auch ältere Messages durch Softwarekomponenten, welcher bereits mit einer neueren Version dieser Bibliothek arbeiten, weiterhin verarbeitet werden können. 
  
## 1.1 Aufgabenstellung ##

Implementierung des W3C Activity Stream Standard und einer entsprechenden API. Jede Softwarekomponente soll mit Hilfe dieser API folgende Aufgaben umsetzen können: 

<ul>
<li>Erstellen einer Message</li>
<li>Auslesen einer Message für die weitere Datenverarbeitung</li>
<li>Hinzufügen von Daten zu einer Message</li>
</ul> 

## 1.2 Qualitätsziele ##

Das wichtigste Qualitätsziel ist die Gewährleistung der Abwärtskompatibilität für die erstellten Messages. 
   
## 1.3 Projektbeteiligte (Stakeholder) ##

Projektbeteiligte sind primär die Entwicklungsteams des Handschriftenportals. Dies sind für den Erfassungsbereich des Team der Staatsbibliothek aus dem Bereich IDM 2.2 und 
für den Präsentationsbereich des Team der Universitätsbibliothek Leipzig. Weitere Stakeholder des Projektes können weitere Entwicklunsgteams der Staatsbibliothek sein, welche ebenfalls die Kommunikations via Kafka und ActvityStream durchführen wollen.
  
# 2. Randbedingungen 
# 3. Kontextabgrenzung
Sicht aus der Vogelperspektive. Zeigt das System als Blackbox und den Zusammenhang zu Nachbarsystemen. 
# 4. Lösungsstrategie

Das Projekt ist als Java Maven Multimodule strukturiert. Es besteht aus folgenden Modulen: 

   *  activitystreams-hsp
   *  tei-jaxb 
 
 Das Modul activitystreams-hsp bietet eine Java API zur Erstellung einer Activity Stream Message. 
 Das Modul tei-jaxb bietet eine Java API zur Serialisierung und Deserialisierung von TEI XML Dokumenten. Diese Dokumente stellen den fachlichen Inhalt einer jeden 
 Message dar und müssen durch die jeweiligen Softwarekomponenten ausgelesen werden können. 
 
Diese beiden Module zusammen ermöglichen einem Entwickler das Erstellen einer Activity Stream Message mit entsprechendem TEI XML Content.   
# 5. Bausteinsicht
Statische Zerlegung des Systems in Bausteine.  
# 6. Laufzeitsicht

Die nachfolgende Tabelle gibt eine Übersicht über die Kommunikationsvereinbarung auf Basis des ActivityStreamAction und ActivityStreamsDokumentTyp. Jede Message enthält ein vollständiges und 
konsistente Message mit entsprechenden TEI XML Dokumenten welche zu einem KulturObjektDokument gehören. 

Alle fachlichen Objekte werden durch ActivityStreamsDokumentTyp innerhalb einer Message typisiert. Jede Activity Stream Message 
kann dazu mehrere Activity Stream Objects enthalten, welche nachfolgende fachlich typisiert werden müssen. 
Aktuell gibt es folgende Typen: 

* **KOD**: Activity Stream Object enthält ein TEI XML Dokument für ein KulturObjektDokument. 
* **BESCHREIBUNG**: Activity Stream Object enthält ein TEI XML Dokument für eine Beschreibung. 
* **ORT**: Activity Stream Object enthält ein TEI XML Dokument für einen Datenimport normierter Ortsangaben. Jeder Ort ist als ein place Element beschrieben. 
* **KOERPERSCHAFT**: Activity Stream Object enthält ein TEI XML Dokument für einen Datenimport normierter Körperschaftsangaben. Jede Körperschaft ist als ein org Element beschrieben
* **IMPORT**: Activity Stream Object enthält ein JSON Dokument eines Importvorgangs. Ein Importvorgang stellt einen technischen Prozess dar und lässt sich nicht im TEI Format abbilden. 
* **BEZIEHUNG**: Activity Stream Object enthält ein TEI XML Dokument für einen Datenimport normierter Beziehungsangaben. Jede Beziehung ist als ein relation Element beschrieben.
* **DIGITALISAT**: Activity Stream Object enthält ein TEI XML Dokument für einen Datenimport normierte Digitalisatsangabe. Jedes Digitalisat ist als ein surrogate Element beschrieben.
* **SPRACHE**: Activity Stream Object enthält ein TEI XML Dokument für einen Datenimport normierte Sprachangabe.

Um die Bearbeitung der fachlichen Daten steuern zu können werden folgende ActivityStreamActions definiert: 

* **ADD**: Hinzufügen einer fachlichen Entität. Ist diese bereits vorhanden soll die Message ignoriert werden. 
* **UPDATE**: Aktualisieren einer fachlichen Entität. Alle Daten einer Entität sollen aktualisiert werden. 
* **REMOVE**: Löschen einer fachlichen Entität. Alle Daten einer Entität sollen aus der dazugehörigen Softwarekomponente entfernt werden.  

# 7. Verteilungssicht
Auf welchen Systemen laufen die Systemkomponenten. 
# 8. Betrieb und Wiederherstellung #

Das Projekt bietet die folgenden Maven-Artefakte für die Gruppe **staatsbibliothek-berlin.hsp**:

* **activitystreams-hsp** - API Classen  und TEI basierte Implementierung 

* **tei-jaxb** - JAXB bindings für TEI XSD Schema
    
Die konnten als Maven Abhängigkeiten in anderen Projekten verwendet werden:

```xml
    <dependency>
      <groupId>de.staatsbibliothek-berlin.hsp</groupId>
      <artifactId>activitystreams-hsp</artifactId>
      <version>RELEASE</version>
    </dependency>
    
    <dependency>
      <groupId>de.staatsbibliothek-berlin.hsp</groupId>
      <artifactId>tei-jaxb</artifactId>
      <version>RELEASE</version>
    </dependency>
```
    

Beispiel Verwendung von ActivityStream mit TEI content:

```java
    ActivityStreamObject activityStreamObject = ActivityStreamObject.builder()
            .withCompressed(compressed)
            .withContent("Test")
            .withType(ActivityStreamsDokumentTyp.KOD)
            .withUrl("http://localhost")
            .withId("1")
            .withGroupId("beschreibung1")
            .withMediaType("text/xml")
            .build();
    
        ActivityStream message = ActivityStream
            .builder()
            .withId(UUID.randomUUID().toString())
            .withType(ActivityStreamAction.ADD)
            .withPublished(LocalDateTime.now())
            .withActorName("Konrad Eichstädt")
            .addObject(activityStreamObject)
            .build();
```
        
                
Unmarshal TEI-XML zu JAXB Klassen:

```java
Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    List<TEI> tei = TEIObjectFactory.unmarshal(newInputStream(teiFilePath));
```        
        
        
Marshal JAXB Klassen zu TEI-XML:
        
```java
void testMarshal() throws IOException, JAXBException {
    Path teiFilePath = Paths.get("src", "test", "resources", "tei", "tei-msDesc_Westphal.xml");
    TEI tei = (TEI) TEIObjectFactory.unmarshal(newInputStream(teiFilePath));

    String teiAsXML = TEIObjectFactory.marshal(tei);
}
``` 
              
  

## 8.1 Ansprechpartner , Service Level
Verwantwortlich für die Pflege ist IDM 2.2.  
## 8.2 Installation / Konfiguration ##

Das Modul benötigt *Java* Version 11 als Laufzeitumgebung. Buildprozess verwendet *Maven* Version 3.6.3

Zum Kompilieren des Moduls den folgenden Befehl:
```
mvn clean package -Pintegration
```

Wenn man Java und Maven nicht direkt nutzen möchten, kann alternativ Docker verwendet werden. Um den Build-Prozess innerhalb eines Docker-Containers vornehmen zu lassen, kann aus dem Ordner des Projektes heraus mit folgendem Befehl ein entsprechendes Docker-Image erstellt werden:
```
docker build -t hsp-messaging .
```
Für die resultierenden JAR-Pakete wird ein Zielordner benötigt, der im folgenden Beispiel /home/userx/target (Posix) bzw. F:\foobar\target (MS Windows) sein soll. Der Docker-Container, in dem der build stattfindet, lässt sich dann mit folgendem Befehl starten:

```
docker run -v /home/userx/target:/target:Z --name hsp-messaging-1 hsp-messaging:latest
```
bzw. für Windows:
```
docker run -v /f/foobar/target:/target --name hsp-messaging-1 hsp-messaging:latest
```
Danach sind die erstellten Jar-Pakete im Zielordner zu finden.

## 8.3 Wiederherstellung ##
# 9. Entwurfsentscheidungen
# 10. Qualitätsziele
* Keine ausgewiesen Bugs 
* Entfernung aller Sicherheitskritischer Bibliotheken mit hoher Prioritätsstufe. 
# 11. Risiken und technische Schulden
# 12. Glossar
Fachliches Glossar. 
# 13. Entwickler Informationen
Um Projektversion anzupassen, benutze versions:set aus der **versions-maven** plugin:
```
mvn versions:set -DnewVersion=1.0.9-SNAPSHOT -DgenerateBackupPoms=false
```

Es werden alle POM-Versionen, parent Versionen und Abhängigkeitsversionen im multi-module Projekt angepasst.
 
# 14. Release Notes
| Komponente|letzte Änderung|Version|Bemerkung|
|----------|:-------------:|------:|------:|
| hsp-messaging |04.06.2020|1.1.1|Add XMLFormat Enum, Remove all Generics|
| hsp-messaging |05.06.2020|1.1.2|Add Version for ActivityStreamMessage|
| hsp-messaging |15.06.2020|1.1.5|Adjust JSON Typing for JSON Message Serialisation|
| hsp-messaging |16.09.2020|1.1.14|Add ActivityStreamsDokumentTyp BEZIEHUNG for normdaten relation|
| hsp-messaging |23.11.2020|1.1.16|Add ActivityStreamsDokumentTyp DIGITALISAT AND SPRACHE|
