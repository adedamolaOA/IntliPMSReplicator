
package com.intlipms.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for customer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custDOB" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="custaddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custcity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custcountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custemail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custfirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custlastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custlistedname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custothername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custphone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custphone1call" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="custphone1sms" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="custphone1whatsapp" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="custphone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custreligion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custsex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custstate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="depertmentid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="employeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="globalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replicationStatus" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="updatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VIPstatusid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
    "createdBy",
    "custDOB",
    "custaddress",
    "custcity",
    "custcountry",
    "custemail",
    "custfirstName",
    "custlastname",
    "custlistedname",
    "customerid",
    "custothername",
    "custphone1",
    "custphone1Call",
    "custphone1Sms",
    "custphone1Whatsapp",
    "custphone2",
    "custreligion",
    "custsex",
    "custstate",
    "dateCreated",
    "dateUpdated",
    "depertmentid",
    "employeeId",
    "globalId",
    "hotelId",
    "maxCredit",
    "replicationStatus",
    "updatedBy",
    "viPstatusid"
})
public class Customer {

    protected String createdBy;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar custDOB;
    protected String custaddress;
    protected String custcity;
    protected String custcountry;
    protected String custemail;
    protected String custfirstName;
    protected String custlastname;
    protected String custlistedname;
    protected Integer customerid;
    protected String custothername;
    protected String custphone1;
    @XmlElement(name = "custphone1call")
    protected Short custphone1Call;
    @XmlElement(name = "custphone1sms")
    protected Short custphone1Sms;
    @XmlElement(name = "custphone1whatsapp")
    protected Short custphone1Whatsapp;
    protected String custphone2;
    protected String custreligion;
    protected String custsex;
    protected String custstate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdated;
    protected String depertmentid;
    protected String employeeId;
    protected String globalId;
    protected String hotelId;
    protected String maxCredit;
    protected Boolean replicationStatus;
    protected String updatedBy;
    @XmlElement(name = "VIPstatusid")
    protected Integer viPstatusid;

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
     * Gets the value of the custDOB property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustDOB() {
        return custDOB;
    }

    /**
     * Sets the value of the custDOB property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustDOB(XMLGregorianCalendar value) {
        this.custDOB = value;
    }

    /**
     * Gets the value of the custaddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustaddress() {
        return custaddress;
    }

    /**
     * Sets the value of the custaddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustaddress(String value) {
        this.custaddress = value;
    }

    /**
     * Gets the value of the custcity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustcity() {
        return custcity;
    }

    /**
     * Sets the value of the custcity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustcity(String value) {
        this.custcity = value;
    }

    /**
     * Gets the value of the custcountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustcountry() {
        return custcountry;
    }

    /**
     * Sets the value of the custcountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustcountry(String value) {
        this.custcountry = value;
    }

    /**
     * Gets the value of the custemail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustemail() {
        return custemail;
    }

    /**
     * Sets the value of the custemail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustemail(String value) {
        this.custemail = value;
    }

    /**
     * Gets the value of the custfirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustfirstName() {
        return custfirstName;
    }

    /**
     * Sets the value of the custfirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustfirstName(String value) {
        this.custfirstName = value;
    }

    /**
     * Gets the value of the custlastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustlastname() {
        return custlastname;
    }

    /**
     * Sets the value of the custlastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustlastname(String value) {
        this.custlastname = value;
    }

    /**
     * Gets the value of the custlistedname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustlistedname() {
        return custlistedname;
    }

    /**
     * Sets the value of the custlistedname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustlistedname(String value) {
        this.custlistedname = value;
    }

    /**
     * Gets the value of the customerid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCustomerid() {
        return customerid;
    }

    /**
     * Sets the value of the customerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCustomerid(Integer value) {
        this.customerid = value;
    }

    /**
     * Gets the value of the custothername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustothername() {
        return custothername;
    }

    /**
     * Sets the value of the custothername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustothername(String value) {
        this.custothername = value;
    }

    /**
     * Gets the value of the custphone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustphone1() {
        return custphone1;
    }

    /**
     * Sets the value of the custphone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustphone1(String value) {
        this.custphone1 = value;
    }

    /**
     * Gets the value of the custphone1Call property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustphone1Call() {
        return custphone1Call;
    }

    /**
     * Sets the value of the custphone1Call property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustphone1Call(Short value) {
        this.custphone1Call = value;
    }

    /**
     * Gets the value of the custphone1Sms property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustphone1Sms() {
        return custphone1Sms;
    }

    /**
     * Sets the value of the custphone1Sms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustphone1Sms(Short value) {
        this.custphone1Sms = value;
    }

    /**
     * Gets the value of the custphone1Whatsapp property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCustphone1Whatsapp() {
        return custphone1Whatsapp;
    }

    /**
     * Sets the value of the custphone1Whatsapp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCustphone1Whatsapp(Short value) {
        this.custphone1Whatsapp = value;
    }

    /**
     * Gets the value of the custphone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustphone2() {
        return custphone2;
    }

    /**
     * Sets the value of the custphone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustphone2(String value) {
        this.custphone2 = value;
    }

    /**
     * Gets the value of the custreligion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustreligion() {
        return custreligion;
    }

    /**
     * Sets the value of the custreligion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustreligion(String value) {
        this.custreligion = value;
    }

    /**
     * Gets the value of the custsex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustsex() {
        return custsex;
    }

    /**
     * Sets the value of the custsex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustsex(String value) {
        this.custsex = value;
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
     * Gets the value of the depertmentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepertmentid() {
        return depertmentid;
    }

    /**
     * Sets the value of the depertmentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepertmentid(String value) {
        this.depertmentid = value;
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

    /**
     * Gets the value of the viPstatusid property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVIPstatusid() {
        return viPstatusid;
    }

    /**
     * Sets the value of the viPstatusid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVIPstatusid(Integer value) {
        this.viPstatusid = value;
    }

}
