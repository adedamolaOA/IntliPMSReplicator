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
import javax.persistence.Lob;
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
@Table(name = "maint_request")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaintRequest.findAll", query = "SELECT m FROM MaintRequest m")
    , @NamedQuery(name = "MaintRequest.findByRequestid", query = "SELECT m FROM MaintRequest m WHERE m.requestid = :requestid")
    , @NamedQuery(name = "MaintRequest.findByAreaid", query = "SELECT m FROM MaintRequest m WHERE m.areaid = :areaid")
    , @NamedQuery(name = "MaintRequest.findByItemid", query = "SELECT m FROM MaintRequest m WHERE m.itemid = :itemid")
    , @NamedQuery(name = "MaintRequest.findByRequestby", query = "SELECT m FROM MaintRequest m WHERE m.requestby = :requestby")
    , @NamedQuery(name = "MaintRequest.findByRequestdate", query = "SELECT m FROM MaintRequest m WHERE m.requestdate = :requestdate")
    , @NamedQuery(name = "MaintRequest.findByRequestServerity", query = "SELECT m FROM MaintRequest m WHERE m.requestServerity = :requestServerity")
    , @NamedQuery(name = "MaintRequest.findByRequestfixdate", query = "SELECT m FROM MaintRequest m WHERE m.requestfixdate = :requestfixdate")
    , @NamedQuery(name = "MaintRequest.findByCostEsitmate", query = "SELECT m FROM MaintRequest m WHERE m.costEsitmate = :costEsitmate")
    , @NamedQuery(name = "MaintRequest.findByStatus", query = "SELECT m FROM MaintRequest m WHERE m.status = :status")
    , @NamedQuery(name = "MaintRequest.findByHotelId", query = "SELECT m FROM MaintRequest m WHERE m.hotelId = :hotelId")
    , @NamedQuery(name = "MaintRequest.findByDateCreated", query = "SELECT m FROM MaintRequest m WHERE m.dateCreated = :dateCreated")
    , @NamedQuery(name = "MaintRequest.findByCreatedBy", query = "SELECT m FROM MaintRequest m WHERE m.createdBy = :createdBy")
    , @NamedQuery(name = "MaintRequest.findByDateUpdated", query = "SELECT m FROM MaintRequest m WHERE m.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "MaintRequest.findByUpdatedBy", query = "SELECT m FROM MaintRequest m WHERE m.updatedBy = :updatedBy")
    , @NamedQuery(name = "MaintRequest.findByReplicationStatus", query = "SELECT m FROM MaintRequest m WHERE m.replicationStatus = :replicationStatus")})
public class MaintRequest implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Request_id")
    private Integer requestid;
    @Column(name = "Area_id")
    private String areaid;
    @Column(name = "Item_id")
    private String itemid;
    @Lob
    @Column(name = "Item_desc")
    private String itemdesc;
    @Lob
    @Column(name = "issue_desc")
    private String issueDesc;
    @Column(name = "Request_by")
    private String requestby;
    @Column(name = "Request_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestdate;
    @Column(name = "Request_Serverity")
    private Integer requestServerity;
    @Column(name = "Request_fix_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestfixdate;
    @Column(name = "cost_esitmate")
    private String costEsitmate;
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

    public MaintRequest() {
    }

    public MaintRequest(Integer requestid) {
        this.requestid = requestid;
    }

    public Integer getRequestid() {
        return requestid;
    }

    public void setRequestid(Integer requestid) {
        this.requestid = requestid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    public String getIssueDesc() {
        return issueDesc;
    }

    public void setIssueDesc(String issueDesc) {
        this.issueDesc = issueDesc;
    }

    public String getRequestby() {
        return requestby;
    }

    public void setRequestby(String requestby) {
        this.requestby = requestby;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public Integer getRequestServerity() {
        return requestServerity;
    }

    public void setRequestServerity(Integer requestServerity) {
        this.requestServerity = requestServerity;
    }

    public Date getRequestfixdate() {
        return requestfixdate;
    }

    public void setRequestfixdate(Date requestfixdate) {
        this.requestfixdate = requestfixdate;
    }

    public String getCostEsitmate() {
        return costEsitmate;
    }

    public void setCostEsitmate(String costEsitmate) {
        this.costEsitmate = costEsitmate;
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
        hash += (requestid != null ? requestid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaintRequest)) {
            return false;
        }
        MaintRequest other = (MaintRequest) object;
        if ((this.requestid == null && other.requestid != null) || (this.requestid != null && !this.requestid.equals(other.requestid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.MaintRequest[ requestid=" + requestid + " ]";
    }
    
}
