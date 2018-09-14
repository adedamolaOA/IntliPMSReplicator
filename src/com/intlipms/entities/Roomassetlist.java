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
@Table(name = "Room_asset_list")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roomassetlist.findAll", query = "SELECT r FROM Roomassetlist r")
    , @NamedQuery(name = "Roomassetlist.findByRoomassetlistid", query = "SELECT r FROM Roomassetlist r WHERE r.roomassetlistid = :roomassetlistid")
    , @NamedQuery(name = "Roomassetlist.findByRoomassetid", query = "SELECT r FROM Roomassetlist r WHERE r.roomassetid = :roomassetid")
    , @NamedQuery(name = "Roomassetlist.findByRecordDate", query = "SELECT r FROM Roomassetlist r WHERE r.recordDate = :recordDate")
    , @NamedQuery(name = "Roomassetlist.findByAssetQty", query = "SELECT r FROM Roomassetlist r WHERE r.assetQty = :assetQty")
    , @NamedQuery(name = "Roomassetlist.findByDateCreated", query = "SELECT r FROM Roomassetlist r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Roomassetlist.findByCreatedBy", query = "SELECT r FROM Roomassetlist r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Roomassetlist.findByDateUpdated", query = "SELECT r FROM Roomassetlist r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Roomassetlist.findByUpdatedBy", query = "SELECT r FROM Roomassetlist r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Roomassetlist.findByReplicationStatus", query = "SELECT r FROM Roomassetlist r WHERE r.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "Roomassetlist.findByHotelId", query = "SELECT r FROM Roomassetlist r WHERE r.hotelId = :hotelId")})
public class Roomassetlist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Room_asset_list_id")
    private Integer roomassetlistid;
    @Column(name = "Room_asset_id")
    private String roomassetid;
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
    @Column(name = "Hotel_Id")
    private String hotelId;

    public Roomassetlist() {
    }

    public Roomassetlist(Integer roomassetlistid) {
        this.roomassetlistid = roomassetlistid;
    }

    public Integer getRoomassetlistid() {
        return roomassetlistid;
    }

    public void setRoomassetlistid(Integer roomassetlistid) {
        this.roomassetlistid = roomassetlistid;
    }

    public String getRoomassetid() {
        return roomassetid;
    }

    public void setRoomassetid(String roomassetid) {
        this.roomassetid = roomassetid;
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

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomassetlistid != null ? roomassetlistid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomassetlist)) {
            return false;
        }
        Roomassetlist other = (Roomassetlist) object;
        if ((this.roomassetlistid == null && other.roomassetlistid != null) || (this.roomassetlistid != null && !this.roomassetlistid.equals(other.roomassetlistid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Roomassetlist[ roomassetlistid=" + roomassetlistid + " ]";
    }
    
}
