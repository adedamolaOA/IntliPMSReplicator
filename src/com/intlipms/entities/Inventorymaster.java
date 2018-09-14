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
@Table(name = "Inventory_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventorymaster.findAll", query = "SELECT i FROM Inventorymaster i")
    , @NamedQuery(name = "Inventorymaster.findByInventZoneId", query = "SELECT i FROM Inventorymaster i WHERE i.inventZoneId = :inventZoneId")
    , @NamedQuery(name = "Inventorymaster.findByInventCatId", query = "SELECT i FROM Inventorymaster i WHERE i.inventCatId = :inventCatId")
    , @NamedQuery(name = "Inventorymaster.findByInventItemId", query = "SELECT i FROM Inventorymaster i WHERE i.inventItemId = :inventItemId")
    , @NamedQuery(name = "Inventorymaster.findByInventItemName", query = "SELECT i FROM Inventorymaster i WHERE i.inventItemName = :inventItemName")
    , @NamedQuery(name = "Inventorymaster.findByInventitemdes", query = "SELECT i FROM Inventorymaster i WHERE i.inventitemdes = :inventitemdes")
    , @NamedQuery(name = "Inventorymaster.findByInventpurchaseunit", query = "SELECT i FROM Inventorymaster i WHERE i.inventpurchaseunit = :inventpurchaseunit")
    , @NamedQuery(name = "Inventorymaster.findByInventpurchaseqty", query = "SELECT i FROM Inventorymaster i WHERE i.inventpurchaseqty = :inventpurchaseqty")
    , @NamedQuery(name = "Inventorymaster.findByInventpurchaseprice", query = "SELECT i FROM Inventorymaster i WHERE i.inventpurchaseprice = :inventpurchaseprice")
    , @NamedQuery(name = "Inventorymaster.findByInventpurchasemin", query = "SELECT i FROM Inventorymaster i WHERE i.inventpurchasemin = :inventpurchasemin")
    , @NamedQuery(name = "Inventorymaster.findByInventpurchasemax", query = "SELECT i FROM Inventorymaster i WHERE i.inventpurchasemax = :inventpurchasemax")
    , @NamedQuery(name = "Inventorymaster.findByInventpurchasereorder", query = "SELECT i FROM Inventorymaster i WHERE i.inventpurchasereorder = :inventpurchasereorder")
    , @NamedQuery(name = "Inventorymaster.findByInventretailunit", query = "SELECT i FROM Inventorymaster i WHERE i.inventretailunit = :inventretailunit")
    , @NamedQuery(name = "Inventorymaster.findByInventRetailprice", query = "SELECT i FROM Inventorymaster i WHERE i.inventRetailprice = :inventRetailprice")
    , @NamedQuery(name = "Inventorymaster.findByInventretailmin", query = "SELECT i FROM Inventorymaster i WHERE i.inventretailmin = :inventretailmin")
    , @NamedQuery(name = "Inventorymaster.findByInventretailmax", query = "SELECT i FROM Inventorymaster i WHERE i.inventretailmax = :inventretailmax")
    , @NamedQuery(name = "Inventorymaster.findByInventretailreorder", query = "SELECT i FROM Inventorymaster i WHERE i.inventretailreorder = :inventretailreorder")
    , @NamedQuery(name = "Inventorymaster.findByInventisTrackable", query = "SELECT i FROM Inventorymaster i WHERE i.inventisTrackable = :inventisTrackable")
    , @NamedQuery(name = "Inventorymaster.findByInventisWatchlist", query = "SELECT i FROM Inventorymaster i WHERE i.inventisWatchlist = :inventisWatchlist")
    , @NamedQuery(name = "Inventorymaster.findByInventisDirectsale", query = "SELECT i FROM Inventorymaster i WHERE i.inventisDirectsale = :inventisDirectsale")
    , @NamedQuery(name = "Inventorymaster.findByInventisDiscontinued", query = "SELECT i FROM Inventorymaster i WHERE i.inventisDiscontinued = :inventisDiscontinued")
    , @NamedQuery(name = "Inventorymaster.findByDateCreated", query = "SELECT i FROM Inventorymaster i WHERE i.dateCreated = :dateCreated")
    , @NamedQuery(name = "Inventorymaster.findByCreatedBy", query = "SELECT i FROM Inventorymaster i WHERE i.createdBy = :createdBy")
    , @NamedQuery(name = "Inventorymaster.findByDateUpdated", query = "SELECT i FROM Inventorymaster i WHERE i.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Inventorymaster.findByUpdatedBy", query = "SELECT i FROM Inventorymaster i WHERE i.updatedBy = :updatedBy")
    , @NamedQuery(name = "Inventorymaster.findByReplicationStatus", query = "SELECT i FROM Inventorymaster i WHERE i.replicationStatus = :replicationStatus")})
