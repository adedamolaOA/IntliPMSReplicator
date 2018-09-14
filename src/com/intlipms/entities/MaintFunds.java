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
@Table(name = "maint_funds")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaintFunds.findAll", query = "SELECT m FROM MaintFunds m")
    , @NamedQuery(name = "MaintFunds.findByFundId", query = "SELECT m FROM MaintFunds m WHERE m.fundId = :fundId")
    , @NamedQuery(name = "MaintFunds.findByRequestid", query = "SELECT m FROM MaintFunds m WHERE m.requestid = :requestid")
    , @NamedQuery(name = "MaintFunds.findByFundBy", query = "SELECT m FROM MaintFunds m WHERE m.fundBy = :fundBy")
    , @NamedQuery(name = "MaintFunds.findByFundDate", query = "SELECT m FROM MaintFunds m WHERE m.fundDate = :fundDate")
    , @NamedQuery(name = "MaintFunds.findByStatus", query = "SELECT m FROM MaintFunds m WHERE m.status = :status")
    , @NamedQuery(name = "MaintFunds.findByHotelId", query = "SELECT m FROM MaintFunds m WHERE m.hotelId = :hotelId")
    , @NamedQuery(name = "MaintFunds.findByFundSource", query = "SELECT m FROM MaintFunds m WHERE m.fundSource = :fundSource")
    , @NamedQuery(name = "MaintFunds.findByDateCreated", query = "SELECT m FROM MaintFunds m WHERE m.dateCreated = :dateCreated")
    , @NamedQuery(name = "MaintFunds.findByCreatedBy", query = "SELECT m FROM MaintFunds m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MaintFunds.findByDateUpdated", query = "SELECT m FROM MaintFunds m WHERE m.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "MaintFunds.findByUpdatedBy", query = "SELECT m FROM MaintFunds m WHERE m.updatedBy = :updatedBy")
    , @NamedQuery(name = "MaintFunds.findByReplicationStatus", query = "SELECT m FROM MaintFunds m WHERE m.replicationStatus = :replicationStatus")})
public class MaintFunds implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fund_id")
    private Integer fundId;
    @Column(name = "Request_id")
    private Integer requestid;
    @Column(name = "fund_by")
    private String fundBy;
    @Column(name = "fund_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fundDate;
    @Column(name = "status")
    private String status;
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Column(name = "fund_source")
    private String fundSource;
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

    public MaintFunds() {
    }

    public MaintFunds(Integer fundId) {
        this.fundId = fundId;
    }

    public Integer getFundId() {
        return fundId;
    }

    public void setFundId(Integer fundId) {
        this.fundId = fundId;
    }

    public Integer getRequestid() {
        return requestid;
    }

    public void setRequestid(Integer requestid) {
        this.requestid = requestid;
    }

    public String getFundBy() {
        return fundBy;
    }

    public void setFundBy(String fundBy) {
        this.fundBy = fundBy;
    }

    public Date getFundDate() {
        return fundDate;
    }

    public void setFundDate(Date fundDate) {
        this.fundDate = fundDate;
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

    public String getFundSource() {
        return fundSource;
    }

    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
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
        hash += (fundId != null ? fundId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintFunds)) {
            return false;
        }
        MaintFunds other = (MaintFunds) object;
        if ((this.fundId == null && other.fundId != null) || (this.fundId != null && !this.fundId.equals(other.fundId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.MaintFunds[ fundId=" + fundId + " ]";
    }
    
}
