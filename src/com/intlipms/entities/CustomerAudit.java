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
@Table(name = "customer_audit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerAudit.findAll", query = "SELECT c FROM CustomerAudit c")
    , @NamedQuery(name = "CustomerAudit.findByAuditId", query = "SELECT c FROM CustomerAudit c WHERE c.auditId = :auditId")
    , @NamedQuery(name = "CustomerAudit.findByAuditedBy", query = "SELECT c FROM CustomerAudit c WHERE c.auditedBy = :auditedBy")
    , @NamedQuery(name = "CustomerAudit.findByAuditDate", query = "SELECT c FROM CustomerAudit c WHERE c.auditDate = :auditDate")
    , @NamedQuery(name = "CustomerAudit.findByCustomerCount", query = "SELECT c FROM CustomerAudit c WHERE c.customerCount = :customerCount")
    , @NamedQuery(name = "CustomerAudit.findByTotalCreditPending", query = "SELECT c FROM CustomerAudit c WHERE c.totalCreditPending = :totalCreditPending")
    , @NamedQuery(name = "CustomerAudit.findByTotalDebitPending", query = "SELECT c FROM CustomerAudit c WHERE c.totalDebitPending = :totalDebitPending")
    , @NamedQuery(name = "CustomerAudit.findByPreviousTotalSales", query = "SELECT c FROM CustomerAudit c WHERE c.previousTotalSales = :previousTotalSales")
    , @NamedQuery(name = "CustomerAudit.findByHotelId", query = "SELECT c FROM CustomerAudit c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CustomerAudit.findByCreatedBy", query = "SELECT c FROM CustomerAudit c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CustomerAudit.findByDateCreated", query = "SELECT c FROM CustomerAudit c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CustomerAudit.findByUpdatedBy", query = "SELECT c FROM CustomerAudit c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CustomerAudit.findByDateUpdated", query = "SELECT c FROM CustomerAudit c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CustomerAudit.findByReplicationStatus", query = "SELECT c FROM CustomerAudit c WHERE c.replicationStatus = :replicationStatus")})
public class CustomerAudit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "audit_id")
    private Integer auditId;
    @Column(name = "audited_by")
    private String auditedBy;
    @Column(name = "audit_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date auditDate;
    @Column(name = "customer_count")
    private Integer customerCount;
    @Column(name = "total_credit_pending")
    private Long totalCreditPending;
    @Column(name = "total_debit_pending")
    private Long totalDebitPending;
    @Column(name = "previous_total_sales")
    private Long previousTotalSales;
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Column(name = "replication_status")
    private Boolean replicationStatus;

    public CustomerAudit() {
    }

    public CustomerAudit(Integer auditId) {
        this.auditId = auditId;
    }

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getAuditedBy() {
        return auditedBy;
    }

    public void setAuditedBy(String auditedBy) {
        this.auditedBy = auditedBy;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public Integer getCustomerCount() {
        return customerCount;
    }

    public void setCustomerCount(Integer customerCount) {
        this.customerCount = customerCount;
    }

    public Long getTotalCreditPending() {
        return totalCreditPending;
    }

    public void setTotalCreditPending(Long totalCreditPending) {
        this.totalCreditPending = totalCreditPending;
    }

    public Long getTotalDebitPending() {
        return totalDebitPending;
    }

    public void setTotalDebitPending(Long totalDebitPending) {
        this.totalDebitPending = totalDebitPending;
    }

    public Long getPreviousTotalSales() {
        return previousTotalSales;
    }

    public void setPreviousTotalSales(Long previousTotalSales) {
        this.previousTotalSales = previousTotalSales;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
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
        hash += (auditId != null ? auditId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerAudit)) {
            return false;
        }
        CustomerAudit other = (CustomerAudit) object;
        if ((this.auditId == null && other.auditId != null) || (this.auditId != null && !this.auditId.equals(other.auditId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CustomerAudit[ auditId=" + auditId + " ]";
    }
    
}
