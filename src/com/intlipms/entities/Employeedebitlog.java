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
@Table(name = "Employee_debit_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeedebitlog.findAll", query = "SELECT e FROM Employeedebitlog e")
    , @NamedQuery(name = "Employeedebitlog.findByEmpDebitId", query = "SELECT e FROM Employeedebitlog e WHERE e.empDebitId = :empDebitId")
    , @NamedQuery(name = "Employeedebitlog.findByEmployeeId", query = "SELECT e FROM Employeedebitlog e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "Employeedebitlog.findByDebitAmount", query = "SELECT e FROM Employeedebitlog e WHERE e.debitAmount = :debitAmount")
    , @NamedQuery(name = "Employeedebitlog.findByDateCreated", query = "SELECT e FROM Employeedebitlog e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "Employeedebitlog.findByCreatedBy", query = "SELECT e FROM Employeedebitlog e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "Employeedebitlog.findByDateUpdated", query = "SELECT e FROM Employeedebitlog e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Employeedebitlog.findByUpdatedBy", query = "SELECT e FROM Employeedebitlog e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "Employeedebitlog.findByReplicationStatus", query = "SELECT e FROM Employeedebitlog e WHERE e.replicationStatus = :replicationStatus")})
public class Employeedebitlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_debit_id")
    private Integer empDebitId;
    @Column(name = "employee_id")
    private String employeeId;
    @Lob
    @Column(name = "debit_reason")
    private String debitReason;
    @Column(name = "debit_amount")
    private String debitAmount;
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

    public Employeedebitlog() {
    }

    public Employeedebitlog(Integer empDebitId) {
        this.empDebitId = empDebitId;
    }

    public Integer getEmpDebitId() {
        return empDebitId;
    }

    public void setEmpDebitId(Integer empDebitId) {
        this.empDebitId = empDebitId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDebitReason() {
        return debitReason;
    }

    public void setDebitReason(String debitReason) {
        this.debitReason = debitReason;
    }

    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
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
        hash += (empDebitId != null ? empDebitId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeedebitlog)) {
            return false;
        }
        Employeedebitlog other = (Employeedebitlog) object;
        if ((this.empDebitId == null && other.empDebitId != null) || (this.empDebitId != null && !this.empDebitId.equals(other.empDebitId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Employeedebitlog[ empDebitId=" + empDebitId + " ]";
    }
    
}
