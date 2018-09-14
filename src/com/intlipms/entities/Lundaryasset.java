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
@Table(name = "Lundary_asset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lundaryasset.findAll", query = "SELECT l FROM Lundaryasset l")
    , @NamedQuery(name = "Lundaryasset.findByAssetid", query = "SELECT l FROM Lundaryasset l WHERE l.assetid = :assetid")
    , @NamedQuery(name = "Lundaryasset.findByExpecteddayslifespan", query = "SELECT l FROM Lundaryasset l WHERE l.expecteddayslifespan = :expecteddayslifespan")
    , @NamedQuery(name = "Lundaryasset.findByRecommendedDaysService", query = "SELECT l FROM Lundaryasset l WHERE l.recommendedDaysService = :recommendedDaysService")
    , @NamedQuery(name = "Lundaryasset.findByDateCreated", query = "SELECT l FROM Lundaryasset l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "Lundaryasset.findByCreatedBy", query = "SELECT l FROM Lundaryasset l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "Lundaryasset.findByDateUpdated", query = "SELECT l FROM Lundaryasset l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Lundaryasset.findByUpdatedBy", query = "SELECT l FROM Lundaryasset l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "Lundaryasset.findByReplicationStatus", query = "SELECT l FROM Lundaryasset l WHERE l.replicationStatus = :replicationStatus")})
public class Lundaryasset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Asset_id")
    private Integer assetid;
    @Lob
    @Column(name = "Asset_desc")
    private String assetdesc;
    @Column(name = "Expected_days_lifespan")
    private String expecteddayslifespan;
    @Column(name = "recommended_days_service")
    private String recommendedDaysService;
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
    @OneToMany(mappedBy = "assetid")
    private Collection<Lundaryassetlist> lundaryassetlistCollection;

    public Lundaryasset() {
    }

    public Lundaryasset(Integer assetid) {
        this.assetid = assetid;
    }

    public Integer getAssetid() {
        return assetid;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public String getAssetdesc() {
        return assetdesc;
    }

    public void setAssetdesc(String assetdesc) {
        this.assetdesc = assetdesc;
    }

    public String getExpecteddayslifespan() {
        return expecteddayslifespan;
    }

    public void setExpecteddayslifespan(String expecteddayslifespan) {
        this.expecteddayslifespan = expecteddayslifespan;
    }

    public String getRecommendedDaysService() {
        return recommendedDaysService;
    }

    public void setRecommendedDaysService(String recommendedDaysService) {
        this.recommendedDaysService = recommendedDaysService;
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
    public Collection<Lundaryassetlist> getLundaryassetlistCollection() {
        return lundaryassetlistCollection;
    }

    public void setLundaryassetlistCollection(Collection<Lundaryassetlist> lundaryassetlistCollection) {
        this.lundaryassetlistCollection = lundaryassetlistCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assetid != null ? assetid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lundaryasset)) {
            return false;
        }
        Lundaryasset other = (Lundaryasset) object;
        if ((this.assetid == null && other.assetid != null) || (this.assetid != null && !this.assetid.equals(other.assetid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Lundaryasset[ assetid=" + assetid + " ]";
    }
    
}
