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
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.MonetaryNoDecimalsItemType;
import nl.nltaxonomie.nt13.sbr._20180301.dictionary.nl_types.NonNegativeMonetaryNoDecimalsItemType;
import org.xbrl._2003.instance.BooleanItemType;


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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-tuples}AddressAbroadPresentation" minOccurs="0"/>
 *           &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-tuples}AddressPresentation" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ImmovablePropertyProfitsAndLossesWithdrawal" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ImmovablePropertyWithdrawalBookValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ImmovablePropertyWithdrawalEstimationValuer" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ImmovablePropertyWithdrawalValueOfTrade" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ImmovablePropertyWithdrawalValuerName" minOccurs="0"/>
 *         &lt;element ref="{http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data}ImmovablePropertyWithdrawelTransferToThird" minOccurs="0"/>
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
    "addressAbroadPresentation",
    "addressPresentation",
    "immovablePropertyProfitsAndLossesWithdrawal",
    "immovablePropertyWithdrawalBookValue",
    "immovablePropertyWithdrawalEstimationValuer",
    "immovablePropertyWithdrawalValueOfTrade",
    "immovablePropertyWithdrawalValuerName",
    "immovablePropertyWithdrawelTransferToThird"
})
public class ImmovablePropertyWithdrawalSpecification
    extends Placeholder
{

    @XmlElement(name = "AddressAbroadPresentation", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-tuples")
    protected AddressAbroadPresentation addressAbroadPresentation;
    @XmlElement(name = "AddressPresentation", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-tuples")
    protected AddressPresentation addressPresentation;
    @XmlElement(name = "ImmovablePropertyProfitsAndLossesWithdrawal", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected MonetaryNoDecimalsItemType immovablePropertyProfitsAndLossesWithdrawal;
    @XmlElement(name = "ImmovablePropertyWithdrawalBookValue", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyWithdrawalBookValue;
    @XmlElement(name = "ImmovablePropertyWithdrawalEstimationValuer", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected BooleanItemType immovablePropertyWithdrawalEstimationValuer;
    @XmlElement(name = "ImmovablePropertyWithdrawalValueOfTrade", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected NonNegativeMonetaryNoDecimalsItemType immovablePropertyWithdrawalValueOfTrade;
    @XmlElement(name = "ImmovablePropertyWithdrawalValuerName", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected Anstring70VItemType immovablePropertyWithdrawalValuerName;
    @XmlElement(name = "ImmovablePropertyWithdrawelTransferToThird", namespace = "http://www.nltaxonomie.nl/nt13/bd/20181212.a/dictionary/bd-data")
    protected BooleanItemType immovablePropertyWithdrawelTransferToThird;

    /**
     * Gets the value of the addressAbroadPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public AddressAbroadPresentation getAddressAbroadPresentation() {
        return addressAbroadPresentation;
    }

    /**
     * Sets the value of the addressAbroadPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressAbroadPresentation }
     *     
     */
    public void setAddressAbroadPresentation(AddressAbroadPresentation value) {
        this.addressAbroadPresentation = value;
    }

    /**
     * Gets the value of the addressPresentation property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPresentation }
     *     
     */
    public AddressPresentation getAddressPresentation() {
        return addressPresentation;
    }

    /**
     * Sets the value of the addressPresentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPresentation }
     *     
     */
    public void setAddressPresentation(AddressPresentation value) {
        this.addressPresentation = value;
    }

    /**
     * Gets the value of the immovablePropertyProfitsAndLossesWithdrawal property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public MonetaryNoDecimalsItemType getImmovablePropertyProfitsAndLossesWithdrawal() {
        return immovablePropertyProfitsAndLossesWithdrawal;
    }

    /**
     * Sets the value of the immovablePropertyProfitsAndLossesWithdrawal property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyProfitsAndLossesWithdrawal(MonetaryNoDecimalsItemType value) {
        this.immovablePropertyProfitsAndLossesWithdrawal = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalBookValue property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyWithdrawalBookValue() {
        return immovablePropertyWithdrawalBookValue;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalBookValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalBookValue(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyWithdrawalBookValue = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalEstimationValuer property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyWithdrawalEstimationValuer() {
        return immovablePropertyWithdrawalEstimationValuer;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalEstimationValuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalEstimationValuer(BooleanItemType value) {
        this.immovablePropertyWithdrawalEstimationValuer = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalValueOfTrade property.
     * 
     * @return
     *     possible object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public NonNegativeMonetaryNoDecimalsItemType getImmovablePropertyWithdrawalValueOfTrade() {
        return immovablePropertyWithdrawalValueOfTrade;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalValueOfTrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonNegativeMonetaryNoDecimalsItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalValueOfTrade(NonNegativeMonetaryNoDecimalsItemType value) {
        this.immovablePropertyWithdrawalValueOfTrade = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawalValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link Anstring70VItemType }
     *     
     */
    public Anstring70VItemType getImmovablePropertyWithdrawalValuerName() {
        return immovablePropertyWithdrawalValuerName;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawalValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Anstring70VItemType }
     *     
     */
    public void setImmovablePropertyWithdrawalValuerName(Anstring70VItemType value) {
        this.immovablePropertyWithdrawalValuerName = value;
    }

    /**
     * Gets the value of the immovablePropertyWithdrawelTransferToThird property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanItemType }
     *     
     */
    public BooleanItemType getImmovablePropertyWithdrawelTransferToThird() {
        return immovablePropertyWithdrawelTransferToThird;
    }

    /**
     * Sets the value of the immovablePropertyWithdrawelTransferToThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanItemType }
     *     
     */
    public void setImmovablePropertyWithdrawelTransferToThird(BooleanItemType value) {
        this.immovablePropertyWithdrawelTransferToThird = value;
    }

}
