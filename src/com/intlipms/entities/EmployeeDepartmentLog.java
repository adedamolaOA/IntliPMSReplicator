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
@Table(name = "employee_department_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeDepartmentLog.findAll", query = "SELECT e FROM EmployeeDepartmentLog e")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByEmpdeptid", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.empdeptid = :empdeptid")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByEmployeeId", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByDepartId", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.departId = :departId")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByDepartStartDate", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.departStartDate = :departStartDate")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByDepartisPromotion", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.departisPromotion = :departisPromotion")
    , @NamedQuery(name = "EmployeeDepartmentLog.findBySalaryamount", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.salaryamount = :salaryamount")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByDateCreated", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByCreatedBy", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByDateUpdated", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByUpdatedBy", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "EmployeeDepartmentLog.findByReplicationStatus", query = "SELECT e FROM EmployeeDepartmentLog e WHERE e.replicationStatus = :replicationStatus")})
public class EmployeeDepartmentLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Emp_dept_id")
    private Integer empdeptid;
    @Column(name = "employee_id")
    private String employeeId;
    @Column(name = "depart_id")
    private String departId;
    @Column(name = "depart_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date departStartDate;
    @Column(name = "depart_isPromotion")
    private Boolean departisPromotion;
    @Column(name = "Salary_amount")
    private String salaryamount;
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
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;

    public EmployeeDepartmentLog() {
    }

    public EmployeeDepartmentLog(Integer empdeptid) {
        this.empdeptid = empdeptid;
    }

    public Integer getEmpdeptid() {
        return empdeptid;
    }

    public void setEmpdeptid(Integer empdeptid) {
        this.empdeptid = empdeptid;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public Date getDepartStartDate() {
        return departStartDate;
    }

    public void setDepartStartDate(Date departStartDate) {
        this.departStartDate = departStartDate;
    }

    public Boolean getDepartisPromotion() {
        return departisPromotion;
    }

    public void setDepartisPromotion(Boolean departisPromotion) {
        this.departisPromotion = departisPromotion;
    }

    public String getSalaryamount() {
        return salaryamount;
    }

    public void setSalaryamount(String salaryamount) {
        this.salaryamount = salaryamount;
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
        if (!(object instanceof EmployeeDepartmentLog)) {
            return false;
        }
        EmployeeDepartmentLog other = (EmployeeDepartmentLog) object;
        if ((this.empdeptid == null && other.empdeptid != null) || (this.empdeptid != null && !this.empdeptid.equals(other.empdeptid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.EmployeeDepartmentLog[ empdeptid=" + empdeptid + " ]";
    }
    
}
