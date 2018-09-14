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
@Table(name = "maint_costing")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaintCosting.findAll", query = "SELECT m FROM MaintCosting m")
    , @NamedQuery(name = "MaintCosting.findByCostingId", query = "SELECT m FROM MaintCosting m WHERE m.costingId = :costingId")
    , @NamedQuery(name = "MaintCosting.findByRequestid", query = "SELECT m FROM MaintCosting m WHERE m.requestid = :requestid")
    , @NamedQuery(name = "MaintCosting.findByCost", query = "SELECT m FROM MaintCosting m WHERE m.cost = :cost")
    , @NamedQuery(name = "MaintCosting.findByCostBy", query = "SELECT m FROM MaintCosting m WHERE m.costBy = :costBy")
    , @NamedQuery(name = "MaintCosting.findByFundsReleasedTo", query = "SELECT m FROM MaintCosting m WHERE m.fundsReleasedTo = :fundsReleasedTo")
    , @NamedQuery(name = "MaintCosting.findByCostDate", query = "SELECT m FROM MaintCosting m WHERE m.costDate = :costDate")
    , @NamedQuery(name = "MaintCosting.findByStatus", query = "SELECT m FROM MaintCosting m WHERE m.status = :status")
    , @NamedQuery(name = "MaintCosting.findByHotelId", query = "SELECT m FROM MaintCosting m WHERE m.hotelId = :hotelId")
    , @NamedQuery(name = "MaintCosting.findByDateCreated", query = "SELECT m FROM MaintCosting m WHERE m.dateCreated = :dateCreated")
    , @NamedQuery(name = "MaintCosting.findByCreatedBy", query = "SELECT m FROM MaintCosting m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MaintCosting.findByDateUpdated", query = "SELECT m FROM MaintCosting m WHERE m.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "MaintCosting.findByUpdatedBy", query = "SELECT m FROM MaintCosting m WHERE m.updatedBy = :updatedBy")
    , @NamedQuery(name = "MaintCosting.findByReplicationStatus", query = "SELECT m FROM MaintCosting m WHERE m.replicationStatus = :replicationStatus")})
public class MaintCosting implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "costing_id")
    private Integer costingId;
    @Column(name = "Request_id")
    private Integer requestid;
    @Column(name = "Cost")
    private String cost;
    @Column(name = "cost_by")
    private String costBy;
    @Column(name = "funds_released_to")
    private String fundsReleasedTo;
    @Column(name = "cost_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date costDate;
    @Column(name = "status")
    private String status;
    @Column(name = "Hotel_Id")
    private String hotelId;
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

    public MaintCosting() {
    }

    public MaintCosting(Integer costingId) {
        this.costingId = costingId;
    }

    public Integer getCostingId() {
        return costingId;
    }

    public void setCostingId(Integer costingId) {
        this.costingId = costingId;
    }

    public Integer getRequestid() {
        return requestid;
    }

    public void setRequestid(Integer requestid) {
        this.requestid = requestid;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getCostBy() {
        return costBy;
    }

    public void setCostBy(String costBy) {
        this.costBy = costBy;
    }

    public String getFundsReleasedTo() {
        return fundsReleasedTo;
    }

    public void setFundsReleasedTo(String fundsReleasedTo) {
        this.fundsReleasedTo = fundsReleasedTo;
    }

    public Date getCostDate() {
        return costDate;
    }

    public void setCostDate(Date costDate) {
        this.costDate = costDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costingId != null ? costingId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintCosting)) {
            return false;
        }
        MaintCosting other = (MaintCosting) object;
        if ((this.costingId == null && other.costingId != null) || (this.costingId != null && !this.costingId.equals(other.costingId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.MaintCosting[ costingId=" + costingId + " ]";
    }
    
}
