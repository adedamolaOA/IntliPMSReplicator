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
@Table(name = "Hotel_Amenities")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HotelAmenities.findAll", query = "SELECT h FROM HotelAmenities h")
    , @NamedQuery(name = "HotelAmenities.findByAmenityid", query = "SELECT h FROM HotelAmenities h WHERE h.amenityid = :amenityid")
    , @NamedQuery(name = "HotelAmenities.findByDateCreated", query = "SELECT h FROM HotelAmenities h WHERE h.dateCreated = :dateCreated")
    , @NamedQuery(name = "HotelAmenities.findByCreatedBy", query = "SELECT h FROM HotelAmenities h WHERE h.createdBy = :createdBy")
    , @NamedQuery(name = "HotelAmenities.findByDateUpdated", query = "SELECT h FROM HotelAmenities h WHERE h.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "HotelAmenities.findByUpdatedBy", query = "SELECT h FROM HotelAmenities h WHERE h.updatedBy = :updatedBy")
    , @NamedQuery(name = "HotelAmenities.findByReplicationStatus", query = "SELECT h FROM HotelAmenities h WHERE h.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "HotelAmenities.findByIsKeyArea", query = "SELECT h FROM HotelAmenities h WHERE h.isKeyArea = :isKeyArea")})
public class HotelAmenities implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Amenity_id")
    private Integer amenityid;
    @Basic(optional = false)
    @Lob
    @Column(name = "Aminity_Desc")
    private String aminityDesc;
    @Basic(optional = false)
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @Column(name = "created_by")
    private String createdBy;
    @Basic(optional = false)
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "replication_status")
    private Boolean replicationStatus;
    @Column(name = "isKeyArea")
    private Boolean isKeyArea;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;

    public HotelAmenities() {
    }

    public HotelAmenities(Integer amenityid) {
        this.amenityid = amenityid;
    }

    public HotelAmenities(Integer amenityid, String aminityDesc, Date dateCreated, String createdBy, Date dateUpdated, String updatedBy) {
        this.amenityid = amenityid;
        this.aminityDesc = aminityDesc;
        this.dateCreated = dateCreated;
        this.createdBy = createdBy;
        this.dateUpdated = dateUpdated;
        this.updatedBy = updatedBy;
    }

    public Integer getAmenityid() {
        return amenityid;
    }

    public void setAmenityid(Integer amenityid) {
        this.amenityid = amenityid;
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

    public Boolean getIsKeyArea() {
        return isKeyArea;
    }

    public void setIsKeyArea(Boolean isKeyArea) {
        this.isKeyArea = isKeyArea;
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
        hash += (amenityid != null ? amenityid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HotelAmenities)) {
            return false;
        }
        HotelAmenities other = (HotelAmenities) object;
        if ((this.amenityid == null && other.amenityid != null) || (this.amenityid != null && !this.amenityid.equals(other.amenityid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.HotelAmenities[ amenityid=" + amenityid + " ]";
    }
    
}
