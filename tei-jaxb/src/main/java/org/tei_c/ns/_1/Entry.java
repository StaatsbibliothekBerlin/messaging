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
 *       &amp;lt;choice maxOccurs="unbounded"&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}hom"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}sense"/&amp;gt;
 *         &amp;lt;element ref="{http://www.tei-c.org/ns/1.0}pc"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.entryPart.top"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.global"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.ptrLike"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.sortable.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.global.attributes"/&amp;gt;
 *       &amp;lt;attGroup ref="{http://www.tei-c.org/ns/1.0}att.entryLike.attributes"/&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "homsAndSensesAndPcs"
})
@XmlRootElement(name = "entry")
public class Entry {

    @XmlElements({
        @XmlElement(name = "hom", type = Hom.class),
        @XmlElement(name = "sense", type = Sense.class),
        @XmlElement(name = "pc", type = Pc.class),
        @XmlElement(name = "cit", type = Cit.class),
        @XmlElement(name = "dictScrap", type = DictScrap.class),
        @XmlElement(name = "form", type = Form.class),
        @XmlElement(name = "gramGrp", type = GramGrp.class),
        @XmlElement(name = "def", type = Def.class),
        @XmlElement(name = "etym", type = Etym.class),
        @XmlElement(name = "usg", type = Usg.class),
        @XmlElement(name = "lbl", type = Lbl.class),
        @XmlElement(name = "xr", type = Xr.class),
        @XmlElement(name = "re", type = Re.class),
        @XmlElement(name = "index", type = Index.class),
        @XmlElement(name = "span", type = Span.class),
        @XmlElement(name = "spanGrp", type = SpanGrp.class),
        @XmlElement(name = "interp", type = Interp.class),
        @XmlElement(name = "interpGrp", type = InterpGrp.class),
        @XmlElement(name = "precision", type = Precision.class),
        @XmlElement(name = "certainty", type = Certainty.class),
        @XmlElement(name = "respons", type = Respons.class),
        @XmlElement(name = "fs", type = Fs.class),
        @XmlElement(name = "fLib", type = FLib.class),
        @XmlElement(name = "fvLib", type = FvLib.class),
        @XmlElement(name = "link", type = Link.class),
        @XmlElement(name = "linkGrp", type = LinkGrp.class),
        @XmlElement(name = "timeline", type = Timeline.class),
        @XmlElement(name = "join", type = Join.class),
        @XmlElement(name = "joinGrp", type = JoinGrp.class),
        @XmlElement(name = "alt", type = Alt.class),
        @XmlElement(name = "altGrp", type = AltGrp.class),
        @XmlElement(name = "substJoin", type = SubstJoin.class),
        @XmlElement(name = "listTranspose", type = ListTranspose.class),
        @XmlElement(name = "milestone", type = Milestone.class),
        @XmlElement(name = "gb", type = Gb.class),
        @XmlElement(name = "pb", type = Pb.class),
        @XmlElement(name = "lb", type = Lb.class),
        @XmlElement(name = "cb", type = Cb.class),
        @XmlElement(name = "anchor", type = Anchor.class),
        @XmlElement(name = "fw", type = Fw.class),
        @XmlElement(name = "note", type = Note.class),
        @XmlElement(name = "gap", type = Gap.class),
        @XmlElement(name = "app", type = App.class),
        @XmlElement(name = "witDetail", type = WitDetail.class),
        @XmlElement(name = "addSpan", type = AddSpan.class),
        @XmlElement(name = "damageSpan", type = DamageSpan.class),
        @XmlElement(name = "delSpan", type = DelSpan.class),
        @XmlElement(name = "space", type = Space.class),
        @XmlElement(name = "notatedMusic", type = NotatedMusic.class),
        @XmlElement(name = "figure", type = Figure.class),
        @XmlElement(name = "pause", type = Pause.class),
        @XmlElement(name = "vocal", type = Vocal.class),
        @XmlElement(name = "kinesic", type = Kinesic.class),
        @XmlElement(name = "incident", type = Incident.class),
        @XmlElement(name = "writing", type = Writing.class),
        @XmlElement(name = "shift", type = Shift.class),
        @XmlElement(name = "metamark", type = Metamark.class),
        @XmlElement(name = "ptr", type = Ptr.class),
        @XmlElement(name = "ref", type = Ref.class)
    })
    protected List<java.lang.Object> homsAndSensesAndPcs;
    @XmlAttribute(name = "sortKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String sortKey;
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
    @XmlAttribute(name = "type")
    protected java.lang.String type;
    @XmlAttribute(name = "subtype")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected java.lang.String subtype;

    /**
     * Gets the value of the homsAndSensesAndPcs property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the homsAndSensesAndPcs property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getHomsAndSensesAndPcs().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Hom }
     * {@link Sense }
     * {@link Pc }
     * {@link Cit }
     * {@link DictScrap }
     * {@link Form }
     * {@link GramGrp }
     * {@link Def }
     * {@link Etym }
     * {@link Usg }
     * {@link Lbl }
     * {@link Xr }
     * {@link Re }
     * {@link Index }
     * {@link Span }
     * {@link SpanGrp }
     * {@link Interp }
     * {@link InterpGrp }
     * {@link Precision }
     * {@link Certainty }
     * {@link Respons }
     * {@link Fs }
     * {@link FLib }
     * {@link FvLib }
     * {@link Link }
     * {@link LinkGrp }
     * {@link Timeline }
     * {@link Join }
     * {@link JoinGrp }
     * {@link Alt }
     * {@link AltGrp }
     * {@link SubstJoin }
     * {@link ListTranspose }
     * {@link Milestone }
     * {@link Gb }
     * {@link Pb }
     * {@link Lb }
     * {@link Cb }
     * {@link Anchor }
     * {@link Fw }
     * {@link Note }
     * {@link Gap }
     * {@link App }
     * {@link WitDetail }
     * {@link AddSpan }
     * {@link DamageSpan }
     * {@link DelSpan }
     * {@link Space }
     * {@link NotatedMusic }
     * {@link Figure }
     * {@link Pause }
     * {@link Vocal }
     * {@link Kinesic }
     * {@link Incident }
     * {@link Writing }
     * {@link Shift }
     * {@link Metamark }
     * {@link Ptr }
     * {@link Ref }
     * 
     * 
     */
    public List<java.lang.Object> getHomsAndSensesAndPcs() {
        if (homsAndSensesAndPcs == null) {
            homsAndSensesAndPcs = new ArrayList<java.lang.Object>();
        }
        return this.homsAndSensesAndPcs;
    }

    /**
     * Ruft den Wert der sortKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSortKey() {
        return sortKey;
    }

    /**
     * Legt den Wert der sortKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSortKey(java.lang.String value) {
        this.sortKey = value;
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

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getType() {
        if (type == null) {
            return "main";
        } else {
            return type;
        }
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setType(java.lang.String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der subtype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String }
     *     
     */
    public java.lang.String getSubtype() {
        return subtype;
    }

    /**
     * Legt den Wert der subtype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String }
     *     
     */
    public void setSubtype(java.lang.String value) {
        this.subtype = value;
    }

    @Override
    public java.lang.String toString() {
        return new StringJoiner(", ", Entry.class.getSimpleName() + "[", "]")
            .add("homsAndSensesAndPcs=" + homsAndSensesAndPcs)
            .add("sortKey='" + sortKey + "'")
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
            .add("type='" + type + "'")
            .add("subtype='" + subtype + "'")
            .toString();
    }
}