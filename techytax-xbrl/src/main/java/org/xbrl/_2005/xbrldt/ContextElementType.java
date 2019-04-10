//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package org.xbrl._2005.xbrldt;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contextElementType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="contextElementType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="segment"/>
 *     &lt;enumeration value="scenario"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "contextElementType", namespace = "http://xbrl.org/2005/xbrldt")
@XmlEnum
public enum ContextElementType {

    @XmlEnumValue("segment")
    SEGMENT("segment"),
    @XmlEnumValue("scenario")
    SCENARIO("scenario");
    private final String value;

    ContextElementType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContextElementType fromValue(String v) {
        for (ContextElementType c: ContextElementType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
