package com.intlipms.entities;

import com.intlipms.entities.Employeemaster;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:43")
@StaticMetamodel(EmployeePhones.class)
public class EmployeePhones_ { 

    public static volatile SingularAttribute<EmployeePhones, String> empPhone;
    public static volatile SingularAttribute<EmployeePhones, Date> dateCreated;
    public static volatile SingularAttribute<EmployeePhones, String> updatedBy;
    public static volatile SingularAttribute<EmployeePhones, String> createdBy;
    public static volatile SingularAttribute<EmployeePhones, Boolean> replicationStatus;
    public static volatile SingularAttribute<EmployeePhones, Employeemaster> employeeId;
    public static volatile SingularAttribute<EmployeePhones, Integer> empPhoneId;
    public static volatile SingularAttribute<EmployeePhones, Date> dateUpdated;

}