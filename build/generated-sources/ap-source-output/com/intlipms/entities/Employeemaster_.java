package com.intlipms.entities;

import com.intlipms.entities.EmployeePhones;
import com.intlipms.entities.EmployeeSchedulelog;
import com.intlipms.entities.Employeeaddress;
import com.intlipms.entities.Employeetimeofflog;
import com.intlipms.entities.Hotel;
import com.intlipms.entities.Propertyschmaintlog;
import com.intlipms.entities.RoomInsplog;
import com.intlipms.entities.Roomcleandtlslog;
import com.intlipms.entities.Roomcleanlog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:38")
@StaticMetamodel(Employeemaster.class)
public class Employeemaster_ { 

    public static volatile SingularAttribute<Employeemaster, Date> empEndDate;
    public static volatile CollectionAttribute<Employeemaster, EmployeePhones> employeePhonesCollection;
    public static volatile SingularAttribute<Employeemaster, Integer> empType;
    public static volatile CollectionAttribute<Employeemaster, Employeeaddress> employeeaddressCollection;
    public static volatile SingularAttribute<Employeemaster, Long> empStartSalary;
    public static volatile CollectionAttribute<Employeemaster, Employeetimeofflog> employeetimeofflogCollection;
    public static volatile CollectionAttribute<Employeemaster, Propertyschmaintlog> propertyschmaintlogCollection;
    public static volatile SingularAttribute<Employeemaster, String> empFirstname;
    public static volatile SingularAttribute<Employeemaster, String> empLastname;
    public static volatile SingularAttribute<Employeemaster, Date> empStartDate;
    public static volatile SingularAttribute<Employeemaster, Date> dateCreated;
    public static volatile SingularAttribute<Employeemaster, Boolean> empisActive;
    public static volatile SingularAttribute<Employeemaster, Integer> securelobbyId;
    public static volatile CollectionAttribute<Employeemaster, RoomInsplog> roomInsplogCollection1;
    public static volatile SingularAttribute<Employeemaster, String> updatedBy;
    public static volatile CollectionAttribute<Employeemaster, Roomcleandtlslog> roomcleandtlslogCollection;
    public static volatile CollectionAttribute<Employeemaster, Roomcleandtlslog> roomcleandtlslogCollection1;
    public static volatile SingularAttribute<Employeemaster, Integer> employeeId;
    public static volatile SingularAttribute<Employeemaster, String> empOthername;
    public static volatile SingularAttribute<Employeemaster, Boolean> replicationStatus;
    public static volatile SingularAttribute<Employeemaster, Hotel> hotelId;
    public static volatile CollectionAttribute<Employeemaster, EmployeeSchedulelog> employeeSchedulelogCollection;
    public static volatile SingularAttribute<Employeemaster, Date> dateUpdated;
    public static volatile SingularAttribute<Employeemaster, String> empSex;
    public static volatile CollectionAttribute<Employeemaster, RoomInsplog> roomInsplogCollection;
    public static volatile CollectionAttribute<Employeemaster, Roomcleanlog> roomcleanlogCollection;
    public static volatile CollectionAttribute<Employeemaster, Propertyschmaintlog> propertyschmaintlogCollection1;
    public static volatile SingularAttribute<Employeemaster, String> createdBy;

}