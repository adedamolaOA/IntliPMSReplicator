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
@Table(name = "form_item_access")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormItemAccess.findAll", query = "SELECT f FROM FormItemAccess f")
    , @NamedQuery(name = "FormItemAccess.findById", query = "SELECT f FROM FormItemAccess f WHERE f.id = :id")
    , @NamedQuery(name = "FormItemAccess.findByModule", query = "SELECT f FROM FormItemAccess f WHERE f.module = :module")
    , @NamedQuery(name = "FormItemAccess.findByMForm", query = "SELECT f FROM FormItemAccess f WHERE f.mForm = :mForm")
    , @NamedQuery(name = "FormItemAccess.findByMView", query = "SELECT f FROM FormItemAccess f WHERE f.mView = :mView")
    , @NamedQuery(name = "FormItemAccess.findByMAdd", query = "SELECT f FROM FormItemAccess f WHERE f.mAdd = :mAdd")
    , @NamedQuery(name = "FormItemAccess.findByMUpdate", query = "SELECT f FROM FormItemAccess f WHERE f.mUpdate = :mUpdate")
    , @NamedQuery(name = "FormItemAccess.findByMDelete", query = "SELECT f FROM FormItemAccess f WHERE f.mDelete = :mDelete")})
public class FormItemAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "module")
    private String module;
    @Column(name = "m_form")
    private String mForm;
    @Column(name = "m_view")
    private Boolean mView;
    @Column(name = "m_add")
    private Boolean mAdd;
    @Column(name = "m_update")
    private Boolean mUpdate;
    @Column(name = "m_delete")
    private Boolean mDelete;

    public FormItemAccess() {
    }

    public FormItemAccess(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getMForm() {
        return mForm;
    }

    public void setMForm(String mForm) {
        this.mForm = mForm;
    }

    public Boolean getMView() {
        return mView;
    }

    public void setMView(Boolean mView) {
        this.mView = mView;
    }

    public Boolean getMAdd() {
        return mAdd;
    }

    public void setMAdd(Boolean mAdd) {
        this.mAdd = mAdd;
    }

    public Boolean getMUpdate() {
        return mUpdate;
    }

    public void setMUpdate(Boolean mUpdate) {
        this.mUpdate = mUpdate;
    }

    public Boolean getMDelete() {
        return mDelete;
    }

    public void setMDelete(Boolean mDelete) {
        this.mDelete = mDelete;
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
        if (!(object instanceof FormItemAccess)) {
            return false;
        }
        FormItemAccess other = (FormItemAccess) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.FormItemAccess[ id=" + id + " ]";
    }
    
}
