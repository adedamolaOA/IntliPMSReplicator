
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMaintenanceRequestApproval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadMaintenanceRequestApproval">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="approval" type="{http://services.intlipms.com/}maintAproval" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMaintenanceRequestApproval", propOrder = {
    "approval"
})
public class UploadMaintenanceRequestApproval {

    protected MaintAproval approval;

    /**
     * Gets the value of the approval property.
     * 
     * @return
     *     possible object is
     *     {@link MaintAproval }
     *     
     */
    public MaintAproval getApproval() {
        return approval;
    }

    /**
     * Sets the value of the approval property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintAproval }
     *     
     */
    public void setApproval(MaintAproval value) {
        this.approval = value;
    }

}
