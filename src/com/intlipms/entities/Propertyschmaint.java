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
import javax.persistence.Lob;
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
@Table(name = "Property_sch_maint")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Propertyschmaint.findAll", query = "SELECT p FROM Propertyschmaint p")
    , @NamedQuery(name = "Propertyschmaint.findBySchmaintID", query = "SELECT p FROM Propertyschmaint p WHERE p.schmaintID = :schmaintID")
    , @NamedQuery(name = "Propertyschmaint.findByMaintitem", query = "SELECT p FROM Propertyschmaint p WHERE p.maintitem = :maintitem")
    , @NamedQuery(name = "Propertyschmaint.findByMaintsch", query = "SELECT p FROM Propertyschmaint p WHERE p.maintsch = :maintsch")
    , @NamedQuery(name = "Propertyschmaint.findByDateCreated", query = "SELECT p FROM Propertyschmaint p WHERE p.dateCreated = :dateCreated")
    , @NamedQuery(name = "Propertyschmaint.findByCreatedBy", query = "SELECT p FROM Propertyschmaint p WHERE p.createdBy = :createdBy")
    , @NamedQuery(name = "Propertyschmaint.findByDateUpdated", query = "SELECT p FROM Propertyschmaint p WHERE p.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Propertyschmaint.findByUpdatedBy", query = "SELECT p FROM Propertyschmaint p WHERE p.updatedBy = :updatedBy")
    , @NamedQuery(name = "Propertyschmaint.findByReplicationStatus", query = "SELECT p FROM Propertyschmaint p WHERE p.replicationStatus = :replicationStatus")})
public class Propertyschmaint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Sch_maint_ID")
    private Integer schmaintID;
    @Column(name = "Maint_item")
    private String maintitem;
    @Lob
    @Column(name = "Maint_desc")
    private String maintdesc;
    @Column(name = "Maint_sch")
    private Integer maintsch;
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
    @JoinColumn(name = "Area_id", referencedColumnName = "Area_id")
    @ManyToOne
    private PropertyAreas areaid;

    public Propertyschmaint() {
    }

    public Propertyschmaint(Integer schmaintID) {
        this.schmaintID = schmaintID;
    }

    public Integer getSchmaintID() {
        return schmaintID;
    }

    public void setSchmaintID(Integer schmaintID) {
        this.schmaintID = schmaintID;
    }

    public String getMaintitem() {
        return maintitem;
    }

    public void setMaintitem(String maintitem) {
        this.maintitem = maintitem;
    }

    public String getMaintdesc() {
        return maintdesc;
    }

    public void setMaintdesc(String maintdesc) {
        this.maintdesc = maintdesc;
    }

    public Integer getMaintsch() {
        return maintsch;
    }

    public void setMaintsch(Integer maintsch) {
        this.maintsch = maintsch;
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

    public PropertyAreas getAreaid() {
        return areaid;
    }

    public void setAreaid(PropertyAreas areaid) {
        this.areaid = areaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (schmaintID != null ? schmaintID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propertyschmaint)) {
            return false;
        }
        Propertyschmaint other = (Propertyschmaint) object;
        if ((this.schmaintID == null && other.schmaintID != null) || (this.schmaintID != null && !this.schmaintID.equals(other.schmaintID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Propertyschmaint[ schmaintID=" + schmaintID + " ]";
    }
    
}
