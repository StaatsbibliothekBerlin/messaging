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
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;choice minOccurs="0"&amp;gt;
 *           &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}locus"/&amp;gt;
 *           &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}locusGrp"/&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *         &amp;lt;choice&amp;gt;
 *           &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.pLike" maxOccurs="unbounded"/&amp;gt;
 *           &amp;lt;sequence&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}author" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}respStmt" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}title" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}rubric" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}incipit" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}msItemStruct" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}explicit" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}finalRubric" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}colophon" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}decoNote" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}listBibl" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *               &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}bibl"/&amp;gt;
 *               &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}biblStruct"/&amp;gt;
 *             &amp;lt;/choice&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}filiation" minOccurs="0"/&amp;gt;
 *             &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.noteLike" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *             &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}textLang" minOccurs="0"/&amp;gt;
 *           &amp;lt;/sequence&amp;gt;
 *         &amp;lt;/choice&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.msClass.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.msExcerpt.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locusGrp",
    "locus",
    "authors",
    "respStmts",
    "titles",
    "rubric",
    "incipit",
    "msItemStructs",
    "explicit",
    "finalRubric",
    "colophons",
    "decoNotes",
    "listBibls",
    "biblsAndBiblStructs",
    "filiation",
    "notes",
    "textLang",
    "psAndAbs"
})
@XmlRootElement(name = "msItemStruct")
public class MsItemStruct {

