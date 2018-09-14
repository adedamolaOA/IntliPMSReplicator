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
@Table(name = "Building")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Building.findAll", query = "SELECT b FROM Building b")
    , @NamedQuery(name = "Building.findByBuildingid", query = "SELECT b FROM Building b WHERE b.buildingid = :buildingid")
    , @NamedQuery(name = "Building.findByBuildingname", query = "SELECT b FROM Building b WHERE b.buildingname = :buildingname")
    , @NamedQuery(name = "Building.findByBuildingStatus", query = "SELECT b FROM Building b WHERE b.buildingStatus = :buildingStatus")
    , @NamedQuery(name = "Building.findByBuildingnumfloors", query = "SELECT b FROM Building b WHERE b.buildingnumfloors = :buildingnumfloors")
    , @NamedQuery(name = "Building.findByDateCreated", query = "SELECT b FROM Building b WHERE b.dateCreated = :dateCreated")
    , @NamedQuery(name = "Building.findByCreatedBy", query = "SELECT b FROM Building b WHERE b.createdBy = :createdBy")
    , @NamedQuery(name = "Building.findByDateUpdated", query = "SELECT b FROM Building b WHERE b.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Building.findByUpdatedBy", query = "SELECT b FROM Building b WHERE b.updatedBy = :updatedBy")
    , @NamedQuery(name = "Building.findByReplicationStatus", query = "SELECT b FROM Building b WHERE b.replicationStatus = :replicationStatus")})
public class Building implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Building_id")
    private Integer buildingid;
    @Column(name = "Building_name")
    private String buildingname;
    @Lob
    @Column(name = "Building_des")
    private String buildingdes;
    @Column(name = "Building_Status")
    private Boolean buildingStatus;
    @Column(name = "Building_num_floors")
    private Integer buildingnumfloors;
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
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne
    private Hotel hotelId;

    public Building() {
    }

    public Building(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public Integer getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(Integer buildingid) {
        this.buildingid = buildingid;
    }

    public String getBuildingname() {
        return buildingname;
    }

    public void setBuildingname(String buildingname) {
        this.buildingname = buildingname;
    }

    public String getBuildingdes() {
        return buildingdes;
    }

    public void setBuildingdes(String buildingdes) {
        this.buildingdes = buildingdes;
    }

    public Boolean getBuildingStatus() {
        return buildingStatus;
    }

    public void setBuildingStatus(Boolean buildingStatus) {
        this.buildingStatus = buildingStatus;
    }

    public Integer getBuildingnumfloors() {
        return buildingnumfloors;
    }

    public void setBuildingnumfloors(Integer buildingnumfloors) {
        this.buildingnumfloors = buildingnumfloors;
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

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (buildingid != null ? buildingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Building)) {
            return false;
        }
        Building other = (Building) object;
        if ((this.buildingid == null && other.buildingid != null) || (this.buildingid != null && !this.buildingid.equals(other.buildingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Building[ buildingid=" + buildingid + " ]";
    }
    
}
