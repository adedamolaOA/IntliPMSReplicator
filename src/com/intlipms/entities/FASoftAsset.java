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
@Table(name = "FASoftAsset")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FASoftAsset.findAll", query = "SELECT f FROM FASoftAsset f")
    , @NamedQuery(name = "FASoftAsset.findById", query = "SELECT f FROM FASoftAsset f WHERE f.id = :id")
    , @NamedQuery(name = "FASoftAsset.findByFARoomSoftAsset", query = "SELECT f FROM FASoftAsset f WHERE f.fARoomSoftAsset = :fARoomSoftAsset")
    , @NamedQuery(name = "FASoftAsset.findByExpecteddayslifespan", query = "SELECT f FROM FASoftAsset f WHERE f.expecteddayslifespan = :expecteddayslifespan")
    , @NamedQuery(name = "FASoftAsset.findByRecommededDaysService", query = "SELECT f FROM FASoftAsset f WHERE f.recommededDaysService = :recommededDaysService")
    , @NamedQuery(name = "FASoftAsset.findByHotelId", query = "SELECT f FROM FASoftAsset f WHERE f.hotelId = :hotelId")
    , @NamedQuery(name = "FASoftAsset.findByDateCreated", query = "SELECT f FROM FASoftAsset f WHERE f.dateCreated = :dateCreated")
    , @NamedQuery(name = "FASoftAsset.findByCreatedBy", query = "SELECT f FROM FASoftAsset f WHERE f.createdBy = :createdBy")
    , @NamedQuery(name = "FASoftAsset.findByDateUpdated", query = "SELECT f FROM FASoftAsset f WHERE f.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "FASoftAsset.findByUpdatedBy", query = "SELECT f FROM FASoftAsset f WHERE f.updatedBy = :updatedBy")
    , @NamedQuery(name = "FASoftAsset.findByReplicationStatus", query = "SELECT f FROM FASoftAsset f WHERE f.replicationStatus = :replicationStatus")})
public class FASoftAsset implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "FARoomSoftAsset")
    private String fARoomSoftAsset;
    @Column(name = "Expected_days_lifespan")
    private String expecteddayslifespan;
    @Column(name = "recommeded_days_service")
    private String recommededDaysService;
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

    public FASoftAsset() {
    }

    public FASoftAsset(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFARoomSoftAsset() {
        return fARoomSoftAsset;
    }

    public void setFARoomSoftAsset(String fARoomSoftAsset) {
        this.fARoomSoftAsset = fARoomSoftAsset;
    }

    public String getExpecteddayslifespan() {
        return expecteddayslifespan;
    }

    public void setExpecteddayslifespan(String expecteddayslifespan) {
        this.expecteddayslifespan = expecteddayslifespan;
    }

    public String getRecommededDaysService() {
        return recommededDaysService;
    }

    public void setRecommededDaysService(String recommededDaysService) {
        this.recommededDaysService = recommededDaysService;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FASoftAsset)) {
            return false;
        }
        FASoftAsset other = (FASoftAsset) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.FASoftAsset[ id=" + id + " ]";
    }
    
}
