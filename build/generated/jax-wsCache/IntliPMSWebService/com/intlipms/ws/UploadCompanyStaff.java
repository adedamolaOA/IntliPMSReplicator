
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadCompanyStaff complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadCompanyStaff">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerCompany" type="{http://services.intlipms.com/}companyCustomer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadCompanyStaff", propOrder = {
    "customerCompany"
})
public class UploadCompanyStaff {

    protected CompanyCustomer customerCompany;

    /**
     * Gets the value of the customerCompany property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyCustomer }
     *     
     */
    public CompanyCustomer getCustomerCompany() {
        return customerCompany;
    }

    /**
     * Sets the value of the customerCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyCustomer }
     *     
     */
    public void setCustomerCompany(CompanyCustomer value) {
        this.customerCompany = value;
    }

}
