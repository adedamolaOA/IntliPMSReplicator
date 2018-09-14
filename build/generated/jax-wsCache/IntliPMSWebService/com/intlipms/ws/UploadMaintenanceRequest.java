
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMaintenanceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadMaintenanceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maintenanceRequest" type="{http://services.intlipms.com/}maintRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMaintenanceRequest", propOrder = {
    "maintenanceRequest"
})
public class UploadMaintenanceRequest {

    protected MaintRequest maintenanceRequest;

    /**
     * Gets the value of the maintenanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MaintRequest }
     *     
     */
    public MaintRequest getMaintenanceRequest() {
        return maintenanceRequest;
    }

    /**
     * Sets the value of the maintenanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintRequest }
     *     
     */
    public void setMaintenanceRequest(MaintRequest value) {
        this.maintenanceRequest = value;
    }

}
