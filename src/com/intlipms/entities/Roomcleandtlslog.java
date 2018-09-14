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
@Table(name = "Room_clean_dtls_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roomcleandtlslog.findAll", query = "SELECT r FROM Roomcleandtlslog r")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanid", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanid = :cleanid")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleantypeid", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleantypeid = :cleantypeid")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleandate", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleandate = :cleandate")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleantime", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleantime = :cleantime")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanroomstatus", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanroomstatus = :cleanroomstatus")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanisBedsheetqyt", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanisBedsheetqyt = :cleanisBedsheetqyt")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanisTowelqty", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanisTowelqty = :cleanisTowelqty")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanisTissueqty", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanisTissueqty = :cleanisTissueqty")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanisWaterqty", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanisWaterqty = :cleanisWaterqty")
    , @NamedQuery(name = "Roomcleandtlslog.findByCleanisCupqty", query = "SELECT r FROM Roomcleandtlslog r WHERE r.cleanisCupqty = :cleanisCupqty")
    , @NamedQuery(name = "Roomcleandtlslog.findByDateCreated", query = "SELECT r FROM Roomcleandtlslog r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Roomcleandtlslog.findByCreatedBy", query = "SELECT r FROM Roomcleandtlslog r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Roomcleandtlslog.findByDateUpdated", query = "SELECT r FROM Roomcleandtlslog r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Roomcleandtlslog.findByUpdatedBy", query = "SELECT r FROM Roomcleandtlslog r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Roomcleandtlslog.findByReplicationStatus", query = "SELECT r FROM Roomcleandtlslog r WHERE r.replicationStatus = :replicationStatus")})
public class Roomcleandtlslog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Clean_id")
    private Integer cleanid;
    @Column(name = "Clean_type_id")
    private Integer cleantypeid;
    @Column(name = "Clean_date")
    private String cleandate;
    @Column(name = "Clean_time")
    private String cleantime;
    @Column(name = "Clean_room_status")
    private Integer cleanroomstatus;
    @Column(name = "Clean_isBedsheet_qyt")
    private Integer cleanisBedsheetqyt;
    @Column(name = "Clean_isTowel_qty")
    private Integer cleanisTowelqty;
    @Column(name = "Clean_isTissue_qty")
    private Integer cleanisTissueqty;
    @Column(name = "Clean_isWater_qty")
    private Integer cleanisWaterqty;
    @Column(name = "Clean_isCup_qty")
    private Integer cleanisCupqty;
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
    @JoinColumn(name = "Clean_supervisor", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster cleansupervisor;
    @JoinColumn(name = "Clean_housekeeper", referencedColumnName = "employee_id")
    @ManyToOne
    private Employeemaster cleanhousekeeper;
    @JoinColumn(name = "clean_group_id", referencedColumnName = "clean_group_id")
    @ManyToOne
    private Roomcleanlog cleanGroupId;
    @JoinColumn(name = "Room_id", referencedColumnName = "Room_id")
    @ManyToOne
    private Rooms roomid;

    public Roomcleandtlslog() {
    }

    public Roomcleandtlslog(Integer cleanid) {
        this.cleanid = cleanid;
    }

    public Integer getCleanid() {
        return cleanid;
    }

    public void setCleanid(Integer cleanid) {
        this.cleanid = cleanid;
    }

    public Integer getCleantypeid() {
        return cleantypeid;
    }

    public void setCleantypeid(Integer cleantypeid) {
        this.cleantypeid = cleantypeid;
    }

    public String getCleandate() {
        return cleandate;
    }

    public void setCleandate(String cleandate) {
        this.cleandate = cleandate;
    }

    public String getCleantime() {
        return cleantime;
    }

    public void setCleantime(String cleantime) {
        this.cleantime = cleantime;
    }

    public Integer getCleanroomstatus() {
        return cleanroomstatus;
    }

    public void setCleanroomstatus(Integer cleanroomstatus) {
        this.cleanroomstatus = cleanroomstatus;
    }

    public Integer getCleanisBedsheetqyt() {
        return cleanisBedsheetqyt;
    }

    public void setCleanisBedsheetqyt(Integer cleanisBedsheetqyt) {
        this.cleanisBedsheetqyt = cleanisBedsheetqyt;
    }

    public Integer getCleanisTowelqty() {
        return cleanisTowelqty;
    }

    public void setCleanisTowelqty(Integer cleanisTowelqty) {
        this.cleanisTowelqty = cleanisTowelqty;
    }

    public Integer getCleanisTissueqty() {
        return cleanisTissueqty;
    }

    public void setCleanisTissueqty(Integer cleanisTissueqty) {
        this.cleanisTissueqty = cleanisTissueqty;
    }

    public Integer getCleanisWaterqty() {
        return cleanisWaterqty;
    }

    public void setCleanisWaterqty(Integer cleanisWaterqty) {
        this.cleanisWaterqty = cleanisWaterqty;
    }

    public Integer getCleanisCupqty() {
        return cleanisCupqty;
    }

    public void setCleanisCupqty(Integer cleanisCupqty) {
        this.cleanisCupqty = cleanisCupqty;
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

    public Employeemaster getCleansupervisor() {
        return cleansupervisor;
    }

    public void setCleansupervisor(Employeemaster cleansupervisor) {
        this.cleansupervisor = cleansupervisor;
    }

    public Employeemaster getCleanhousekeeper() {
        return cleanhousekeeper;
    }

    public void setCleanhousekeeper(Employeemaster cleanhousekeeper) {
        this.cleanhousekeeper = cleanhousekeeper;
    }

    public Roomcleanlog getCleanGroupId() {
        return cleanGroupId;
    }

    public void setCleanGroupId(Roomcleanlog cleanGroupId) {
        this.cleanGroupId = cleanGroupId;
    }

    public Rooms getRoomid() {
        return roomid;
    }

    public void setRoomid(Rooms roomid) {
        this.roomid = roomid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cleanid != null ? cleanid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomcleandtlslog)) {
            return false;
        }
        Roomcleandtlslog other = (Roomcleandtlslog) object;
        if ((this.cleanid == null && other.cleanid != null) || (this.cleanid != null && !this.cleanid.equals(other.cleanid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Roomcleandtlslog[ cleanid=" + cleanid + " ]";
    }
    
}