    protected LocusGrp locusGrp;
    protected Locus locus;
    @XmlElement(name = "author")
    protected List<Author> authors;
    @XmlElement(name = "respStmt")
    protected List<RespStmt> respStmts;
    @XmlElement(name = "title")
    protected List<Title> titles;
    protected Rubric rubric;
    protected Incipit incipit;
    @XmlElement(name = "msItemStruct")
    protected List<MsItemStruct> msItemStructs;
    protected Explicit explicit;
    protected FinalRubric finalRubric;
    @XmlElement(name = "colophon")
    protected List<Colophon> colophons;
    @XmlElement(name = "decoNote")
    protected List<DecoNote> decoNotes;
    @XmlElement(name = "listBibl")
    protected List<ListBibl> listBibls;
    @XmlElements({
        @XmlElement(name = "bibl", type = Bibl.class),
        @XmlElement(name = "biblStruct", type = BiblStruct.class)
    })
    protected List<java.lang.Object> biblsAndBiblStructs;
    protected Filiation filiation;
    @XmlElement(name = "note")
    protected List<Note> notes;
    protected TextLang textLang;
    @XmlElements({
        @XmlElement(name = "p", type = P.class),
        @XmlElement(name = "ab", type = Ab.class)
    })
    protected List<MacroParaContent> psAndAbs;
    @XmlAttribute(name = "class")
    protected List<java.lang.String> clazzs;
    @XmlAttribute(name = "defective")
    protected java.lang.String defective;
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
     * Ruft den Wert der locusGrp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LocusGrp }
     *     
     */
    public LocusGrp getLocusGrp() {
        return locusGrp;
    }

    /**
     * Legt den Wert der locusGrp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LocusGrp }
     *     
     */
    public void setLocusGrp(LocusGrp value) {
        this.locusGrp = value;
    }

    /**
     * Ruft den Wert der locus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Locus }
     *     
     */
    public Locus getLocus() {
        return locus;
    }

    /**
     * Legt den Wert der locus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Locus }
     *     
     */
    public void setLocus(Locus value) {
        this.locus = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the authors property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAuthors().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Author }
     * 
     * 
     */
    public List<Author> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<Author>();
        }
        return this.authors;
    }

    /**
     * Gets the value of the respStmts property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the respStmts property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRespStmts().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link RespStmt }
     * 
     * 
     */
    public List<RespStmt> getRespStmts() {
        if (respStmts == null) {
            respStmts = new ArrayList<RespStmt>();
        }
        return this.respStmts;
    }

    /**
     * Gets the value of the titles property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the titles property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getTitles().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * 
     * 
     */
    public List<Title> getTitles() {
        if (titles == null) {
            titles = new ArrayList<Title>();
        }
        return this.titles;
    }

    /**
     * Ruft den Wert der rubric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rubric }
     *     
     */
    public Rubric getRubric() {
        return rubric;
    }

    /**
     * Legt den Wert der rubric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rubric }
     *     
     */
    public void setRubric(Rubric value) {
        this.rubric = value;
    }

    /**
     * Ruft den Wert der incipit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Incipit }
     *     
     */
    public Incipit getIncipit() {
        return incipit;
    }

    /**
     * Legt den Wert der incipit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Incipit }
     *     
     */
    public void setIncipit(Incipit value) {
        this.incipit = value;
    }

    /**
     * Gets the value of the msItemStructs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the msItemStructs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getMsItemStructs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link MsItemStruct }
     * 
     * 
     */
    public List<MsItemStruct> getMsItemStructs() {
        if (msItemStructs == null) {
            msItemStructs = new ArrayList<MsItemStruct>();
        }
        return this.msItemStructs;
    }

    /**
     * Ruft den Wert der explicit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Explicit }
     *     
     */
    public Explicit getExplicit() {
        return explicit;
    }

    /**
     * Legt den Wert der explicit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Explicit }
     *     
     */
    public void setExplicit(Explicit value) {
        this.explicit = value;
    }

    /**
     * Ruft den Wert der finalRubric-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FinalRubric }
     *     
     */
    public FinalRubric getFinalRubric() {
        return finalRubric;
    }

    /**
     * Legt den Wert der finalRubric-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalRubric }
     *     
     */
    public void setFinalRubric(FinalRubric value) {
        this.finalRubric = value;
    }

    /**
     * Gets the value of the colophons property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the colophons property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getColophons().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Colophon }
     * 
     * 
     */
    public List<Colophon> getColophons() {
        if (colophons == null) {
            colophons = new ArrayList<Colophon>();
        }
        return this.colophons;
    }

    /**
     * Gets the value of the decoNotes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the decoNotes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getDecoNotes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link DecoNote }
     * 
     * 
     */
    public List<DecoNote> getDecoNotes() {
        if (decoNotes == null) {
            decoNotes = new ArrayList<DecoNote>();
        }
        return this.decoNotes;
    }

    /**
     * Gets the value of the listBibls property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the listBibls property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getListBibls().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link ListBibl }
     * 
     * 
     */
    public List<ListBibl> getListBibls() {
        if (listBibls == null) {
            listBibls = new ArrayList<ListBibl>();
        }
        return this.listBibls;
    }

    /**
     * Gets the value of the biblsAndBiblStructs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the biblsAndBiblStructs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getBiblsAndBiblStructs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Bibl }
     * {@link BiblStruct }
     * 
     * 
     */
    public List<java.lang.Object> getBiblsAndBiblStructs() {
        if (biblsAndBiblStructs == null) {
            biblsAndBiblStructs = new ArrayList<java.lang.Object>();
        }
        return this.biblsAndBiblStructs;
    }

    /**
     * Ruft den Wert der filiation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Filiation }
     *     
     */
    public Filiation getFiliation() {
        return filiation;
    }

    /**
     * Legt den Wert der filiation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Filiation }
     *     
     */
    public void setFiliation(Filiation value) {
        this.filiation = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the notes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getNotes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Note>();
        }
        return this.notes;
    }

    /**
     * Ruft den Wert der textLang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextLang }
     *     
     */
    public TextLang getTextLang() {
        return textLang;
    }

    /**
     * Legt den Wert der textLang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextLang }
     *     
     */
    public void setTextLang(TextLang value) {
        this.textLang = value;
    }

    /**
     * Gets the value of the psAndAbs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the psAndAbs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getPSAndAbs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link P }
     * {@link Ab }
     * 
     * 
     */
    public List<MacroParaContent> getPSAndAbs() {
        if (psAndAbs == null) {
            psAndAbs = new ArrayList<MacroParaContent>();
        }
        return this.psAndAbs;
    }

    /**
     * Gets the value of the clazzs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the clazzs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getClazzs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
     */
    public List<java.lang.String> getClazzs() {
        if (clazzs == null) {
            clazzs = new ArrayList<java.lang.String>();
        }
        return this.clazzs;
    }

    /**
     * Ruft den Wert der defective-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getDefective() {
        return defective;
    }

    /**
     * Legt den Wert der defective-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setDefective(java.lang.String value) {
        this.defective = value;
    }

    /**
     * Gets the value of the rends property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the rends property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRends().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the renditions property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getRenditions().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getStyle() {
        return style;
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setStyle(java.lang.String value) {
        this.style = value;
    }

    /**
     * Gets the value of the facs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the facs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getFacs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getNext() {
        return next;
    }

    /**
     * Legt den Wert der next-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setNext(java.lang.String value) {
        this.next = value;
    }

    /**
     * Gets the value of the synches property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the synches property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSynches().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getPrev() {
        return prev;
    }

    /**
     * Legt den Wert der prev-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setPrev(java.lang.String value) {
        this.prev = value;
    }

    /**
     * Gets the value of the excludes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the excludes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getExcludes().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSameAs() {
        return sameAs;
    }

    /**
     * Legt den Wert der sameAs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSameAs(java.lang.String value) {
        this.sameAs = value;
    }

    /**
     * Ruft den Wert der copyOf-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCopyOf() {
        return copyOf;
    }

    /**
     * Legt den Wert der copyOf-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCopyOf(java.lang.String value) {
        this.copyOf = value;
    }

    /**
     * Gets the value of the corresps property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the corresps property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getCorresps().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the selects property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSelects().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getBase() {
        return base;
    }

    /**
     * Legt den Wert der base-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setBase(java.lang.String value) {
        this.base = value;
    }

    /**
     * Gets the value of the anas property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the anas property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getAnas().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setId(java.lang.String value) {
        this.id = value;
    }

    /**
     * Gets the value of the changes property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the changes property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getChanges().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resps property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getResps().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getCert() {
        return cert;
    }

    /**
     * Legt den Wert der cert-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setCert(java.lang.String value) {
        this.cert = value;
    }

    /**
     * Ruft den Wert der lang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getLang() {
        return lang;
    }

    /**
     * Legt den Wert der lang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setLang(java.lang.String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the sources property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the sources property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getSources().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.String }
     * 
     * 
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
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getN() {
        return n;
    }

    /**
     * Legt den Wert der n-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setN(java.lang.String value) {
        this.n = value;
    }

    /**
     * Ruft den Wert der space-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSpace() {
        return space;
    }

    /**
     * Legt den Wert der space-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSpace(java.lang.String value) {
        this.space = value;
    }

    @Override
    public java.lang.String toString() {
        return new StringJoiner(", ", MsItemStruct.class.getSimpleName() + "[", "]")
            .add("locusGrp=" + locusGrp)
            .add("locus=" + locus)
            .add("authors=" + authors)
            .add("respStmts=" + respStmts)
            .add("titles=" + titles)
            .add("rubric=" + rubric)
            .add("incipit=" + incipit)
            .add("msItemStructs=" + msItemStructs)
            .add("explicit=" + explicit)
            .add("finalRubric=" + finalRubric)
            .add("colophons=" + colophons)
            .add("decoNotes=" + decoNotes)
            .add("listBibls=" + listBibls)
            .add("biblsAndBiblStructs=" + biblsAndBiblStructs)
            .add("filiation=" + filiation)
            .add("notes=" + notes)
            .add("textLang=" + textLang)
            .add("psAndAbs=" + psAndAbs)
            .add("clazzs=" + clazzs)
            .add("defective='" + defective + "'")
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
