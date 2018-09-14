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
@Table(name = "Room_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomType.findAll", query = "SELECT r FROM RoomType r")
    , @NamedQuery(name = "RoomType.findByRoomtypeid", query = "SELECT r FROM RoomType r WHERE r.roomtypeid = :roomtypeid")
    , @NamedQuery(name = "RoomType.findByRoomtypename", query = "SELECT r FROM RoomType r WHERE r.roomtypename = :roomtypename")
    , @NamedQuery(name = "RoomType.findByRoomtypeStatus", query = "SELECT r FROM RoomType r WHERE r.roomtypeStatus = :roomtypeStatus")
    , @NamedQuery(name = "RoomType.findByRoomtyperate", query = "SELECT r FROM RoomType r WHERE r.roomtyperate = :roomtyperate")
    , @NamedQuery(name = "RoomType.findByDateCreated", query = "SELECT r FROM RoomType r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "RoomType.findByCreatedBy", query = "SELECT r FROM RoomType r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "RoomType.findByDateUpdated", query = "SELECT r FROM RoomType r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "RoomType.findByUpdatedBy", query = "SELECT r FROM RoomType r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "RoomType.findByReplicationStatus", query = "SELECT r FROM RoomType r WHERE r.replicationStatus = :replicationStatus")})
public class RoomType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Room_type_id")
    private Integer roomtypeid;
    @Column(name = "Room_type_name")
    private String roomtypename;
    @Lob
    @Column(name = "Room_type_des")
    private String roomtypedes;
    @Column(name = "Room_type_Status")
    private Integer roomtypeStatus;
    @Column(name = "Room_type_rate")
    private Integer roomtyperate;
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
    @OneToMany(mappedBy = "roomtypeid")
    private Collection<Checkinlog> checkinlogCollection;
    @OneToMany(mappedBy = "roomtypeid")
    private Collection<PromotionType> promotionTypeCollection;
    @OneToMany(mappedBy = "roomtypeid")
    private Collection<BookingDtlsLog> bookingDtlsLogCollection;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne
    private Hotel hotelId;

    public RoomType() {
    }

    public RoomType(Integer roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public Integer getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(Integer roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public String getRoomtypename() {
        return roomtypename;
    }

    public void setRoomtypename(String roomtypename) {
        this.roomtypename = roomtypename;
    }

    public String getRoomtypedes() {
        return roomtypedes;
    }

    public void setRoomtypedes(String roomtypedes) {
        this.roomtypedes = roomtypedes;
    }

    public Integer getRoomtypeStatus() {
        return roomtypeStatus;
    }

    public void setRoomtypeStatus(Integer roomtypeStatus) {
        this.roomtypeStatus = roomtypeStatus;
    }

    public Integer getRoomtyperate() {
        return roomtyperate;
    }

    public void setRoomtyperate(Integer roomtyperate) {
        this.roomtyperate = roomtyperate;
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
    public Collection<Checkinlog> getCheckinlogCollection() {
        return checkinlogCollection;
    }

    public void setCheckinlogCollection(Collection<Checkinlog> checkinlogCollection) {
        this.checkinlogCollection = checkinlogCollection;
    }

    @XmlTransient
    public Collection<PromotionType> getPromotionTypeCollection() {
        return promotionTypeCollection;
    }

    public void setPromotionTypeCollection(Collection<PromotionType> promotionTypeCollection) {
        this.promotionTypeCollection = promotionTypeCollection;
    }

    @XmlTransient
    public Collection<BookingDtlsLog> getBookingDtlsLogCollection() {
        return bookingDtlsLogCollection;
    }

    public void setBookingDtlsLogCollection(Collection<BookingDtlsLog> bookingDtlsLogCollection) {
        this.bookingDtlsLogCollection = bookingDtlsLogCollection;
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
        hash += (roomtypeid != null ? roomtypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomType)) {
            return false;
        }
        RoomType other = (RoomType) object;
        if ((this.roomtypeid == null && other.roomtypeid != null) || (this.roomtypeid != null && !this.roomtypeid.equals(other.roomtypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.RoomType[ roomtypeid=" + roomtypeid + " ]";
    }
    
}
