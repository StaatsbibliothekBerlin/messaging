/*
 * MIT License
 *
 * Copyright (c) 2020 Staatsbibliothek zu Berlin - Preußischer Kulturbesitz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.4.0-SNAPSHOT generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.03.03 um 05:11:39 PM CET 
//


package org.tei_c.ns._1;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * &lt;p&gt;Java-Klasse für anonymous complex type.
 *
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 *
 * &lt;pre&gt; &amp;lt;complexType&amp;gt; &amp;lt;complexContent&amp;gt; &amp;lt;restriction
 * base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt; &amp;lt;sequence&amp;gt; &amp;lt;element
 * ref="{http://www.tei-c.org/ns/1.0}teiHeader"/&amp;gt; &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.resourceLike"
 * maxOccurs="unbounded"/&amp;gt; &amp;lt;/sequence&amp;gt; &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.typed.attributes"/&amp;gt;
 * &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&amp;gt; &amp;lt;attribute
 * name="version"&amp;gt; &amp;lt;simpleType&amp;gt; &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&amp;gt;
 * &amp;lt;pattern value="[\d]+(\.[\d]+){0,2}"/&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/simpleType&amp;gt;
 * &amp;lt;/attribute&amp;gt; &amp;lt;/restriction&amp;gt; &amp;lt;/complexContent&amp;gt; &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "teiHeader",
    "fsdDeclsAndTextsAndFacsimiles"
})
@XmlRootElement(name = "TEI")
public class TEI {

  @XmlElement(required = true)
  protected TeiHeader teiHeader;
  @XmlElements({
      @XmlElement(name = "fsdDecl", type = FsdDecl.class),
      @XmlElement(name = "text", type = Text.class),
      @XmlElement(name = "facsimile", type = Facsimile.class),
      @XmlElement(name = "sourceDoc", type = SourceDoc.class)
  })
  protected List<java.lang.Object> fsdDeclsAndTextsAndFacsimiles;
  @XmlAttribute(name = "version")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected java.lang.String version;
  @XmlAttribute(name = "subtype")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected java.lang.String subtype;
  @XmlAttribute(name = "type")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected java.lang.String type;
  @XmlAttribute(name = "rend")
  protected List<java.lang.String> rends;
  @XmlAttribute(name = "rendition")
  protected List<java.lang.String> renditions;
  @XmlAttribute(name = "style")
  protected java.lang.String style;
  @XmlAttribute(name = "facs")
  protected List<java.lang.String> facs;
  @XmlAttribute(name = "next")
  @XmlSchemaType(name = "anyURI")
  protected java.lang.String next;
  @XmlAttribute(name = "synch")
  protected List<java.lang.String> synches;
  @XmlAttribute(name = "prev")
  @XmlSchemaType(name = "anyURI")
  protected java.lang.String prev;
  @XmlAttribute(name = "exclude")
  protected List<java.lang.String> excludes;
  @XmlAttribute(name = "sameAs")
  @XmlSchemaType(name = "anyURI")
  protected java.lang.String sameAs;
  @XmlAttribute(name = "copyOf")
  @XmlSchemaType(name = "anyURI")
  protected java.lang.String copyOf;
  @XmlAttribute(name = "corresp")
  protected List<java.lang.String> corresps;
  @XmlAttribute(name = "select")
  protected List<java.lang.String> selects;
  @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
  @XmlSchemaType(name = "anyURI")
  protected java.lang.String base;
  @XmlAttribute(name = "ana")
  protected List<java.lang.String> anas;
  @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlID
  @XmlSchemaType(name = "ID")
  protected java.lang.String id;
  @XmlAttribute(name = "change")
  protected List<java.lang.String> changes;
  @XmlAttribute(name = "resp")
  protected List<java.lang.String> resps;
  @XmlAttribute(name = "cert")
  protected java.lang.String cert;
  @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
  protected java.lang.String lang;
  @XmlAttribute(name = "source")
  protected List<java.lang.String> sources;
  @XmlAttribute(name = "n")
  protected java.lang.String n;
  @XmlAttribute(name = "space", namespace = "http://www.w3.org/XML/1998/namespace")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected java.lang.String space;

  /**
   * Ruft den Wert der teiHeader-Eigenschaft ab.
   *
   * @return possible object is {@link TeiHeader }
   */
  public TeiHeader getTeiHeader() {
    return teiHeader;
  }

  /**
   * Legt den Wert der teiHeader-Eigenschaft fest.
   *
   * @param value allowed object is {@link TeiHeader }
   */
  public void setTeiHeader(TeiHeader value) {
    this.teiHeader = value;
  }

  /**
   * Gets the value of the fsdDeclsAndTextsAndFacsimiles property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the fsdDeclsAndTextsAndFacsimiles property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getFsdDeclsAndTextsAndFacsimiles().add(newItem);
   * &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link FsdDecl } {@link Text } {@link Facsimile
   * } {@link SourceDoc }
   */
  public List<java.lang.Object> getFsdDeclsAndTextsAndFacsimiles() {
    if (fsdDeclsAndTextsAndFacsimiles == null) {
      fsdDeclsAndTextsAndFacsimiles = new ArrayList<java.lang.Object>();
    }
    return this.fsdDeclsAndTextsAndFacsimiles;
  }

  /**
   * Ruft den Wert der version-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Legt den Wert der version-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setVersion(java.lang.String value) {
    this.version = value;
  }

  /**
   * Ruft den Wert der subtype-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getSubtype() {
    return subtype;
  }

  /**
   * Legt den Wert der subtype-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setSubtype(java.lang.String value) {
    this.subtype = value;
  }

  /**
   * Ruft den Wert der type-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Legt den Wert der type-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setType(java.lang.String value) {
    this.type = value;
  }

  /**
   * Gets the value of the rends property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the rends property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getRends().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getRends() {
    if (rends == null) {
      rends = new ArrayList<java.lang.String>();
    }
    return this.rends;
  }

  /**
   * Gets the value of the renditions property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the renditions property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getRenditions().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getRenditions() {
    if (renditions == null) {
      renditions = new ArrayList<java.lang.String>();
    }
    return this.renditions;
  }

  /**
   * Ruft den Wert der style-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getStyle() {
    return style;
  }

  /**
   * Legt den Wert der style-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setStyle(java.lang.String value) {
    this.style = value;
  }

  /**
   * Gets the value of the facs property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the facs property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getFacs().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getFacs() {
    if (facs == null) {
      facs = new ArrayList<java.lang.String>();
    }
    return this.facs;
  }

  /**
   * Ruft den Wert der next-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getNext() {
    return next;
  }

  /**
   * Legt den Wert der next-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setNext(java.lang.String value) {
    this.next = value;
  }

  /**
   * Gets the value of the synches property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the synches property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getSynches().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getSynches() {
    if (synches == null) {
      synches = new ArrayList<java.lang.String>();
    }
    return this.synches;
  }

  /**
   * Ruft den Wert der prev-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getPrev() {
    return prev;
  }

  /**
   * Legt den Wert der prev-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setPrev(java.lang.String value) {
    this.prev = value;
  }

  /**
   * Gets the value of the excludes property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the excludes property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getExcludes().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getExcludes() {
    if (excludes == null) {
      excludes = new ArrayList<java.lang.String>();
    }
    return this.excludes;
  }

  /**
   * Ruft den Wert der sameAs-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getSameAs() {
    return sameAs;
  }

  /**
   * Legt den Wert der sameAs-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setSameAs(java.lang.String value) {
    this.sameAs = value;
  }

  /**
   * Ruft den Wert der copyOf-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getCopyOf() {
    return copyOf;
  }

  /**
   * Legt den Wert der copyOf-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setCopyOf(java.lang.String value) {
    this.copyOf = value;
  }

  /**
   * Gets the value of the corresps property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the corresps property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getCorresps().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getCorresps() {
    if (corresps == null) {
      corresps = new ArrayList<java.lang.String>();
    }
    return this.corresps;
  }

  /**
   * Gets the value of the selects property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the selects property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getSelects().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getSelects() {
    if (selects == null) {
      selects = new ArrayList<java.lang.String>();
    }
    return this.selects;
  }

  /**
   * Ruft den Wert der base-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getBase() {
    return base;
  }

  /**
   * Legt den Wert der base-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setBase(java.lang.String value) {
    this.base = value;
  }

  /**
   * Gets the value of the anas property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the anas property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getAnas().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getAnas() {
    if (anas == null) {
      anas = new ArrayList<java.lang.String>();
    }
    return this.anas;
  }

  /**
   * Ruft den Wert der id-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Legt den Wert der id-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setId(java.lang.String value) {
    this.id = value;
  }

  /**
   * Gets the value of the changes property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the changes property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getChanges().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getChanges() {
    if (changes == null) {
      changes = new ArrayList<java.lang.String>();
    }
    return this.changes;
  }

  /**
   * Gets the value of the resps property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the resps property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getResps().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getResps() {
    if (resps == null) {
      resps = new ArrayList<java.lang.String>();
    }
    return this.resps;
  }

  /**
   * Ruft den Wert der cert-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getCert() {
    return cert;
  }

  /**
   * Legt den Wert der cert-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setCert(java.lang.String value) {
    this.cert = value;
  }

  /**
   * Ruft den Wert der lang-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getLang() {
    return lang;
  }

  /**
   * Legt den Wert der lang-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setLang(java.lang.String value) {
    this.lang = value;
  }

  /**
   * Gets the value of the sources property.
   *
   * &lt;p&gt; This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you
   * make to the returned list will be present inside the JAXB object. This is why there is not a
   * &lt;CODE&gt;set&lt;/CODE&gt; method for the sources property.
   *
   * &lt;p&gt; For example, to add a new item, do as follows: &lt;pre&gt; getSources().add(newItem); &lt;/pre&gt;
   *
   *
   * &lt;p&gt; Objects of the following type(s) are allowed in the list {@link java.lang.String }
   */
  public List<java.lang.String> getSources() {
    if (sources == null) {
      sources = new ArrayList<java.lang.String>();
    }
    return this.sources;
  }

  /**
   * Ruft den Wert der n-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getN() {
    return n;
  }

  /**
   * Legt den Wert der n-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setN(java.lang.String value) {
    this.n = value;
  }

  /**
   * Ruft den Wert der space-Eigenschaft ab.
   *
   * @return possible object is {@link java.lang.String }
   */
  public java.lang.String getSpace() {
    return space;
  }

  /**
   * Legt den Wert der space-Eigenschaft fest.
   *
   * @param value allowed object is {@link java.lang.String }
   */
  public void setSpace(java.lang.String value) {
    this.space = value;
  }

  @Override
  public java.lang.String toString() {
    return new StringJoiner(", ", TEI.class.getSimpleName() + "[", "]")
        .add("teiHeader=" + teiHeader)
        .add("fsdDeclsAndTextsAndFacsimiles=" + fsdDeclsAndTextsAndFacsimiles)
        .add("version='" + version + "'")
        .add("subtype='" + subtype + "'")
        .add("type='" + type + "'")
        .add("rends=" + rends)
        .add("renditions=" + renditions)
        .add("style='" + style + "'")
        .add("facs=" + facs)
        .add("next='" + next + "'")
        .add("synches=" + synches)
        .add("prev='" + prev + "'")
        .add("excludes=" + excludes)
        .add("sameAs='" + sameAs + "'")
        .add("copyOf='" + copyOf + "'")
        .add("corresps=" + corresps)
        .add("selects=" + selects)
        .add("base='" + base + "'")
        .add("anas=" + anas)
        .add("id='" + id + "'")
        .add("changes=" + changes)
        .add("resps=" + resps)
        .add("cert='" + cert + "'")
        .add("lang='" + lang + "'")
        .add("sources=" + sources)
        .add("n='" + n + "'")
        .add("space='" + space + "'")
        .toString();
  }
}
