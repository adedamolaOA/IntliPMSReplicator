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
@Table(name = "Employee_address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeeaddress.findAll", query = "SELECT e FROM Employeeaddress e")
    , @NamedQuery(name = "Employeeaddress.findByEmpAddressId", query = "SELECT e FROM Employeeaddress e WHERE e.empAddressId = :empAddressId")
    , @NamedQuery(name = "Employeeaddress.findByEmpCity", query = "SELECT e FROM Employeeaddress e WHERE e.empCity = :empCity")
    , @NamedQuery(name = "Employeeaddress.findByEmpState", query = "SELECT e FROM Employeeaddress e WHERE e.empState = :empState")
    , @NamedQuery(name = "Employeeaddress.findByDateCreated", query = "SELECT e FROM Employeeaddress e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "Employeeaddress.findByCreatedBy", query = "SELECT e FROM Employeeaddress e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "Employeeaddress.findByDateUpdated", query = "SELECT e FROM Employeeaddress e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Employeeaddress.findByUpdatedBy", query = "SELECT e FROM Employeeaddress e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "Employeeaddress.findByReplicationStatus", query = "SELECT e FROM Employeeaddress e WHERE e.replicationStatus = :replicationStatus")})
public class Employeeaddress implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_address_id")
    private Integer empAddressId;
    @Lob
    @Column(name = "emp_address")
    private String empAddress;
    @Column(name = "emp_city")
    private String empCity;
    @Column(name = "emp_state")
    private String empState;
    @Lob
    @Column(name = "emp_address_des")
    private String empAddressDes;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Basic(optional = false)
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "replication_status")
    private Boolean replicationStatus;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster employeeId;

    public Employeeaddress() {
    }

    public Employeeaddress(Integer empAddressId) {
        this.empAddressId = empAddressId;
    }

    public Employeeaddress(Integer empAddressId, String createdBy, String updatedBy) {
        this.empAddressId = empAddressId;
        this.createdBy = createdBy;
        this.updatedBy = updatedBy;
    }

    public Integer getEmpAddressId() {
        return empAddressId;
    }

    public void setEmpAddressId(Integer empAddressId) {
        this.empAddressId = empAddressId;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpCity() {
        return empCity;
    }

    public void setEmpCity(String empCity) {
        this.empCity = empCity;
    }

    public String getEmpState() {
        return empState;
    }

    public void setEmpState(String empState) {
        this.empState = empState;
    }

    public String getEmpAddressDes() {
        return empAddressDes;
    }

    public void setEmpAddressDes(String empAddressDes) {
        this.empAddressDes = empAddressDes;
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
        hash += (empAddressId != null ? empAddressId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeeaddress)) {
            return false;
        }
        Employeeaddress other = (Employeeaddress) object;
        if ((this.empAddressId == null && other.empAddressId != null) || (this.empAddressId != null && !this.empAddressId.equals(other.empAddressId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Employeeaddress[ empAddressId=" + empAddressId + " ]";
    }
    
}
