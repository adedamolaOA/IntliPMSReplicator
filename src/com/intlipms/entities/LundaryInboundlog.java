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
@Table(name = "Lundary_Inbound_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LundaryInboundlog.findAll", query = "SELECT l FROM LundaryInboundlog l")
    , @NamedQuery(name = "LundaryInboundlog.findByInboundItemId", query = "SELECT l FROM LundaryInboundlog l WHERE l.inboundItemId = :inboundItemId")
    , @NamedQuery(name = "LundaryInboundlog.findByLaundrycatid", query = "SELECT l FROM LundaryInboundlog l WHERE l.laundrycatid = :laundrycatid")
    , @NamedQuery(name = "LundaryInboundlog.findByItemqty", query = "SELECT l FROM LundaryInboundlog l WHERE l.itemqty = :itemqty")
    , @NamedQuery(name = "LundaryInboundlog.findByOutboundDate", query = "SELECT l FROM LundaryInboundlog l WHERE l.outboundDate = :outboundDate")
    , @NamedQuery(name = "LundaryInboundlog.findByRateperitem", query = "SELECT l FROM LundaryInboundlog l WHERE l.rateperitem = :rateperitem")
    , @NamedQuery(name = "LundaryInboundlog.findByDateCreated", query = "SELECT l FROM LundaryInboundlog l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "LundaryInboundlog.findByCreatedBy", query = "SELECT l FROM LundaryInboundlog l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "LundaryInboundlog.findByDateUpdated", query = "SELECT l FROM LundaryInboundlog l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "LundaryInboundlog.findByUpdatedBy", query = "SELECT l FROM LundaryInboundlog l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "LundaryInboundlog.findByReplicationStatus", query = "SELECT l FROM LundaryInboundlog l WHERE l.replicationStatus = :replicationStatus")})
public class LundaryInboundlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "inbound_item_id")
    private Integer inboundItemId;
    @Column(name = "Laundry_cat_id")
    private String laundrycatid;
    @Lob
    @Column(name = "Laundry_notes")
    private String laundrynotes;
    @Column(name = "Item_qty")
    private Integer itemqty;
    @Column(name = "outbound_date")
    private String outboundDate;
    @Lob
    @Column(name = "Outbound_time")
    private byte[] outboundtime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Rate_per_item")
    private BigDecimal rateperitem;
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
    @JoinColumn(name = "Inbound_id", referencedColumnName = "Inbound_id")
    @ManyToOne
    private LundaryInbound inboundid;
    @JoinColumn(name = "Laundry_type_id", referencedColumnName = "Lundry_type_id")
    @ManyToOne
    private LundaryType laundrytypeid;

    public LundaryInboundlog() {
    }

    public LundaryInboundlog(Integer inboundItemId) {
        this.inboundItemId = inboundItemId;
    }

    public Integer getInboundItemId() {
        return inboundItemId;
    }

    public void setInboundItemId(Integer inboundItemId) {
        this.inboundItemId = inboundItemId;
    }

    public String getLaundrycatid() {
        return laundrycatid;
    }

    public void setLaundrycatid(String laundrycatid) {
        this.laundrycatid = laundrycatid;
    }

    public String getLaundrynotes() {
        return laundrynotes;
    }

    public void setLaundrynotes(String laundrynotes) {
        this.laundrynotes = laundrynotes;
    }

    public Integer getItemqty() {
        return itemqty;
    }

    public void setItemqty(Integer itemqty) {
        this.itemqty = itemqty;
    }

    public String getOutboundDate() {
        return outboundDate;
    }

    public void setOutboundDate(String outboundDate) {
        this.outboundDate = outboundDate;
    }

    public byte[] getOutboundtime() {
        return outboundtime;
    }

    public void setOutboundtime(byte[] outboundtime) {
        this.outboundtime = outboundtime;
    }

    public BigDecimal getRateperitem() {
        return rateperitem;
    }

    public void setRateperitem(BigDecimal rateperitem) {
        this.rateperitem = rateperitem;
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

    public LundaryInbound getInboundid() {
        return inboundid;
    }

    public void setInboundid(LundaryInbound inboundid) {
        this.inboundid = inboundid;
    }

    public LundaryType getLaundrytypeid() {
        return laundrytypeid;
    }

    public void setLaundrytypeid(LundaryType laundrytypeid) {
        this.laundrytypeid = laundrytypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inboundItemId != null ? inboundItemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LundaryInboundlog)) {
            return false;
        }
        LundaryInboundlog other = (LundaryInboundlog) object;
        if ((this.inboundItemId == null && other.inboundItemId != null) || (this.inboundItemId != null && !this.inboundItemId.equals(other.inboundItemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.LundaryInboundlog[ inboundItemId=" + inboundItemId + " ]";
    }
    
}
