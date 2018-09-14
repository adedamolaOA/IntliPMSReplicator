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
import javax.persistence.Lob;
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
@Table(name = "company_privileges")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyPrivileges.findAll", query = "SELECT c FROM CompanyPrivileges c")
    , @NamedQuery(name = "CompanyPrivileges.findByPid", query = "SELECT c FROM CompanyPrivileges c WHERE c.pid = :pid")
    , @NamedQuery(name = "CompanyPrivileges.findByHotelAmentity", query = "SELECT c FROM CompanyPrivileges c WHERE c.hotelAmentity = :hotelAmentity")
    , @NamedQuery(name = "CompanyPrivileges.findByCompany", query = "SELECT c FROM CompanyPrivileges c WHERE c.company = :company")
    , @NamedQuery(name = "CompanyPrivileges.findByHotelId", query = "SELECT c FROM CompanyPrivileges c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CompanyPrivileges.findByDateCreated", query = "SELECT c FROM CompanyPrivileges c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CompanyPrivileges.findByCreatedBy", query = "SELECT c FROM CompanyPrivileges c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CompanyPrivileges.findByDateUpdated", query = "SELECT c FROM CompanyPrivileges c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CompanyPrivileges.findByUpdatedBy", query = "SELECT c FROM CompanyPrivileges c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CompanyPrivileges.findByReplicationStatus", query = "SELECT c FROM CompanyPrivileges c WHERE c.replicationStatus = :replicationStatus")})
public class CompanyPrivileges implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "hotel_amentity")
    private String hotelAmentity;
    @Column(name = "company")
    private String company;
    @Lob
    @Column(name = "memo")
    private String memo;
    @Column(name = "Hotel_Id")
    private String hotelId;
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

    public CompanyPrivileges() {
    }

    public CompanyPrivileges(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getHotelAmentity() {
        return hotelAmentity;
    }

    public void setHotelAmentity(String hotelAmentity) {
        this.hotelAmentity = hotelAmentity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyPrivileges)) {
            return false;
        }
        CompanyPrivileges other = (CompanyPrivileges) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CompanyPrivileges[ pid=" + pid + " ]";
    }
    
}
