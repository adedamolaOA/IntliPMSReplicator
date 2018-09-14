
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadCompanyPrivileges complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadCompanyPrivileges">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="privilege" type="{http://services.intlipms.com/}companyPrivileges" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadCompanyPrivileges", propOrder = {
    "privilege"
})
public class UploadCompanyPrivileges {

    protected CompanyPrivileges privilege;

    /**
     * Gets the value of the privilege property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyPrivileges }
     *     
     */
    public CompanyPrivileges getPrivilege() {
        return privilege;
    }

    /**
     * Sets the value of the privilege property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyPrivileges }
     *     
     */
    public void setPrivilege(CompanyPrivileges value) {
        this.privilege = value;
    }

}
