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
import javax.persistence.Lob;
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
@Table(name = "Company")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
    , @NamedQuery(name = "Company.findByCompanyid", query = "SELECT c FROM Company c WHERE c.companyid = :companyid")
    , @NamedQuery(name = "Company.findByComptypeid", query = "SELECT c FROM Company c WHERE c.comptypeid = :comptypeid")
    , @NamedQuery(name = "Company.findByCompname", query = "SELECT c FROM Company c WHERE c.compname = :compname")
    , @NamedQuery(name = "Company.findByCompothernames", query = "SELECT c FROM Company c WHERE c.compothernames = :compothernames")
    , @NamedQuery(name = "Company.findByCompPhone1", query = "SELECT c FROM Company c WHERE c.compPhone1 = :compPhone1")
    , @NamedQuery(name = "Company.findByCompphone2", query = "SELECT c FROM Company c WHERE c.compphone2 = :compphone2")
    , @NamedQuery(name = "Company.findByCompemail", query = "SELECT c FROM Company c WHERE c.compemail = :compemail")
    , @NamedQuery(name = "Company.findByCompRC", query = "SELECT c FROM Company c WHERE c.compRC = :compRC")
    , @NamedQuery(name = "Company.findByCompcity", query = "SELECT c FROM Company c WHERE c.compcity = :compcity")
    , @NamedQuery(name = "Company.findByCuststate", query = "SELECT c FROM Company c WHERE c.custstate = :custstate")
    , @NamedQuery(name = "Company.findByCompreligion", query = "SELECT c FROM Company c WHERE c.compreligion = :compreligion")
    , @NamedQuery(name = "Company.findByDepartmentid", query = "SELECT c FROM Company c WHERE c.departmentid = :departmentid")
    , @NamedQuery(name = "Company.findByEmployeeid", query = "SELECT c FROM Company c WHERE c.employeeid = :employeeid")
    , @NamedQuery(name = "Company.findByDateCreated", query = "SELECT c FROM Company c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Company.findByCreatedBy", query = "SELECT c FROM Company c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Company.findByDateUpdated", query = "SELECT c FROM Company c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Company.findByUpdatedBy", query = "SELECT c FROM Company c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Company.findByReplicationStatus", query = "SELECT c FROM Company c WHERE c.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "Company.findByMaxCredit", query = "SELECT c FROM Company c WHERE c.maxCredit = :maxCredit")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Company_id")
    private Integer companyid;
    @Column(name = "Comp_type_id")
    private String comptypeid;
    @Column(name = "Comp_name")
    private String compname;
    @Column(name = "Comp_othernames")
    private String compothernames;
    @Column(name = "comp_phone1")
    private String compPhone1;
    @Column(name = "Comp_phone2")
    private String compphone2;
    @Column(name = "Comp_email")
    private String compemail;
    @Column(name = "Comp_RC")
    private String compRC;
    @Lob
    @Column(name = "Comp_address")
    private String compaddress;
    @Column(name = "Comp_city")
    private String compcity;
    @Column(name = "Cust_state")
    private String custstate;
    @Column(name = "Comp_religion")
    private String compreligion;
    @Column(name = "Department_id")
    private String departmentid;
    @Column(name = "Employee_id")
    private String employeeid;
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

    public Company() {
    }

    public Company(Integer companyid) {
        this.companyid = companyid;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getComptypeid() {
        return comptypeid;
    }

    public void setComptypeid(String comptypeid) {
        this.comptypeid = comptypeid;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getCompothernames() {
        return compothernames;
    }

    public void setCompothernames(String compothernames) {
        this.compothernames = compothernames;
    }

    public String getCompPhone1() {
        return compPhone1;
    }

    public void setCompPhone1(String compPhone1) {
        this.compPhone1 = compPhone1;
    }

    public String getCompphone2() {
        return compphone2;
    }

    public void setCompphone2(String compphone2) {
        this.compphone2 = compphone2;
    }

    public String getCompemail() {
        return compemail;
    }

    public void setCompemail(String compemail) {
        this.compemail = compemail;
    }

    public String getCompRC() {
        return compRC;
    }

    public void setCompRC(String compRC) {
        this.compRC = compRC;
    }

    public String getCompaddress() {
        return compaddress;
    }

    public void setCompaddress(String compaddress) {
        this.compaddress = compaddress;
    }

    public String getCompcity() {
        return compcity;
    }

    public void setCompcity(String compcity) {
        this.compcity = compcity;
    }

    public String getCuststate() {
        return custstate;
    }

    public void setCuststate(String custstate) {
        this.custstate = custstate;
    }

    public String getCompreligion() {
        return compreligion;
    }

    public void setCompreligion(String compreligion) {
        this.compreligion = compreligion;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (companyid != null ? companyid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.companyid == null && other.companyid != null) || (this.companyid != null && !this.companyid.equals(other.companyid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Company[ companyid=" + companyid + " ]";
    }
    
}
