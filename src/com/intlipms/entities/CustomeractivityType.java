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
@Table(name = "Customer_activity_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomeractivityType.findAll", query = "SELECT c FROM CustomeractivityType c")
    , @NamedQuery(name = "CustomeractivityType.findByActivityTypeid", query = "SELECT c FROM CustomeractivityType c WHERE c.activityTypeid = :activityTypeid")
    , @NamedQuery(name = "CustomeractivityType.findByDateCreated", query = "SELECT c FROM CustomeractivityType c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CustomeractivityType.findByCreatedBy", query = "SELECT c FROM CustomeractivityType c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CustomeractivityType.findByDateUpdated", query = "SELECT c FROM CustomeractivityType c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CustomeractivityType.findByUpdatedBy", query = "SELECT c FROM CustomeractivityType c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CustomeractivityType.findByReplicationStatus", query = "SELECT c FROM CustomeractivityType c WHERE c.replicationStatus = :replicationStatus")})
public class CustomeractivityType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Activity_Type_id")
    private Integer activityTypeid;
    @Lob
    @Column(name = "Activity_type_Desc")
    private String activitytypeDesc;
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

    public CustomeractivityType() {
    }

    public CustomeractivityType(Integer activityTypeid) {
        this.activityTypeid = activityTypeid;
    }

    public Integer getActivityTypeid() {
        return activityTypeid;
    }

    public void setActivityTypeid(Integer activityTypeid) {
        this.activityTypeid = activityTypeid;
    }

    public String getActivitytypeDesc() {
        return activitytypeDesc;
    }

    public void setActivitytypeDesc(String activitytypeDesc) {
        this.activitytypeDesc = activitytypeDesc;
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
        hash += (activityTypeid != null ? activityTypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomeractivityType)) {
            return false;
        }
        CustomeractivityType other = (CustomeractivityType) object;
        if ((this.activityTypeid == null && other.activityTypeid != null) || (this.activityTypeid != null && !this.activityTypeid.equals(other.activityTypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CustomeractivityType[ activityTypeid=" + activityTypeid + " ]";
    }
    
}
