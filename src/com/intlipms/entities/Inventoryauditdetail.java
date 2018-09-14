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
@Table(name = "Inventory_audit_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventoryauditdetail.findAll", query = "SELECT i FROM Inventoryauditdetail i")
    , @NamedQuery(name = "Inventoryauditdetail.findByAuditid", query = "SELECT i FROM Inventoryauditdetail i WHERE i.auditid = :auditid")
    , @NamedQuery(name = "Inventoryauditdetail.findByInventitemid", query = "SELECT i FROM Inventoryauditdetail i WHERE i.inventitemid = :inventitemid")
    , @NamedQuery(name = "Inventoryauditdetail.findByInventstockqty", query = "SELECT i FROM Inventoryauditdetail i WHERE i.inventstockqty = :inventstockqty")
    , @NamedQuery(name = "Inventoryauditdetail.findByInventauditqty", query = "SELECT i FROM Inventoryauditdetail i WHERE i.inventauditqty = :inventauditqty")})
public class Inventoryauditdetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Audit_id")
    private Integer auditid;
    @Column(name = "Invent_item_id")
    private String inventitemid;
    @Column(name = "Invent_stock_qty")
    private String inventstockqty;
    @Column(name = "Invent_audit_qty")
    private String inventauditqty;

    public Inventoryauditdetail() {
    }

    public Inventoryauditdetail(Integer auditid) {
        this.auditid = auditid;
    }

    public Integer getAuditid() {
        return auditid;
    }

    public void setAuditid(Integer auditid) {
        this.auditid = auditid;
    }

    public String getInventitemid() {
        return inventitemid;
    }

    public void setInventitemid(String inventitemid) {
        this.inventitemid = inventitemid;
    }

    public String getInventstockqty() {
        return inventstockqty;
    }

    public void setInventstockqty(String inventstockqty) {
        this.inventstockqty = inventstockqty;
    }

    public String getInventauditqty() {
        return inventauditqty;
    }

    public void setInventauditqty(String inventauditqty) {
        this.inventauditqty = inventauditqty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (auditid != null ? auditid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventoryauditdetail)) {
            return false;
        }
        Inventoryauditdetail other = (Inventoryauditdetail) object;
        if ((this.auditid == null && other.auditid != null) || (this.auditid != null && !this.auditid.equals(other.auditid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Inventoryauditdetail[ auditid=" + auditid + " ]";
    }
    
}
