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
@Table(name = "employee_phones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeePhones.findAll", query = "SELECT e FROM EmployeePhones e")
    , @NamedQuery(name = "EmployeePhones.findByEmpPhoneId", query = "SELECT e FROM EmployeePhones e WHERE e.empPhoneId = :empPhoneId")
    , @NamedQuery(name = "EmployeePhones.findByEmpPhone", query = "SELECT e FROM EmployeePhones e WHERE e.empPhone = :empPhone")
    , @NamedQuery(name = "EmployeePhones.findByDateCreated", query = "SELECT e FROM EmployeePhones e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "EmployeePhones.findByCreatedBy", query = "SELECT e FROM EmployeePhones e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "EmployeePhones.findByDateUpdated", query = "SELECT e FROM EmployeePhones e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "EmployeePhones.findByUpdatedBy", query = "SELECT e FROM EmployeePhones e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "EmployeePhones.findByReplicationStatus", query = "SELECT e FROM EmployeePhones e WHERE e.replicationStatus = :replicationStatus")})
public class EmployeePhones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_phone_id")
    private Integer empPhoneId;
    @Column(name = "emp_phone")
    private String empPhone;
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
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster employeeId;

    public EmployeePhones() {
    }

    public EmployeePhones(Integer empPhoneId) {
        this.empPhoneId = empPhoneId;
    }

    public Integer getEmpPhoneId() {
        return empPhoneId;
    }

    public void setEmpPhoneId(Integer empPhoneId) {
        this.empPhoneId = empPhoneId;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
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

    public Employeemaster getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Employeemaster employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empPhoneId != null ? empPhoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeePhones)) {
            return false;
        }
        EmployeePhones other = (EmployeePhones) object;
        if ((this.empPhoneId == null && other.empPhoneId != null) || (this.empPhoneId != null && !this.empPhoneId.equals(other.empPhoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.EmployeePhones[ empPhoneId=" + empPhoneId + " ]";
    }
    
}
