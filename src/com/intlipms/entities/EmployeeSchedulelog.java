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
@Table(name = "Employee_Schedule_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeSchedulelog.findAll", query = "SELECT e FROM EmployeeSchedulelog e")
    , @NamedQuery(name = "EmployeeSchedulelog.findByEmpschlogid", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.empschlogid = :empschlogid")
    , @NamedQuery(name = "EmployeeSchedulelog.findBySchCreationDate", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.schCreationDate = :schCreationDate")
    , @NamedQuery(name = "EmployeeSchedulelog.findBySchStartDate", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.schStartDate = :schStartDate")
    , @NamedQuery(name = "EmployeeSchedulelog.findBySchprimarytype", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.schprimarytype = :schprimarytype")
    , @NamedQuery(name = "EmployeeSchedulelog.findBySchdaypart", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.schdaypart = :schdaypart")
    , @NamedQuery(name = "EmployeeSchedulelog.findByDateCreated", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "EmployeeSchedulelog.findByCreatedBy", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "EmployeeSchedulelog.findByDateUpdated", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "EmployeeSchedulelog.findByUpdatedBy", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "EmployeeSchedulelog.findByReplicationStatus", query = "SELECT e FROM EmployeeSchedulelog e WHERE e.replicationStatus = :replicationStatus")})
public class EmployeeSchedulelog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Emp_sch_log_id")
    private Integer empschlogid;
    @Column(name = "sch_creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date schCreationDate;
    @Column(name = "sch_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date schStartDate;
    @Column(name = "Sch_primary_type")
    private Integer schprimarytype;
    @Column(name = "Sch_daypart")
    private Integer schdaypart;
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
    @JoinColumn(name = "sch_dept_id", referencedColumnName = "Emp_dept_id")
    @ManyToOne
    private EmployeeDepartment schDeptId;
    @JoinColumn(name = "employee_id", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster employeeId;

    public EmployeeSchedulelog() {
    }

    public EmployeeSchedulelog(Integer empschlogid) {
        this.empschlogid = empschlogid;
    }

    public Integer getEmpschlogid() {
        return empschlogid;
    }

    public void setEmpschlogid(Integer empschlogid) {
        this.empschlogid = empschlogid;
    }

    public Date getSchCreationDate() {
        return schCreationDate;
    }

    public void setSchCreationDate(Date schCreationDate) {
        this.schCreationDate = schCreationDate;
    }

    public Date getSchStartDate() {
        return schStartDate;
    }

    public void setSchStartDate(Date schStartDate) {
        this.schStartDate = schStartDate;
    }

    public Integer getSchprimarytype() {
        return schprimarytype;
    }

    public void setSchprimarytype(Integer schprimarytype) {
        this.schprimarytype = schprimarytype;
    }

    public Integer getSchdaypart() {
        return schdaypart;
    }

    public void setSchdaypart(Integer schdaypart) {
        this.schdaypart = schdaypart;
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

    public EmployeeDepartment getSchDeptId() {
        return schDeptId;
    }

    public void setSchDeptId(EmployeeDepartment schDeptId) {
        this.schDeptId = schDeptId;
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
        hash += (empschlogid != null ? empschlogid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeSchedulelog)) {
            return false;
        }
        EmployeeSchedulelog other = (EmployeeSchedulelog) object;
        if ((this.empschlogid == null && other.empschlogid != null) || (this.empschlogid != null && !this.empschlogid.equals(other.empschlogid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.EmployeeSchedulelog[ empschlogid=" + empschlogid + " ]";
    }
    
}
