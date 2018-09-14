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
@Table(name = "Lundry_category")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lundrycategory.findAll", query = "SELECT l FROM Lundrycategory l")
    , @NamedQuery(name = "Lundrycategory.findById", query = "SELECT l FROM Lundrycategory l WHERE l.id = :id")
    , @NamedQuery(name = "Lundrycategory.findByLundryCategoryName", query = "SELECT l FROM Lundrycategory l WHERE l.lundryCategoryName = :lundryCategoryName")
    , @NamedQuery(name = "Lundrycategory.findByDateCreated", query = "SELECT l FROM Lundrycategory l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "Lundrycategory.findByCreatedBy", query = "SELECT l FROM Lundrycategory l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "Lundrycategory.findByDateUpdated", query = "SELECT l FROM Lundrycategory l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Lundrycategory.findByUpdatedBy", query = "SELECT l FROM Lundrycategory l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "Lundrycategory.findByReplicationStatus", query = "SELECT l FROM Lundrycategory l WHERE l.replicationStatus = :replicationStatus")})
public class Lundrycategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "lundry_category_name")
    private String lundryCategoryName;
    @Lob
    @Column(name = "description")
    private String description;
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

    public Lundrycategory() {
    }

    public Lundrycategory(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLundryCategoryName() {
        return lundryCategoryName;
    }

    public void setLundryCategoryName(String lundryCategoryName) {
        this.lundryCategoryName = lundryCategoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (!(object instanceof Lundrycategory)) {
            return false;
        }
        Lundrycategory other = (Lundrycategory) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Lundrycategory[ id=" + id + " ]";
    }
    
}
