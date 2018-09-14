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
import javax.persistence.Lob;
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
@Table(name = "Lundary_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LundaryType.findAll", query = "SELECT l FROM LundaryType l")
    , @NamedQuery(name = "LundaryType.findByLundrytypeid", query = "SELECT l FROM LundaryType l WHERE l.lundrytypeid = :lundrytypeid")
    , @NamedQuery(name = "LundaryType.findByLaundrycatid", query = "SELECT l FROM LundaryType l WHERE l.laundrycatid = :laundrycatid")
    , @NamedQuery(name = "LundaryType.findByRateperitem", query = "SELECT l FROM LundaryType l WHERE l.rateperitem = :rateperitem")
    , @NamedQuery(name = "LundaryType.findByExpressrate", query = "SELECT l FROM LundaryType l WHERE l.expressrate = :expressrate")
    , @NamedQuery(name = "LundaryType.findByDateCreated", query = "SELECT l FROM LundaryType l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "LundaryType.findByCreatedBy", query = "SELECT l FROM LundaryType l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "LundaryType.findByDateUpdated", query = "SELECT l FROM LundaryType l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "LundaryType.findByUpdatedBy", query = "SELECT l FROM LundaryType l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "LundaryType.findByReplicationStatus", query = "SELECT l FROM LundaryType l WHERE l.replicationStatus = :replicationStatus")})
public class LundaryType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Lundry_type_id")
    private Integer lundrytypeid;
    @Column(name = "Laundry_cat_id")
    private String laundrycatid;
    @Lob
    @Column(name = "Lundry_type_desc")
    private String lundrytypedesc;
    @Column(name = "Rate_per_item")
    private Integer rateperitem;
    @Lob
    @Column(name = "expected_wait")
    private byte[] expectedWait;
    @Column(name = "Express_rate")
    private Integer expressrate;
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
    @OneToMany(mappedBy = "laundrytypeid")
    private Collection<LundaryInboundlog> lundaryInboundlogCollection;

    public LundaryType() {
    }

    public LundaryType(Integer lundrytypeid) {
        this.lundrytypeid = lundrytypeid;
    }

    public Integer getLundrytypeid() {
        return lundrytypeid;
    }

    public void setLundrytypeid(Integer lundrytypeid) {
        this.lundrytypeid = lundrytypeid;
    }

    public String getLaundrycatid() {
        return laundrycatid;
    }

    public void setLaundrycatid(String laundrycatid) {
        this.laundrycatid = laundrycatid;
    }

    public String getLundrytypedesc() {
        return lundrytypedesc;
    }

    public void setLundrytypedesc(String lundrytypedesc) {
        this.lundrytypedesc = lundrytypedesc;
    }

    public Integer getRateperitem() {
        return rateperitem;
    }

    public void setRateperitem(Integer rateperitem) {
        this.rateperitem = rateperitem;
    }

    public byte[] getExpectedWait() {
        return expectedWait;
    }

    public void setExpectedWait(byte[] expectedWait) {
        this.expectedWait = expectedWait;
    }

    public Integer getExpressrate() {
        return expressrate;
    }

    public void setExpressrate(Integer expressrate) {
        this.expressrate = expressrate;
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

    @XmlTransient
    public Collection<LundaryInboundlog> getLundaryInboundlogCollection() {
        return lundaryInboundlogCollection;
    }

    public void setLundaryInboundlogCollection(Collection<LundaryInboundlog> lundaryInboundlogCollection) {
        this.lundaryInboundlogCollection = lundaryInboundlogCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lundrytypeid != null ? lundrytypeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LundaryType)) {
            return false;
        }
        LundaryType other = (LundaryType) object;
        if ((this.lundrytypeid == null && other.lundrytypeid != null) || (this.lundrytypeid != null && !this.lundrytypeid.equals(other.lundrytypeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.LundaryType[ lundrytypeid=" + lundrytypeid + " ]";
    }
    
}
