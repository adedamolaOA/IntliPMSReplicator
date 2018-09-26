package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:41")
@StaticMetamodel(EmployeeDepartmentLog.class)
public class EmployeeDepartmentLog_ { 

    public static volatile SingularAttribute<EmployeeDepartmentLog, String> updatedBy;
    public static volatile SingularAttribute<EmployeeDepartmentLog, String> salaryamount;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Date> dateCreated;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Boolean> departisPromotion;
    public static volatile SingularAttribute<EmployeeDepartmentLog, String> createdBy;
    public static volatile SingularAttribute<EmployeeDepartmentLog, String> departId;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Integer> empdeptid;
    public static volatile SingularAttribute<EmployeeDepartmentLog, String> employeeId;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Boolean> replicationStatus;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Date> departStartDate;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Hotel> hotelId;
    public static volatile SingularAttribute<EmployeeDepartmentLog, Date> dateUpdated;

}