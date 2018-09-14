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
@Table(name = "Room_Type_Amenities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomTypeAmenities.findAll", query = "SELECT r FROM RoomTypeAmenities r")
    , @NamedQuery(name = "RoomTypeAmenities.findByAmenityid", query = "SELECT r FROM RoomTypeAmenities r WHERE r.amenityid = :amenityid")
    , @NamedQuery(name = "RoomTypeAmenities.findByAminityTypeid", query = "SELECT r FROM RoomTypeAmenities r WHERE r.aminityTypeid = :aminityTypeid")
    , @NamedQuery(name = "RoomTypeAmenities.findByRoomtypeid", query = "SELECT r FROM RoomTypeAmenities r WHERE r.roomtypeid = :roomtypeid")
    , @NamedQuery(name = "RoomTypeAmenities.findByDateCreated", query = "SELECT r FROM RoomTypeAmenities r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "RoomTypeAmenities.findByCreatedBy", query = "SELECT r FROM RoomTypeAmenities r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "RoomTypeAmenities.findByDateUpdated", query = "SELECT r FROM RoomTypeAmenities r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "RoomTypeAmenities.findByUpdatedBy", query = "SELECT r FROM RoomTypeAmenities r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "RoomTypeAmenities.findByReplicationStatus", query = "SELECT r FROM RoomTypeAmenities r WHERE r.replicationStatus = :replicationStatus")})
public class RoomTypeAmenities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Amenity_id")
    private Integer amenityid;
    @Column(name = "Aminity_Type_id")
    private String aminityTypeid;
    @Column(name = "Room_type_id")
    private String roomtypeid;
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

    public RoomTypeAmenities() {
    }

    public RoomTypeAmenities(Integer amenityid) {
        this.amenityid = amenityid;
    }

    public Integer getAmenityid() {
        return amenityid;
    }

    public void setAmenityid(Integer amenityid) {
        this.amenityid = amenityid;
    }

    public String getAminityTypeid() {
        return aminityTypeid;
    }

    public void setAminityTypeid(String aminityTypeid) {
        this.aminityTypeid = aminityTypeid;
    }

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid;
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
        hash += (amenityid != null ? amenityid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomTypeAmenities)) {
            return false;
        }
        RoomTypeAmenities other = (RoomTypeAmenities) object;
        if ((this.amenityid == null && other.amenityid != null) || (this.amenityid != null && !this.amenityid.equals(other.amenityid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.RoomTypeAmenities[ amenityid=" + amenityid + " ]";
    }
    
}
