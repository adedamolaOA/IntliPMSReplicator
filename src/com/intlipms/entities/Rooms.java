/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "Rooms")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rooms.findAll", query = "SELECT r FROM Rooms r")
    , @NamedQuery(name = "Rooms.findByRoomid", query = "SELECT r FROM Rooms r WHERE r.roomid = :roomid")
    , @NamedQuery(name = "Rooms.findByRoomtypeid", query = "SELECT r FROM Rooms r WHERE r.roomtypeid = :roomtypeid")
    , @NamedQuery(name = "Rooms.findByBuildingid", query = "SELECT r FROM Rooms r WHERE r.buildingid = :buildingid")
    , @NamedQuery(name = "Rooms.findByRoomnumber", query = "SELECT r FROM Rooms r WHERE r.roomnumber = :roomnumber")
    , @NamedQuery(name = "Rooms.findByRoomname", query = "SELECT r FROM Rooms r WHERE r.roomname = :roomname")
    , @NamedQuery(name = "Rooms.findByRoomstatus", query = "SELECT r FROM Rooms r WHERE r.roomstatus = :roomstatus")
    , @NamedQuery(name = "Rooms.findByRoompromrate", query = "SELECT r FROM Rooms r WHERE r.roompromrate = :roompromrate")
    , @NamedQuery(name = "Rooms.findByRoombaserate", query = "SELECT r FROM Rooms r WHERE r.roombaserate = :roombaserate")
    , @NamedQuery(name = "Rooms.findByRoomsize", query = "SELECT r FROM Rooms r WHERE r.roomsize = :roomsize")
    , @NamedQuery(name = "Rooms.findByRoombedsize", query = "SELECT r FROM Rooms r WHERE r.roombedsize = :roombedsize")
    , @NamedQuery(name = "Rooms.findByRoomHKStatus", query = "SELECT r FROM Rooms r WHERE r.roomHKStatus = :roomHKStatus")
    , @NamedQuery(name = "Rooms.findByDateCreated", query = "SELECT r FROM Rooms r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Rooms.findByCreatedBy", query = "SELECT r FROM Rooms r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Rooms.findByDateUpdated", query = "SELECT r FROM Rooms r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Rooms.findByUpdatedBy", query = "SELECT r FROM Rooms r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Rooms.findByReplicationStatus", query = "SELECT r FROM Rooms r WHERE r.replicationStatus = :replicationStatus")})
public class Rooms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Room_id")
    private Integer roomid;
    @Basic(optional = false)
    @Column(name = "Room_type_id")
    private String roomtypeid;
    @Basic(optional = false)
    @Column(name = "Building_id")
    private String buildingid;
    @Basic(optional = false)
    @Column(name = "Room_number")
    private int roomnumber;
    @Column(name = "Room_name")
    private String roomname;
    @Lob
    @Column(name = "Room_notes")
    private String roomnotes;
    @Lob
    @Column(name = "Room_des_extra")
    private String roomdesextra;
    @Column(name = "Room_status")
    private Integer roomstatus;
    @Column(name = "Room_prom_rate")
    private Integer roompromrate;
    @Column(name = "Room_base_rate")
    private Integer roombaserate;
    @Column(name = "Room_size")
    private String roomsize;
    @Column(name = "Room_bed_size")
    private String roombedsize;
    @Column(name = "Room_HK_Status")
    private Integer roomHKStatus;
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
    @OneToMany(mappedBy = "roomid")
    private Collection<Roomcleandtlslog> roomcleandtlslogCollection;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;

    public Rooms() {
    }

    public Rooms(Integer roomid) {
        this.roomid = roomid;
    }

    public Rooms(Integer roomid, String roomtypeid, String buildingid, int roomnumber) {
        this.roomid = roomid;
        this.roomtypeid = roomtypeid;
        this.buildingid = buildingid;
        this.roomnumber = roomnumber;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public String getBuildingid() {
        return buildingid;
    }

    public void setBuildingid(String buildingid) {
        this.buildingid = buildingid;
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomnotes() {
        return roomnotes;
    }

    public void setRoomnotes(String roomnotes) {
        this.roomnotes = roomnotes;
    }

    public String getRoomdesextra() {
        return roomdesextra;
    }

    public void setRoomdesextra(String roomdesextra) {
        this.roomdesextra = roomdesextra;
    }

    public Integer getRoomstatus() {
        return roomstatus;
    }

    public void setRoomstatus(Integer roomstatus) {
        this.roomstatus = roomstatus;
    }

    public Integer getRoompromrate() {
        return roompromrate;
    }

    public void setRoompromrate(Integer roompromrate) {
        this.roompromrate = roompromrate;
    }

    public Integer getRoombaserate() {
        return roombaserate;
    }

    public void setRoombaserate(Integer roombaserate) {
        this.roombaserate = roombaserate;
    }

    public String getRoomsize() {
        return roomsize;
    }

    public void setRoomsize(String roomsize) {
        this.roomsize = roomsize;
    }

    public String getRoombedsize() {
        return roombedsize;
    }

    public void setRoombedsize(String roombedsize) {
        this.roombedsize = roombedsize;
    }

    public Integer getRoomHKStatus() {
        return roomHKStatus;
    }

    public void setRoomHKStatus(Integer roomHKStatus) {
        this.roomHKStatus = roomHKStatus;
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

    @XmlTransient
    public Collection<Roomcleandtlslog> getRoomcleandtlslogCollection() {
        return roomcleandtlslogCollection;
    }

    public void setRoomcleandtlslogCollection(Collection<Roomcleandtlslog> roomcleandtlslogCollection) {
        this.roomcleandtlslogCollection = roomcleandtlslogCollection;
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
        hash += (roomid != null ? roomid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rooms)) {
            return false;
        }
        Rooms other = (Rooms) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Rooms[ roomid=" + roomid + " ]";
    }
    
}
