//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.NonNegativeInteger3FItemType;
import nl.nltaxonomie.nt13.bd._20181212_b.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.iso3166_countrycodes_2017_11_23.IsoCountryCodes3CharactersItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}AssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}AssetsOnBankStockAccountsForeignBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}AssetsOnBankStockAccountsForeignBankName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}AssetsOnBankStockAccountsForeignCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data}CommonReportingStandardCode" minOccurs="0"/>
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
    "assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber",
    "assetsOnBankStockAccountsForeignBankAccountNumber",
    "assetsOnBankStockAccountsForeignBankName",
    "assetsOnBankStockAccountsForeignCountryCode",
    "commonReportingStandardCode"
})
public class AssetsOnBankStockAccountsForeignSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected Test11ItemType assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected Anstring34VItemType assetsOnBankStockAccountsForeignBankAccountNumber;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignBankName", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected Anstring70VItemType assetsOnBankStockAccountsForeignBankName;
    @XmlElement(name = "AssetsOnBankStockAccountsForeignCountryCode", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected IsoCountryCodes3CharactersItemType assetsOnBankStockAccountsForeignCountryCode;
    @XmlElement(name = "CommonReportingStandardCode", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.b/dictionary/bd-data")
    protected NonNegativeInteger3FItemType commonReportingStandardCode;

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getAssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber() {
        return assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignAccountHolderIdentificationNumber(Test11ItemType value) {
        this.assetsOnBankStockAccountsForeignAccountHolderIdentificationNumber = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getAssetsOnBankStockAccountsForeignBankAccountNumber() {
        return assetsOnBankStockAccountsForeignBankAccountNumber;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignBankAccountNumber(Anstring34VItemType value) {
        this.assetsOnBankStockAccountsForeignBankAccountNumber = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignBankName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetsOnBankStockAccountsForeignBankName() {
        return assetsOnBankStockAccountsForeignBankName;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignBankName(Anstring70VItemType value) {
        this.assetsOnBankStockAccountsForeignBankName = value;
    }

    /**
     * Gets the value of the assetsOnBankStockAccountsForeignCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getAssetsOnBankStockAccountsForeignCountryCode() {
        return assetsOnBankStockAccountsForeignCountryCode;
    }

    /**
     * Sets the value of the assetsOnBankStockAccountsForeignCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setAssetsOnBankStockAccountsForeignCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.assetsOnBankStockAccountsForeignCountryCode = value;
    }

    /**
     * Gets the value of the commonReportingStandardCode property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger3FItemType }
     *     
     */
    public NonNegativeInteger3FItemType getCommonReportingStandardCode() {
        return commonReportingStandardCode;
    }

    /**
     * Sets the value of the commonReportingStandardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger3FItemType }
     *     
     */
    public void setCommonReportingStandardCode(NonNegativeInteger3FItemType value) {
        this.commonReportingStandardCode = value;
    }

}