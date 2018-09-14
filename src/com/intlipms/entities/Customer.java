/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerid", query = "SELECT c FROM Customer c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "Customer.findByCustfirstName", query = "SELECT c FROM Customer c WHERE c.custfirstName = :custfirstName")
    , @NamedQuery(name = "Customer.findByCustlastname", query = "SELECT c FROM Customer c WHERE c.custlastname = :custlastname")
    , @NamedQuery(name = "Customer.findByCustothername", query = "SELECT c FROM Customer c WHERE c.custothername = :custothername")
    , @NamedQuery(name = "Customer.findByCustlistedname", query = "SELECT c FROM Customer c WHERE c.custlistedname = :custlistedname")
    , @NamedQuery(name = "Customer.findByCustsex", query = "SELECT c FROM Customer c WHERE c.custsex = :custsex")
    , @NamedQuery(name = "Customer.findByCustDOB", query = "SELECT c FROM Customer c WHERE c.custDOB = :custDOB")
    , @NamedQuery(name = "Customer.findByVIPstatusid", query = "SELECT c FROM Customer c WHERE c.vIPstatusid = :vIPstatusid")
    , @NamedQuery(name = "Customer.findByCustphone1", query = "SELECT c FROM Customer c WHERE c.custphone1 = :custphone1")
    , @NamedQuery(name = "Customer.findByCustphone1call", query = "SELECT c FROM Customer c WHERE c.custphone1call = :custphone1call")
    , @NamedQuery(name = "Customer.findByCustphone1sms", query = "SELECT c FROM Customer c WHERE c.custphone1sms = :custphone1sms")
    , @NamedQuery(name = "Customer.findByCustphone1whatsapp", query = "SELECT c FROM Customer c WHERE c.custphone1whatsapp = :custphone1whatsapp")
    , @NamedQuery(name = "Customer.findByCustphone2", query = "SELECT c FROM Customer c WHERE c.custphone2 = :custphone2")
    , @NamedQuery(name = "Customer.findByCustemail", query = "SELECT c FROM Customer c WHERE c.custemail = :custemail")
    , @NamedQuery(name = "Customer.findByCustcity", query = "SELECT c FROM Customer c WHERE c.custcity = :custcity")
    , @NamedQuery(name = "Customer.findByCuststate", query = "SELECT c FROM Customer c WHERE c.custstate = :custstate")
    , @NamedQuery(name = "Customer.findByCustcountry", query = "SELECT c FROM Customer c WHERE c.custcountry = :custcountry")
    , @NamedQuery(name = "Customer.findByCustreligion", query = "SELECT c FROM Customer c WHERE c.custreligion = :custreligion")
    , @NamedQuery(name = "Customer.findByDepertmentid", query = "SELECT c FROM Customer c WHERE c.depertmentid = :depertmentid")
    , @NamedQuery(name = "Customer.findByEmployeeId", query = "SELECT c FROM Customer c WHERE c.employeeId = :employeeId")
    , @NamedQuery(name = "Customer.findByDateCreated", query = "SELECT c FROM Customer c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Customer.findByCreatedBy", query = "SELECT c FROM Customer c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Customer.findByDateUpdated", query = "SELECT c FROM Customer c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Customer.findByUpdatedBy", query = "SELECT c FROM Customer c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Customer.findByReplicationStatus", query = "SELECT c FROM Customer c WHERE c.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "Customer.findByMaxCredit", query = "SELECT c FROM Customer c WHERE c.maxCredit = :maxCredit")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Customer_id")
    private Integer customerid;
    @Column(name = "Cust_firstName")
    private String custfirstName;
    @Column(name = "Cust_lastname")
    private String custlastname;
    @Column(name = "Cust_othername")
    private String custothername;
    @Column(name = "Cust_listedname")
    private String custlistedname;
    @Column(name = "Cust_sex")
    private String custsex;
    @Column(name = "Cust_DOB")
    private String custDOB;
    @Column(name = "VIP_status_id")
    private Integer vIPstatusid;
    @Column(name = "Cust_phone1")
    private String custphone1;
    @Column(name = "Cust_phone1_call")
    private Boolean custphone1call;
    @Column(name = "Cust_phone1_sms")
    private Boolean custphone1sms;
    @Column(name = "Cust_phone1_whatsapp")
    private Boolean custphone1whatsapp;
    @Column(name = "Cust_phone2")
    private String custphone2;
    @Column(name = "Cust_email")
    private String custemail;
    @Lob
    @Column(name = "Cust_address")
    private String custaddress;
    @Column(name = "Cust_city")
    private String custcity;
    @Column(name = "Cust_state")
    private String custstate;
    @Column(name = "Cust_country")
    private String custcountry;
    @Column(name = "Cust_religion")
    private String custreligion;
    @Column(name = "Depertment_id")
    private String depertmentid;
    @Column(name = "employee_id")
    private String employeeId;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "replication_status")
    private Boolean replicationStatus;
    @Column(name = "max_credit")
    private String maxCredit;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;
    @OneToMany(mappedBy = "customerpayid")
    private Collection<Checkinlog> checkinlogCollection;
    @OneToMany(mappedBy = "customercheckinid")
    private Collection<Checkinlog> checkinlogCollection1;
    @OneToMany(mappedBy = "customerid")
    private Collection<BookingLog> bookingLogCollection;
    @OneToMany(mappedBy = "customerpayid")
    private Collection<BookingLog> bookingLogCollection1;
    @OneToMany(mappedBy = "relationshipcustid")
    private Collection<BookingLog> bookingLogCollection2;

    public Customer() {
    }

    public Customer(Integer customerid) {
        this.customerid = customerid;
    }

    public Integer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Integer customerid) {
        this.customerid = customerid;
    }

    public String getCustfirstName() {
        return custfirstName;
    }

    public void setCustfirstName(String custfirstName) {
        this.custfirstName = custfirstName;
    }

    public String getCustlastname() {
        return custlastname;
    }

    public void setCustlastname(String custlastname) {
        this.custlastname = custlastname;
    }

    public String getCustothername() {
        return custothername;
    }

    public void setCustothername(String custothername) {
        this.custothername = custothername;
    }

    public String getCustlistedname() {
        return custlistedname;
    }

    public void setCustlistedname(String custlistedname) {
        this.custlistedname = custlistedname;
    }

    public String getCustsex() {
        return custsex;
    }

    public void setCustsex(String custsex) {
        this.custsex = custsex;
    }

    public String getCustDOB() {
        return custDOB;
    }

    public void setCustDOB(String custDOB) {
        this.custDOB = custDOB;
    }

    public Integer getVIPstatusid() {
        return vIPstatusid;
    }

    public void setVIPstatusid(Integer vIPstatusid) {
        this.vIPstatusid = vIPstatusid;
    }

    public String getCustphone1() {
        return custphone1;
    }

    public void setCustphone1(String custphone1) {
        this.custphone1 = custphone1;
    }

    public Boolean getCustphone1call() {
        return custphone1call;
    }

    public void setCustphone1call(Boolean custphone1call) {
        this.custphone1call = custphone1call;
    }

    public Boolean getCustphone1sms() {
        return custphone1sms;
    }

    public void setCustphone1sms(Boolean custphone1sms) {
        this.custphone1sms = custphone1sms;
    }

    public Boolean getCustphone1whatsapp() {
        return custphone1whatsapp;
    }

    public void setCustphone1whatsapp(Boolean custphone1whatsapp) {
        this.custphone1whatsapp = custphone1whatsapp;
    }

    public String getCustphone2() {
        return custphone2;
    }

    public void setCustphone2(String custphone2) {
        this.custphone2 = custphone2;
    }

    public String getCustemail() {
        return custemail;
    }

    public void setCustemail(String custemail) {
        this.custemail = custemail;
    }

    public String getCustaddress() {
        return custaddress;
    }

    public void setCustaddress(String custaddress) {
        this.custaddress = custaddress;
    }

    public String getCustcity() {
        return custcity;
    }

    public void setCustcity(String custcity) {
        this.custcity = custcity;
    }

    public String getCuststate() {
        return custstate;
    }

    public void setCuststate(String custstate) {
        this.custstate = custstate;
    }

    public String getCustcountry() {
        return custcountry;
    }

    public void setCustcountry(String custcountry) {
        this.custcountry = custcountry;
    }

    public String getCustreligion() {
        return custreligion;
    }

    public void setCustreligion(String custreligion) {
        this.custreligion = custreligion;
    }

    public String getDepertmentid() {
        return depertmentid;
    }

    public void setDepertmentid(String depertmentid) {
        this.depertmentid = depertmentid;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(Boolean replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public String getMaxCredit() {
        return maxCredit;
    }

    public void setMaxCredit(String maxCredit) {
        this.maxCredit = maxCredit;
    }

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    @XmlTransient
    public Collection<Checkinlog> getCheckinlogCollection() {
        return checkinlogCollection;
    }

    public void setCheckinlogCollection(Collection<Checkinlog> checkinlogCollection) {
        this.checkinlogCollection = checkinlogCollection;
    }

    @XmlTransient
    public Collection<Checkinlog> getCheckinlogCollection1() {
        return checkinlogCollection1;
    }

    public void setCheckinlogCollection1(Collection<Checkinlog> checkinlogCollection1) {
        this.checkinlogCollection1 = checkinlogCollection1;
    }

    @XmlTransient
    public Collection<BookingLog> getBookingLogCollection() {
        return bookingLogCollection;
    }

    public void setBookingLogCollection(Collection<BookingLog> bookingLogCollection) {
        this.bookingLogCollection = bookingLogCollection;
    }

    @XmlTransient
    public Collection<BookingLog> getBookingLogCollection1() {
        return bookingLogCollection1;
    }

    public void setBookingLogCollection1(Collection<BookingLog> bookingLogCollection1) {
        this.bookingLogCollection1 = bookingLogCollection1;
    }

    @XmlTransient
    public Collection<BookingLog> getBookingLogCollection2() {
        return bookingLogCollection2;
    }

    public void setBookingLogCollection2(Collection<BookingLog> bookingLogCollection2) {
        this.bookingLogCollection2 = bookingLogCollection2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Customer[ customerid=" + customerid + " ]";
    }
    
}
