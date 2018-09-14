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
@Table(name = "Sales_menu_detail")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salesmenudetail.findAll", query = "SELECT s FROM Salesmenudetail s")
    , @NamedQuery(name = "Salesmenudetail.findById", query = "SELECT s FROM Salesmenudetail s WHERE s.id = :id")
    , @NamedQuery(name = "Salesmenudetail.findByMenuId", query = "SELECT s FROM Salesmenudetail s WHERE s.menuId = :menuId")
    , @NamedQuery(name = "Salesmenudetail.findByItemid", query = "SELECT s FROM Salesmenudetail s WHERE s.itemid = :itemid")
    , @NamedQuery(name = "Salesmenudetail.findByItemdes", query = "SELECT s FROM Salesmenudetail s WHERE s.itemdes = :itemdes")
    , @NamedQuery(name = "Salesmenudetail.findByItemPrice", query = "SELECT s FROM Salesmenudetail s WHERE s.itemPrice = :itemPrice")
    , @NamedQuery(name = "Salesmenudetail.findByItemIsprintable", query = "SELECT s FROM Salesmenudetail s WHERE s.itemIsprintable = :itemIsprintable")
    , @NamedQuery(name = "Salesmenudetail.findByItemIssubitem", query = "SELECT s FROM Salesmenudetail s WHERE s.itemIssubitem = :itemIssubitem")})
public class Salesmenudetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Menu_Id")
    private String menuId;
    @Column(name = "Item_id")
    private String itemid;
    @Column(name = "Item_des")
    private String itemdes;
    @Column(name = "item_price")
    private String itemPrice;
    @Column(name = "item_isprintable")
    private String itemIsprintable;
    @Column(name = "item_issubitem")
    private String itemIssubitem;

    public Salesmenudetail() {
    }

    public Salesmenudetail(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemdes() {
        return itemdes;
    }

    public void setItemdes(String itemdes) {
        this.itemdes = itemdes;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemIsprintable() {
        return itemIsprintable;
    }

    public void setItemIsprintable(String itemIsprintable) {
        this.itemIsprintable = itemIsprintable;
    }

    public String getItemIssubitem() {
        return itemIssubitem;
    }

    public void setItemIssubitem(String itemIssubitem) {
        this.itemIssubitem = itemIssubitem;
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
        if (!(object instanceof Salesmenudetail)) {
            return false;
        }
        Salesmenudetail other = (Salesmenudetail) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Salesmenudetail[ id=" + id + " ]";
    }
    
}
