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
import java.util.StringJoiner;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.tei_c.ns.examples.EgXML;


/**
 * &lt;p&gt;Java-Klasse für macro.limitedContent complex type.
 * 
 * &lt;p&gt;Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="macro.limitedContent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;choice maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.limitedPhrase"/&amp;gt;
 *         &amp;lt;group ref="{http://www.tei-c.org/ns/1.0}model.inter"/&amp;gt;
 *       &amp;lt;/choice&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "macro.limitedContent", propOrder = {
    "content"
})
@XmlSeeAlso({
    FDescr.class,
    FsDescr.class,
    TagUsage.class,
    Rendition.class,
    Desc.class,
    FigDesc.class,
    Witness.class,
    Meeting.class
})
public class MacroLimitedContent {

    @XmlElementRefs({
        @XmlElementRef(name = "hi", namespace = "http://www.tei-c.org/ns/1.0", type = Hi.class),
        @XmlElementRef(name = "foreign", namespace = "http://www.tei-c.org/ns/1.0", type = Foreign.class),
        @XmlElementRef(name = "emph", namespace = "http://www.tei-c.org/ns/1.0", type = Emph.class),
        @XmlElementRef(name = "distinct", namespace = "http://www.tei-c.org/ns/1.0", type = Distinct.class),
        @XmlElementRef(name = "mentioned", namespace = "http://www.tei-c.org/ns/1.0", type = Mentioned.class),
        @XmlElementRef(name = "soCalled", namespace = "http://www.tei-c.org/ns/1.0", type = SoCalled.class),
        @XmlElementRef(name = "gloss", namespace = "http://www.tei-c.org/ns/1.0", type = Gloss.class),
        @XmlElementRef(name = "term", namespace = "http://www.tei-c.org/ns/1.0", type = Term.class),
        @XmlElementRef(name = "title", namespace = "http://www.tei-c.org/ns/1.0", type = Title.class),
        @XmlElementRef(name = "code", namespace = "http://www.tei-c.org/ns/1.0", type = Code.class),
        @XmlElementRef(name = "ident", namespace = "http://www.tei-c.org/ns/1.0", type = Ident.class),
        @XmlElementRef(name = "catchwords", namespace = "http://www.tei-c.org/ns/1.0", type = Catchwords.class),
        @XmlElementRef(name = "dimensions", namespace = "http://www.tei-c.org/ns/1.0", type = Dimensions.class),
        @XmlElementRef(name = "heraldry", namespace = "http://www.tei-c.org/ns/1.0", type = Heraldry.class),
        @XmlElementRef(name = "locus", namespace = "http://www.tei-c.org/ns/1.0", type = Locus.class),
        @XmlElementRef(name = "locusGrp", namespace = "http://www.tei-c.org/ns/1.0", type = LocusGrp.class),
        @XmlElementRef(name = "material", namespace = "http://www.tei-c.org/ns/1.0", type = Material.class),
        @XmlElementRef(name = "objectType", namespace = "http://www.tei-c.org/ns/1.0", type = ObjectType.class),
        @XmlElementRef(name = "origDate", namespace = "http://www.tei-c.org/ns/1.0", type = OrigDate.class),
        @XmlElementRef(name = "origPlace", namespace = "http://www.tei-c.org/ns/1.0", type = OrigPlace.class),
        @XmlElementRef(name = "secFol", namespace = "http://www.tei-c.org/ns/1.0", type = SecFol.class),
        @XmlElementRef(name = "signatures", namespace = "http://www.tei-c.org/ns/1.0", type = Signatures.class),
        @XmlElementRef(name = "stamp", namespace = "http://www.tei-c.org/ns/1.0", type = Stamp.class),
        @XmlElementRef(name = "watermark", namespace = "http://www.tei-c.org/ns/1.0", type = Watermark.class),
        @XmlElementRef(name = "choice", namespace = "http://www.tei-c.org/ns/1.0", type = Choice.class),
        @XmlElementRef(name = "abbr", namespace = "http://www.tei-c.org/ns/1.0", type = Abbr.class),
        @XmlElementRef(name = "expan", namespace = "http://www.tei-c.org/ns/1.0", type = Expan.class),
        @XmlElementRef(name = "ex", namespace = "http://www.tei-c.org/ns/1.0", type = Ex.class),
        @XmlElementRef(name = "am", namespace = "http://www.tei-c.org/ns/1.0", type = Am.class),
        @XmlElementRef(name = "subst", namespace = "http://www.tei-c.org/ns/1.0", type = Subst.class),
        @XmlElementRef(name = "ptr", namespace = "http://www.tei-c.org/ns/1.0", type = Ptr.class),
        @XmlElementRef(name = "ref", namespace = "http://www.tei-c.org/ns/1.0", type = Ref.class),
        @XmlElementRef(name = "att", namespace = "http://www.tei-c.org/ns/1.0", type = Att.class),
        @XmlElementRef(name = "gi", namespace = "http://www.tei-c.org/ns/1.0", type = Gi.class),
        @XmlElementRef(name = "tag", namespace = "http://www.tei-c.org/ns/1.0", type = Tag.class),
        @XmlElementRef(name = "val", namespace = "http://www.tei-c.org/ns/1.0", type = Val.class),
        @XmlElementRef(name = "date", namespace = "http://www.tei-c.org/ns/1.0", type = Date.class),
        @XmlElementRef(name = "time", namespace = "http://www.tei-c.org/ns/1.0", type = Time.class),
        @XmlElementRef(name = "num", namespace = "http://www.tei-c.org/ns/1.0", type = Num.class),
        @XmlElementRef(name = "measure", namespace = "http://www.tei-c.org/ns/1.0", type = Measure.class),
        @XmlElementRef(name = "measureGrp", namespace = "http://www.tei-c.org/ns/1.0", type = MeasureGrp.class),
        @XmlElementRef(name = "unit", namespace = "http://www.tei-c.org/ns/1.0", type = Unit.class),
        @XmlElementRef(name = "dim", namespace = "http://www.tei-c.org/ns/1.0", type = Dim.class),
        @XmlElementRef(name = "height", namespace = "http://www.tei-c.org/ns/1.0", type = Height.class),
        @XmlElementRef(name = "depth", namespace = "http://www.tei-c.org/ns/1.0", type = Depth.class),
        @XmlElementRef(name = "width", namespace = "http://www.tei-c.org/ns/1.0", type = Width.class),
        @XmlElementRef(name = "geo", namespace = "http://www.tei-c.org/ns/1.0", type = Geo.class),
        @XmlElementRef(name = "email", namespace = "http://www.tei-c.org/ns/1.0", type = Email.class),
        @XmlElementRef(name = "address", namespace = "http://www.tei-c.org/ns/1.0", type = Address.class),
        @XmlElementRef(name = "affiliation", namespace = "http://www.tei-c.org/ns/1.0", type = Affiliation.class),
        @XmlElementRef(name = "name", namespace = "http://www.tei-c.org/ns/1.0", type = Name.class),
        @XmlElementRef(name = "orgName", namespace = "http://www.tei-c.org/ns/1.0", type = OrgName.class),
        @XmlElementRef(name = "persName", namespace = "http://www.tei-c.org/ns/1.0", type = PersName.class),
        @XmlElementRef(name = "offset", namespace = "http://www.tei-c.org/ns/1.0", type = Offset.class),
        @XmlElementRef(name = "geogFeat", namespace = "http://www.tei-c.org/ns/1.0", type = GeogFeat.class),
        @XmlElementRef(name = "placeName", namespace = "http://www.tei-c.org/ns/1.0", type = PlaceName.class),
        @XmlElementRef(name = "bloc", namespace = "http://www.tei-c.org/ns/1.0", type = Bloc.class),
        @XmlElementRef(name = "country", namespace = "http://www.tei-c.org/ns/1.0", type = Country.class),
        @XmlElementRef(name = "region", namespace = "http://www.tei-c.org/ns/1.0", type = Region.class),
        @XmlElementRef(name = "settlement", namespace = "http://www.tei-c.org/ns/1.0", type = Settlement.class),
        @XmlElementRef(name = "district", namespace = "http://www.tei-c.org/ns/1.0", type = District.class),
        @XmlElementRef(name = "geogName", namespace = "http://www.tei-c.org/ns/1.0", type = GeogName.class),
        @XmlElementRef(name = "climate", namespace = "http://www.tei-c.org/ns/1.0", type = Climate.class),
        @XmlElementRef(name = "location", namespace = "http://www.tei-c.org/ns/1.0", type = Location.class),
        @XmlElementRef(name = "population", namespace = "http://www.tei-c.org/ns/1.0", type = Population.class),
        @XmlElementRef(name = "state", namespace = "http://www.tei-c.org/ns/1.0", type = State.class),
        @XmlElementRef(name = "terrain", namespace = "http://www.tei-c.org/ns/1.0", type = Terrain.class),
        @XmlElementRef(name = "trait", namespace = "http://www.tei-c.org/ns/1.0", type = Trait.class),
        @XmlElementRef(name = "rs", namespace = "http://www.tei-c.org/ns/1.0", type = Rs.class),
        @XmlElementRef(name = "lang", namespace = "http://www.tei-c.org/ns/1.0", type = Lang.class),
        @XmlElementRef(name = "idno", namespace = "http://www.tei-c.org/ns/1.0", type = Idno.class),
        @XmlElementRef(name = "surname", namespace = "http://www.tei-c.org/ns/1.0", type = Surname.class),
        @XmlElementRef(name = "forename", namespace = "http://www.tei-c.org/ns/1.0", type = Forename.class),
        @XmlElementRef(name = "genName", namespace = "http://www.tei-c.org/ns/1.0", type = GenName.class),
        @XmlElementRef(name = "nameLink", namespace = "http://www.tei-c.org/ns/1.0", type = NameLink.class),
        @XmlElementRef(name = "addName", namespace = "http://www.tei-c.org/ns/1.0", type = AddName.class),
        @XmlElementRef(name = "roleName", namespace = "http://www.tei-c.org/ns/1.0", type = RoleName.class),
        @XmlElementRef(name = "objectName", namespace = "http://www.tei-c.org/ns/1.0", type = ObjectName.class),
        @XmlElementRef(name = "eg", namespace = "http://www.tei-c.org/ns/1.0", type = Eg.class),
        @XmlElementRef(name = "egXML", namespace = "http://www.tei-c.org/ns/Examples", type = EgXML.class),
        @XmlElementRef(name = "moduleSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ModuleSpec.class),
        @XmlElementRef(name = "specGrp", namespace = "http://www.tei-c.org/ns/1.0", type = SpecGrp.class),
        @XmlElementRef(name = "specGrpRef", namespace = "http://www.tei-c.org/ns/1.0", type = SpecGrpRef.class),
        @XmlElementRef(name = "elementSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ElementSpec.class),
        @XmlElementRef(name = "classSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ClassSpec.class),
        @XmlElementRef(name = "dataSpec", namespace = "http://www.tei-c.org/ns/1.0", type = DataSpec.class),
        @XmlElementRef(name = "macroSpec", namespace = "http://www.tei-c.org/ns/1.0", type = MacroSpec.class),
        @XmlElementRef(name = "listRef", namespace = "http://www.tei-c.org/ns/1.0", type = ListRef.class),
        @XmlElementRef(name = "outputRendition", namespace = "http://www.tei-c.org/ns/1.0", type = OutputRendition.class),
        @XmlElementRef(name = "constraintSpec", namespace = "http://www.tei-c.org/ns/1.0", type = ConstraintSpec.class),
        @XmlElementRef(name = "bibl", namespace = "http://www.tei-c.org/ns/1.0", type = Bibl.class),
        @XmlElementRef(name = "biblStruct", namespace = "http://www.tei-c.org/ns/1.0", type = BiblStruct.class),
        @XmlElementRef(name = "listBibl", namespace = "http://www.tei-c.org/ns/1.0", type = ListBibl.class),
        @XmlElementRef(name = "biblFull", namespace = "http://www.tei-c.org/ns/1.0", type = BiblFull.class),
        @XmlElementRef(name = "msDesc", namespace = "http://www.tei-c.org/ns/1.0", type = MsDesc.class),
        @XmlElementRef(name = "desc", namespace = "http://www.tei-c.org/ns/1.0", type = Desc.class),
        @XmlElementRef(name = "label", namespace = "http://www.tei-c.org/ns/1.0", type = Label.class),
        @XmlElementRef(name = "list", namespace = "http://www.tei-c.org/ns/1.0", type = org.tei_c.ns._1.List.class),
        @XmlElementRef(name = "table", namespace = "http://www.tei-c.org/ns/1.0", type = Table.class),
        @XmlElementRef(name = "listOrg", namespace = "http://www.tei-c.org/ns/1.0", type = ListOrg.class),
        @XmlElementRef(name = "listEvent", namespace = "http://www.tei-c.org/ns/1.0", type = ListEvent.class),
        @XmlElementRef(name = "listPerson", namespace = "http://www.tei-c.org/ns/1.0", type = ListPerson.class),
        @XmlElementRef(name = "listPlace", namespace = "http://www.tei-c.org/ns/1.0", type = ListPlace.class),
        @XmlElementRef(name = "listRelation", namespace = "http://www.tei-c.org/ns/1.0", type = ListRelation.class),
        @XmlElementRef(name = "listObject", namespace = "http://www.tei-c.org/ns/1.0", type = ListObject.class),
        @XmlElementRef(name = "listNym", namespace = "http://www.tei-c.org/ns/1.0", type = ListNym.class),
        @XmlElementRef(name = "listApp", namespace = "http://www.tei-c.org/ns/1.0", type = ListApp.class),
        @XmlElementRef(name = "listWit", namespace = "http://www.tei-c.org/ns/1.0", type = ListWit.class),
        @XmlElementRef(name = "stage", namespace = "http://www.tei-c.org/ns/1.0", type = Stage.class),
        @XmlElementRef(name = "move", namespace = "http://www.tei-c.org/ns/1.0", type = Move.class),
        @XmlElementRef(name = "view", namespace = "http://www.tei-c.org/ns/1.0", type = View.class),
        @XmlElementRef(name = "camera", namespace = "http://www.tei-c.org/ns/1.0", type = Camera.class),
        @XmlElementRef(name = "sound", namespace = "http://www.tei-c.org/ns/1.0", type = Sound.class),
        @XmlElementRef(name = "caption", namespace = "http://www.tei-c.org/ns/1.0", type = Caption.class),
        @XmlElementRef(name = "tech", namespace = "http://www.tei-c.org/ns/1.0", type = Tech.class),
        @XmlElementRef(name = "quote", namespace = "http://www.tei-c.org/ns/1.0", type = Quote.class),
        @XmlElementRef(name = "cit", namespace = "http://www.tei-c.org/ns/1.0", type = Cit.class),
        @XmlElementRef(name = "said", namespace = "http://www.tei-c.org/ns/1.0", type = Said.class),
        @XmlElementRef(name = "q", namespace = "http://www.tei-c.org/ns/1.0", type = Q.class),
        @XmlElementRef(name = "floatingText", namespace = "http://www.tei-c.org/ns/1.0", type = FloatingText.class),
        @XmlElementRef(name = "castList", namespace = "http://www.tei-c.org/ns/1.0", type = CastList.class)
    })
    @XmlMixed
    protected java.util.List<java.lang.Object> content;

    /**
     * Gets the value of the content property.
     * 
     * &lt;p&gt;
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the content property.
     * 
     * &lt;p&gt;
     * For example, to add a new item, do as follows:
     * &lt;pre&gt;
     *    getContent().add(newItem);
     * &lt;/pre&gt;
     * 
     * 
     * &lt;p&gt;
     * Objects of the following type(s) are allowed in the list
     * {@link Hi }
     * {@link Foreign }
     * {@link Emph }
     * {@link Distinct }
     * {@link Mentioned }
     * {@link SoCalled }
     * {@link Gloss }
     * {@link Term }
     * {@link Title }
     * {@link Code }
     * {@link Ident }
     * {@link Catchwords }
     * {@link Dimensions }
     * {@link Heraldry }
     * {@link Locus }
     * {@link LocusGrp }
     * {@link Material }
     * {@link ObjectType }
     * {@link OrigDate }
     * {@link OrigPlace }
     * {@link SecFol }
     * {@link Signatures }
     * {@link Stamp }
     * {@link Watermark }
     * {@link Choice }
     * {@link Abbr }
     * {@link Expan }
     * {@link Ex }
     * {@link Am }
     * {@link Subst }
     * {@link Ptr }
     * {@link Ref }
     * {@link Att }
     * {@link Gi }
     * {@link Tag }
     * {@link Val }
     * {@link Date }
     * {@link Time }
     * {@link Num }
     * {@link Measure }
     * {@link MeasureGrp }
     * {@link Unit }
     * {@link Dim }
     * {@link Height }
     * {@link Depth }
     * {@link Width }
     * {@link Geo }
     * {@link Email }
     * {@link Address }
     * {@link Affiliation }
     * {@link Name }
     * {@link OrgName }
     * {@link PersName }
     * {@link Offset }
     * {@link GeogFeat }
     * {@link PlaceName }
     * {@link Bloc }
     * {@link Country }
     * {@link Region }
     * {@link Settlement }
     * {@link District }
     * {@link GeogName }
     * {@link Climate }
     * {@link Location }
     * {@link Population }
     * {@link State }
     * {@link Terrain }
     * {@link Trait }
     * {@link Rs }
     * {@link Lang }
     * {@link Idno }
     * {@link Surname }
     * {@link Forename }
     * {@link GenName }
     * {@link NameLink }
     * {@link AddName }
     * {@link RoleName }
     * {@link ObjectName }
     * {@link Eg }
     * {@link EgXML }
     * {@link ModuleSpec }
     * {@link SpecGrp }
     * {@link SpecGrpRef }
     * {@link ElementSpec }
     * {@link ClassSpec }
     * {@link DataSpec }
     * {@link MacroSpec }
     * {@link ListRef }
     * {@link OutputRendition }
     * {@link ConstraintSpec }
     * {@link Bibl }
     * {@link BiblStruct }
     * {@link ListBibl }
     * {@link BiblFull }
     * {@link MsDesc }
     * {@link Desc }
     * {@link Label }
     * {@link org.tei_c.ns._1.List }
     * {@link Table }
     * {@link ListOrg }
     * {@link ListEvent }
     * {@link ListPerson }
     * {@link ListPlace }
     * {@link ListRelation }
     * {@link ListObject }
     * {@link ListNym }
     * {@link ListApp }
     * {@link ListWit }
     * {@link Stage }
     * {@link Move }
     * {@link View }
     * {@link Camera }
     * {@link Sound }
     * {@link Caption }
     * {@link Tech }
     * {@link Quote }
     * {@link Cit }
     * {@link Said }
     * {@link Q }
     * {@link FloatingText }
     * {@link CastList }
     * {@link java.lang.String }
     * 
     * 
     */
    public java.util.List<java.lang.Object> getContent() {
        if (content == null) {
            content = new ArrayList<java.lang.Object>();
        }
        return this.content;
    }

    @Override
    public java.lang.String toString() {
        return new StringJoiner(", ", MacroLimitedContent.class.getSimpleName() + "[", "]")
            .add("content=" + content)
            .toString();
    }
}
