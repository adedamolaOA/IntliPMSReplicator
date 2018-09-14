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
@Table(name = "Room_Type_Amenity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomTypeAmenity.findAll", query = "SELECT r FROM RoomTypeAmenity r")
    , @NamedQuery(name = "RoomTypeAmenity.findByAminityTypeid", query = "SELECT r FROM RoomTypeAmenity r WHERE r.aminityTypeid = :aminityTypeid")
    , @NamedQuery(name = "RoomTypeAmenity.findByDateCreated", query = "SELECT r FROM RoomTypeAmenity r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "RoomTypeAmenity.findByCreatedBy", query = "SELECT r FROM RoomTypeAmenity r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "RoomTypeAmenity.findByDateUpdated", query = "SELECT r FROM RoomTypeAmenity r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "RoomTypeAmenity.findByUpdatedBy", query = "SELECT r FROM RoomTypeAmenity r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "RoomTypeAmenity.findByReplicationStatus", query = "SELECT r FROM RoomTypeAmenity r WHERE r.replicationStatus = :replicationStatus")})
public class RoomTypeAmenity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Aminity_Type_id")
    private Integer aminityTypeid;
    @Lob
    @Column(name = "Aminity_Desc")
    private String aminityDesc;
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

    public RoomTypeAmenity() {
    }

    public RoomTypeAmenity(Integer aminityTypeid) {
        this.aminityTypeid = aminityTypeid;
    }

    public Integer getAminityTypeid() {
        return aminityTypeid;
    }

    public void setAminityTypeid(Integer aminityTypeid) {
        this.aminityTypeid = aminityTypeid;
    }

    public String getAminityDesc() {
        return aminityDesc;
    }

    public void setAminityDesc(String aminityDesc) {
        this.aminityDesc = aminityDesc;
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
        hash += (aminityTypeid != null ? aminityTypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomTypeAmenity)) {
            return false;
        }
        RoomTypeAmenity other = (RoomTypeAmenity) object;
        if ((this.aminityTypeid == null && other.aminityTypeid != null) || (this.aminityTypeid != null && !this.aminityTypeid.equals(other.aminityTypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.RoomTypeAmenity[ aminityTypeid=" + aminityTypeid + " ]";
    }
    
}
