//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.25 at 08:13:42 PM CEST 
//


package nl.nltaxonomie._9_0.domein.bd.tuples.bd_bedr_tuples;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import nl.nltaxonomie._2011.xbrl.xbrl_syntax_extension.Placeholder;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring24VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring4VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Anstring70VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.NonNegativeInteger5VItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Pure52ItemType;
import nl.nltaxonomie._9_0.basis.bd.types.bd_types.Test11ItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie._9_0.basis.sbr.types.nl_types.NonNegativeMonetaryNoDecimalsItemType;
//import org.iso.iso3166.iso3166_countrycodes_2013_07_11.IsoCountryCodes3CharactersItemType;
import nl.nltaxonomie.iso.iso3166.IsoCountryCodes3CharactersItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderAddressHouseNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderAddressHouseNumberAddition" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderAddressPlaceOfResidence" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderAddressStreetName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderCountryCode" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderDebtToEntity" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderDirectorLargeShareholderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderInterestPaid" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderInterestReceived" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderIssuedCapitalPercentage" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderOrdinarySharesNominalValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderPrefenceSharesNominalValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderPrioritySharesNominalValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven}ShareholderReceivablesOnEntity" minOccurs="0"/>
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
    "shareholderAddressHouseNumber",
    "shareholderAddressHouseNumberAddition",
    "shareholderAddressPlaceOfResidence",
    "shareholderAddressStreetName",
    "shareholderCountryCode",
    "shareholderDebtToEntity",
    "shareholderDirectorLargeShareholderIdentificationNumber",
    "shareholderInterestPaid",
    "shareholderInterestReceived",
    "shareholderIssuedCapitalPercentage",
    "shareholderName",
    "shareholderOrdinarySharesNominalValue",
    "shareholderPrefenceSharesNominalValue",
    "shareholderPrioritySharesNominalValue",
    "shareholderReceivablesOnEntity"
})
public class ShareholderSpecification
    extends Placeholder
{

    @XmlElement(name = "ShareholderAddressHouseNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeInteger5VItemType shareholderAddressHouseNumber;
    @XmlElement(name = "ShareholderAddressHouseNumberAddition", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring4VItemType shareholderAddressHouseNumberAddition;
    @XmlElement(name = "ShareholderAddressPlaceOfResidence", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring24VItemType shareholderAddressPlaceOfResidence;
    @XmlElement(name = "ShareholderAddressStreetName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring24VItemType shareholderAddressStreetName;
    @XmlElement(name = "ShareholderCountryCode", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected IsoCountryCodes3CharactersItemType shareholderCountryCode;
    @XmlElement(name = "ShareholderDebtToEntity", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType shareholderDebtToEntity;
    @XmlElement(name = "ShareholderDirectorLargeShareholderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Test11ItemType shareholderDirectorLargeShareholderIdentificationNumber;
    @XmlElement(name = "ShareholderInterestPaid", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType shareholderInterestPaid;
    @XmlElement(name = "ShareholderInterestReceived", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected NonNegativeMonetaryNoDecimalsItemType shareholderInterestReceived;
    @XmlElement(name = "ShareholderIssuedCapitalPercentage", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Pure52ItemType shareholderIssuedCapitalPercentage;
    @XmlElement(name = "ShareholderName", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected Anstring70VItemType shareholderName;
    @XmlElement(name = "ShareholderOrdinarySharesNominalValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType shareholderOrdinarySharesNominalValue;
    @XmlElement(name = "ShareholderPrefenceSharesNominalValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType shareholderPrefenceSharesNominalValue;
    @XmlElement(name = "ShareholderPrioritySharesNominalValue", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType shareholderPrioritySharesNominalValue;
    @XmlElement(name = "ShareholderReceivablesOnEntity", namespace = "http://www.nltaxonomie.nl/9.0/basis/bd/items/bd-bedrijven")
    protected MonetaryNoDecimalsItemType shareholderReceivablesOnEntity;

    /**
     * Gets the value of the shareholderAddressHouseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public NonNegativeInteger5VItemType getShareholderAddressHouseNumber() {
        return shareholderAddressHouseNumber;
    }

    /**
     * Sets the value of the shareholderAddressHouseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger5VItemType }
     *     
     */
    public void setShareholderAddressHouseNumber(NonNegativeInteger5VItemType value) {
        this.shareholderAddressHouseNumber = value;
    }

    /**
     * Gets the value of the shareholderAddressHouseNumberAddition property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring4VItemType }
     *     
     */
    public Anstring4VItemType getShareholderAddressHouseNumberAddition() {
        return shareholderAddressHouseNumberAddition;
    }

    /**
     * Sets the value of the shareholderAddressHouseNumberAddition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring4VItemType }
     *     
     */
    public void setShareholderAddressHouseNumberAddition(Anstring4VItemType value) {
        this.shareholderAddressHouseNumberAddition = value;
    }

    /**
     * Gets the value of the shareholderAddressPlaceOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getShareholderAddressPlaceOfResidence() {
        return shareholderAddressPlaceOfResidence;
    }

    /**
     * Sets the value of the shareholderAddressPlaceOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setShareholderAddressPlaceOfResidence(Anstring24VItemType value) {
        this.shareholderAddressPlaceOfResidence = value;
    }

    /**
     * Gets the value of the shareholderAddressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring24VItemType }
     *     
     */
    public Anstring24VItemType getShareholderAddressStreetName() {
        return shareholderAddressStreetName;
    }

    /**
     * Sets the value of the shareholderAddressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring24VItemType }
     *     
     */
    public void setShareholderAddressStreetName(Anstring24VItemType value) {
        this.shareholderAddressStreetName = value;
    }

    /**
     * Gets the value of the shareholderCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public IsoCountryCodes3CharactersItemType getShareholderCountryCode() {
        return shareholderCountryCode;
    }

    /**
     * Sets the value of the shareholderCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsoCountryCodes3CharactersItemType }
     *     
     */
    public void setShareholderCountryCode(IsoCountryCodes3CharactersItemType value) {
        this.shareholderCountryCode = value;
    }

    /**
     * Gets the value of the shareholderDebtToEntity property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getShareholderDebtToEntity() {
        return shareholderDebtToEntity;
    }

    /**
     * Sets the value of the shareholderDebtToEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderDebtToEntity(MonetaryNoDecimalsItemType value) {
        this.shareholderDebtToEntity = value;
    }

    /**
     * Gets the value of the shareholderDirectorLargeShareholderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getShareholderDirectorLargeShareholderIdentificationNumber() {
        return shareholderDirectorLargeShareholderIdentificationNumber;
    }

    /**
     * Sets the value of the shareholderDirectorLargeShareholderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setShareholderDirectorLargeShareholderIdentificationNumber(Test11ItemType value) {
        this.shareholderDirectorLargeShareholderIdentificationNumber = value;
    }

    /**
     * Gets the value of the shareholderInterestPaid property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getShareholderInterestPaid() {
        return shareholderInterestPaid;
    }

    /**
     * Sets the value of the shareholderInterestPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderInterestPaid(NonNegativeMonetaryNoDecimalsItemType value) {
        this.shareholderInterestPaid = value;
    }

    /**
     * Gets the value of the shareholderInterestReceived property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getShareholderInterestReceived() {
        return shareholderInterestReceived;
    }

    /**
     * Sets the value of the shareholderInterestReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderInterestReceived(NonNegativeMonetaryNoDecimalsItemType value) {
        this.shareholderInterestReceived = value;
    }

    /**
     * Gets the value of the shareholderIssuedCapitalPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link Pure52ItemType }
     *     
     */
    public Pure52ItemType getShareholderIssuedCapitalPercentage() {
        return shareholderIssuedCapitalPercentage;
    }

    /**
     * Sets the value of the shareholderIssuedCapitalPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pure52ItemType }
     *     
     */
    public void setShareholderIssuedCapitalPercentage(Pure52ItemType value) {
        this.shareholderIssuedCapitalPercentage = value;
    }

    /**
     * Gets the value of the shareholderName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getShareholderName() {
        return shareholderName;
    }

    /**
     * Sets the value of the shareholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setShareholderName(Anstring70VItemType value) {
        this.shareholderName = value;
    }

    /**
     * Gets the value of the shareholderOrdinarySharesNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getShareholderOrdinarySharesNominalValue() {
        return shareholderOrdinarySharesNominalValue;
    }

    /**
     * Sets the value of the shareholderOrdinarySharesNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderOrdinarySharesNominalValue(MonetaryNoDecimalsItemType value) {
        this.shareholderOrdinarySharesNominalValue = value;
    }

    /**
     * Gets the value of the shareholderPrefenceSharesNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getShareholderPrefenceSharesNominalValue() {
        return shareholderPrefenceSharesNominalValue;
    }

    /**
     * Sets the value of the shareholderPrefenceSharesNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderPrefenceSharesNominalValue(MonetaryNoDecimalsItemType value) {
        this.shareholderPrefenceSharesNominalValue = value;
    }

    /**
     * Gets the value of the shareholderPrioritySharesNominalValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getShareholderPrioritySharesNominalValue() {
        return shareholderPrioritySharesNominalValue;
    }

    /**
     * Sets the value of the shareholderPrioritySharesNominalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderPrioritySharesNominalValue(MonetaryNoDecimalsItemType value) {
        this.shareholderPrioritySharesNominalValue = value;
    }

    /**
     * Gets the value of the shareholderReceivablesOnEntity property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getShareholderReceivablesOnEntity() {
        return shareholderReceivablesOnEntity;
    }

    /**
     * Sets the value of the shareholderReceivablesOnEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setShareholderReceivablesOnEntity(MonetaryNoDecimalsItemType value) {
        this.shareholderReceivablesOnEntity = value;
    }

}