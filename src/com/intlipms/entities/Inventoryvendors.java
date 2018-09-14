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
@Table(name = "Inventory_vendors")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inventoryvendors.findAll", query = "SELECT i FROM Inventoryvendors i")
    , @NamedQuery(name = "Inventoryvendors.findById", query = "SELECT i FROM Inventoryvendors i WHERE i.id = :id")
    , @NamedQuery(name = "Inventoryvendors.findByCompothernames", query = "SELECT i FROM Inventoryvendors i WHERE i.compothernames = :compothernames")
    , @NamedQuery(name = "Inventoryvendors.findByCompPhone1", query = "SELECT i FROM Inventoryvendors i WHERE i.compPhone1 = :compPhone1")
    , @NamedQuery(name = "Inventoryvendors.findByCompphone2", query = "SELECT i FROM Inventoryvendors i WHERE i.compphone2 = :compphone2")
    , @NamedQuery(name = "Inventoryvendors.findByCompemail", query = "SELECT i FROM Inventoryvendors i WHERE i.compemail = :compemail")
    , @NamedQuery(name = "Inventoryvendors.findByCompRC", query = "SELECT i FROM Inventoryvendors i WHERE i.compRC = :compRC")
    , @NamedQuery(name = "Inventoryvendors.findByCompaddress", query = "SELECT i FROM Inventoryvendors i WHERE i.compaddress = :compaddress")
    , @NamedQuery(name = "Inventoryvendors.findByCompcity", query = "SELECT i FROM Inventoryvendors i WHERE i.compcity = :compcity")
    , @NamedQuery(name = "Inventoryvendors.findByCuststate", query = "SELECT i FROM Inventoryvendors i WHERE i.custstate = :custstate")
    , @NamedQuery(name = "Inventoryvendors.findByHotelid", query = "SELECT i FROM Inventoryvendors i WHERE i.hotelid = :hotelid")
    , @NamedQuery(name = "Inventoryvendors.findByCompkeycontactname", query = "SELECT i FROM Inventoryvendors i WHERE i.compkeycontactname = :compkeycontactname")
    , @NamedQuery(name = "Inventoryvendors.findByCompanykeycontactphone1", query = "SELECT i FROM Inventoryvendors i WHERE i.companykeycontactphone1 = :companykeycontactphone1")
    , @NamedQuery(name = "Inventoryvendors.findByCompanykeycontactphone2", query = "SELECT i FROM Inventoryvendors i WHERE i.companykeycontactphone2 = :companykeycontactphone2")
    , @NamedQuery(name = "Inventoryvendors.findByCompanykeycontactemail", query = "SELECT i FROM Inventoryvendors i WHERE i.companykeycontactemail = :companykeycontactemail")
    , @NamedQuery(name = "Inventoryvendors.findByEmployeeid", query = "SELECT i FROM Inventoryvendors i WHERE i.employeeid = :employeeid")
    , @NamedQuery(name = "Inventoryvendors.findByDateCreated", query = "SELECT i FROM Inventoryvendors i WHERE i.dateCreated = :dateCreated")
    , @NamedQuery(name = "Inventoryvendors.findByCreatedBy", query = "SELECT i FROM Inventoryvendors i WHERE i.createdBy = :createdBy")
    , @NamedQuery(name = "Inventoryvendors.findByDateUpdated", query = "SELECT i FROM Inventoryvendors i WHERE i.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Inventoryvendors.findByUpdatedBy", query = "SELECT i FROM Inventoryvendors i WHERE i.updatedBy = :updatedBy")
    , @NamedQuery(name = "Inventoryvendors.findByReplicationStatus", query = "SELECT i FROM Inventoryvendors i WHERE i.replicationStatus = :replicationStatus")})
public class Inventoryvendors implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Comp_othernames")
    private String compothernames;
    @Column(name = "comp_phone1")
    private String compPhone1;
    @Column(name = "Comp_phone2")
    private String compphone2;
    @Column(name = "Comp_email")
    private String compemail;
    @Column(name = "Comp_RC")
    private String compRC;
    @Column(name = "Comp_address")
    private String compaddress;
    @Column(name = "Comp_city")
    private String compcity;
    @Column(name = "Cust_state")
    private String custstate;
    @Column(name = "Hotel_id")
    private String hotelid;
    @Column(name = "Comp_keycontact_name")
    private String compkeycontactname;
    @Column(name = "Company_keycontact_phone1")
    private String companykeycontactphone1;
    @Column(name = "Company_keycontact_phone2")
    private String companykeycontactphone2;
    @Column(name = "Company_keycontact_email")
    private String companykeycontactemail;
    @Column(name = "Employee_id")
    private String employeeid;
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

    public Inventoryvendors() {
    }

    public Inventoryvendors(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompothernames() {
        return compothernames;
    }

    public void setCompothernames(String compothernames) {
        this.compothernames = compothernames;
    }

    public String getCompPhone1() {
        return compPhone1;
    }

    public void setCompPhone1(String compPhone1) {
        this.compPhone1 = compPhone1;
    }

    public String getCompphone2() {
        return compphone2;
    }

    public void setCompphone2(String compphone2) {
        this.compphone2 = compphone2;
    }

    public String getCompemail() {
        return compemail;
    }

    public void setCompemail(String compemail) {
        this.compemail = compemail;
    }

    public String getCompRC() {
        return compRC;
    }

    public void setCompRC(String compRC) {
        this.compRC = compRC;
    }

    public String getCompaddress() {
        return compaddress;
    }

    public void setCompaddress(String compaddress) {
        this.compaddress = compaddress;
    }

    public String getCompcity() {
        return compcity;
    }

    public void setCompcity(String compcity) {
        this.compcity = compcity;
    }

    public String getCuststate() {
        return custstate;
    }

    public void setCuststate(String custstate) {
        this.custstate = custstate;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public String getCompkeycontactname() {
        return compkeycontactname;
    }

    public void setCompkeycontactname(String compkeycontactname) {
        this.compkeycontactname = compkeycontactname;
    }

    public String getCompanykeycontactphone1() {
        return companykeycontactphone1;
    }

    public void setCompanykeycontactphone1(String companykeycontactphone1) {
        this.companykeycontactphone1 = companykeycontactphone1;
    }

    public String getCompanykeycontactphone2() {
        return companykeycontactphone2;
    }

    public void setCompanykeycontactphone2(String companykeycontactphone2) {
        this.companykeycontactphone2 = companykeycontactphone2;
    }

    public String getCompanykeycontactemail() {
        return companykeycontactemail;
    }

    public void setCompanykeycontactemail(String companykeycontactemail) {
        this.companykeycontactemail = companykeycontactemail;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventoryvendors)) {
            return false;
        }
        Inventoryvendors other = (Inventoryvendors) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Inventoryvendors[ id=" + id + " ]";
    }
    
}
