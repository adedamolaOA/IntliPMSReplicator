
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for uploadMaintenanceFunds complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="uploadMaintenanceFunds">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fund" type="{http://services.intlipms.com/}maintFunds" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadMaintenanceFunds", propOrder = {
    "fund"
})
public class UploadMaintenanceFunds {

    protected MaintFunds fund;

    /**
     * Gets the value of the fund property.
     * 
     * @return
     *     possible object is
     *     {@link MaintFunds }
     *     
     */
    public MaintFunds getFund() {
        return fund;
    }

    /**
     * Sets the value of the fund property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintFunds }
     *     
     */
    public void setFund(MaintFunds value) {
        this.fund = value;
    }

}
