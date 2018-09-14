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
@Table(name = "form_access")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormAccess.findAll", query = "SELECT f FROM FormAccess f")
    , @NamedQuery(name = "FormAccess.findById", query = "SELECT f FROM FormAccess f WHERE f.id = :id")
    , @NamedQuery(name = "FormAccess.findByModuleId", query = "SELECT f FROM FormAccess f WHERE f.moduleId = :moduleId")
    , @NamedQuery(name = "FormAccess.findByFormName", query = "SELECT f FROM FormAccess f WHERE f.formName = :formName")
    , @NamedQuery(name = "FormAccess.findByFormStatus", query = "SELECT f FROM FormAccess f WHERE f.formStatus = :formStatus")})
public class FormAccess implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "module_id")
    private String moduleId;
    @Column(name = "form_name")
    private String formName;
    @Lob
    @Column(name = "form_desc")
    private String formDesc;
    @Column(name = "form_status")
    private Boolean formStatus;

    public FormAccess() {
    }

    public FormAccess(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormDesc() {
        return formDesc;
    }

    public void setFormDesc(String formDesc) {
        this.formDesc = formDesc;
    }

    public Boolean getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(Boolean formStatus) {
        this.formStatus = formStatus;
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
        if (!(object instanceof FormAccess)) {
            return false;
        }
        FormAccess other = (FormAccess) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.FormAccess[ id=" + id + " ]";
    }
    
}
