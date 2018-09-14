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
@Table(name = "Lundary_Invt_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LundaryInvtlog.findAll", query = "SELECT l FROM LundaryInvtlog l")
    , @NamedQuery(name = "LundaryInvtlog.findByItemlistid", query = "SELECT l FROM LundaryInvtlog l WHERE l.itemlistid = :itemlistid")
    , @NamedQuery(name = "LundaryInvtlog.findByItemid", query = "SELECT l FROM LundaryInvtlog l WHERE l.itemid = :itemid")
    , @NamedQuery(name = "LundaryInvtlog.findByEmployeeid", query = "SELECT l FROM LundaryInvtlog l WHERE l.employeeid = :employeeid")
    , @NamedQuery(name = "LundaryInvtlog.findByRecordDate", query = "SELECT l FROM LundaryInvtlog l WHERE l.recordDate = :recordDate")
    , @NamedQuery(name = "LundaryInvtlog.findByQtyPre", query = "SELECT l FROM LundaryInvtlog l WHERE l.qtyPre = :qtyPre")
    , @NamedQuery(name = "LundaryInvtlog.findByQtyCurrent", query = "SELECT l FROM LundaryInvtlog l WHERE l.qtyCurrent = :qtyCurrent")
    , @NamedQuery(name = "LundaryInvtlog.findByQtyPost", query = "SELECT l FROM LundaryInvtlog l WHERE l.qtyPost = :qtyPost")
    , @NamedQuery(name = "LundaryInvtlog.findByDateCreated", query = "SELECT l FROM LundaryInvtlog l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "LundaryInvtlog.findByCreatedBy", query = "SELECT l FROM LundaryInvtlog l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "LundaryInvtlog.findByDateUpdated", query = "SELECT l FROM LundaryInvtlog l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "LundaryInvtlog.findByUpdatedBy", query = "SELECT l FROM LundaryInvtlog l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "LundaryInvtlog.findByReplicationStatus", query = "SELECT l FROM LundaryInvtlog l WHERE l.replicationStatus = :replicationStatus")})
public class LundaryInvtlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Item_list_id")
    private Integer itemlistid;
    @Column(name = "Item_id")
    private String itemid;
    @Column(name = "Employee_id")
    private String employeeid;
    @Column(name = "record_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDate;
    @Column(name = "qty_pre")
    private Integer qtyPre;
    @Column(name = "qty_current")
    private Integer qtyCurrent;
    @Column(name = "qty_post")
    private Integer qtyPost;
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

    public LundaryInvtlog() {
    }

    public LundaryInvtlog(Integer itemlistid) {
        this.itemlistid = itemlistid;
    }

    public Integer getItemlistid() {
        return itemlistid;
    }

    public void setItemlistid(Integer itemlistid) {
        this.itemlistid = itemlistid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Integer getQtyPre() {
        return qtyPre;
    }

    public void setQtyPre(Integer qtyPre) {
        this.qtyPre = qtyPre;
    }

    public Integer getQtyCurrent() {
        return qtyCurrent;
    }

    public void setQtyCurrent(Integer qtyCurrent) {
        this.qtyCurrent = qtyCurrent;
    }

    public Integer getQtyPost() {
        return qtyPost;
    }

    public void setQtyPost(Integer qtyPost) {
        this.qtyPost = qtyPost;
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
        hash += (itemlistid != null ? itemlistid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LundaryInvtlog)) {
            return false;
        }
        LundaryInvtlog other = (LundaryInvtlog) object;
        if ((this.itemlistid == null && other.itemlistid != null) || (this.itemlistid != null && !this.itemlistid.equals(other.itemlistid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.LundaryInvtlog[ itemlistid=" + itemlistid + " ]";
    }
    
}
