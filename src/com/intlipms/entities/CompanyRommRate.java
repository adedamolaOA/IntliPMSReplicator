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
@Table(name = "company_romm_rate")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompanyRommRate.findAll", query = "SELECT c FROM CompanyRommRate c")
    , @NamedQuery(name = "CompanyRommRate.findByRoomrateid", query = "SELECT c FROM CompanyRommRate c WHERE c.roomrateid = :roomrateid")
    , @NamedQuery(name = "CompanyRommRate.findByCompanyid", query = "SELECT c FROM CompanyRommRate c WHERE c.companyid = :companyid")
    , @NamedQuery(name = "CompanyRommRate.findByHotelId", query = "SELECT c FROM CompanyRommRate c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CompanyRommRate.findByRoomtypeid", query = "SELECT c FROM CompanyRommRate c WHERE c.roomtypeid = :roomtypeid")
    , @NamedQuery(name = "CompanyRommRate.findByRoomrate", query = "SELECT c FROM CompanyRommRate c WHERE c.roomrate = :roomrate")
    , @NamedQuery(name = "CompanyRommRate.findByRoomrateguest", query = "SELECT c FROM CompanyRommRate c WHERE c.roomrateguest = :roomrateguest")
    , @NamedQuery(name = "CompanyRommRate.findByApprovedby", query = "SELECT c FROM CompanyRommRate c WHERE c.approvedby = :approvedby")
    , @NamedQuery(name = "CompanyRommRate.findByStartdate", query = "SELECT c FROM CompanyRommRate c WHERE c.startdate = :startdate")
    , @NamedQuery(name = "CompanyRommRate.findByEnddate", query = "SELECT c FROM CompanyRommRate c WHERE c.enddate = :enddate")
    , @NamedQuery(name = "CompanyRommRate.findByDateCreated", query = "SELECT c FROM CompanyRommRate c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CompanyRommRate.findByCreatedBy", query = "SELECT c FROM CompanyRommRate c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CompanyRommRate.findByDateUpdated", query = "SELECT c FROM CompanyRommRate c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CompanyRommRate.findByUpdatedBy", query = "SELECT c FROM CompanyRommRate c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CompanyRommRate.findByReplicationStatus", query = "SELECT c FROM CompanyRommRate c WHERE c.replicationStatus = :replicationStatus")})
public class CompanyRommRate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Room_rate_id")
    private Integer roomrateid;
    @Column(name = "Company_id")
    private String companyid;
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Column(name = "Room_type_id")
    private String roomtypeid;
    @Column(name = "Room_rate")
    private Integer roomrate;
    @Column(name = "Room_rate_guest")
    private Integer roomrateguest;
    @Column(name = "Approved_by")
    private String approvedby;
    @Column(name = "Start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "End_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
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

    public CompanyRommRate() {
    }

    public CompanyRommRate(Integer roomrateid) {
        this.roomrateid = roomrateid;
    }

    public Integer getRoomrateid() {
        return roomrateid;
    }

    public void setRoomrateid(Integer roomrateid) {
        this.roomrateid = roomrateid;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(String roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    public Integer getRoomrate() {
        return roomrate;
    }

    public void setRoomrate(Integer roomrate) {
        this.roomrate = roomrate;
    }

    public Integer getRoomrateguest() {
        return roomrateguest;
    }

    public void setRoomrateguest(Integer roomrateguest) {
        this.roomrateguest = roomrateguest;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
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
        hash += (roomrateid != null ? roomrateid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompanyRommRate)) {
            return false;
        }
        CompanyRommRate other = (CompanyRommRate) object;
        if ((this.roomrateid == null && other.roomrateid != null) || (this.roomrateid != null && !this.roomrateid.equals(other.roomrateid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CompanyRommRate[ roomrateid=" + roomrateid + " ]";
    }
    
}
