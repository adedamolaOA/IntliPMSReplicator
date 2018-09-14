/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "booking_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookingLog.findAll", query = "SELECT b FROM BookingLog b")
    , @NamedQuery(name = "BookingLog.findByBookingid", query = "SELECT b FROM BookingLog b WHERE b.bookingid = :bookingid")
    , @NamedQuery(name = "BookingLog.findByRoomnumrooms", query = "SELECT b FROM BookingLog b WHERE b.roomnumrooms = :roomnumrooms")
    , @NamedQuery(name = "BookingLog.findByPaytypeid", query = "SELECT b FROM BookingLog b WHERE b.paytypeid = :paytypeid")
    , @NamedQuery(name = "BookingLog.findByCustomersource", query = "SELECT b FROM BookingLog b WHERE b.customersource = :customersource")
    , @NamedQuery(name = "BookingLog.findByTotalAmount", query = "SELECT b FROM BookingLog b WHERE b.totalAmount = :totalAmount")
    , @NamedQuery(name = "BookingLog.findByDepositamount", query = "SELECT b FROM BookingLog b WHERE b.depositamount = :depositamount")
    , @NamedQuery(name = "BookingLog.findByDateCreated", query = "SELECT b FROM BookingLog b WHERE b.dateCreated = :dateCreated")
    , @NamedQuery(name = "BookingLog.findByCreatedBy", query = "SELECT b FROM BookingLog b WHERE b.createdBy = :createdBy")
    , @NamedQuery(name = "BookingLog.findByDateUpdated", query = "SELECT b FROM BookingLog b WHERE b.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "BookingLog.findByUpdatedBy", query = "SELECT b FROM BookingLog b WHERE b.updatedBy = :updatedBy")
    , @NamedQuery(name = "BookingLog.findByReplicationStatus", query = "SELECT b FROM BookingLog b WHERE b.replicationStatus = :replicationStatus")})
public class BookingLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Booking_id")
    private Integer bookingid;
    @Column(name = "Room_num_rooms")
    private Integer roomnumrooms;
    @Column(name = "Pay_type_id")
    private Integer paytypeid;
    @Column(name = "Customer_source")
    private Integer customersource;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Total_Amount")
    private BigDecimal totalAmount;
    @Column(name = "Deposit_amount")
    private BigDecimal depositamount;
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
    @OneToMany(mappedBy = "bookingid")
    private Collection<Checkinlog> checkinlogCollection;
    @OneToMany(mappedBy = "bookingid")
    private Collection<BookingDtlsLog> bookingDtlsLogCollection;
    @JoinColumn(name = "Customer_id", referencedColumnName = "Customer_id")
    @ManyToOne
    private Customer customerid;
    @JoinColumn(name = "Customer_pay_id", referencedColumnName = "Customer_id")
    @ManyToOne
    private Customer customerpayid;
    @JoinColumn(name = "Relationship_cust_id", referencedColumnName = "Customer_id")
    @ManyToOne
    private Customer relationshipcustid;

    public BookingLog() {
    }

    public BookingLog(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Integer getBookingid() {
        return bookingid;
    }

    public void setBookingid(Integer bookingid) {
        this.bookingid = bookingid;
    }

    public Integer getRoomnumrooms() {
        return roomnumrooms;
    }

    public void setRoomnumrooms(Integer roomnumrooms) {
        this.roomnumrooms = roomnumrooms;
    }

    public Integer getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(Integer paytypeid) {
        this.paytypeid = paytypeid;
    }

    public Integer getCustomersource() {
        return customersource;
    }

    public void setCustomersource(Integer customersource) {
        this.customersource = customersource;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(BigDecimal depositamount) {
        this.depositamount = depositamount;
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
    public Collection<BookingDtlsLog> getBookingDtlsLogCollection() {
        return bookingDtlsLogCollection;
    }

    public void setBookingDtlsLogCollection(Collection<BookingDtlsLog> bookingDtlsLogCollection) {
        this.bookingDtlsLogCollection = bookingDtlsLogCollection;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Customer getCustomerpayid() {
        return customerpayid;
    }

    public void setCustomerpayid(Customer customerpayid) {
        this.customerpayid = customerpayid;
    }

    public Customer getRelationshipcustid() {
        return relationshipcustid;
    }

    public void setRelationshipcustid(Customer relationshipcustid) {
        this.relationshipcustid = relationshipcustid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bookingid != null ? bookingid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BookingLog)) {
            return false;
        }
        BookingLog other = (BookingLog) object;
        if ((this.bookingid == null && other.bookingid != null) || (this.bookingid != null && !this.bookingid.equals(other.bookingid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.BookingLog[ bookingid=" + bookingid + " ]";
    }
    
}
