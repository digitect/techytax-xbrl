//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.04.10 at 11:10:53 AM CEST 
//


package org.xbrl._2003.linkbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.xbrl._2003.xlink.SimpleType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.xbrl.org/2003/XLink}simpleType">
 *       &lt;attribute name="roleURI" use="required" type="{http://www.xbrl.org/2003/XLink}nonEmptyURI" />
 *       &lt;anyAttribute processContents='lax' namespace='http://www.w3.org/XML/1998/namespace'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class RoleRef
    extends SimpleType
{

    @XmlAttribute(name = "roleURI", required = true)
    protected String roleURI;

    /**
     * Gets the value of the roleURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleURI() {
        return roleURI;
    }

    /**
     * Sets the value of the roleURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleURI(String value) {
        this.roleURI = value;
    }

}
