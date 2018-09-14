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
@Table(name = "Lundary_asset_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lundaryassetlist.findAll", query = "SELECT l FROM Lundaryassetlist l")
    , @NamedQuery(name = "Lundaryassetlist.findByAssetlistid", query = "SELECT l FROM Lundaryassetlist l WHERE l.assetlistid = :assetlistid")
    , @NamedQuery(name = "Lundaryassetlist.findByRecordDate", query = "SELECT l FROM Lundaryassetlist l WHERE l.recordDate = :recordDate")
    , @NamedQuery(name = "Lundaryassetlist.findByAssetQty", query = "SELECT l FROM Lundaryassetlist l WHERE l.assetQty = :assetQty")
    , @NamedQuery(name = "Lundaryassetlist.findByDateCreated", query = "SELECT l FROM Lundaryassetlist l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "Lundaryassetlist.findByCreatedBy", query = "SELECT l FROM Lundaryassetlist l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "Lundaryassetlist.findByDateUpdated", query = "SELECT l FROM Lundaryassetlist l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Lundaryassetlist.findByUpdatedBy", query = "SELECT l FROM Lundaryassetlist l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "Lundaryassetlist.findByReplicationStatus", query = "SELECT l FROM Lundaryassetlist l WHERE l.replicationStatus = :replicationStatus")})
public class Lundaryassetlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Asset_list_id")
    private Integer assetlistid;
    @Column(name = "record_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date recordDate;
    @Column(name = "asset_qty")
    private Integer assetQty;
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
    @JoinColumn(name = "Asset_id", referencedColumnName = "Asset_id")
    @ManyToOne
    private Lundaryasset assetid;

    public Lundaryassetlist() {
    }

    public Lundaryassetlist(Integer assetlistid) {
        this.assetlistid = assetlistid;
    }

    public Integer getAssetlistid() {
        return assetlistid;
    }

    public void setAssetlistid(Integer assetlistid) {
        this.assetlistid = assetlistid;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public Integer getAssetQty() {
        return assetQty;
    }

    public void setAssetQty(Integer assetQty) {
        this.assetQty = assetQty;
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

    public Lundaryasset getAssetid() {
        return assetid;
    }

    public void setAssetid(Lundaryasset assetid) {
        this.assetid = assetid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assetlistid != null ? assetlistid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lundaryassetlist)) {
            return false;
        }
        Lundaryassetlist other = (Lundaryassetlist) object;
        if ((this.assetlistid == null && other.assetlistid != null) || (this.assetlistid != null && !this.assetlistid.equals(other.assetlistid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Lundaryassetlist[ assetlistid=" + assetlistid + " ]";
    }
    
}
