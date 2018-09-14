/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "Hotel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h")
    , @NamedQuery(name = "Hotel.findByHotelId", query = "SELECT h FROM Hotel h WHERE h.hotelId = :hotelId")
    , @NamedQuery(name = "Hotel.findByHotelCity", query = "SELECT h FROM Hotel h WHERE h.hotelCity = :hotelCity")
    , @NamedQuery(name = "Hotel.findByHotelState", query = "SELECT h FROM Hotel h WHERE h.hotelState = :hotelState")
    , @NamedQuery(name = "Hotel.findByHotelphone1", query = "SELECT h FROM Hotel h WHERE h.hotelphone1 = :hotelphone1")
    , @NamedQuery(name = "Hotel.findByHotelphone2", query = "SELECT h FROM Hotel h WHERE h.hotelphone2 = :hotelphone2")
    , @NamedQuery(name = "Hotel.findByHoteldateopened", query = "SELECT h FROM Hotel h WHERE h.hoteldateopened = :hoteldateopened")
    , @NamedQuery(name = "Hotel.findByHotelStatus", query = "SELECT h FROM Hotel h WHERE h.hotelStatus = :hotelStatus")
    , @NamedQuery(name = "Hotel.findByHotelNumRooms", query = "SELECT h FROM Hotel h WHERE h.hotelNumRooms = :hotelNumRooms")
    , @NamedQuery(name = "Hotel.findByDateCreated", query = "SELECT h FROM Hotel h WHERE h.dateCreated = :dateCreated")
    , @NamedQuery(name = "Hotel.findByCreatedBy", query = "SELECT h FROM Hotel h WHERE h.createdBy = :createdBy")
    , @NamedQuery(name = "Hotel.findByDateUpdated", query = "SELECT h FROM Hotel h WHERE h.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Hotel.findByUpdatedBy", query = "SELECT h FROM Hotel h WHERE h.updatedBy = :updatedBy")
    , @NamedQuery(name = "Hotel.findByReplicationStatus", query = "SELECT h FROM Hotel h WHERE h.replicationStatus = :replicationStatus")})
