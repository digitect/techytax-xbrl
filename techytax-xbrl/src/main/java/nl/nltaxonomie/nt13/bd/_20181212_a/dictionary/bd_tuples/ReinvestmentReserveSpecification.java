//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.GYearItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Perc32ItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.MonetaryNoDecimalsItemType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nltaxonomie.nl/2011/xbrl/xbrl-syntax-extension}placeholder">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ReinvestmentReserveDisposedBusinessAssetBookProfit" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ReinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ReinvestmentReserveDisposedBusinessAssetDepreciationPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ReinvestmentReserveDisposedBusinessAssetDescription" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ReinvestmentReserveDisposedBusinessAssetYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reinvestmentReserveDisposedBusinessAssetBookProfit",
    "reinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime",
    "reinvestmentReserveDisposedBusinessAssetDepreciationPercentage",
    "reinvestmentReserveDisposedBusinessAssetDescription",
    "reinvestmentReserveDisposedBusinessAssetYear"
})
public class ReinvestmentReserveSpecification
    extends Placeholder
{

    @XmlElement(name = "ReinvestmentReserveDisposedBusinessAssetBookProfit", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType reinvestmentReserveDisposedBusinessAssetBookProfit;
    @XmlElement(name = "ReinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType reinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime;
    @XmlElement(name = "ReinvestmentReserveDisposedBusinessAssetDepreciationPercentage", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Perc32ItemType reinvestmentReserveDisposedBusinessAssetDepreciationPercentage;
    @XmlElement(name = "ReinvestmentReserveDisposedBusinessAssetDescription", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring70VItemType reinvestmentReserveDisposedBusinessAssetDescription;
    @XmlElement(name = "ReinvestmentReserveDisposedBusinessAssetYear", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected GYearItemType reinvestmentReserveDisposedBusinessAssetYear;

    /**
     * Gets the value of the reinvestmentReserveDisposedBusinessAssetBookProfit property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getReinvestmentReserveDisposedBusinessAssetBookProfit() {
        return reinvestmentReserveDisposedBusinessAssetBookProfit;
    }

    /**
     * Sets the value of the reinvestmentReserveDisposedBusinessAssetBookProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setReinvestmentReserveDisposedBusinessAssetBookProfit(MonetaryNoDecimalsItemType value) {
        this.reinvestmentReserveDisposedBusinessAssetBookProfit = value;
    }

    /**
     * Gets the value of the reinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getReinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime() {
        return reinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime;
    }

    /**
     * Sets the value of the reinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setReinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime(MonetaryNoDecimalsItemType value) {
        this.reinvestmentReserveDisposedBusinessAssetBookValueAtTransferTime = value;
    }

    /**
     * Gets the value of the reinvestmentReserveDisposedBusinessAssetDepreciationPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Perc32ItemType }
     *     
     */
    public Perc32ItemType getReinvestmentReserveDisposedBusinessAssetDepreciationPercentage() {
        return reinvestmentReserveDisposedBusinessAssetDepreciationPercentage;
    }

    /**
     * Sets the value of the reinvestmentReserveDisposedBusinessAssetDepreciationPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Perc32ItemType }
     *     
     */
    public void setReinvestmentReserveDisposedBusinessAssetDepreciationPercentage(Perc32ItemType value) {
        this.reinvestmentReserveDisposedBusinessAssetDepreciationPercentage = value;
    }

    /**
     * Gets the value of the reinvestmentReserveDisposedBusinessAssetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getReinvestmentReserveDisposedBusinessAssetDescription() {
        return reinvestmentReserveDisposedBusinessAssetDescription;
    }

    /**
     * Sets the value of the reinvestmentReserveDisposedBusinessAssetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setReinvestmentReserveDisposedBusinessAssetDescription(Anstring70VItemType value) {
        this.reinvestmentReserveDisposedBusinessAssetDescription = value;
    }

    /**
     * Gets the value of the reinvestmentReserveDisposedBusinessAssetYear property.
     * 
     * @return
     *     possible object is
     *     {@link GYearItemType }
     *     
     */
    public GYearItemType getReinvestmentReserveDisposedBusinessAssetYear() {
        return reinvestmentReserveDisposedBusinessAssetYear;
    }

    /**
     * Sets the value of the reinvestmentReserveDisposedBusinessAssetYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearItemType }
     *     
     */
    public void setReinvestmentReserveDisposedBusinessAssetYear(GYearItemType value) {
        this.reinvestmentReserveDisposedBusinessAssetYear = value;
    }

}
