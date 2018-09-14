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
@Table(name = "Room_inspection_log")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roominspectionlog.findAll", query = "SELECT r FROM Roominspectionlog r")
    , @NamedQuery(name = "Roominspectionlog.findByInspId", query = "SELECT r FROM Roominspectionlog r WHERE r.inspId = :inspId")
    , @NamedQuery(name = "Roominspectionlog.findByInspTypeId", query = "SELECT r FROM Roominspectionlog r WHERE r.inspTypeId = :inspTypeId")
    , @NamedQuery(name = "Roominspectionlog.findByInspDate", query = "SELECT r FROM Roominspectionlog r WHERE r.inspDate = :inspDate")
    , @NamedQuery(name = "Roominspectionlog.findByInspTime", query = "SELECT r FROM Roominspectionlog r WHERE r.inspTime = :inspTime")
    , @NamedQuery(name = "Roominspectionlog.findByInspSupervisor", query = "SELECT r FROM Roominspectionlog r WHERE r.inspSupervisor = :inspSupervisor")
    , @NamedQuery(name = "Roominspectionlog.findByInspRoomStatus", query = "SELECT r FROM Roominspectionlog r WHERE r.inspRoomStatus = :inspRoomStatus")
    , @NamedQuery(name = "Roominspectionlog.findByInspisBedsheet", query = "SELECT r FROM Roominspectionlog r WHERE r.inspisBedsheet = :inspisBedsheet")
    , @NamedQuery(name = "Roominspectionlog.findByInspisTowel", query = "SELECT r FROM Roominspectionlog r WHERE r.inspisTowel = :inspisTowel")
    , @NamedQuery(name = "Roominspectionlog.findByInspisTissue", query = "SELECT r FROM Roominspectionlog r WHERE r.inspisTissue = :inspisTissue")
    , @NamedQuery(name = "Roominspectionlog.findByInspisWater", query = "SELECT r FROM Roominspectionlog r WHERE r.inspisWater = :inspisWater")
    , @NamedQuery(name = "Roominspectionlog.findByInspisCup", query = "SELECT r FROM Roominspectionlog r WHERE r.inspisCup = :inspisCup")
    , @NamedQuery(name = "Roominspectionlog.findByInspBathroom", query = "SELECT r FROM Roominspectionlog r WHERE r.inspBathroom = :inspBathroom")
    , @NamedQuery(name = "Roominspectionlog.findByInspisTV", query = "SELECT r FROM Roominspectionlog r WHERE r.inspisTV = :inspisTV")
    , @NamedQuery(name = "Roominspectionlog.findByInspRating", query = "SELECT r FROM Roominspectionlog r WHERE r.inspRating = :inspRating")
    , @NamedQuery(name = "Roominspectionlog.findByUpdateRoomStatus", query = "SELECT r FROM Roominspectionlog r WHERE r.updateRoomStatus = :updateRoomStatus")
    , @NamedQuery(name = "Roominspectionlog.findByDateCreated", query = "SELECT r FROM Roominspectionlog r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Roominspectionlog.findByCreatedBy", query = "SELECT r FROM Roominspectionlog r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Roominspectionlog.findByDateUpdated", query = "SELECT r FROM Roominspectionlog r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Roominspectionlog.findByUpdatedBy", query = "SELECT r FROM Roominspectionlog r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Roominspectionlog.findByReplicationStatus", query = "SELECT r FROM Roominspectionlog r WHERE r.replicationStatus = :replicationStatus")
    , @NamedQuery(name = "Roominspectionlog.findByRoom", query = "SELECT r FROM Roominspectionlog r WHERE r.room = :room")})
