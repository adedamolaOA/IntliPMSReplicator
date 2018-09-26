package com.intlipms.entities;

import com.intlipms.entities.EmployeeSchedulelog;
import com.intlipms.entities.Employeetimeofflog;
import com.intlipms.entities.Hotel;
import com.intlipms.entities.Inventoryaudit;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:38")
@StaticMetamodel(EmployeeDepartment.class)
public class EmployeeDepartment_ { 

    public static volatile SingularAttribute<EmployeeDepartment, String> deptsubname;
    public static volatile SingularAttribute<EmployeeDepartment, String> updatedBy;
    public static volatile SingularAttribute<EmployeeDepartment, Date> dateCreated;
    public static volatile SingularAttribute<EmployeeDepartment, String> createdBy;
    public static volatile CollectionAttribute<EmployeeDepartment, Inventoryaudit> inventoryauditCollection;
    public static volatile CollectionAttribute<EmployeeDepartment, Employeetimeofflog> employeetimeofflogCollection;
    public static volatile SingularAttribute<EmployeeDepartment, Integer> empdeptid;
    public static volatile SingularAttribute<EmployeeDepartment, Boolean> replicationStatus;
    public static volatile SingularAttribute<EmployeeDepartment, Hotel> hotelId;
    public static volatile CollectionAttribute<EmployeeDepartment, EmployeeSchedulelog> employeeSchedulelogCollection;
    public static volatile SingularAttribute<EmployeeDepartment, Date> dateUpdated;
    public static volatile SingularAttribute<EmployeeDepartment, String> departName;

}