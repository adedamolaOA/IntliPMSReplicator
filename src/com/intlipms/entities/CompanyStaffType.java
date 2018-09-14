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
@Table(name = "company_staff_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyStaffType.findAll", query = "SELECT c FROM CompanyStaffType c")
    , @NamedQuery(name = "CompanyStaffType.findById", query = "SELECT c FROM CompanyStaffType c WHERE c.id = :id")
    , @NamedQuery(name = "CompanyStaffType.findByStaffType", query = "SELECT c FROM CompanyStaffType c WHERE c.staffType = :staffType")
    , @NamedQuery(name = "CompanyStaffType.findByHotelId", query = "SELECT c FROM CompanyStaffType c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CompanyStaffType.findByDateCreated", query = "SELECT c FROM CompanyStaffType c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CompanyStaffType.findByCreatedBy", query = "SELECT c FROM CompanyStaffType c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CompanyStaffType.findByDateUpdated", query = "SELECT c FROM CompanyStaffType c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CompanyStaffType.findByUpdatedBy", query = "SELECT c FROM CompanyStaffType c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CompanyStaffType.findByReplicationStatus", query = "SELECT c FROM CompanyStaffType c WHERE c.replicationStatus = :replicationStatus")})
public class CompanyStaffType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "staff_type")
    private String staffType;
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

    public CompanyStaffType() {
    }

    public CompanyStaffType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffType() {
        return staffType;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyStaffType)) {
            return false;
        }
        CompanyStaffType other = (CompanyStaffType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CompanyStaffType[ id=" + id + " ]";
    }
    
}
