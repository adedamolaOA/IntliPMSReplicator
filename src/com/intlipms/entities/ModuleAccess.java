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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "module_access")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModuleAccess.findAll", query = "SELECT m FROM ModuleAccess m")
    , @NamedQuery(name = "ModuleAccess.findByModuleId", query = "SELECT m FROM ModuleAccess m WHERE m.moduleId = :moduleId")
    , @NamedQuery(name = "ModuleAccess.findByModuleName", query = "SELECT m FROM ModuleAccess m WHERE m.moduleName = :moduleName")
    , @NamedQuery(name = "ModuleAccess.findByModuleStatus", query = "SELECT m FROM ModuleAccess m WHERE m.moduleStatus = :moduleStatus")})
public class ModuleAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "module_id")
    private Integer moduleId;
    @Column(name = "module_name")
    private String moduleName;
    @Lob
    @Column(name = "module_desc")
    private String moduleDesc;
    @Column(name = "module_status")
    private Boolean moduleStatus;

    public ModuleAccess() {
    }

    public ModuleAccess(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleDesc() {
        return moduleDesc;
    }

    public void setModuleDesc(String moduleDesc) {
        this.moduleDesc = moduleDesc;
    }

    public Boolean getModuleStatus() {
        return moduleStatus;
    }

    public void setModuleStatus(Boolean moduleStatus) {
        this.moduleStatus = moduleStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (moduleId != null ? moduleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModuleAccess)) {
            return false;
        }
        ModuleAccess other = (ModuleAccess) object;
        if ((this.moduleId == null && other.moduleId != null) || (this.moduleId != null && !this.moduleId.equals(other.moduleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.ModuleAccess[ moduleId=" + moduleId + " ]";
    }
    
}
