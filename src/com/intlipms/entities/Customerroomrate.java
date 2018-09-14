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
@Table(name = "Customer_room_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customerroomrate.findAll", query = "SELECT c FROM Customerroomrate c")
    , @NamedQuery(name = "Customerroomrate.findByRoomrateid", query = "SELECT c FROM Customerroomrate c WHERE c.roomrateid = :roomrateid")
    , @NamedQuery(name = "Customerroomrate.findByCustomerid", query = "SELECT c FROM Customerroomrate c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "Customerroomrate.findByRoomtypeid", query = "SELECT c FROM Customerroomrate c WHERE c.roomtypeid = :roomtypeid")
    , @NamedQuery(name = "Customerroomrate.findByRoomrate", query = "SELECT c FROM Customerroomrate c WHERE c.roomrate = :roomrate")
    , @NamedQuery(name = "Customerroomrate.findByRoomrateguest", query = "SELECT c FROM Customerroomrate c WHERE c.roomrateguest = :roomrateguest")
    , @NamedQuery(name = "Customerroomrate.findByApprovedby", query = "SELECT c FROM Customerroomrate c WHERE c.approvedby = :approvedby")
    , @NamedQuery(name = "Customerroomrate.findByStartdate", query = "SELECT c FROM Customerroomrate c WHERE c.startdate = :startdate")
    , @NamedQuery(name = "Customerroomrate.findByEnddate", query = "SELECT c FROM Customerroomrate c WHERE c.enddate = :enddate")
    , @NamedQuery(name = "Customerroomrate.findByDateCreated", query = "SELECT c FROM Customerroomrate c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Customerroomrate.findByCreatedBy", query = "SELECT c FROM Customerroomrate c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Customerroomrate.findByDateUpdated", query = "SELECT c FROM Customerroomrate c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Customerroomrate.findByUpdatedBy", query = "SELECT c FROM Customerroomrate c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Customerroomrate.findByReplicationStatus", query = "SELECT c FROM Customerroomrate c WHERE c.replicationStatus = :replicationStatus")})
public class Customerroomrate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Room_rate_id")
    private Integer roomrateid;
    @Column(name = "Customer_id")
    private String customerid;
    @Column(name = "Room_type_id")
    private String roomtypeid;
    @Column(name = "Room_rate")
    private Integer roomrate;
    @Column(name = "Room_rate_guest")
    private Integer roomrateguest;
    @Column(name = "Approved_by")
    private String approvedby;
    @Column(name = "Start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "End_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
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

    public Customerroomrate() {
    }

    public Customerroomrate(Integer roomrateid) {
        this.roomrateid = roomrateid;
    }

    public Integer getRoomrateid() {
        return roomrateid;
    }

    public void setRoomrateid(Integer roomrateid) {
        this.roomrateid = roomrateid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public Integer getRoomrate() {
        return roomrate;
    }

    public void setRoomrate(Integer roomrate) {
        this.roomrate = roomrate;
    }

    public Integer getRoomrateguest() {
        return roomrateguest;
    }

    public void setRoomrateguest(Integer roomrateguest) {
        this.roomrateguest = roomrateguest;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        hash += (roomrateid != null ? roomrateid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customerroomrate)) {
            return false;
        }
        Customerroomrate other = (Customerroomrate) object;
        if ((this.roomrateid == null && other.roomrateid != null) || (this.roomrateid != null && !this.roomrateid.equals(other.roomrateid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Customerroomrate[ roomrateid=" + roomrateid + " ]";
    }
    
}