public class Inventorymaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "invent_zone_id")
    private Integer inventZoneId;
    @Column(name = "invent_cat_id")
    private String inventCatId;
    @Column(name = "invent_item_id")
    private String inventItemId;
    @Column(name = "invent_item_name")
    private String inventItemName;
    @Column(name = "Invent_item_des")
    private String inventitemdes;
    @Column(name = "Invent_purchase_unit")
    private String inventpurchaseunit;
    @Column(name = "Invent_purchase_qty")
    private String inventpurchaseqty;
    @Column(name = "Invent_purchase_price")
    private String inventpurchaseprice;
    @Column(name = "Invent_purchase_min")
    private String inventpurchasemin;
    @Column(name = "Invent_purchase_max")
    private String inventpurchasemax;
    @Column(name = "Invent_purchase_reorder")
    private String inventpurchasereorder;
    @Column(name = "Invent_retail_unit")
    private String inventretailunit;
    @Column(name = "Invent_Retail_price")
    private String inventRetailprice;
    @Column(name = "Invent_retail_min")
    private String inventretailmin;
    @Column(name = "Invent_retail_max")
    private String inventretailmax;
    @Column(name = "Invent_retail_reorder")
    private String inventretailreorder;
    @Column(name = "Invent_isTrackable")
    private String inventisTrackable;
    @Column(name = "Invent_isWatchlist")
    private String inventisWatchlist;
    @Column(name = "Invent_isDirectsale")
    private String inventisDirectsale;
    @Column(name = "Invent_isDiscontinued")
    private String inventisDiscontinued;
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

    public Inventorymaster() {
    }

    public Inventorymaster(Integer inventZoneId) {
        this.inventZoneId = inventZoneId;
    }

    public Integer getInventZoneId() {
        return inventZoneId;
    }

    public void setInventZoneId(Integer inventZoneId) {
        this.inventZoneId = inventZoneId;
    }

    public String getInventCatId() {
        return inventCatId;
    }

    public void setInventCatId(String inventCatId) {
        this.inventCatId = inventCatId;
    }

    public String getInventItemId() {
        return inventItemId;
    }

    public void setInventItemId(String inventItemId) {
        this.inventItemId = inventItemId;
    }

    public String getInventItemName() {
        return inventItemName;
    }

    public void setInventItemName(String inventItemName) {
        this.inventItemName = inventItemName;
    }

    public String getInventitemdes() {
        return inventitemdes;
    }

    public void setInventitemdes(String inventitemdes) {
        this.inventitemdes = inventitemdes;
    }

    public String getInventpurchaseunit() {
        return inventpurchaseunit;
    }

    public void setInventpurchaseunit(String inventpurchaseunit) {
        this.inventpurchaseunit = inventpurchaseunit;
    }

    public String getInventpurchaseqty() {
        return inventpurchaseqty;
    }

    public void setInventpurchaseqty(String inventpurchaseqty) {
        this.inventpurchaseqty = inventpurchaseqty;
    }

    public String getInventpurchaseprice() {
        return inventpurchaseprice;
    }

    public void setInventpurchaseprice(String inventpurchaseprice) {
        this.inventpurchaseprice = inventpurchaseprice;
    }

    public String getInventpurchasemin() {
        return inventpurchasemin;
    }

    public void setInventpurchasemin(String inventpurchasemin) {
        this.inventpurchasemin = inventpurchasemin;
    }

    public String getInventpurchasemax() {
        return inventpurchasemax;
    }

    public void setInventpurchasemax(String inventpurchasemax) {
        this.inventpurchasemax = inventpurchasemax;
    }

    public String getInventpurchasereorder() {
        return inventpurchasereorder;
    }

    public void setInventpurchasereorder(String inventpurchasereorder) {
        this.inventpurchasereorder = inventpurchasereorder;
    }

    public String getInventretailunit() {
        return inventretailunit;
    }

    public void setInventretailunit(String inventretailunit) {
        this.inventretailunit = inventretailunit;
    }

    public String getInventRetailprice() {
        return inventRetailprice;
    }

    public void setInventRetailprice(String inventRetailprice) {
        this.inventRetailprice = inventRetailprice;
    }

    public String getInventretailmin() {
        return inventretailmin;
    }

    public void setInventretailmin(String inventretailmin) {
        this.inventretailmin = inventretailmin;
    }

    public String getInventretailmax() {
        return inventretailmax;
    }

    public void setInventretailmax(String inventretailmax) {
        this.inventretailmax = inventretailmax;
    }

    public String getInventretailreorder() {
        return inventretailreorder;
    }

    public void setInventretailreorder(String inventretailreorder) {
        this.inventretailreorder = inventretailreorder;
    }

    public String getInventisTrackable() {
        return inventisTrackable;
    }

    public void setInventisTrackable(String inventisTrackable) {
        this.inventisTrackable = inventisTrackable;
    }

    public String getInventisWatchlist() {
        return inventisWatchlist;
    }

    public void setInventisWatchlist(String inventisWatchlist) {
        this.inventisWatchlist = inventisWatchlist;
    }

    public String getInventisDirectsale() {
        return inventisDirectsale;
    }

    public void setInventisDirectsale(String inventisDirectsale) {
        this.inventisDirectsale = inventisDirectsale;
    }

    public String getInventisDiscontinued() {
        return inventisDiscontinued;
    }

    public void setInventisDiscontinued(String inventisDiscontinued) {
        this.inventisDiscontinued = inventisDiscontinued;
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
        hash += (inventZoneId != null ? inventZoneId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventorymaster)) {
            return false;
        }
        Inventorymaster other = (Inventorymaster) object;
        if ((this.inventZoneId == null && other.inventZoneId != null) || (this.inventZoneId != null && !this.inventZoneId.equals(other.inventZoneId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Inventorymaster[ inventZoneId=" + inventZoneId + " ]";
    }
    
}
