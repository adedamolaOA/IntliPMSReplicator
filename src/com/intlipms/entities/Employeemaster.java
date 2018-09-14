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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Employee_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employeemaster.findAll", query = "SELECT e FROM Employeemaster e")
    , @NamedQuery(name = "Employeemaster.findByEmployeeId", query = "SELECT e FROM Employeemaster e WHERE e.employeeId = :employeeId")
    , @NamedQuery(name = "Employeemaster.findBySecurelobbyId", query = "SELECT e FROM Employeemaster e WHERE e.securelobbyId = :securelobbyId")
    , @NamedQuery(name = "Employeemaster.findByEmpFirstname", query = "SELECT e FROM Employeemaster e WHERE e.empFirstname = :empFirstname")
    , @NamedQuery(name = "Employeemaster.findByEmpLastname", query = "SELECT e FROM Employeemaster e WHERE e.empLastname = :empLastname")
    , @NamedQuery(name = "Employeemaster.findByEmpOthername", query = "SELECT e FROM Employeemaster e WHERE e.empOthername = :empOthername")
    , @NamedQuery(name = "Employeemaster.findByEmpSex", query = "SELECT e FROM Employeemaster e WHERE e.empSex = :empSex")
    , @NamedQuery(name = "Employeemaster.findByEmpStartDate", query = "SELECT e FROM Employeemaster e WHERE e.empStartDate = :empStartDate")
    , @NamedQuery(name = "Employeemaster.findByEmpStartSalary", query = "SELECT e FROM Employeemaster e WHERE e.empStartSalary = :empStartSalary")
    , @NamedQuery(name = "Employeemaster.findByEmpEndDate", query = "SELECT e FROM Employeemaster e WHERE e.empEndDate = :empEndDate")
    , @NamedQuery(name = "Employeemaster.findByEmpisActive", query = "SELECT e FROM Employeemaster e WHERE e.empisActive = :empisActive")
    , @NamedQuery(name = "Employeemaster.findByEmpType", query = "SELECT e FROM Employeemaster e WHERE e.empType = :empType")
    , @NamedQuery(name = "Employeemaster.findByDateCreated", query = "SELECT e FROM Employeemaster e WHERE e.dateCreated = :dateCreated")
    , @NamedQuery(name = "Employeemaster.findByCreatedBy", query = "SELECT e FROM Employeemaster e WHERE e.createdBy = :createdBy")
    , @NamedQuery(name = "Employeemaster.findByDateUpdated", query = "SELECT e FROM Employeemaster e WHERE e.dateUpdated = :dateUpdated")
    , @NamedQuery(name = "Employeemaster.findByUpdatedBy", query = "SELECT e FROM Employeemaster e WHERE e.updatedBy = :updatedBy")
    , @NamedQuery(name = "Employeemaster.findByReplicationStatus", query = "SELECT e FROM Employeemaster e WHERE e.replicationStatus = :replicationStatus")})
