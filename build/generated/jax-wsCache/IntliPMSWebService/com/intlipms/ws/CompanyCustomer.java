
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for companyCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="companyCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compCustId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="companyid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contactisBooking" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contactisFandB" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contactisPayment" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contactisReport" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="contacttype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="departmentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replicationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rightsLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "companyCustomer", propOrder = {
    "compCustId",
    "companyid",
    "contactisBooking",
    "contactisFandB",
    "contactisPayment",
    "contactisReport",
    "contacttype",
    "createdBy",
    "customerid",
    "dateCreated",
    "dateUpdated",
    "departmentid",
    "employeeId",
    "globalId",
    "hotelId",
    "replicationStatus",
    "rightsLevel",
    "updatedBy"
})
public class CompanyCustomer {

    protected Integer compCustId;
    protected String companyid;
    protected Short contactisBooking;
    protected Short contactisFandB;
    protected Short contactisPayment;
    protected Short contactisReport;
    protected String contacttype;
    protected String createdBy;
    protected String customerid;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdated;
    protected String departmentid;
    protected String employeeId;
    protected String globalId;
    protected String hotelId;
    protected Boolean replicationStatus;
    protected String rightsLevel;
    protected String updatedBy;

    /**
     * Gets the value of the compCustId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompCustId() {
        return compCustId;
    }

    /**
     * Sets the value of the compCustId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompCustId(Integer value) {
        this.compCustId = value;
    }

    /**
     * Gets the value of the companyid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyid() {
        return companyid;
    }

    /**
     * Sets the value of the companyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyid(String value) {
        this.companyid = value;
    }

    /**
     * Gets the value of the contactisBooking property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContactisBooking() {
        return contactisBooking;
    }

    /**
     * Sets the value of the contactisBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContactisBooking(Short value) {
        this.contactisBooking = value;
    }

    /**
     * Gets the value of the contactisFandB property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContactisFandB() {
        return contactisFandB;
    }

    /**
     * Sets the value of the contactisFandB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContactisFandB(Short value) {
        this.contactisFandB = value;
    }

    /**
     * Gets the value of the contactisPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContactisPayment() {
        return contactisPayment;
    }

    /**
     * Sets the value of the contactisPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContactisPayment(Short value) {
        this.contactisPayment = value;
    }

    /**
     * Gets the value of the contactisReport property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContactisReport() {
        return contactisReport;
    }

    /**
     * Sets the value of the contactisReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContactisReport(Short value) {
        this.contactisReport = value;
    }

    /**
     * Gets the value of the contacttype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContacttype() {
        return contacttype;
    }

    /**
     * Sets the value of the contacttype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContacttype(String value) {
        this.contacttype = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerid(String value) {
        this.customerid = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the dateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Sets the value of the dateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdated(XMLGregorianCalendar value) {
        this.dateUpdated = value;
    }

    /**
     * Gets the value of the departmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentid() {
        return departmentid;
    }

    /**
     * Sets the value of the departmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentid(String value) {
        this.departmentid = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

    /**
     * Gets the value of the globalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalId() {
        return globalId;
    }

    /**
     * Sets the value of the globalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalId(String value) {
        this.globalId = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the replicationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReplicationStatus() {
        return replicationStatus;
    }

    /**
     * Sets the value of the replicationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReplicationStatus(Boolean value) {
        this.replicationStatus = value;
    }

    /**
     * Gets the value of the rightsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsLevel() {
        return rightsLevel;
    }

    /**
     * Sets the value of the rightsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsLevel(String value) {
        this.rightsLevel = value;
    }

    /**
     * Gets the value of the updatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * Sets the value of the updatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

}
