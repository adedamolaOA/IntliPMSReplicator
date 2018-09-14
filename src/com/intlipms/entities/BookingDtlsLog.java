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
@Table(name = "booking_dtls_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookingDtlsLog.findAll", query = "SELECT b FROM BookingDtlsLog b")
    , @NamedQuery(name = "BookingDtlsLog.findByBookingdtlsid", query = "SELECT b FROM BookingDtlsLog b WHERE b.bookingdtlsid = :bookingdtlsid")
    , @NamedQuery(name = "BookingDtlsLog.findByNumOfRooms", query = "SELECT b FROM BookingDtlsLog b WHERE b.numOfRooms = :numOfRooms")
    , @NamedQuery(name = "BookingDtlsLog.findByCheckindate", query = "SELECT b FROM BookingDtlsLog b WHERE b.checkindate = :checkindate")
    , @NamedQuery(name = "BookingDtlsLog.findByCheckintime", query = "SELECT b FROM BookingDtlsLog b WHERE b.checkintime = :checkintime")
    , @NamedQuery(name = "BookingDtlsLog.findByCheckoutdate", query = "SELECT b FROM BookingDtlsLog b WHERE b.checkoutdate = :checkoutdate")
    , @NamedQuery(name = "BookingDtlsLog.findByCheckouttime", query = "SELECT b FROM BookingDtlsLog b WHERE b.checkouttime = :checkouttime")
    , @NamedQuery(name = "BookingDtlsLog.findByCheckintype", query = "SELECT b FROM BookingDtlsLog b WHERE b.checkintype = :checkintype")
    , @NamedQuery(name = "BookingDtlsLog.findByBreakfasttypeid", query = "SELECT b FROM BookingDtlsLog b WHERE b.breakfasttypeid = :breakfasttypeid")
    , @NamedQuery(name = "BookingDtlsLog.findByRoomtyperate", query = "SELECT b FROM BookingDtlsLog b WHERE b.roomtyperate = :roomtyperate")
    , @NamedQuery(name = "BookingDtlsLog.findByPromotionrate", query = "SELECT b FROM BookingDtlsLog b WHERE b.promotionrate = :promotionrate")
    , @NamedQuery(name = "BookingDtlsLog.findByDateCreated", query = "SELECT b FROM BookingDtlsLog b WHERE b.dateCreated = :dateCreated")
    , @NamedQuery(name = "BookingDtlsLog.findByCreatedBy", query = "SELECT b FROM BookingDtlsLog b WHERE b.createdBy = :createdBy")
    , @NamedQuery(name = "BookingDtlsLog.findByDateUpdated", query = "SELECT b FROM BookingDtlsLog b WHERE b.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "BookingDtlsLog.findByUpdatedBy", query = "SELECT b FROM BookingDtlsLog b WHERE b.updatedBy = :updatedBy")
    , @NamedQuery(name = "BookingDtlsLog.findByReplicationStatus", query = "SELECT b FROM BookingDtlsLog b WHERE b.replicationStatus = :replicationStatus")})
public class BookingDtlsLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Booking_dtls_id")
    private Integer bookingdtlsid;
    @Column(name = "num_of_rooms")
    private Integer numOfRooms;
    @Column(name = "Check_in_date")
    private String checkindate;
    @Column(name = "Check_in_time")
    private String checkintime;
    @Column(name = "Check_out_date")
    private String checkoutdate;
    @Column(name = "Check_out_time")
    private String checkouttime;
    @Column(name = "Check_in_type")
    private Integer checkintype;
    @Column(name = "Breakfast_type_id")
    private Integer breakfasttypeid;
    @Column(name = "Room_type_rate")
    private String roomtyperate;
    @Column(name = "Promotion_rate")
    private String promotionrate;
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
    @JoinColumn(name = "Booking_id", referencedColumnName = "Booking_id")
    @ManyToOne
    private BookingLog bookingid;
    @JoinColumn(name = "Room_type_id", referencedColumnName = "Room_type_id")
    @ManyToOne
    private RoomType roomtypeid;

    public BookingDtlsLog() {
    }

    public BookingDtlsLog(Integer bookingdtlsid) {
        this.bookingdtlsid = bookingdtlsid;
    }

    public Integer getBookingdtlsid() {
        return bookingdtlsid;
    }

    public void setBookingdtlsid(Integer bookingdtlsid) {
        this.bookingdtlsid = bookingdtlsid;
    }

    public Integer getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(Integer numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public String getCheckindate() {
        return checkindate;
    }

    public void setCheckindate(String checkindate) {
        this.checkindate = checkindate;
    }

    public String getCheckintime() {
        return checkintime;
    }

    public void setCheckintime(String checkintime) {
        this.checkintime = checkintime;
    }

    public String getCheckoutdate() {
        return checkoutdate;
    }

    public void setCheckoutdate(String checkoutdate) {
        this.checkoutdate = checkoutdate;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    public Integer getCheckintype() {
        return checkintype;
    }

    public void setCheckintype(Integer checkintype) {
        this.checkintype = checkintype;
    }

    public Integer getBreakfasttypeid() {
        return breakfasttypeid;
    }

    public void setBreakfasttypeid(Integer breakfasttypeid) {
        this.breakfasttypeid = breakfasttypeid;
    }

    public String getRoomtyperate() {
        return roomtyperate;
    }

    public void setRoomtyperate(String roomtyperate) {
        this.roomtyperate = roomtyperate;
    }

    public String getPromotionrate() {
        return promotionrate;
    }

    public void setPromotionrate(String promotionrate) {
        this.promotionrate = promotionrate;
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

    public BookingLog getBookingid() {
        return bookingid;
    }

    public void setBookingid(BookingLog bookingid) {
        this.bookingid = bookingid;
    }

    public RoomType getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(RoomType roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingdtlsid != null ? bookingdtlsid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingDtlsLog)) {
            return false;
        }
        BookingDtlsLog other = (BookingDtlsLog) object;
        if ((this.bookingdtlsid == null && other.bookingdtlsid != null) || (this.bookingdtlsid != null && !this.bookingdtlsid.equals(other.bookingdtlsid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.BookingDtlsLog[ bookingdtlsid=" + bookingdtlsid + " ]";
    }
    
}
