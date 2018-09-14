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
@Table(name = "Room_Insp_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RoomInsplog.findAll", query = "SELECT r FROM RoomInsplog r")
    , @NamedQuery(name = "RoomInsplog.findByInspgroupid", query = "SELECT r FROM RoomInsplog r WHERE r.inspgroupid = :inspgroupid")
    , @NamedQuery(name = "RoomInsplog.findByNumofRooms", query = "SELECT r FROM RoomInsplog r WHERE r.numofRooms = :numofRooms")
    , @NamedQuery(name = "RoomInsplog.findByInspdate", query = "SELECT r FROM RoomInsplog r WHERE r.inspdate = :inspdate")
    , @NamedQuery(name = "RoomInsplog.findByInsstatus", query = "SELECT r FROM RoomInsplog r WHERE r.insstatus = :insstatus")
    , @NamedQuery(name = "RoomInsplog.findByDateCreated", query = "SELECT r FROM RoomInsplog r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "RoomInsplog.findByCreatedBy", query = "SELECT r FROM RoomInsplog r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "RoomInsplog.findByDateUpdated", query = "SELECT r FROM RoomInsplog r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "RoomInsplog.findByUpdatedBy", query = "SELECT r FROM RoomInsplog r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "RoomInsplog.findByReplicationStatus", query = "SELECT r FROM RoomInsplog r WHERE r.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "RoomInsplog.findByInspGroupName", query = "SELECT r FROM RoomInsplog r WHERE r.inspGroupName = :inspGroupName")})
public class RoomInsplog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Insp_group_id")
    private Integer inspgroupid;
    @Column(name = "Num_of_Rooms")
    private Integer numofRooms;
    @Column(name = "Insp_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inspdate;
    @Column(name = "Ins_status")
    private Integer insstatus;
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
    @Column(name = "insp_group_name")
    private String inspGroupName;
    @JoinColumn(name = "Manager_id", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster managerid;
    @JoinColumn(name = "FD_supervisor", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster fDsupervisor;

    public RoomInsplog() {
    }

    public RoomInsplog(Integer inspgroupid) {
        this.inspgroupid = inspgroupid;
    }

    public Integer getInspgroupid() {
        return inspgroupid;
    }

    public void setInspgroupid(Integer inspgroupid) {
        this.inspgroupid = inspgroupid;
    }

    public Integer getNumofRooms() {
        return numofRooms;
    }

    public void setNumofRooms(Integer numofRooms) {
        this.numofRooms = numofRooms;
    }

    public Date getInspdate() {
        return inspdate;
    }

    public void setInspdate(Date inspdate) {
        this.inspdate = inspdate;
    }

    public Integer getInsstatus() {
        return insstatus;
    }

    public void setInsstatus(Integer insstatus) {
        this.insstatus = insstatus;
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

    public String getInspGroupName() {
        return inspGroupName;
    }

    public void setInspGroupName(String inspGroupName) {
        this.inspGroupName = inspGroupName;
    }

    public Employeemaster getManagerid() {
        return managerid;
    }

    public void setManagerid(Employeemaster managerid) {
        this.managerid = managerid;
    }

    public Employeemaster getFDsupervisor() {
        return fDsupervisor;
    }

    public void setFDsupervisor(Employeemaster fDsupervisor) {
        this.fDsupervisor = fDsupervisor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inspgroupid != null ? inspgroupid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RoomInsplog)) {
            return false;
        }
        RoomInsplog other = (RoomInsplog) object;
        if ((this.inspgroupid == null && other.inspgroupid != null) || (this.inspgroupid != null && !this.inspgroupid.equals(other.inspgroupid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.RoomInsplog[ inspgroupid=" + inspgroupid + " ]";
    }
    
}
