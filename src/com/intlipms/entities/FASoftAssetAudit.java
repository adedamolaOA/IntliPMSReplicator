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
@Table(name = "FASoftAssetAudit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FASoftAssetAudit.findAll", query = "SELECT f FROM FASoftAssetAudit f")
    , @NamedQuery(name = "FASoftAssetAudit.findById", query = "SELECT f FROM FASoftAssetAudit f WHERE f.id = :id")
    , @NamedQuery(name = "FASoftAssetAudit.findByFSoftAsset", query = "SELECT f FROM FASoftAssetAudit f WHERE f.fSoftAsset = :fSoftAsset")
    , @NamedQuery(name = "FASoftAssetAudit.findByInspectionDate", query = "SELECT f FROM FASoftAssetAudit f WHERE f.inspectionDate = :inspectionDate")
    , @NamedQuery(name = "FASoftAssetAudit.findByInspectionAssetQty", query = "SELECT f FROM FASoftAssetAudit f WHERE f.inspectionAssetQty = :inspectionAssetQty")
    , @NamedQuery(name = "FASoftAssetAudit.findByHotelId", query = "SELECT f FROM FASoftAssetAudit f WHERE f.hotelId = :hotelId")
    , @NamedQuery(name = "FASoftAssetAudit.findByDateCreated", query = "SELECT f FROM FASoftAssetAudit f WHERE f.dateCreated = :dateCreated")
    , @NamedQuery(name = "FASoftAssetAudit.findByCreatedBy", query = "SELECT f FROM FASoftAssetAudit f WHERE f.createdBy = :createdBy")
    , @NamedQuery(name = "FASoftAssetAudit.findByDateUpdated", query = "SELECT f FROM FASoftAssetAudit f WHERE f.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "FASoftAssetAudit.findByUpdatedBy", query = "SELECT f FROM FASoftAssetAudit f WHERE f.updatedBy = :updatedBy")
    , @NamedQuery(name = "FASoftAssetAudit.findByReplicationStatus", query = "SELECT f FROM FASoftAssetAudit f WHERE f.replicationStatus = :replicationStatus")})
public class FASoftAssetAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "FSoftAsset")
    private String fSoftAsset;
    @Column(name = "inspection_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inspectionDate;
    @Column(name = "inspection_asset_qty")
    private Integer inspectionAssetQty;
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

    public FASoftAssetAudit() {
    }

    public FASoftAssetAudit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFSoftAsset() {
        return fSoftAsset;
    }

    public void setFSoftAsset(String fSoftAsset) {
        this.fSoftAsset = fSoftAsset;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public Integer getInspectionAssetQty() {
        return inspectionAssetQty;
    }

    public void setInspectionAssetQty(Integer inspectionAssetQty) {
        this.inspectionAssetQty = inspectionAssetQty;
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
        if (!(object instanceof FASoftAssetAudit)) {
            return false;
        }
        FASoftAssetAudit other = (FASoftAssetAudit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.FASoftAssetAudit[ id=" + id + " ]";
    }
    
}
