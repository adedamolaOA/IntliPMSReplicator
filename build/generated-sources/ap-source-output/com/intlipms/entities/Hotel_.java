package com.intlipms.entities;

import com.intlipms.entities.Building;
import com.intlipms.entities.Company;
import com.intlipms.entities.CompanyCustomer;
import com.intlipms.entities.Customer;
import com.intlipms.entities.Customeractivitylog;
import com.intlipms.entities.Customerroomrate;
import com.intlipms.entities.EmployeeDepartment;
import com.intlipms.entities.EmployeeDepartmentLog;
import com.intlipms.entities.Employeemaster;
import com.intlipms.entities.HotelAmenities;
import com.intlipms.entities.Inventoryaudit;
import com.intlipms.entities.PromotionType;
import com.intlipms.entities.RoomType;
import com.intlipms.entities.Rooms;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:39")
@StaticMetamodel(Hotel.class)
public class Hotel_ { 

    public static volatile CollectionAttribute<Hotel, HotelAmenities> hotelAmenitiesCollection;
    public static volatile CollectionAttribute<Hotel, Customerroomrate> customerroomrateCollection;
    public static volatile CollectionAttribute<Hotel, Company> companyCollection;
    public static volatile CollectionAttribute<Hotel, Inventoryaudit> inventoryauditCollection;
    public static volatile SingularAttribute<Hotel, String> hotelAddress;
    public static volatile SingularAttribute<Hotel, String> hotelDesc;
    public static volatile CollectionAttribute<Hotel, RoomType> roomTypeCollection;
    public static volatile CollectionAttribute<Hotel, EmployeeDepartmentLog> employeeDepartmentLogCollection;
    public static volatile SingularAttribute<Hotel, String> hotelState;
    public static volatile CollectionAttribute<Hotel, Employeemaster> employeemasterCollection;
    public static volatile CollectionAttribute<Hotel, EmployeeDepartment> employeeDepartmentCollection;
    public static volatile SingularAttribute<Hotel, String> hotelCity;
    public static volatile CollectionAttribute<Hotel, Building> buildingCollection;
    public static volatile SingularAttribute<Hotel, Date> dateCreated;
    public static volatile CollectionAttribute<Hotel, CompanyCustomer> companyCustomerCollection;
    public static volatile CollectionAttribute<Hotel, Rooms> roomsCollection;
    public static volatile SingularAttribute<Hotel, Integer> hotelNumRooms;
    public static volatile SingularAttribute<Hotel, String> updatedBy;
    public static volatile SingularAttribute<Hotel, Boolean> replicationStatus;
    public static volatile SingularAttribute<Hotel, String> hotelId;
    public static volatile SingularAttribute<Hotel, Integer> hotelStatus;
    public static volatile CollectionAttribute<Hotel, PromotionType> promotionTypeCollection;
    public static volatile SingularAttribute<Hotel, Date> dateUpdated;
    public static volatile CollectionAttribute<Hotel, Customeractivitylog> customeractivitylogCollection;
    public static volatile SingularAttribute<Hotel, String> hotelphone1;
    public static volatile SingularAttribute<Hotel, String> createdBy;
    public static volatile CollectionAttribute<Hotel, Customer> customerCollection;
    public static volatile SingularAttribute<Hotel, Date> hoteldateopened;
    public static volatile SingularAttribute<Hotel, String> hotelname;
    public static volatile SingularAttribute<Hotel, String> hotelphone2;

}