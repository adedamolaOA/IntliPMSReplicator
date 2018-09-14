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
@Table(name = "Room_inspection_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roominspectiontype.findAll", query = "SELECT r FROM Roominspectiontype r")
    , @NamedQuery(name = "Roominspectiontype.findByRoominsptype", query = "SELECT r FROM Roominspectiontype r WHERE r.roominsptype = :roominsptype")
    , @NamedQuery(name = "Roominspectiontype.findByInspname", query = "SELECT r FROM Roominspectiontype r WHERE r.inspname = :inspname")
    , @NamedQuery(name = "Roominspectiontype.findByInspDesc", query = "SELECT r FROM Roominspectiontype r WHERE r.inspDesc = :inspDesc")
    , @NamedQuery(name = "Roominspectiontype.findByHotelid", query = "SELECT r FROM Roominspectiontype r WHERE r.hotelid = :hotelid")
    , @NamedQuery(name = "Roominspectiontype.findByDateCreated", query = "SELECT r FROM Roominspectiontype r WHERE r.dateCreated = :dateCreated")
    , @NamedQuery(name = "Roominspectiontype.findByCreatedBy", query = "SELECT r FROM Roominspectiontype r WHERE r.createdBy = :createdBy")
    , @NamedQuery(name = "Roominspectiontype.findByDateUpdated", query = "SELECT r FROM Roominspectiontype r WHERE r.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Roominspectiontype.findByUpdatedBy", query = "SELECT r FROM Roominspectiontype r WHERE r.updatedBy = :updatedBy")
    , @NamedQuery(name = "Roominspectiontype.findByReplicationStatus", query = "SELECT r FROM Roominspectiontype r WHERE r.replicationStatus = :replicationStatus")})
public class Roominspectiontype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Room_insp_type")
    private Integer roominsptype;
    @Column(name = "Insp_name")
    private String inspname;
    @Column(name = "insp_desc")
    private String inspDesc;
    @Column(name = "Hotel_id")
    private String hotelid;
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

    public Roominspectiontype() {
    }

    public Roominspectiontype(Integer roominsptype) {
        this.roominsptype = roominsptype;
    }

    public Integer getRoominsptype() {
        return roominsptype;
    }

    public void setRoominsptype(Integer roominsptype) {
        this.roominsptype = roominsptype;
    }

    public String getInspname() {
        return inspname;
    }

    public void setInspname(String inspname) {
        this.inspname = inspname;
    }

    public String getInspDesc() {
        return inspDesc;
    }

    public void setInspDesc(String inspDesc) {
        this.inspDesc = inspDesc;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
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
        hash += (roominsptype != null ? roominsptype.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roominspectiontype)) {
            return false;
        }
        Roominspectiontype other = (Roominspectiontype) object;
        if ((this.roominsptype == null && other.roominsptype != null) || (this.roominsptype != null && !this.roominsptype.equals(other.roominsptype))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Roominspectiontype[ roominsptype=" + roominsptype + " ]";
    }
    
}
