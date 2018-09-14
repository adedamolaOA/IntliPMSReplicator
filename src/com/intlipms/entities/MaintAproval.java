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
@Table(name = "maint_aproval")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaintAproval.findAll", query = "SELECT m FROM MaintAproval m")
    , @NamedQuery(name = "MaintAproval.findByApprovalId", query = "SELECT m FROM MaintAproval m WHERE m.approvalId = :approvalId")
    , @NamedQuery(name = "MaintAproval.findByRequestid", query = "SELECT m FROM MaintAproval m WHERE m.requestid = :requestid")
    , @NamedQuery(name = "MaintAproval.findByApprovedBy", query = "SELECT m FROM MaintAproval m WHERE m.approvedBy = :approvedBy")
    , @NamedQuery(name = "MaintAproval.findByFundingSource", query = "SELECT m FROM MaintAproval m WHERE m.fundingSource = :fundingSource")
    , @NamedQuery(name = "MaintAproval.findByAprovedate", query = "SELECT m FROM MaintAproval m WHERE m.aprovedate = :aprovedate")
    , @NamedQuery(name = "MaintAproval.findByStatus", query = "SELECT m FROM MaintAproval m WHERE m.status = :status")
    , @NamedQuery(name = "MaintAproval.findByHotelId", query = "SELECT m FROM MaintAproval m WHERE m.hotelId = :hotelId")
    , @NamedQuery(name = "MaintAproval.findByDateCreated", query = "SELECT m FROM MaintAproval m WHERE m.dateCreated = :dateCreated")
    , @NamedQuery(name = "MaintAproval.findByCreatedBy", query = "SELECT m FROM MaintAproval m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MaintAproval.findByDateUpdated", query = "SELECT m FROM MaintAproval m WHERE m.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "MaintAproval.findByUpdatedBy", query = "SELECT m FROM MaintAproval m WHERE m.updatedBy = :updatedBy")
    , @NamedQuery(name = "MaintAproval.findByReplicationStatus", query = "SELECT m FROM MaintAproval m WHERE m.replicationStatus = :replicationStatus")})
public class MaintAproval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "approval_id")
    private Integer approvalId;
    @Column(name = "Request_id")
    private Integer requestid;
    @Column(name = "approved_by")
    private String approvedBy;
    @Column(name = "funding_source")
    private String fundingSource;
    @Column(name = "Aprove_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date aprovedate;
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

    public MaintAproval() {
    }

    public MaintAproval(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public Integer getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(Integer approvalId) {
        this.approvalId = approvalId;
    }

    public Integer getRequestid() {
        return requestid;
    }

    public void setRequestid(Integer requestid) {
        this.requestid = requestid;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public String getFundingSource() {
        return fundingSource;
    }

    public void setFundingSource(String fundingSource) {
        this.fundingSource = fundingSource;
    }

    public Date getAprovedate() {
        return aprovedate;
    }

    public void setAprovedate(Date aprovedate) {
        this.aprovedate = aprovedate;
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
        hash += (approvalId != null ? approvalId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintAproval)) {
            return false;
        }
        MaintAproval other = (MaintAproval) object;
        if ((this.approvalId == null && other.approvalId != null) || (this.approvalId != null && !this.approvalId.equals(other.approvalId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.MaintAproval[ approvalId=" + approvalId + " ]";
    }
    
}
