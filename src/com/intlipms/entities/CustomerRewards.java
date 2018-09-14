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
@Table(name = "customer_rewards")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerRewards.findAll", query = "SELECT c FROM CustomerRewards c")
    , @NamedQuery(name = "CustomerRewards.findByPid", query = "SELECT c FROM CustomerRewards c WHERE c.pid = :pid")
    , @NamedQuery(name = "CustomerRewards.findByProgramName", query = "SELECT c FROM CustomerRewards c WHERE c.programName = :programName")
    , @NamedQuery(name = "CustomerRewards.findByStartDate", query = "SELECT c FROM CustomerRewards c WHERE c.startDate = :startDate")
    , @NamedQuery(name = "CustomerRewards.findByEndDate", query = "SELECT c FROM CustomerRewards c WHERE c.endDate = :endDate")
    , @NamedQuery(name = "CustomerRewards.findByHotelId", query = "SELECT c FROM CustomerRewards c WHERE c.hotelId = :hotelId")
    , @NamedQuery(name = "CustomerRewards.findByDateCreated", query = "SELECT c FROM CustomerRewards c WHERE c.dateCreated = :dateCreated")
    , @NamedQuery(name = "CustomerRewards.findByCreatedBy", query = "SELECT c FROM CustomerRewards c WHERE c.createdBy = :createdBy")
    , @NamedQuery(name = "CustomerRewards.findByDateUpdated", query = "SELECT c FROM CustomerRewards c WHERE c.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "CustomerRewards.findByUpdatedBy", query = "SELECT c FROM CustomerRewards c WHERE c.updatedBy = :updatedBy")
    , @NamedQuery(name = "CustomerRewards.findByReplicationStatus", query = "SELECT c FROM CustomerRewards c WHERE c.replicationStatus = :replicationStatus")})
public class CustomerRewards implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "pid")
    private Integer pid;
    @Column(name = "program_name")
    private String programName;
    @Lob
    @Column(name = "description")
    private String description;
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "Hotel_Id")
    private String hotelId;
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

    public CustomerRewards() {
    }

    public CustomerRewards(Integer pid) {
        this.pid = pid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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
        hash += (pid != null ? pid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerRewards)) {
            return false;
        }
        CustomerRewards other = (CustomerRewards) object;
        if ((this.pid == null && other.pid != null) || (this.pid != null && !this.pid.equals(other.pid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.CustomerRewards[ pid=" + pid + " ]";
    }
    
}
