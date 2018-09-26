package com.intlipms.entities;

import com.intlipms.entities.EmployeeDepartment;
import com.intlipms.entities.Employeemaster;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:43")
@StaticMetamodel(EmployeeSchedulelog.class)
public class EmployeeSchedulelog_ { 

    public static volatile SingularAttribute<EmployeeSchedulelog, Integer> empschlogid;
    public static volatile SingularAttribute<EmployeeSchedulelog, String> updatedBy;
    public static volatile SingularAttribute<EmployeeSchedulelog, Date> dateCreated;
    public static volatile SingularAttribute<EmployeeSchedulelog, Integer> schprimarytype;
    public static volatile SingularAttribute<EmployeeSchedulelog, String> createdBy;
    public static volatile SingularAttribute<EmployeeSchedulelog, Integer> schdaypart;
    public static volatile SingularAttribute<EmployeeSchedulelog, Date> schCreationDate;
    public static volatile SingularAttribute<EmployeeSchedulelog, Boolean> replicationStatus;
    public static volatile SingularAttribute<EmployeeSchedulelog, Employeemaster> employeeId;
    public static volatile SingularAttribute<EmployeeSchedulelog, Date> schStartDate;
    public static volatile SingularAttribute<EmployeeSchedulelog, Date> dateUpdated;
    public static volatile SingularAttribute<EmployeeSchedulelog, EmployeeDepartment> schDeptId;

}