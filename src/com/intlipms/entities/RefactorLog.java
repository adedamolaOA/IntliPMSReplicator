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
@Table(name = "__RefactorLog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RefactorLog.findAll", query = "SELECT r FROM RefactorLog r")
    , @NamedQuery(name = "RefactorLog.findByOperationKey", query = "SELECT r FROM RefactorLog r WHERE r.operationKey = :operationKey")})
public class RefactorLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OperationKey")
    private String operationKey;

    public RefactorLog() {
    }

    public RefactorLog(String operationKey) {
        this.operationKey = operationKey;
    }

    public String getOperationKey() {
        return operationKey;
    }

    public void setOperationKey(String operationKey) {
        this.operationKey = operationKey;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (operationKey != null ? operationKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RefactorLog)) {
            return false;
        }
        RefactorLog other = (RefactorLog) object;
        if ((this.operationKey == null && other.operationKey != null) || (this.operationKey != null && !this.operationKey.equals(other.operationKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.RefactorLog[ operationKey=" + operationKey + " ]";
    }
    
}
