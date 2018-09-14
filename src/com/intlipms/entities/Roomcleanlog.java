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
@Table(name = "Room_clean_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roomcleanlog.findAll", query = "SELECT r FROM Roomcleanlog r")
    , @NamedQuery(name = "Roomcleanlog.findByCleanGroupId", query = "SELECT r FROM Roomcleanlog r WHERE r.cleanGroupId = :cleanGroupId")
    , @NamedQuery(name = "Roomcleanlog.findByNumofRooms", query = "SELECT r FROM Roomcleanlog r WHERE r.numofRooms = :numofRooms")
    , @NamedQuery(name = "Roomcleanlog.findByCleandate", query = "SELECT r FROM Roomcleanlog r WHERE r.cleandate = :cleandate")
    , @NamedQuery(name = "Roomcleanlog.findByDateCreated", query = "SELECT r FROM Roomcleanlog r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Roomcleanlog.findByCreatedBy", query = "SELECT r FROM Roomcleanlog r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Roomcleanlog.findByDateUpdated", query = "SELECT r FROM Roomcleanlog r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Roomcleanlog.findByUpdatedBy", query = "SELECT r FROM Roomcleanlog r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Roomcleanlog.findByReplicationStatus", query = "SELECT r FROM Roomcleanlog r WHERE r.replicationStatus = :replicationStatus")})
public class Roomcleanlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "clean_group_id")
    private Integer cleanGroupId;
    @Column(name = "Num_of_Rooms")
    private Integer numofRooms;
    @Column(name = "Clean_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cleandate;
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
    @Temporal(TemporalType.TIMESTAMP)
    private Date replicationStatus;
    @JoinColumn(name = "FD_supervisor", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster fDsupervisor;
    @OneToMany(mappedBy = "cleanGroupId")
    private Collection<Roomcleandtlslog> roomcleandtlslogCollection;

    public Roomcleanlog() {
    }

    public Roomcleanlog(Integer cleanGroupId) {
        this.cleanGroupId = cleanGroupId;
    }

    public Integer getCleanGroupId() {
        return cleanGroupId;
    }

    public void setCleanGroupId(Integer cleanGroupId) {
        this.cleanGroupId = cleanGroupId;
    }

    public Integer getNumofRooms() {
        return numofRooms;
    }

    public void setNumofRooms(Integer numofRooms) {
        this.numofRooms = numofRooms;
    }

    public Date getCleandate() {
        return cleandate;
    }

    public void setCleandate(Date cleandate) {
        this.cleandate = cleandate;
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

    public Date getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(Date replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public Employeemaster getFDsupervisor() {
        return fDsupervisor;
    }

    public void setFDsupervisor(Employeemaster fDsupervisor) {
        this.fDsupervisor = fDsupervisor;
    }

    @XmlTransient
    public Collection<Roomcleandtlslog> getRoomcleandtlslogCollection() {
        return roomcleandtlslogCollection;
    }

    public void setRoomcleandtlslogCollection(Collection<Roomcleandtlslog> roomcleandtlslogCollection) {
        this.roomcleandtlslogCollection = roomcleandtlslogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cleanGroupId != null ? cleanGroupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomcleanlog)) {
            return false;
        }
        Roomcleanlog other = (Roomcleanlog) object;
        if ((this.cleanGroupId == null && other.cleanGroupId != null) || (this.cleanGroupId != null && !this.cleanGroupId.equals(other.cleanGroupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Roomcleanlog[ cleanGroupId=" + cleanGroupId + " ]";
    }
    
}
