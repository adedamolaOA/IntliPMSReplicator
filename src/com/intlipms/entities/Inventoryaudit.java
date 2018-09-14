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
@Table(name = "Inventory_audit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventoryaudit.findAll", query = "SELECT i FROM Inventoryaudit i")
    , @NamedQuery(name = "Inventoryaudit.findByAuditId", query = "SELECT i FROM Inventoryaudit i WHERE i.auditId = :auditId")
    , @NamedQuery(name = "Inventoryaudit.findByInventlocationid", query = "SELECT i FROM Inventoryaudit i WHERE i.inventlocationid = :inventlocationid")
    , @NamedQuery(name = "Inventoryaudit.findByEffectivedate", query = "SELECT i FROM Inventoryaudit i WHERE i.effectivedate = :effectivedate")
    , @NamedQuery(name = "Inventoryaudit.findByDateCreated", query = "SELECT i FROM Inventoryaudit i WHERE i.dateCreated = :dateCreated")
    , @NamedQuery(name = "Inventoryaudit.findByCreatedBy", query = "SELECT i FROM Inventoryaudit i WHERE i.createdBy = :createdBy")
    , @NamedQuery(name = "Inventoryaudit.findByDateUpdated", query = "SELECT i FROM Inventoryaudit i WHERE i.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Inventoryaudit.findByUpdatedBy", query = "SELECT i FROM Inventoryaudit i WHERE i.updatedBy = :updatedBy")
    , @NamedQuery(name = "Inventoryaudit.findByReplicationStatus", query = "SELECT i FROM Inventoryaudit i WHERE i.replicationStatus = :replicationStatus")})
public class Inventoryaudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Audit_Id")
    private Integer auditId;
    @Column(name = "Invent_location_id")
    private Integer inventlocationid;
    @Column(name = "Effective_date")
    private String effectivedate;
    @Lob
    @Column(name = "Effective_time")
    private byte[] effectivetime;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "replication_status")
    private Boolean replicationStatus;
    @JoinColumn(name = "Depart_id", referencedColumnName = "Emp_dept_id")
    @ManyToOne
    private EmployeeDepartment departid;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne
    private Hotel hotelId;

    public Inventoryaudit() {
    }

    public Inventoryaudit(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getInventlocationid() {
        return inventlocationid;
    }

    public void setInventlocationid(Integer inventlocationid) {
        this.inventlocationid = inventlocationid;
    }

    public String getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate;
    }

    public byte[] getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(byte[] effectivetime) {
        this.effectivetime = effectivetime;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Boolean getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(Boolean replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public EmployeeDepartment getDepartid() {
        return departid;
    }

    public void setDepartid(EmployeeDepartment departid) {
        this.departid = departid;
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
        hash += (auditId != null ? auditId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventoryaudit)) {
            return false;
        }
        Inventoryaudit other = (Inventoryaudit) object;
        if ((this.auditId == null && other.auditId != null) || (this.auditId != null && !this.auditId.equals(other.auditId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Inventoryaudit[ auditId=" + auditId + " ]";
    }
    
}
