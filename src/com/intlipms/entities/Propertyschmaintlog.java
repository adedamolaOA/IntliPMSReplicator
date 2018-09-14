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
@Table(name = "Property_sch_maint_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propertyschmaintlog.findAll", query = "SELECT p FROM Propertyschmaintlog p")
    , @NamedQuery(name = "Propertyschmaintlog.findBySchmaintID", query = "SELECT p FROM Propertyschmaintlog p WHERE p.schmaintID = :schmaintID")
    , @NamedQuery(name = "Propertyschmaintlog.findByDatemaint", query = "SELECT p FROM Propertyschmaintlog p WHERE p.datemaint = :datemaint")
    , @NamedQuery(name = "Propertyschmaintlog.findByDatenextmaint", query = "SELECT p FROM Propertyschmaintlog p WHERE p.datenextmaint = :datenextmaint")
    , @NamedQuery(name = "Propertyschmaintlog.findByDateCreated", query = "SELECT p FROM Propertyschmaintlog p WHERE p.dateCreated = :dateCreated")
    , @NamedQuery(name = "Propertyschmaintlog.findByCreatedBy", query = "SELECT p FROM Propertyschmaintlog p WHERE p.createdBy = :createdBy")
    , @NamedQuery(name = "Propertyschmaintlog.findByDateUpdated", query = "SELECT p FROM Propertyschmaintlog p WHERE p.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Propertyschmaintlog.findByUpdatedBy", query = "SELECT p FROM Propertyschmaintlog p WHERE p.updatedBy = :updatedBy")
    , @NamedQuery(name = "Propertyschmaintlog.findByReplicationStatus", query = "SELECT p FROM Propertyschmaintlog p WHERE p.replicationStatus = :replicationStatus")})
public class Propertyschmaintlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Sch_maint_ID")
    private Integer schmaintID;
    @Column(name = "Date_maint")
    private String datemaint;
    @Column(name = "Date_next_maint")
    private String datenextmaint;
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
    @JoinColumn(name = "Maint_by", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster maintby;
    @JoinColumn(name = "Verified_by", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster verifiedby;

    public Propertyschmaintlog() {
    }

    public Propertyschmaintlog(Integer schmaintID) {
        this.schmaintID = schmaintID;
    }

    public Integer getSchmaintID() {
        return schmaintID;
    }

    public void setSchmaintID(Integer schmaintID) {
        this.schmaintID = schmaintID;
    }

    public String getDatemaint() {
        return datemaint;
    }

    public void setDatemaint(String datemaint) {
        this.datemaint = datemaint;
    }

    public String getDatenextmaint() {
        return datenextmaint;
    }

    public void setDatenextmaint(String datenextmaint) {
        this.datenextmaint = datenextmaint;
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

    public Employeemaster getMaintby() {
        return maintby;
    }

    public void setMaintby(Employeemaster maintby) {
        this.maintby = maintby;
    }

    public Employeemaster getVerifiedby() {
        return verifiedby;
    }

    public void setVerifiedby(Employeemaster verifiedby) {
        this.verifiedby = verifiedby;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schmaintID != null ? schmaintID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propertyschmaintlog)) {
            return false;
        }
        Propertyschmaintlog other = (Propertyschmaintlog) object;
        if ((this.schmaintID == null && other.schmaintID != null) || (this.schmaintID != null && !this.schmaintID.equals(other.schmaintID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Propertyschmaintlog[ schmaintID=" + schmaintID + " ]";
    }
    
}
