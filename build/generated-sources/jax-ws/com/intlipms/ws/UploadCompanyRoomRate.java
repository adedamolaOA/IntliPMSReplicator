
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadCompanyRoomRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadCompanyRoomRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomRate" type="{http://services.intlipms.com/}companyRommRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadCompanyRoomRate", propOrder = {
    "roomRate"
})
public class UploadCompanyRoomRate {

    protected CompanyRommRate roomRate;

    /**
     * Gets the value of the roomRate property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyRommRate }
     *     
     */
    public CompanyRommRate getRoomRate() {
        return roomRate;
    }

    /**
     * Sets the value of the roomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyRommRate }
     *     
     */
    public void setRoomRate(CompanyRommRate value) {
        this.roomRate = value;
    }

}
