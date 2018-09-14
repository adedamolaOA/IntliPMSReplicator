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
@Table(name = "Customer_activity_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customeractivitylog.findAll", query = "SELECT c FROM Customeractivitylog c")
    , @NamedQuery(name = "Customeractivitylog.findByActivityid", query = "SELECT c FROM Customeractivitylog c WHERE c.activityid = :activityid")
    , @NamedQuery(name = "Customeractivitylog.findByCustomerid", query = "SELECT c FROM Customeractivitylog c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "Customeractivitylog.findByActdepartid", query = "SELECT c FROM Customeractivitylog c WHERE c.actdepartid = :actdepartid")
    , @NamedQuery(name = "Customeractivitylog.findByActdebit", query = "SELECT c FROM Customeractivitylog c WHERE c.actdebit = :actdebit")
    , @NamedQuery(name = "Customeractivitylog.findByActcredit", query = "SELECT c FROM Customeractivitylog c WHERE c.actcredit = :actcredit")
    , @NamedQuery(name = "Customeractivitylog.findByActBalance", query = "SELECT c FROM Customeractivitylog c WHERE c.actBalance = :actBalance")
    , @NamedQuery(name = "Customeractivitylog.findByDateCreated", query = "SELECT c FROM Customeractivitylog c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "Customeractivitylog.findByCreatedBy", query = "SELECT c FROM Customeractivitylog c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "Customeractivitylog.findByDateUpdated", query = "SELECT c FROM Customeractivitylog c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Customeractivitylog.findByUpdatedBy", query = "SELECT c FROM Customeractivitylog c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "Customeractivitylog.findByReplicationStatus", query = "SELECT c FROM Customeractivitylog c WHERE c.replicationStatus = :replicationStatus")})
public class Customeractivitylog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Activity_id")
    private Integer activityid;
    @Column(name = "Customer_id")
    private String customerid;
    @Lob
    @Column(name = "Act_type_id")
    private String acttypeid;
    @Column(name = "Act_depart_id")
    private String actdepartid;
    @Lob
    @Column(name = "Act_ref_info")
    private String actrefinfo;
    @Column(name = "Act_debit")
    private Long actdebit;
    @Column(name = "Act_credit")
    private Long actcredit;
    @Column(name = "Act_Balance")
    private Long actBalance;
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

    public Customeractivitylog() {
    }

    public Customeractivitylog(Integer activityid) {
        this.activityid = activityid;
    }

    public Integer getActivityid() {
        return activityid;
    }

    public void setActivityid(Integer activityid) {
        this.activityid = activityid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getActtypeid() {
        return acttypeid;
    }

    public void setActtypeid(String acttypeid) {
        this.acttypeid = acttypeid;
    }

    public String getActdepartid() {
        return actdepartid;
    }

    public void setActdepartid(String actdepartid) {
        this.actdepartid = actdepartid;
    }

    public String getActrefinfo() {
        return actrefinfo;
    }

    public void setActrefinfo(String actrefinfo) {
        this.actrefinfo = actrefinfo;
    }

    public Long getActdebit() {
        return actdebit;
    }

    public void setActdebit(Long actdebit) {
        this.actdebit = actdebit;
    }

    public Long getActcredit() {
        return actcredit;
    }

    public void setActcredit(Long actcredit) {
        this.actcredit = actcredit;
    }

    public Long getActBalance() {
        return actBalance;
    }

    public void setActBalance(Long actBalance) {
        this.actBalance = actBalance;
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
        hash += (activityid != null ? activityid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customeractivitylog)) {
            return false;
        }
        Customeractivitylog other = (Customeractivitylog) object;
        if ((this.activityid == null && other.activityid != null) || (this.activityid != null && !this.activityid.equals(other.activityid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Customeractivitylog[ activityid=" + activityid + " ]";
    }
    
}