public class Hotel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Hotel_Id")
    private String hotelId;
    @Lob
    @Column(name = "Hotel_name")
    private String hotelname;
    @Lob
    @Column(name = "Hotel_Desc")
    private String hotelDesc;
    @Lob
    @Column(name = "Hotel_Address")
    private String hotelAddress;
    @Column(name = "Hotel_City")
    private String hotelCity;
    @Column(name = "Hotel_State")
    private String hotelState;
    @Column(name = "Hotel_phone1")
    private String hotelphone1;
    @Column(name = "Hotel_phone2")
    private String hotelphone2;
    @Column(name = "Hotel_date_opened")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hoteldateopened;
    @Column(name = "Hotel_Status")
    private Integer hotelStatus;
    @Column(name = "Hotel_Num_Rooms")
    private Integer hotelNumRooms;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<Company> companyCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<Customer> customerCollection;
    @OneToMany(mappedBy = "hotelId")
    private Collection<Customerroomrate> customerroomrateCollection;
    @OneToMany(mappedBy = "hotelId")
    private Collection<CompanyCustomer> companyCustomerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<PromotionType> promotionTypeCollection;
    @OneToMany(mappedBy = "hotelId")
    private Collection<Building> buildingCollection;
    @OneToMany(mappedBy = "hotelId")
    private Collection<Customeractivitylog> customeractivitylogCollection;
    @OneToMany(mappedBy = "hotelId")
    private Collection<Inventoryaudit> inventoryauditCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<HotelAmenities> hotelAmenitiesCollection;
    @OneToMany(mappedBy = "hotelId")
    private Collection<RoomType> roomTypeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<EmployeeDepartment> employeeDepartmentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<EmployeeDepartmentLog> employeeDepartmentLogCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<Rooms> roomsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hotelId")
    private Collection<Employeemaster> employeemasterCollection;

    public Hotel() {
    }

    public Hotel(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public String getHotelDesc() {
        return hotelDesc;
    }

    public void setHotelDesc(String hotelDesc) {
        this.hotelDesc = hotelDesc;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelState() {
        return hotelState;
    }

    public void setHotelState(String hotelState) {
        this.hotelState = hotelState;
    }

    public String getHotelphone1() {
        return hotelphone1;
    }

    public void setHotelphone1(String hotelphone1) {
        this.hotelphone1 = hotelphone1;
    }

    public String getHotelphone2() {
        return hotelphone2;
    }

    public void setHotelphone2(String hotelphone2) {
        this.hotelphone2 = hotelphone2;
    }

    public Date getHoteldateopened() {
        return hoteldateopened;
    }

    public void setHoteldateopened(Date hoteldateopened) {
        this.hoteldateopened = hoteldateopened;
    }

    public Integer getHotelStatus() {
        return hotelStatus;
    }

    public void setHotelStatus(Integer hotelStatus) {
        this.hotelStatus = hotelStatus;
    }

    public Integer getHotelNumRooms() {
        return hotelNumRooms;
    }

    public void setHotelNumRooms(Integer hotelNumRooms) {
        this.hotelNumRooms = hotelNumRooms;
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

    @XmlTransient
    public Collection<Company> getCompanyCollection() {
        return companyCollection;
    }

    public void setCompanyCollection(Collection<Company> companyCollection) {
        this.companyCollection = companyCollection;
    }

    @XmlTransient
    public Collection<Customer> getCustomerCollection() {
        return customerCollection;
    }

    public void setCustomerCollection(Collection<Customer> customerCollection) {
        this.customerCollection = customerCollection;
    }

    @XmlTransient
    public Collection<Customerroomrate> getCustomerroomrateCollection() {
        return customerroomrateCollection;
    }

    public void setCustomerroomrateCollection(Collection<Customerroomrate> customerroomrateCollection) {
        this.customerroomrateCollection = customerroomrateCollection;
    }

    @XmlTransient
    public Collection<CompanyCustomer> getCompanyCustomerCollection() {
        return companyCustomerCollection;
    }

    public void setCompanyCustomerCollection(Collection<CompanyCustomer> companyCustomerCollection) {
        this.companyCustomerCollection = companyCustomerCollection;
    }

    @XmlTransient
    public Collection<PromotionType> getPromotionTypeCollection() {
        return promotionTypeCollection;
    }

    public void setPromotionTypeCollection(Collection<PromotionType> promotionTypeCollection) {
        this.promotionTypeCollection = promotionTypeCollection;
    }

    @XmlTransient
    public Collection<Building> getBuildingCollection() {
        return buildingCollection;
    }

    public void setBuildingCollection(Collection<Building> buildingCollection) {
        this.buildingCollection = buildingCollection;
    }

    @XmlTransient
    public Collection<Customeractivitylog> getCustomeractivitylogCollection() {
        return customeractivitylogCollection;
    }

    public void setCustomeractivitylogCollection(Collection<Customeractivitylog> customeractivitylogCollection) {
        this.customeractivitylogCollection = customeractivitylogCollection;
    }

    @XmlTransient
    public Collection<Inventoryaudit> getInventoryauditCollection() {
        return inventoryauditCollection;
    }

    public void setInventoryauditCollection(Collection<Inventoryaudit> inventoryauditCollection) {
        this.inventoryauditCollection = inventoryauditCollection;
    }

    @XmlTransient
    public Collection<HotelAmenities> getHotelAmenitiesCollection() {
        return hotelAmenitiesCollection;
    }

    public void setHotelAmenitiesCollection(Collection<HotelAmenities> hotelAmenitiesCollection) {
        this.hotelAmenitiesCollection = hotelAmenitiesCollection;
    }

    @XmlTransient
    public Collection<RoomType> getRoomTypeCollection() {
        return roomTypeCollection;
    }

    public void setRoomTypeCollection(Collection<RoomType> roomTypeCollection) {
        this.roomTypeCollection = roomTypeCollection;
    }

    @XmlTransient
    public Collection<EmployeeDepartment> getEmployeeDepartmentCollection() {
        return employeeDepartmentCollection;
    }

    public void setEmployeeDepartmentCollection(Collection<EmployeeDepartment> employeeDepartmentCollection) {
        this.employeeDepartmentCollection = employeeDepartmentCollection;
    }

    @XmlTransient
    public Collection<EmployeeDepartmentLog> getEmployeeDepartmentLogCollection() {
        return employeeDepartmentLogCollection;
    }

    public void setEmployeeDepartmentLogCollection(Collection<EmployeeDepartmentLog> employeeDepartmentLogCollection) {
        this.employeeDepartmentLogCollection = employeeDepartmentLogCollection;
    }

    @XmlTransient
    public Collection<Rooms> getRoomsCollection() {
        return roomsCollection;
    }

    public void setRoomsCollection(Collection<Rooms> roomsCollection) {
        this.roomsCollection = roomsCollection;
    }

    @XmlTransient
    public Collection<Employeemaster> getEmployeemasterCollection() {
        return employeemasterCollection;
    }

    public void setEmployeemasterCollection(Collection<Employeemaster> employeemasterCollection) {
        this.employeemasterCollection = employeemasterCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hotelId != null ? hotelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.hotelId == null && other.hotelId != null) || (this.hotelId != null && !this.hotelId.equals(other.hotelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Hotel[ hotelId=" + hotelId + " ]";
    }
    
}
