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
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring20VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring34VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Anstring70VItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.NonNegativeInteger2FItemType;
import nl.nltaxonomie.nt13.bd._20181212_a.dictionary.bd_types.Test11ItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;


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
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsAccountHolderIdentificationNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBalance" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBalanceBenefit" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBalanceBox3BankAccountSavings" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBalanceOriginalCurrency" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBalanceType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBankAccountNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsBankProductLabel" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsCommonInterestIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsProductID" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsRecordType" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}AssetsOnStockAccountsSourceBankTaxReferenceNumber" minOccurs="0"/>
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
    "assetsOnStockAccountsAccountHolderIdentificationNumber",
    "assetsOnStockAccountsBalance",
    "assetsOnStockAccountsBalanceBenefit",
    "assetsOnStockAccountsBalanceBox3BankAccountSavings",
    "assetsOnStockAccountsBalanceOriginalCurrency",
    "assetsOnStockAccountsBalanceType",
    "assetsOnStockAccountsBankAccountNumber",
    "assetsOnStockAccountsBankProductLabel",
    "assetsOnStockAccountsCommonInterestIndication",
    "assetsOnStockAccountsProductID",
    "assetsOnStockAccountsRecordType",
    "assetsOnStockAccountsSourceBankTaxReferenceNumber"
})
public class AssetsOnStockAccountsSpecification
    extends Placeholder
{

    @XmlElement(name = "AssetsOnStockAccountsAccountHolderIdentificationNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Test11ItemType assetsOnStockAccountsAccountHolderIdentificationNumber;
    @XmlElement(name = "AssetsOnStockAccountsBalance", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType assetsOnStockAccountsBalance;
    @XmlElement(name = "AssetsOnStockAccountsBalanceBenefit", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType assetsOnStockAccountsBalanceBenefit;
    @XmlElement(name = "AssetsOnStockAccountsBalanceBox3BankAccountSavings", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType assetsOnStockAccountsBalanceBox3BankAccountSavings;
    @XmlElement(name = "AssetsOnStockAccountsBalanceOriginalCurrency", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType assetsOnStockAccountsBalanceOriginalCurrency;
    @XmlElement(name = "AssetsOnStockAccountsBalanceType", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeInteger2FItemType assetsOnStockAccountsBalanceType;
    @XmlElement(name = "AssetsOnStockAccountsBankAccountNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring34VItemType assetsOnStockAccountsBankAccountNumber;
    @XmlElement(name = "AssetsOnStockAccountsBankProductLabel", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring70VItemType assetsOnStockAccountsBankProductLabel;
    @XmlElement(name = "AssetsOnStockAccountsCommonInterestIndication", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeInteger2FItemType assetsOnStockAccountsCommonInterestIndication;
    @XmlElement(name = "AssetsOnStockAccountsProductID", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring20VItemType assetsOnStockAccountsProductID;
    @XmlElement(name = "AssetsOnStockAccountsRecordType", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeInteger2FItemType assetsOnStockAccountsRecordType;
    @XmlElement(name = "AssetsOnStockAccountsSourceBankTaxReferenceNumber", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Test11ItemType assetsOnStockAccountsSourceBankTaxReferenceNumber;

    /**
     * Gets the value of the assetsOnStockAccountsAccountHolderIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getAssetsOnStockAccountsAccountHolderIdentificationNumber() {
        return assetsOnStockAccountsAccountHolderIdentificationNumber;
    }

    /**
     * Sets the value of the assetsOnStockAccountsAccountHolderIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setAssetsOnStockAccountsAccountHolderIdentificationNumber(Test11ItemType value) {
        this.assetsOnStockAccountsAccountHolderIdentificationNumber = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBalance property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAssetsOnStockAccountsBalance() {
        return assetsOnStockAccountsBalance;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOnStockAccountsBalance(NonNegativeMonetaryNoDecimalsItemType value) {
        this.assetsOnStockAccountsBalance = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBalanceBenefit property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAssetsOnStockAccountsBalanceBenefit() {
        return assetsOnStockAccountsBalanceBenefit;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBalanceBenefit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOnStockAccountsBalanceBenefit(NonNegativeMonetaryNoDecimalsItemType value) {
        this.assetsOnStockAccountsBalanceBenefit = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBalanceBox3BankAccountSavings property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAssetsOnStockAccountsBalanceBox3BankAccountSavings() {
        return assetsOnStockAccountsBalanceBox3BankAccountSavings;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBalanceBox3BankAccountSavings property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOnStockAccountsBalanceBox3BankAccountSavings(NonNegativeMonetaryNoDecimalsItemType value) {
        this.assetsOnStockAccountsBalanceBox3BankAccountSavings = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBalanceOriginalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getAssetsOnStockAccountsBalanceOriginalCurrency() {
        return assetsOnStockAccountsBalanceOriginalCurrency;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBalanceOriginalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setAssetsOnStockAccountsBalanceOriginalCurrency(NonNegativeMonetaryNoDecimalsItemType value) {
        this.assetsOnStockAccountsBalanceOriginalCurrency = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBalanceType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getAssetsOnStockAccountsBalanceType() {
        return assetsOnStockAccountsBalanceType;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBalanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setAssetsOnStockAccountsBalanceType(NonNegativeInteger2FItemType value) {
        this.assetsOnStockAccountsBalanceType = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring34VItemType }
     *     
     */
    public Anstring34VItemType getAssetsOnStockAccountsBankAccountNumber() {
        return assetsOnStockAccountsBankAccountNumber;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring34VItemType }
     *     
     */
    public void setAssetsOnStockAccountsBankAccountNumber(Anstring34VItemType value) {
        this.assetsOnStockAccountsBankAccountNumber = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsBankProductLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getAssetsOnStockAccountsBankProductLabel() {
        return assetsOnStockAccountsBankProductLabel;
    }

    /**
     * Sets the value of the assetsOnStockAccountsBankProductLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setAssetsOnStockAccountsBankProductLabel(Anstring70VItemType value) {
        this.assetsOnStockAccountsBankProductLabel = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsCommonInterestIndication property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getAssetsOnStockAccountsCommonInterestIndication() {
        return assetsOnStockAccountsCommonInterestIndication;
    }

    /**
     * Sets the value of the assetsOnStockAccountsCommonInterestIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setAssetsOnStockAccountsCommonInterestIndication(NonNegativeInteger2FItemType value) {
        this.assetsOnStockAccountsCommonInterestIndication = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsProductID property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring20VItemType }
     *     
     */
    public Anstring20VItemType getAssetsOnStockAccountsProductID() {
        return assetsOnStockAccountsProductID;
    }

    /**
     * Sets the value of the assetsOnStockAccountsProductID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring20VItemType }
     *     
     */
    public void setAssetsOnStockAccountsProductID(Anstring20VItemType value) {
        this.assetsOnStockAccountsProductID = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public NonNegativeInteger2FItemType getAssetsOnStockAccountsRecordType() {
        return assetsOnStockAccountsRecordType;
    }

    /**
     * Sets the value of the assetsOnStockAccountsRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeInteger2FItemType }
     *     
     */
    public void setAssetsOnStockAccountsRecordType(NonNegativeInteger2FItemType value) {
        this.assetsOnStockAccountsRecordType = value;
    }

    /**
     * Gets the value of the assetsOnStockAccountsSourceBankTaxReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Test11ItemType }
     *     
     */
    public Test11ItemType getAssetsOnStockAccountsSourceBankTaxReferenceNumber() {
        return assetsOnStockAccountsSourceBankTaxReferenceNumber;
    }

    /**
     * Sets the value of the assetsOnStockAccountsSourceBankTaxReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Test11ItemType }
     *     
     */
    public void setAssetsOnStockAccountsSourceBankTaxReferenceNumber(Test11ItemType value) {
        this.assetsOnStockAccountsSourceBankTaxReferenceNumber = value;
    }

}
