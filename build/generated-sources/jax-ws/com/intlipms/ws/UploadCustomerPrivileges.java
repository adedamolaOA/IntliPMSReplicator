
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadCustomerPrivileges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadCustomerPrivileges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privilege" type="{http://services.intlipms.com/}customerPrivileges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadCustomerPrivileges", propOrder = {
    "privilege"
})
public class UploadCustomerPrivileges {

    protected CustomerPrivileges privilege;

    /**
     * Gets the value of the privilege property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerPrivileges }
     *     
     */
    public CustomerPrivileges getPrivilege() {
        return privilege;
    }

    /**
     * Sets the value of the privilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerPrivileges }
     *     
     */
    public void setPrivilege(CustomerPrivileges value) {
        this.privilege = value;
    }

}
