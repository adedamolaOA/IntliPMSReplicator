package com.intlipms.entities;

import com.intlipms.entities.EmployeeDepartment;
import com.intlipms.entities.Employeemaster;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:38")
@StaticMetamodel(Employeetimeofflog.class)
public class Employeetimeofflog_ { 

    public static volatile SingularAttribute<Employeetimeofflog, Integer> empschlogid;
    public static volatile SingularAttribute<Employeetimeofflog, String> updatedBy;
    public static volatile SingularAttribute<Employeetimeofflog, String> dateCreated;
    public static volatile SingularAttribute<Employeetimeofflog, Integer> schprimarytype;
    public static volatile SingularAttribute<Employeetimeofflog, String> createdBy;
    public static volatile SingularAttribute<Employeetimeofflog, Integer> schdaypart;
    public static volatile SingularAttribute<Employeetimeofflog, Date> schCreationDate;
    public static volatile SingularAttribute<Employeetimeofflog, Boolean> replicationStatus;
    public static volatile SingularAttribute<Employeetimeofflog, Employeemaster> employeeId;
    public static volatile SingularAttribute<Employeetimeofflog, String> schStartDate;
    public static volatile SingularAttribute<Employeetimeofflog, Date> dateUpdated;
    public static volatile SingularAttribute<Employeetimeofflog, EmployeeDepartment> schDeptId;

}