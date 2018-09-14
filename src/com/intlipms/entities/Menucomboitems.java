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
@Table(name = "Menu_combo_items")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menucomboitems.findAll", query = "SELECT m FROM Menucomboitems m")
    , @NamedQuery(name = "Menucomboitems.findById", query = "SELECT m FROM Menucomboitems m WHERE m.id = :id")
    , @NamedQuery(name = "Menucomboitems.findByMenuid", query = "SELECT m FROM Menucomboitems m WHERE m.menuid = :menuid")
    , @NamedQuery(name = "Menucomboitems.findByInventItemId", query = "SELECT m FROM Menucomboitems m WHERE m.inventItemId = :inventItemId")
    , @NamedQuery(name = "Menucomboitems.findByInventItemQty", query = "SELECT m FROM Menucomboitems m WHERE m.inventItemQty = :inventItemQty")
    , @NamedQuery(name = "Menucomboitems.findByInventisMusthave", query = "SELECT m FROM Menucomboitems m WHERE m.inventisMusthave = :inventisMusthave")
    , @NamedQuery(name = "Menucomboitems.findByInventisTracable", query = "SELECT m FROM Menucomboitems m WHERE m.inventisTracable = :inventisTracable")})
public class Menucomboitems implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Menu_id")
    private Integer menuid;
    @Column(name = "invent_item_id")
    private String inventItemId;
    @Column(name = "invent_item_qty")
    private String inventItemQty;
    @Column(name = "invent_isMusthave")
    private String inventisMusthave;
    @Column(name = "invent_isTracable")
    private String inventisTracable;

    public Menucomboitems() {
    }

    public Menucomboitems(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getInventItemId() {
        return inventItemId;
    }

    public void setInventItemId(String inventItemId) {
        this.inventItemId = inventItemId;
    }

    public String getInventItemQty() {
        return inventItemQty;
    }

    public void setInventItemQty(String inventItemQty) {
        this.inventItemQty = inventItemQty;
    }

    public String getInventisMusthave() {
        return inventisMusthave;
    }

    public void setInventisMusthave(String inventisMusthave) {
        this.inventisMusthave = inventisMusthave;
    }

    public String getInventisTracable() {
        return inventisTracable;
    }

    public void setInventisTracable(String inventisTracable) {
        this.inventisTracable = inventisTracable;
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
        if (!(object instanceof Menucomboitems)) {
            return false;
        }
        Menucomboitems other = (Menucomboitems) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Menucomboitems[ id=" + id + " ]";
    }
    
}
