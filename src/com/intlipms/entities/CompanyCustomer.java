/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "Company_Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyCustomer.findAll", query = "SELECT c FROM CompanyCustomer c")
    , @NamedQuery(name = "CompanyCustomer.findByCompCustId", query = "SELECT c FROM CompanyCustomer c WHERE c.compCustId = :compCustId")
    , @NamedQuery(name = "CompanyCustomer.findByCompanyid", query = "SELECT c FROM CompanyCustomer c WHERE c.companyid = :companyid")
    , @NamedQuery(name = "CompanyCustomer.findByCustomerid", query = "SELECT c FROM CompanyCustomer c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "CompanyCustomer.findByContacttype", query = "SELECT c FROM CompanyCustomer c WHERE c.contacttype = :contacttype")
    , @NamedQuery(name = "CompanyCustomer.findByRightsLevel", query = "SELECT c FROM CompanyCustomer c WHERE c.rightsLevel = :rightsLevel")
    , @NamedQuery(name = "CompanyCustomer.findByContactisReport", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisReport = :contactisReport")
    , @NamedQuery(name = "CompanyCustomer.findByContactisBooking", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisBooking = :contactisBooking")
    , @NamedQuery(name = "CompanyCustomer.findByContactisPayment", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisPayment = :contactisPayment")
    , @NamedQuery(name = "CompanyCustomer.findByContactisFandB", query = "SELECT c FROM CompanyCustomer c WHERE c.contactisFandB = :contactisFandB")
    , @NamedQuery(name = "CompanyCustomer.findByDepartmentid", query = "SELECT c FROM CompanyCustomer c WHERE c.departmentid = :departmentid")
    , @NamedQuery(name = "CompanyCustomer.findByEmployeeId", query = "SELECT c FROM CompanyCustomer c WHERE c.employeeId = :employeeId")
    , @NamedQuery(name = "CompanyCustomer.findByDateCreated", query = "SELECT c FROM CompanyCustomer c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CompanyCustomer.findByCreatedBy", query = "SELECT c FROM CompanyCustomer c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CompanyCustomer.findByDateUpdated", query = "SELECT c FROM CompanyCustomer c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CompanyCustomer.findByUpdatedBy", query = "SELECT c FROM CompanyCustomer c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CompanyCustomer.findByReplicationStatus", query = "SELECT c FROM CompanyCustomer c WHERE c.replicationStatus = :replicationStatus")})
public class CompanyCustomer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Comp_Cust_Id")
    private Integer compCustId;
    @Column(name = "Company_id")
    private String companyid;
    @Column(name = "Customer_id")
    private String customerid;
    @Column(name = "Contact_type")
    private String contacttype;
    @Column(name = "rights_level")
    private String rightsLevel;
    @Column(name = "Contact_isReport")
    private Boolean contactisReport;
    @Column(name = "Contact_isBooking")
    private Boolean contactisBooking;
    @Column(name = "Contact_isPayment")
    private Boolean contactisPayment;
    @Column(name = "Contact_isFandB")
    private Boolean contactisFandB;
    @Column(name = "Department_id")
    private String departmentid;
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
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne
    private Hotel hotelId;

    public CompanyCustomer() {
    }

    public CompanyCustomer(Integer compCustId) {
        this.compCustId = compCustId;
    }

    public Integer getCompCustId() {
        return compCustId;
    }

    public void setCompCustId(Integer compCustId) {
        this.compCustId = compCustId;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getContacttype() {
        return contacttype;
    }

    public void setContacttype(String contacttype) {
        this.contacttype = contacttype;
    }

    public String getRightsLevel() {
        return rightsLevel;
    }

    public void setRightsLevel(String rightsLevel) {
        this.rightsLevel = rightsLevel;
    }

    public Boolean getContactisReport() {
        return contactisReport;
    }

    public void setContactisReport(Boolean contactisReport) {
        this.contactisReport = contactisReport;
    }

    public Boolean getContactisBooking() {
        return contactisBooking;
    }

    public void setContactisBooking(Boolean contactisBooking) {
        this.contactisBooking = contactisBooking;
    }

    public Boolean getContactisPayment() {
        return contactisPayment;
    }

    public void setContactisPayment(Boolean contactisPayment) {
        this.contactisPayment = contactisPayment;
    }

    public Boolean getContactisFandB() {
        return contactisFandB;
    }

    public void setContactisFandB(Boolean contactisFandB) {
        this.contactisFandB = contactisFandB;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
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

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compCustId != null ? compCustId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyCustomer)) {
            return false;
        }
        CompanyCustomer other = (CompanyCustomer) object;
        if ((this.compCustId == null && other.compCustId != null) || (this.compCustId != null && !this.compCustId.equals(other.compCustId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CompanyCustomer[ compCustId=" + compCustId + " ]";
    }
    
}
