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
@Table(name = "EmployeeDepartmentMaster")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmployeeDepartmentMaster.findAll", query = "SELECT e FROM EmployeeDepartmentMaster e")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findById", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.id = :id")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByDepartment", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.department = :department")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByHotelId", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.hotelId = :hotelId")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByDateCreated", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByCreatedBy", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByDateUpdated", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByUpdatedBy", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "EmployeeDepartmentMaster.findByReplicationStatus", query = "SELECT e FROM EmployeeDepartmentMaster e WHERE e.replicationStatus = :replicationStatus")})
public class EmployeeDepartmentMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Department")
    private String department;
    @Lob
    @Column(name = "Description")
    private String description;
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

    public EmployeeDepartmentMaster() {
    }

    public EmployeeDepartmentMaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmployeeDepartmentMaster)) {
            return false;
        }
        EmployeeDepartmentMaster other = (EmployeeDepartmentMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.EmployeeDepartmentMaster[ id=" + id + " ]";
    }
    
}
