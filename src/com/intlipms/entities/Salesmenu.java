/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.intlipms.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "Sales_menu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesmenu.findAll", query = "SELECT s FROM Salesmenu s")
    , @NamedQuery(name = "Salesmenu.findByMenuId", query = "SELECT s FROM Salesmenu s WHERE s.menuId = :menuId")
    , @NamedQuery(name = "Salesmenu.findByHotelid", query = "SELECT s FROM Salesmenu s WHERE s.hotelid = :hotelid")
    , @NamedQuery(name = "Salesmenu.findByDepartid", query = "SELECT s FROM Salesmenu s WHERE s.departid = :departid")
    , @NamedQuery(name = "Salesmenu.findByEffectivedate", query = "SELECT s FROM Salesmenu s WHERE s.effectivedate = :effectivedate")
    , @NamedQuery(name = "Salesmenu.findByDateCreated", query = "SELECT s FROM Salesmenu s WHERE s.dateCreated = :dateCreated")
    , @NamedQuery(name = "Salesmenu.findByCreatedBy", query = "SELECT s FROM Salesmenu s WHERE s.createdBy = :createdBy")
    , @NamedQuery(name = "Salesmenu.findByDateUpdated", query = "SELECT s FROM Salesmenu s WHERE s.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Salesmenu.findByUpdatedBy", query = "SELECT s FROM Salesmenu s WHERE s.updatedBy = :updatedBy")
    , @NamedQuery(name = "Salesmenu.findByReplicationStatus", query = "SELECT s FROM Salesmenu s WHERE s.replicationStatus = :replicationStatus")})
public class Salesmenu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Menu_Id")
    private Integer menuId;
    @Column(name = "Hotel_id")
    private String hotelid;
    @Column(name = "Depart_id")
    private String departid;
    @Column(name = "Effective_date")
    private String effectivedate;
    @Column(name = "date_created")
    private String dateCreated;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "date_updated")
    private String dateUpdated;
    @Column(name = "updated_by")
    private String updatedBy;
    @Column(name = "replication_status")
    private String replicationStatus;

    public Salesmenu() {
    }

    public Salesmenu(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public String getDepartid() {
        return departid;
    }

    public void setDepartid(String departid) {
        this.departid = departid;
    }

    public String getEffectivedate() {
        return effectivedate;
    }

    public void setEffectivedate(String effectivedate) {
        this.effectivedate = effectivedate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(String dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(String replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (menuId != null ? menuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salesmenu)) {
            return false;
        }
        Salesmenu other = (Salesmenu) object;
        if ((this.menuId == null && other.menuId != null) || (this.menuId != null && !this.menuId.equals(other.menuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Salesmenu[ menuId=" + menuId + " ]";
    }

}
