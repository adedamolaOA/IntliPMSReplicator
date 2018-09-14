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
import javax.persistence.Lob;
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
@Table(name = "Lundary_Inbound")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LundaryInbound.findAll", query = "SELECT l FROM LundaryInbound l")
    , @NamedQuery(name = "LundaryInbound.findByInboundid", query = "SELECT l FROM LundaryInbound l WHERE l.inboundid = :inboundid")
    , @NamedQuery(name = "LundaryInbound.findByCustId", query = "SELECT l FROM LundaryInbound l WHERE l.custId = :custId")
    , @NamedQuery(name = "LundaryInbound.findByInbounddate", query = "SELECT l FROM LundaryInbound l WHERE l.inbounddate = :inbounddate")
    , @NamedQuery(name = "LundaryInbound.findByOutboundDate", query = "SELECT l FROM LundaryInbound l WHERE l.outboundDate = :outboundDate")
    , @NamedQuery(name = "LundaryInbound.findByTotalNumItems", query = "SELECT l FROM LundaryInbound l WHERE l.totalNumItems = :totalNumItems")
    , @NamedQuery(name = "LundaryInbound.findByAmountCharged", query = "SELECT l FROM LundaryInbound l WHERE l.amountCharged = :amountCharged")
    , @NamedQuery(name = "LundaryInbound.findByDateCreated", query = "SELECT l FROM LundaryInbound l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "LundaryInbound.findByCreatedBy", query = "SELECT l FROM LundaryInbound l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "LundaryInbound.findByDateUpdated", query = "SELECT l FROM LundaryInbound l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "LundaryInbound.findByUpdatedBy", query = "SELECT l FROM LundaryInbound l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "LundaryInbound.findByReplicationStatus", query = "SELECT l FROM LundaryInbound l WHERE l.replicationStatus = :replicationStatus")})
public class LundaryInbound implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Inbound_id")
    private Integer inboundid;
    @Column(name = "Cust_Id")
    private String custId;
    @Column(name = "Inbound_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inbounddate;
    @Column(name = "outbound_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date outboundDate;
    @Lob
    @Column(name = "Outbound_time")
    private byte[] outboundtime;
    @Column(name = "total_num_items")
    private Integer totalNumItems;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "amount_charged")
    private BigDecimal amountCharged;
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
    @OneToMany(mappedBy = "inboundid")
    private Collection<LundaryInboundlog> lundaryInboundlogCollection;

    public LundaryInbound() {
    }

    public LundaryInbound(Integer inboundid) {
        this.inboundid = inboundid;
    }

    public Integer getInboundid() {
        return inboundid;
    }

    public void setInboundid(Integer inboundid) {
        this.inboundid = inboundid;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getInbounddate() {
        return inbounddate;
    }

    public void setInbounddate(Date inbounddate) {
        this.inbounddate = inbounddate;
    }

    public Date getOutboundDate() {
        return outboundDate;
    }

    public void setOutboundDate(Date outboundDate) {
        this.outboundDate = outboundDate;
    }

    public byte[] getOutboundtime() {
        return outboundtime;
    }

    public void setOutboundtime(byte[] outboundtime) {
        this.outboundtime = outboundtime;
    }

    public Integer getTotalNumItems() {
        return totalNumItems;
    }

    public void setTotalNumItems(Integer totalNumItems) {
        this.totalNumItems = totalNumItems;
    }

    public BigDecimal getAmountCharged() {
        return amountCharged;
    }

    public void setAmountCharged(BigDecimal amountCharged) {
        this.amountCharged = amountCharged;
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
    public Collection<LundaryInboundlog> getLundaryInboundlogCollection() {
        return lundaryInboundlogCollection;
    }

    public void setLundaryInboundlogCollection(Collection<LundaryInboundlog> lundaryInboundlogCollection) {
        this.lundaryInboundlogCollection = lundaryInboundlogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inboundid != null ? inboundid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LundaryInbound)) {
            return false;
        }
        LundaryInbound other = (LundaryInbound) object;
        if ((this.inboundid == null && other.inboundid != null) || (this.inboundid != null && !this.inboundid.equals(other.inboundid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.LundaryInbound[ inboundid=" + inboundid + " ]";
    }
    
}
