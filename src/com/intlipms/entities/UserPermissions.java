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
@Table(name = "User_Permissions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserPermissions.findAll", query = "SELECT u FROM UserPermissions u")
    , @NamedQuery(name = "UserPermissions.findByUserPermId", query = "SELECT u FROM UserPermissions u WHERE u.userPermId = :userPermId")
    , @NamedQuery(name = "UserPermissions.findByPermName", query = "SELECT u FROM UserPermissions u WHERE u.permName = :permName")
    , @NamedQuery(name = "UserPermissions.findByModule", query = "SELECT u FROM UserPermissions u WHERE u.module = :module")
    , @NamedQuery(name = "UserPermissions.findByMForm", query = "SELECT u FROM UserPermissions u WHERE u.mForm = :mForm")
    , @NamedQuery(name = "UserPermissions.findByMView", query = "SELECT u FROM UserPermissions u WHERE u.mView = :mView")
    , @NamedQuery(name = "UserPermissions.findByMAdd", query = "SELECT u FROM UserPermissions u WHERE u.mAdd = :mAdd")
    , @NamedQuery(name = "UserPermissions.findByMUpdate", query = "SELECT u FROM UserPermissions u WHERE u.mUpdate = :mUpdate")
    , @NamedQuery(name = "UserPermissions.findByMDelete", query = "SELECT u FROM UserPermissions u WHERE u.mDelete = :mDelete")
    , @NamedQuery(name = "UserPermissions.findByDateCreated", query = "SELECT u FROM UserPermissions u WHERE u.dateCreated = :dateCreated")
    , @NamedQuery(name = "UserPermissions.findByCreatedBy", query = "SELECT u FROM UserPermissions u WHERE u.createdBy = :createdBy")
    , @NamedQuery(name = "UserPermissions.findByDateUpdated", query = "SELECT u FROM UserPermissions u WHERE u.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "UserPermissions.findByUpdatedBy", query = "SELECT u FROM UserPermissions u WHERE u.updatedBy = :updatedBy")
    , @NamedQuery(name = "UserPermissions.findByReplicationStatus", query = "SELECT u FROM UserPermissions u WHERE u.replicationStatus = :replicationStatus")})
public class UserPermissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_perm_id")
    private Integer userPermId;
    @Column(name = "perm_name")
    private String permName;
    @Column(name = "module")
    private String module;
    @Column(name = "m_form")
    private String mForm;
    @Column(name = "m_view")
    private Boolean mView;
    @Column(name = "m_add")
    private Boolean mAdd;
    @Column(name = "m_update")
    private Boolean mUpdate;
    @Column(name = "m_delete")
    private Boolean mDelete;
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

    public UserPermissions() {
    }

    public UserPermissions(Integer userPermId) {
        this.userPermId = userPermId;
    }

    public Integer getUserPermId() {
        return userPermId;
    }

    public void setUserPermId(Integer userPermId) {
        this.userPermId = userPermId;
    }

    public String getPermName() {
        return permName;
    }

    public void setPermName(String permName) {
        this.permName = permName;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMForm() {
        return mForm;
    }

    public void setMForm(String mForm) {
        this.mForm = mForm;
    }

    public Boolean getMView() {
        return mView;
    }

    public void setMView(Boolean mView) {
        this.mView = mView;
    }

    public Boolean getMAdd() {
        return mAdd;
    }

    public void setMAdd(Boolean mAdd) {
        this.mAdd = mAdd;
    }

    public Boolean getMUpdate() {
        return mUpdate;
    }

    public void setMUpdate(Boolean mUpdate) {
        this.mUpdate = mUpdate;
    }

    public Boolean getMDelete() {
        return mDelete;
    }

    public void setMDelete(Boolean mDelete) {
        this.mDelete = mDelete;
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
        hash += (userPermId != null ? userPermId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserPermissions)) {
            return false;
        }
        UserPermissions other = (UserPermissions) object;
        if ((this.userPermId == null && other.userPermId != null) || (this.userPermId != null && !this.userPermId.equals(other.userPermId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.UserPermissions[ userPermId=" + userPermId + " ]";
    }
    
}
