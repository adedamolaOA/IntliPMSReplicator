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
@Table(name = "user_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserMaster.findAll", query = "SELECT u FROM UserMaster u")
    , @NamedQuery(name = "UserMaster.findById", query = "SELECT u FROM UserMaster u WHERE u.id = :id")
    , @NamedQuery(name = "UserMaster.findByEmployeeId", query = "SELECT u FROM UserMaster u WHERE u.employeeId = :employeeId")
    , @NamedQuery(name = "UserMaster.findByUsername", query = "SELECT u FROM UserMaster u WHERE u.username = :username")
    , @NamedQuery(name = "UserMaster.findByPassword", query = "SELECT u FROM UserMaster u WHERE u.password = :password")
    , @NamedQuery(name = "UserMaster.findByDateCreated", query = "SELECT u FROM UserMaster u WHERE u.dateCreated = :dateCreated")
    , @NamedQuery(name = "UserMaster.findByCreatedBy", query = "SELECT u FROM UserMaster u WHERE u.createdBy = :createdBy")
    , @NamedQuery(name = "UserMaster.findByDateUpdated", query = "SELECT u FROM UserMaster u WHERE u.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "UserMaster.findByUpdatedBy", query = "SELECT u FROM UserMaster u WHERE u.updatedBy = :updatedBy")
    , @NamedQuery(name = "UserMaster.findByReplicationStatus", query = "SELECT u FROM UserMaster u WHERE u.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "UserMaster.findByUserPermId", query = "SELECT u FROM UserMaster u WHERE u.userPermId = :userPermId")})
public class UserMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "employee_Id")
    private Integer employeeId;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
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
    @Column(name = "user_perm_id")
    private Integer userPermId;

    public UserMaster() {
    }

    public UserMaster(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public Integer getUserPermId() {
        return userPermId;
    }

    public void setUserPermId(Integer userPermId) {
        this.userPermId = userPermId;
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
        if (!(object instanceof UserMaster)) {
            return false;
        }
        UserMaster other = (UserMaster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.UserMaster[ id=" + id + " ]";
    }
    
}
