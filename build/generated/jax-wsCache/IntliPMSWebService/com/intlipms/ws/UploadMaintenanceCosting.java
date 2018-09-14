
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMaintenanceCosting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadMaintenanceCosting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="costing" type="{http://services.intlipms.com/}maintCosting" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMaintenanceCosting", propOrder = {
    "costing"
})
public class UploadMaintenanceCosting {

    protected MaintCosting costing;

    /**
     * Gets the value of the costing property.
     * 
     * @return
     *     possible object is
     *     {@link MaintCosting }
     *     
     */
    public MaintCosting getCosting() {
        return costing;
    }

    /**
     * Sets the value of the costing property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintCosting }
     *     
     */
    public void setCosting(MaintCosting value) {
        this.costing = value;
    }

}
