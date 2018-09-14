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
@Table(name = "Lundary_Invt_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LundaryInvtitems.findAll", query = "SELECT l FROM LundaryInvtitems l")
    , @NamedQuery(name = "LundaryInvtitems.findByItemId", query = "SELECT l FROM LundaryInvtitems l WHERE l.itemId = :itemId")
    , @NamedQuery(name = "LundaryInvtitems.findByItemperbox", query = "SELECT l FROM LundaryInvtitems l WHERE l.itemperbox = :itemperbox")
    , @NamedQuery(name = "LundaryInvtitems.findByCostperbox", query = "SELECT l FROM LundaryInvtitems l WHERE l.costperbox = :costperbox")
    , @NamedQuery(name = "LundaryInvtitems.findByCostperitem", query = "SELECT l FROM LundaryInvtitems l WHERE l.costperitem = :costperitem")
    , @NamedQuery(name = "LundaryInvtitems.findByItemtrackable", query = "SELECT l FROM LundaryInvtitems l WHERE l.itemtrackable = :itemtrackable")
    , @NamedQuery(name = "LundaryInvtitems.findByItemonwatchlist", query = "SELECT l FROM LundaryInvtitems l WHERE l.itemonwatchlist = :itemonwatchlist")
    , @NamedQuery(name = "LundaryInvtitems.findByQtymin", query = "SELECT l FROM LundaryInvtitems l WHERE l.qtymin = :qtymin")
    , @NamedQuery(name = "LundaryInvtitems.findByQtyreorder", query = "SELECT l FROM LundaryInvtitems l WHERE l.qtyreorder = :qtyreorder")
    , @NamedQuery(name = "LundaryInvtitems.findByQtymax", query = "SELECT l FROM LundaryInvtitems l WHERE l.qtymax = :qtymax")
    , @NamedQuery(name = "LundaryInvtitems.findByDateCreated", query = "SELECT l FROM LundaryInvtitems l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "LundaryInvtitems.findByCreatedBy", query = "SELECT l FROM LundaryInvtitems l WHERE l.createdBy = :createdBy")
    , @NamedQuery(name = "LundaryInvtitems.findByDateUpdated", query = "SELECT l FROM LundaryInvtitems l WHERE l.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "LundaryInvtitems.findByUpdatedBy", query = "SELECT l FROM LundaryInvtitems l WHERE l.updatedBy = :updatedBy")
    , @NamedQuery(name = "LundaryInvtitems.findByReplicationStatus", query = "SELECT l FROM LundaryInvtitems l WHERE l.replicationStatus = :replicationStatus")})
public class LundaryInvtitems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "item_id")
    private Integer itemId;
    @Lob
    @Column(name = "item_desc")
    private String itemDesc;
    @Column(name = "Item_per_box")
    private Integer itemperbox;
    @Column(name = "Cost_per_box")
    private Long costperbox;
    @Column(name = "Cost_per_item")
    private Long costperitem;
    @Column(name = "Item_trackable")
    private Boolean itemtrackable;
    @Column(name = "Item_onwatchlist")
    private Boolean itemonwatchlist;
    @Column(name = "Qty_min")
    private Integer qtymin;
    @Column(name = "Qty_reorder")
    private Integer qtyreorder;
    @Column(name = "Qty_max")
    private Integer qtymax;
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

    public LundaryInvtitems() {
    }

    public LundaryInvtitems(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Integer getItemperbox() {
        return itemperbox;
    }

    public void setItemperbox(Integer itemperbox) {
        this.itemperbox = itemperbox;
    }

    public Long getCostperbox() {
        return costperbox;
    }

    public void setCostperbox(Long costperbox) {
        this.costperbox = costperbox;
    }

    public Long getCostperitem() {
        return costperitem;
    }

    public void setCostperitem(Long costperitem) {
        this.costperitem = costperitem;
    }

    public Boolean getItemtrackable() {
        return itemtrackable;
    }

    public void setItemtrackable(Boolean itemtrackable) {
        this.itemtrackable = itemtrackable;
    }

    public Boolean getItemonwatchlist() {
        return itemonwatchlist;
    }

    public void setItemonwatchlist(Boolean itemonwatchlist) {
        this.itemonwatchlist = itemonwatchlist;
    }

    public Integer getQtymin() {
        return qtymin;
    }

    public void setQtymin(Integer qtymin) {
        this.qtymin = qtymin;
    }

    public Integer getQtyreorder() {
        return qtyreorder;
    }

    public void setQtyreorder(Integer qtyreorder) {
        this.qtyreorder = qtyreorder;
    }

    public Integer getQtymax() {
        return qtymax;
    }

    public void setQtymax(Integer qtymax) {
        this.qtymax = qtymax;
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
        hash += (itemId != null ? itemId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LundaryInvtitems)) {
            return false;
        }
        LundaryInvtitems other = (LundaryInvtitems) object;
        if ((this.itemId == null && other.itemId != null) || (this.itemId != null && !this.itemId.equals(other.itemId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.LundaryInvtitems[ itemId=" + itemId + " ]";
    }
    
}
