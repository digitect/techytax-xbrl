//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package org.xbrl._2003.xlink;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xbrl._2003.xlink package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Locator_QNAME = new QName("http://www.xbrl.org/2003/XLink", "locator");
    private final static QName _Resource_QNAME = new QName("http://www.xbrl.org/2003/XLink", "resource");
    private final static QName _Title_QNAME = new QName("http://www.xbrl.org/2003/XLink", "title");
    private final static QName _Arc_QNAME = new QName("http://www.xbrl.org/2003/XLink", "arc");
    private final static QName _Simple_QNAME = new QName("http://www.xbrl.org/2003/XLink", "simple");
    private final static QName _Extended_QNAME = new QName("http://www.xbrl.org/2003/XLink", "extended");
    private final static QName _Documentation_QNAME = new QName("http://www.xbrl.org/2003/XLink", "documentation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xbrl._2003.xlink
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SimpleType }
     * 
     */
    public SimpleType createSimpleType() {
        return new SimpleType();
    }

    /**
     * Create an instance of {@link ExtendedType }
     * 
     */
    public ExtendedType createExtendedType() {
        return new ExtendedType();
    }

    /**
     * Create an instance of {@link LocatorType }
     * 
     */
    public LocatorType createLocatorType() {
        return new LocatorType();
    }

    /**
     * Create an instance of {@link ArcType }
     * 
     */
    public ArcType createArcType() {
        return new ArcType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link DocumentationType }
     * 
     */
    public DocumentationType createDocumentationType() {
        return new DocumentationType();
    }

    /**
     * Create an instance of {@link TitleType }
     * 
     */
    public TitleType createTitleType() {
        return new TitleType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "locator")
    public JAXBElement<LocatorType> createLocator(LocatorType value) {
        return new JAXBElement<LocatorType>(_Locator_QNAME, LocatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "resource")
    public JAXBElement<ResourceType> createResource(ResourceType value) {
        return new JAXBElement<ResourceType>(_Resource_QNAME, ResourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TitleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "title")
    public JAXBElement<TitleType> createTitle(TitleType value) {
        return new JAXBElement<TitleType>(_Title_QNAME, TitleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArcType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "arc")
    public JAXBElement<ArcType> createArc(ArcType value) {
        return new JAXBElement<ArcType>(_Arc_QNAME, ArcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "simple")
    public JAXBElement<SimpleType> createSimple(SimpleType value) {
        return new JAXBElement<SimpleType>(_Simple_QNAME, SimpleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "extended")
    public JAXBElement<ExtendedType> createExtended(ExtendedType value) {
        return new JAXBElement<ExtendedType>(_Extended_QNAME, ExtendedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.xbrl.org/2003/XLink", name = "documentation")
    public JAXBElement<DocumentationType> createDocumentation(DocumentationType value) {
        return new JAXBElement<DocumentationType>(_Documentation_QNAME, DocumentationType.class, null, value);
    }

}
