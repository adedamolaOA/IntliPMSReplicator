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
@Table(name = "user_access")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserAccess.findAll", query = "SELECT u FROM UserAccess u")
    , @NamedQuery(name = "UserAccess.findByAccessId", query = "SELECT u FROM UserAccess u WHERE u.accessId = :accessId")
    , @NamedQuery(name = "UserAccess.findByUserId", query = "SELECT u FROM UserAccess u WHERE u.userId = :userId")
    , @NamedQuery(name = "UserAccess.findByModuleId", query = "SELECT u FROM UserAccess u WHERE u.moduleId = :moduleId")
    , @NamedQuery(name = "UserAccess.findByFormId", query = "SELECT u FROM UserAccess u WHERE u.formId = :formId")
    , @NamedQuery(name = "UserAccess.findByV", query = "SELECT u FROM UserAccess u WHERE u.v = :v")
    , @NamedQuery(name = "UserAccess.findByA", query = "SELECT u FROM UserAccess u WHERE u.a = :a")
    , @NamedQuery(name = "UserAccess.findByU", query = "SELECT u FROM UserAccess u WHERE u.u = :u")
    , @NamedQuery(name = "UserAccess.findByD", query = "SELECT u FROM UserAccess u WHERE u.d = :d")
    , @NamedQuery(name = "UserAccess.findByDateCreated", query = "SELECT u FROM UserAccess u WHERE u.dateCreated = :dateCreated")
    , @NamedQuery(name = "UserAccess.findByCreatedBy", query = "SELECT u FROM UserAccess u WHERE u.createdBy = :createdBy")
    , @NamedQuery(name = "UserAccess.findByDateUpdated", query = "SELECT u FROM UserAccess u WHERE u.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "UserAccess.findByUpdatedBy", query = "SELECT u FROM UserAccess u WHERE u.updatedBy = :updatedBy")
    , @NamedQuery(name = "UserAccess.findByReplicationStatus", query = "SELECT u FROM UserAccess u WHERE u.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "UserAccess.findByHotelId", query = "SELECT u FROM UserAccess u WHERE u.hotelId = :hotelId")})
public class UserAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "access_id")
    private Integer accessId;
    @Column(name = "user_id")
    private Integer userId;
    @Column(name = "module_id")
    private Integer moduleId;
    @Column(name = "form_id")
    private Integer formId;
    @Column(name = "v")
    private Boolean v;
    @Column(name = "a")
    private Boolean a;
    @Column(name = "u")
    private Boolean u;
    @Column(name = "d")
    private Boolean d;
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
    @Column(name = "hotel_id")
    private String hotelId;

    public UserAccess() {
    }

    public UserAccess(Integer accessId) {
        this.accessId = accessId;
    }

    public Integer getAccessId() {
        return accessId;
    }

    public void setAccessId(Integer accessId) {
        this.accessId = accessId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getFormId() {
        return formId;
    }

    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    public Boolean getV() {
        return v;
    }

    public void setV(Boolean v) {
        this.v = v;
    }

    public Boolean getA() {
        return a;
    }

    public void setA(Boolean a) {
        this.a = a;
    }

    public Boolean getU() {
        return u;
    }

    public void setU(Boolean u) {
        this.u = u;
    }

    public Boolean getD() {
        return d;
    }

    public void setD(Boolean d) {
        this.d = d;
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

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accessId != null ? accessId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserAccess)) {
            return false;
        }
        UserAccess other = (UserAccess) object;
        if ((this.accessId == null && other.accessId != null) || (this.accessId != null && !this.accessId.equals(other.accessId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.UserAccess[ accessId=" + accessId + " ]";
    }
    
}
