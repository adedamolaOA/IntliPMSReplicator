/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "Inventory_activity")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventoryactivity.findAll", query = "SELECT i FROM Inventoryactivity i")
    , @NamedQuery(name = "Inventoryactivity.findById", query = "SELECT i FROM Inventoryactivity i WHERE i.id = :id")
    , @NamedQuery(name = "Inventoryactivity.findByCustomerId", query = "SELECT i FROM Inventoryactivity i WHERE i.customerId = :customerId")
    , @NamedQuery(name = "Inventoryactivity.findByActtypeid", query = "SELECT i FROM Inventoryactivity i WHERE i.acttypeid = :acttypeid")
    , @NamedQuery(name = "Inventoryactivity.findByActhotelid", query = "SELECT i FROM Inventoryactivity i WHERE i.acthotelid = :acthotelid")
    , @NamedQuery(name = "Inventoryactivity.findByActdepartid", query = "SELECT i FROM Inventoryactivity i WHERE i.actdepartid = :actdepartid")
    , @NamedQuery(name = "Inventoryactivity.findByActdebit", query = "SELECT i FROM Inventoryactivity i WHERE i.actdebit = :actdebit")
    , @NamedQuery(name = "Inventoryactivity.findByActcredit", query = "SELECT i FROM Inventoryactivity i WHERE i.actcredit = :actcredit")
    , @NamedQuery(name = "Inventoryactivity.findByActBalance", query = "SELECT i FROM Inventoryactivity i WHERE i.actBalance = :actBalance")
    , @NamedQuery(name = "Inventoryactivity.findByDateCreated", query = "SELECT i FROM Inventoryactivity i WHERE i.dateCreated = :dateCreated")
    , @NamedQuery(name = "Inventoryactivity.findByCreatedBy", query = "SELECT i FROM Inventoryactivity i WHERE i.createdBy = :createdBy")
    , @NamedQuery(name = "Inventoryactivity.findByDateUpdated", query = "SELECT i FROM Inventoryactivity i WHERE i.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Inventoryactivity.findByUpdatedBy", query = "SELECT i FROM Inventoryactivity i WHERE i.updatedBy = :updatedBy")
    , @NamedQuery(name = "Inventoryactivity.findByReplicationStatus", query = "SELECT i FROM Inventoryactivity i WHERE i.replicationStatus = :replicationStatus")})
public class Inventoryactivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "customer_id")
    private Integer customerId;
    @Column(name = "Act_type_id")
    private Integer acttypeid;
    @Column(name = "Act_hotel_id")
    private Integer acthotelid;
    @Column(name = "Act_depart_id")
    private Integer actdepartid;
    @Lob
    @Column(name = "Act_ref_info")
    private String actrefinfo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Act_debit")
    private BigDecimal actdebit;
    @Column(name = "Act_credit")
    private BigDecimal actcredit;
    @Column(name = "Act_Balance")
    private BigDecimal actBalance;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "replication_status")
    private Boolean replicationStatus;

    public Inventoryactivity() {
    }

    public Inventoryactivity(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getActtypeid() {
        return acttypeid;
    }

    public void setActtypeid(Integer acttypeid) {
        this.acttypeid = acttypeid;
    }

    public Integer getActhotelid() {
        return acthotelid;
    }

    public void setActhotelid(Integer acthotelid) {
        this.acthotelid = acthotelid;
    }

    public Integer getActdepartid() {
        return actdepartid;
    }

    public void setActdepartid(Integer actdepartid) {
        this.actdepartid = actdepartid;
    }

    public String getActrefinfo() {
        return actrefinfo;
    }

    public void setActrefinfo(String actrefinfo) {
        this.actrefinfo = actrefinfo;
    }

    public BigDecimal getActdebit() {
        return actdebit;
    }

    public void setActdebit(BigDecimal actdebit) {
        this.actdebit = actdebit;
    }

    public BigDecimal getActcredit() {
        return actcredit;
    }

    public void setActcredit(BigDecimal actcredit) {
        this.actcredit = actcredit;
    }

    public BigDecimal getActBalance() {
        return actBalance;
    }

    public void setActBalance(BigDecimal actBalance) {
        this.actBalance = actBalance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
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
        if (!(object instanceof Inventoryactivity)) {
            return false;
        }
        Inventoryactivity other = (Inventoryactivity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Inventoryactivity[ id=" + id + " ]";
    }
    
}
