/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "employee_department")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeDepartment.findAll", query = "SELECT e FROM EmployeeDepartment e")
    , @NamedQuery(name = "EmployeeDepartment.findByEmpdeptid", query = "SELECT e FROM EmployeeDepartment e WHERE e.empdeptid = :empdeptid")
    , @NamedQuery(name = "EmployeeDepartment.findByDepartName", query = "SELECT e FROM EmployeeDepartment e WHERE e.departName = :departName")
    , @NamedQuery(name = "EmployeeDepartment.findByDeptsubname", query = "SELECT e FROM EmployeeDepartment e WHERE e.deptsubname = :deptsubname")
    , @NamedQuery(name = "EmployeeDepartment.findByDateCreated", query = "SELECT e FROM EmployeeDepartment e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "EmployeeDepartment.findByCreatedBy", query = "SELECT e FROM EmployeeDepartment e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "EmployeeDepartment.findByDateUpdated", query = "SELECT e FROM EmployeeDepartment e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "EmployeeDepartment.findByUpdatedBy", query = "SELECT e FROM EmployeeDepartment e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "EmployeeDepartment.findByReplicationStatus", query = "SELECT e FROM EmployeeDepartment e WHERE e.replicationStatus = :replicationStatus")})
public class EmployeeDepartment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Emp_dept_id")
    private Integer empdeptid;
    @Column(name = "depart_Name")
    private String departName;
    @Column(name = "Dept_sub_name")
    private String deptsubname;
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
    @OneToMany(mappedBy = "schDeptId")
    private Collection<EmployeeSchedulelog> employeeSchedulelogCollection;
    @OneToMany(mappedBy = "schDeptId")
    private Collection<Employeetimeofflog> employeetimeofflogCollection;
    @OneToMany(mappedBy = "departid")
    private Collection<Inventoryaudit> inventoryauditCollection;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;

    public EmployeeDepartment() {
    }

    public EmployeeDepartment(Integer empdeptid) {
        this.empdeptid = empdeptid;
    }

    public Integer getEmpdeptid() {
        return empdeptid;
    }

    public void setEmpdeptid(Integer empdeptid) {
        this.empdeptid = empdeptid;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getDeptsubname() {
        return deptsubname;
    }

    public void setDeptsubname(String deptsubname) {
        this.deptsubname = deptsubname;
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
    public Collection<EmployeeSchedulelog> getEmployeeSchedulelogCollection() {
        return employeeSchedulelogCollection;
    }

    public void setEmployeeSchedulelogCollection(Collection<EmployeeSchedulelog> employeeSchedulelogCollection) {
        this.employeeSchedulelogCollection = employeeSchedulelogCollection;
    }

    @XmlTransient
    public Collection<Employeetimeofflog> getEmployeetimeofflogCollection() {
        return employeetimeofflogCollection;
    }

    public void setEmployeetimeofflogCollection(Collection<Employeetimeofflog> employeetimeofflogCollection) {
        this.employeetimeofflogCollection = employeetimeofflogCollection;
    }

    @XmlTransient
    public Collection<Inventoryaudit> getInventoryauditCollection() {
        return inventoryauditCollection;
    }

    public void setInventoryauditCollection(Collection<Inventoryaudit> inventoryauditCollection) {
        this.inventoryauditCollection = inventoryauditCollection;
    }

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empdeptid != null ? empdeptid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeDepartment)) {
            return false;
        }
        EmployeeDepartment other = (EmployeeDepartment) object;
        if ((this.empdeptid == null && other.empdeptid != null) || (this.empdeptid != null && !this.empdeptid.equals(other.empdeptid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.EmployeeDepartment[ empdeptid=" + empdeptid + " ]";
    }
    
}
