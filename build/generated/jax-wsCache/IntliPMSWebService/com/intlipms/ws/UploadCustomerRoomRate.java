
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadCustomerRoomRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadCustomerRoomRate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomRate" type="{http://services.intlipms.com/}customerRoomRate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadCustomerRoomRate", propOrder = {
    "roomRate"
})
public class UploadCustomerRoomRate {

    protected CustomerRoomRate roomRate;

    /**
     * Gets the value of the roomRate property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerRoomRate }
     *     
     */
    public CustomerRoomRate getRoomRate() {
        return roomRate;
    }

    /**
     * Sets the value of the roomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerRoomRate }
     *     
     */
    public void setRoomRate(CustomerRoomRate value) {
        this.roomRate = value;
    }

}
