//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package org.xbrl._2003.instance;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import nl.nltaxonomie.nt13.bd._20190220_b.dictionary.bd_types_ext1.Perc34ItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.Decimal20ItemType;
import org.xbrl.dtr.type.numeric.AreaItemType;
import org.xbrl.dtr.type.numeric.EnergyItemType;
import org.xbrl.dtr.type.numeric.LengthItemType;
import org.xbrl.dtr.type.numeric.MassItemType;
import org.xbrl.dtr.type.numeric.MemoryItemType;
import org.xbrl.dtr.type.numeric.PerShareItemType;
import org.xbrl.dtr.type.numeric.PowerItemType;
import org.xbrl.dtr.type.numeric.VolumeItemType;
import org.xbrl.dtr.type.numeric.WeightItemType;


/**
 * <p>Java class for decimalItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="decimalItemType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *       &lt;attGroup ref="{http://www.xbrl.org/2003/instance}numericItemAttrs"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "decimalItemType", propOrder = {
    "value"
})
@XmlSeeAlso({
    Decimal20ItemType.class,
    MassItemType.class,
    AreaItemType.class,
    VolumeItemType.class,
    PowerItemType.class,
    WeightItemType.class,
    LengthItemType.class,
    MemoryItemType.class,
    PerShareItemType.class,
    EnergyItemType.class,
    nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Perc23VItemType.class,
    nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Perc32ItemType.class,
    nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Perc23ItemType.class,
    nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Perc32ItemType.class,
    nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Perc23VItemType.class,
    nl.nltaxonomie.nt13.bd._20181212.dictionary.bd_types.Perc23ItemType.class,
    nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Perc23VItemType.class,
    nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Perc32ItemType.class,
    nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Perc23ItemType.class,
    Perc34ItemType.class
})
public class DecimalItemType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "precision")
    protected String precision;
    @XmlAttribute(name = "decimals")
    protected String decimals;
    @XmlAttribute(name = "unitRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object unitRef;
    @XmlAttribute(name = "contextRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object contextRef;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecision(String value) {
        this.precision = value;
    }

    /**
     * Gets the value of the decimals property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimals() {
        return decimals;
    }

    /**
     * Sets the value of the decimals property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimals(String value) {
        this.decimals = value;
    }

    /**
     * Gets the value of the unitRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnitRef() {
        return unitRef;
    }

    /**
     * Sets the value of the unitRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnitRef(Object value) {
        this.unitRef = value;
    }

    /**
     * Gets the value of the contextRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getContextRef() {
        return contextRef;
    }

    /**
     * Sets the value of the contextRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setContextRef(Object value) {
        this.contextRef = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