public class Employeemaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "securelobby_id")
    private Integer securelobbyId;
    @Basic(optional = false)
    @Column(name = "emp_firstname")
    private String empFirstname;
    @Basic(optional = false)
    @Column(name = "emp_lastname")
    private String empLastname;
    @Basic(optional = false)
    @Column(name = "emp_othername")
    private String empOthername;
    @Basic(optional = false)
    @Column(name = "emp_sex")
    private String empSex;
    @Basic(optional = false)
    @Column(name = "emp_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empStartDate;
    @Basic(optional = false)
    @Column(name = "emp_start_salary")
    private long empStartSalary;
    @Basic(optional = false)
    @Column(name = "emp_end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date empEndDate;
    @Basic(optional = false)
    @Column(name = "emp_isActive")
    private boolean empisActive;
    @Basic(optional = false)
    @Column(name = "emp_type")
    private int empType;
    @Basic(optional = false)
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "created_by")
    private String createdBy;
    @Basic(optional = false)
    @Column(name = "date_updated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateUpdated;
    @Column(name = "updated_by")
    private String updatedBy;
    @Basic(optional = false)
    @Column(name = "replication_status")
    private boolean replicationStatus;
    @OneToMany(mappedBy = "employeeId")
    private Collection<EmployeePhones> employeePhonesCollection;
    @OneToMany(mappedBy = "fDsupervisor")
    private Collection<Roomcleanlog> roomcleanlogCollection;
    @OneToMany(mappedBy = "employeeId")
    private Collection<EmployeeSchedulelog> employeeSchedulelogCollection;
    @OneToMany(mappedBy = "managerid")
    private Collection<RoomInsplog> roomInsplogCollection;
    @OneToMany(mappedBy = "fDsupervisor")
    private Collection<RoomInsplog> roomInsplogCollection1;
    @OneToMany(mappedBy = "employeeId")
    private Collection<Employeetimeofflog> employeetimeofflogCollection;
    @OneToMany(mappedBy = "cleansupervisor")
    private Collection<Roomcleandtlslog> roomcleandtlslogCollection;
    @OneToMany(mappedBy = "cleanhousekeeper")
    private Collection<Roomcleandtlslog> roomcleandtlslogCollection1;
    @OneToMany(mappedBy = "employeeId")
    private Collection<Employeeaddress> employeeaddressCollection;
    @OneToMany(mappedBy = "maintby")
    private Collection<Propertyschmaintlog> propertyschmaintlogCollection;
    @OneToMany(mappedBy = "verifiedby")
    private Collection<Propertyschmaintlog> propertyschmaintlogCollection1;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;

    public Employeemaster() {
    }

    public Employeemaster(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Employeemaster(Integer employeeId, String empFirstname, String empLastname, String empOthername, String empSex, Date empStartDate, long empStartSalary, Date empEndDate, boolean empisActive, int empType, Date dateCreated, Date dateUpdated, boolean replicationStatus) {
        this.employeeId = employeeId;
        this.empFirstname = empFirstname;
        this.empLastname = empLastname;
        this.empOthername = empOthername;
        this.empSex = empSex;
        this.empStartDate = empStartDate;
        this.empStartSalary = empStartSalary;
        this.empEndDate = empEndDate;
        this.empisActive = empisActive;
        this.empType = empType;
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
        this.replicationStatus = replicationStatus;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getSecurelobbyId() {
        return securelobbyId;
    }

    public void setSecurelobbyId(Integer securelobbyId) {
        this.securelobbyId = securelobbyId;
    }

    public String getEmpFirstname() {
        return empFirstname;
    }

    public void setEmpFirstname(String empFirstname) {
        this.empFirstname = empFirstname;
    }

    public String getEmpLastname() {
        return empLastname;
    }

    public void setEmpLastname(String empLastname) {
        this.empLastname = empLastname;
    }

    public String getEmpOthername() {
        return empOthername;
    }

    public void setEmpOthername(String empOthername) {
        this.empOthername = empOthername;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public Date getEmpStartDate() {
        return empStartDate;
    }

    public void setEmpStartDate(Date empStartDate) {
        this.empStartDate = empStartDate;
    }

    public long getEmpStartSalary() {
        return empStartSalary;
    }

    public void setEmpStartSalary(long empStartSalary) {
        this.empStartSalary = empStartSalary;
    }

    public Date getEmpEndDate() {
        return empEndDate;
    }

    public void setEmpEndDate(Date empEndDate) {
        this.empEndDate = empEndDate;
    }

    public boolean getEmpisActive() {
        return empisActive;
    }

    public void setEmpisActive(boolean empisActive) {
        this.empisActive = empisActive;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
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

    public boolean getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(boolean replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    @XmlTransient
    public Collection<EmployeePhones> getEmployeePhonesCollection() {
        return employeePhonesCollection;
    }

    public void setEmployeePhonesCollection(Collection<EmployeePhones> employeePhonesCollection) {
        this.employeePhonesCollection = employeePhonesCollection;
    }

    @XmlTransient
    public Collection<Roomcleanlog> getRoomcleanlogCollection() {
        return roomcleanlogCollection;
    }

    public void setRoomcleanlogCollection(Collection<Roomcleanlog> roomcleanlogCollection) {
        this.roomcleanlogCollection = roomcleanlogCollection;
    }

    @XmlTransient
    public Collection<EmployeeSchedulelog> getEmployeeSchedulelogCollection() {
        return employeeSchedulelogCollection;
    }

    public void setEmployeeSchedulelogCollection(Collection<EmployeeSchedulelog> employeeSchedulelogCollection) {
        this.employeeSchedulelogCollection = employeeSchedulelogCollection;
    }

    @XmlTransient
    public Collection<RoomInsplog> getRoomInsplogCollection() {
        return roomInsplogCollection;
    }

    public void setRoomInsplogCollection(Collection<RoomInsplog> roomInsplogCollection) {
        this.roomInsplogCollection = roomInsplogCollection;
    }

    @XmlTransient
    public Collection<RoomInsplog> getRoomInsplogCollection1() {
        return roomInsplogCollection1;
    }

    public void setRoomInsplogCollection1(Collection<RoomInsplog> roomInsplogCollection1) {
        this.roomInsplogCollection1 = roomInsplogCollection1;
    }

    @XmlTransient
    public Collection<Employeetimeofflog> getEmployeetimeofflogCollection() {
        return employeetimeofflogCollection;
    }

    public void setEmployeetimeofflogCollection(Collection<Employeetimeofflog> employeetimeofflogCollection) {
        this.employeetimeofflogCollection = employeetimeofflogCollection;
    }

    @XmlTransient
    public Collection<Roomcleandtlslog> getRoomcleandtlslogCollection() {
        return roomcleandtlslogCollection;
    }

    public void setRoomcleandtlslogCollection(Collection<Roomcleandtlslog> roomcleandtlslogCollection) {
        this.roomcleandtlslogCollection = roomcleandtlslogCollection;
    }

    @XmlTransient
    public Collection<Roomcleandtlslog> getRoomcleandtlslogCollection1() {
        return roomcleandtlslogCollection1;
    }

    public void setRoomcleandtlslogCollection1(Collection<Roomcleandtlslog> roomcleandtlslogCollection1) {
        this.roomcleandtlslogCollection1 = roomcleandtlslogCollection1;
    }

    @XmlTransient
    public Collection<Employeeaddress> getEmployeeaddressCollection() {
        return employeeaddressCollection;
    }

    public void setEmployeeaddressCollection(Collection<Employeeaddress> employeeaddressCollection) {
        this.employeeaddressCollection = employeeaddressCollection;
    }

    @XmlTransient
    public Collection<Propertyschmaintlog> getPropertyschmaintlogCollection() {
        return propertyschmaintlogCollection;
    }

    public void setPropertyschmaintlogCollection(Collection<Propertyschmaintlog> propertyschmaintlogCollection) {
        this.propertyschmaintlogCollection = propertyschmaintlogCollection;
    }

    @XmlTransient
    public Collection<Propertyschmaintlog> getPropertyschmaintlogCollection1() {
        return propertyschmaintlogCollection1;
    }

    public void setPropertyschmaintlogCollection1(Collection<Propertyschmaintlog> propertyschmaintlogCollection1) {
        this.propertyschmaintlogCollection1 = propertyschmaintlogCollection1;
    }

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeId != null ? employeeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employeemaster)) {
            return false;
        }
        Employeemaster other = (Employeemaster) object;
        if ((this.employeeId == null && other.employeeId != null) || (this.employeeId != null && !this.employeeId.equals(other.employeeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.Employeemaster[ employeeId=" + employeeId + " ]";
    }
    
}