public class Roominspectionlog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "insp_id")
    private Integer inspId;
    @Column(name = "insp_type_id")
    private Integer inspTypeId;
    @Column(name = "insp_date")
    private String inspDate;
    @Column(name = "insp_time")
    private String inspTime;
    @Column(name = "insp_supervisor")
    private String inspSupervisor;
    @Column(name = "insp_room_status")
    private Integer inspRoomStatus;
    @Column(name = "insp_isBedsheet")
    private Boolean inspisBedsheet;
    @Column(name = "insp_isTowel")
    private Boolean inspisTowel;
    @Column(name = "insp_isTissue")
    private Boolean inspisTissue;
    @Column(name = "insp_isWater")
    private Boolean inspisWater;
    @Column(name = "insp_isCup")
    private Boolean inspisCup;
    @Column(name = "insp_bathroom")
    private Boolean inspBathroom;
    @Column(name = "insp_isTV")
    private Boolean inspisTV;
    @Column(name = "insp_rating")
    private Integer inspRating;
    @Column(name = "update_room_status")
    private Integer updateRoomStatus;
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
    @Column(name = "Room")
    private String room;

    public Roominspectionlog() {
    }

    public Roominspectionlog(Integer inspId) {
        this.inspId = inspId;
    }

    public Integer getInspId() {
        return inspId;
    }

    public void setInspId(Integer inspId) {
        this.inspId = inspId;
    }

    public Integer getInspTypeId() {
        return inspTypeId;
    }

    public void setInspTypeId(Integer inspTypeId) {
        this.inspTypeId = inspTypeId;
    }

    public String getInspDate() {
        return inspDate;
    }

    public void setInspDate(String inspDate) {
        this.inspDate = inspDate;
    }

    public String getInspTime() {
        return inspTime;
    }

    public void setInspTime(String inspTime) {
        this.inspTime = inspTime;
    }

    public String getInspSupervisor() {
        return inspSupervisor;
    }

    public void setInspSupervisor(String inspSupervisor) {
        this.inspSupervisor = inspSupervisor;
    }

    public Integer getInspRoomStatus() {
        return inspRoomStatus;
    }

    public void setInspRoomStatus(Integer inspRoomStatus) {
        this.inspRoomStatus = inspRoomStatus;
    }

    public Boolean getInspisBedsheet() {
        return inspisBedsheet;
    }

    public void setInspisBedsheet(Boolean inspisBedsheet) {
        this.inspisBedsheet = inspisBedsheet;
    }

    public Boolean getInspisTowel() {
        return inspisTowel;
    }

    public void setInspisTowel(Boolean inspisTowel) {
        this.inspisTowel = inspisTowel;
    }

    public Boolean getInspisTissue() {
        return inspisTissue;
    }

    public void setInspisTissue(Boolean inspisTissue) {
        this.inspisTissue = inspisTissue;
    }

    public Boolean getInspisWater() {
        return inspisWater;
    }

    public void setInspisWater(Boolean inspisWater) {
        this.inspisWater = inspisWater;
    }

    public Boolean getInspisCup() {
        return inspisCup;
    }

    public void setInspisCup(Boolean inspisCup) {
        this.inspisCup = inspisCup;
    }

    public Boolean getInspBathroom() {
        return inspBathroom;
    }

    public void setInspBathroom(Boolean inspBathroom) {
        this.inspBathroom = inspBathroom;
    }

    public Boolean getInspisTV() {
        return inspisTV;
    }

    public void setInspisTV(Boolean inspisTV) {
        this.inspisTV = inspisTV;
    }

    public Integer getInspRating() {
        return inspRating;
    }

    public void setInspRating(Integer inspRating) {
        this.inspRating = inspRating;
    }

    public Integer getUpdateRoomStatus() {
        return updateRoomStatus;
    }

    public void setUpdateRoomStatus(Integer updateRoomStatus) {
        this.updateRoomStatus = updateRoomStatus;
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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inspId != null ? inspId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roominspectionlog)) {
            return false;
        }
        Roominspectionlog other = (Roominspectionlog) object;
        if ((this.inspId == null && other.inspId != null) || (this.inspId != null && !this.inspId.equals(other.inspId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Roominspectionlog[ inspId=" + inspId + " ]";
    }
    
}
