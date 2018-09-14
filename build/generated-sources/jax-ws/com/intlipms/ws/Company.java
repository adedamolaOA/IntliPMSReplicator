
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for company complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="company">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compPhone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companyid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="compcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compothernames" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compphone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="compreligion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comptypeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="departmentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replicationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "company", propOrder = {
    "compPhone1",
    "compRC",
    "compaddress",
    "companyid",
    "compcity",
    "compemail",
    "compname",
    "compothernames",
    "compphone2",
    "compreligion",
    "comptypeid",
    "createdBy",
    "custstate",
    "dateCreated",
    "dateUpdated",
    "departmentid",
    "employeeid",
    "globalId",
    "hotelId",
    "maxCredit",
    "replicationStatus",
    "updatedBy"
})
public class Company {

    protected String compPhone1;
    protected String compRC;
    protected String compaddress;
    protected Integer companyid;
    protected String compcity;
    protected String compemail;
    protected String compname;
    protected String compothernames;
    protected String compphone2;
    protected String compreligion;
    protected String comptypeid;
    protected String createdBy;
    protected String custstate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdated;
    protected String departmentid;
    protected String employeeid;
    protected String globalId;
    protected String hotelId;
    protected String maxCredit;
    protected Boolean replicationStatus;
    protected String updatedBy;

    /**
     * Gets the value of the compPhone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompPhone1() {
        return compPhone1;
    }

    /**
     * Sets the value of the compPhone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompPhone1(String value) {
        this.compPhone1 = value;
    }

    /**
     * Gets the value of the compRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompRC() {
        return compRC;
    }

    /**
     * Sets the value of the compRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompRC(String value) {
        this.compRC = value;
    }

    /**
     * Gets the value of the compaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompaddress() {
        return compaddress;
    }

    /**
     * Sets the value of the compaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompaddress(String value) {
        this.compaddress = value;
    }

    /**
     * Gets the value of the companyid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * Sets the value of the companyid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompanyid(Integer value) {
        this.companyid = value;
    }

    /**
     * Gets the value of the compcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompcity() {
        return compcity;
    }

    /**
     * Sets the value of the compcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompcity(String value) {
        this.compcity = value;
    }

    /**
     * Gets the value of the compemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompemail() {
        return compemail;
    }

    /**
     * Sets the value of the compemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompemail(String value) {
        this.compemail = value;
    }

    /**
     * Gets the value of the compname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompname() {
        return compname;
    }

    /**
     * Sets the value of the compname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompname(String value) {
        this.compname = value;
    }

    /**
     * Gets the value of the compothernames property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompothernames() {
        return compothernames;
    }

    /**
     * Sets the value of the compothernames property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompothernames(String value) {
        this.compothernames = value;
    }

    /**
     * Gets the value of the compphone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompphone2() {
        return compphone2;
    }

    /**
     * Sets the value of the compphone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompphone2(String value) {
        this.compphone2 = value;
    }

    /**
     * Gets the value of the compreligion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompreligion() {
        return compreligion;
    }

    /**
     * Sets the value of the compreligion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompreligion(String value) {
        this.compreligion = value;
    }

    /**
     * Gets the value of the comptypeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComptypeid() {
        return comptypeid;
    }

    /**
     * Sets the value of the comptypeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComptypeid(String value) {
        this.comptypeid = value;
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
     * Gets the value of the custstate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuststate() {
        return custstate;
    }

    /**
     * Sets the value of the custstate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuststate(String value) {
        this.custstate = value;
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
     * Gets the value of the employeeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeid() {
        return employeeid;
    }

    /**
     * Sets the value of the employeeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeid(String value) {
        this.employeeid = value;
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
     * Gets the value of the maxCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCredit() {
        return maxCredit;
    }

    /**
     * Sets the value of the maxCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCredit(String value) {
        this.maxCredit = value;
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
