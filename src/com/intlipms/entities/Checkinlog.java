/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Check_in_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Checkinlog.findAll", query = "SELECT c FROM Checkinlog c")
    , @NamedQuery(name = "Checkinlog.findByCheckinlog", query = "SELECT c FROM Checkinlog c WHERE c.checkinlog = :checkinlog")
    , @NamedQuery(name = "Checkinlog.findByCheckindate", query = "SELECT c FROM Checkinlog c WHERE c.checkindate = :checkindate")
    , @NamedQuery(name = "Checkinlog.findByCheckintime", query = "SELECT c FROM Checkinlog c WHERE c.checkintime = :checkintime")
    , @NamedQuery(name = "Checkinlog.findByCheckoutdate", query = "SELECT c FROM Checkinlog c WHERE c.checkoutdate = :checkoutdate")
    , @NamedQuery(name = "Checkinlog.findByCheckouttime", query = "SELECT c FROM Checkinlog c WHERE c.checkouttime = :checkouttime")
    , @NamedQuery(name = "Checkinlog.findByCheckintype", query = "SELECT c FROM Checkinlog c WHERE c.checkintype = :checkintype")
    , @NamedQuery(name = "Checkinlog.findByAmountBilled", query = "SELECT c FROM Checkinlog c WHERE c.amountBilled = :amountBilled")
    , @NamedQuery(name = "Checkinlog.findByAmountCollected", query = "SELECT c FROM Checkinlog c WHERE c.amountCollected = :amountCollected")
    , @NamedQuery(name = "Checkinlog.findByDateCreated", query = "SELECT c FROM Checkinlog c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Checkinlog.findByCreatedBy", query = "SELECT c FROM Checkinlog c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Checkinlog.findByDateUpdated", query = "SELECT c FROM Checkinlog c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Checkinlog.findByUpdatedBy", query = "SELECT c FROM Checkinlog c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Checkinlog.findByReplicationStatus", query = "SELECT c FROM Checkinlog c WHERE c.replicationStatus = :replicationStatus")})
public class Checkinlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Check_in_log")
    private Integer checkinlog;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Amount_Billed")
    private BigDecimal amountBilled;
    @Column(name = "Amount_Collected")
    private BigDecimal amountCollected;
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
    @JoinColumn(name = "Customer_pay_id", referencedColumnName = "Customer_id")
    @ManyToOne
    private Customer customerpayid;
    @JoinColumn(name = "Customer_check_in_id", referencedColumnName = "Customer_id")
    @ManyToOne
    private Customer customercheckinid;
    @JoinColumn(name = "Room_type_id", referencedColumnName = "Room_type_id")
    @ManyToOne
    private RoomType roomtypeid;

    public Checkinlog() {
    }

    public Checkinlog(Integer checkinlog) {
        this.checkinlog = checkinlog;
    }

    public Integer getCheckinlog() {
        return checkinlog;
    }

    public void setCheckinlog(Integer checkinlog) {
        this.checkinlog = checkinlog;
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

    public BigDecimal getAmountBilled() {
        return amountBilled;
    }

    public void setAmountBilled(BigDecimal amountBilled) {
        this.amountBilled = amountBilled;
    }

    public BigDecimal getAmountCollected() {
        return amountCollected;
    }

    public void setAmountCollected(BigDecimal amountCollected) {
        this.amountCollected = amountCollected;
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

    public Customer getCustomerpayid() {
        return customerpayid;
    }

    public void setCustomerpayid(Customer customerpayid) {
        this.customerpayid = customerpayid;
    }

    public Customer getCustomercheckinid() {
        return customercheckinid;
    }

    public void setCustomercheckinid(Customer customercheckinid) {
        this.customercheckinid = customercheckinid;
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
        hash += (checkinlog != null ? checkinlog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Checkinlog)) {
            return false;
        }
        Checkinlog other = (Checkinlog) object;
        if ((this.checkinlog == null && other.checkinlog != null) || (this.checkinlog != null && !this.checkinlog.equals(other.checkinlog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Checkinlog[ checkinlog=" + checkinlog + " ]";
    }
    
}
