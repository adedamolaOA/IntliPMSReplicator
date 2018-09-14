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
@Table(name = "Room_status")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roomstatus.findAll", query = "SELECT r FROM Roomstatus r")
    , @NamedQuery(name = "Roomstatus.findByStatusId", query = "SELECT r FROM Roomstatus r WHERE r.statusId = :statusId")
    , @NamedQuery(name = "Roomstatus.findByStatustypeid", query = "SELECT r FROM Roomstatus r WHERE r.statustypeid = :statustypeid")
    , @NamedQuery(name = "Roomstatus.findByDateCreated", query = "SELECT r FROM Roomstatus r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Roomstatus.findByCreatedBy", query = "SELECT r FROM Roomstatus r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Roomstatus.findByDateUpdated", query = "SELECT r FROM Roomstatus r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Roomstatus.findByUpdatedBy", query = "SELECT r FROM Roomstatus r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Roomstatus.findByReplicationStatus", query = "SELECT r FROM Roomstatus r WHERE r.replicationStatus = :replicationStatus")})
public class Roomstatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "Status_type_id")
    private Integer statustypeid;
    @Lob
    @Column(name = "Status_desc")
    private String statusdesc;
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

    public Roomstatus() {
    }

    public Roomstatus(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getStatustypeid() {
        return statustypeid;
    }

    public void setStatustypeid(Integer statustypeid) {
        this.statustypeid = statustypeid;
    }

    public String getStatusdesc() {
        return statusdesc;
    }

    public void setStatusdesc(String statusdesc) {
        this.statusdesc = statusdesc;
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
        hash += (statusId != null ? statusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomstatus)) {
            return false;
        }
        Roomstatus other = (Roomstatus) object;
        if ((this.statusId == null && other.statusId != null) || (this.statusId != null && !this.statusId.equals(other.statusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Roomstatus[ statusId=" + statusId + " ]";
    }
    
}
