package com.intlipms.entities;

import com.intlipms.entities.Employeemaster;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:40")
@StaticMetamodel(Employeeaddress.class)
public class Employeeaddress_ { 

    public static volatile SingularAttribute<Employeeaddress, Date> dateCreated;
    public static volatile SingularAttribute<Employeeaddress, String> updatedBy;
    public static volatile SingularAttribute<Employeeaddress, String> empAddressDes;
    public static volatile SingularAttribute<Employeeaddress, String> createdBy;
    public static volatile SingularAttribute<Employeeaddress, Boolean> replicationStatus;
    public static volatile SingularAttribute<Employeeaddress, Employeemaster> employeeId;
    public static volatile SingularAttribute<Employeeaddress, String> empAddress;
    public static volatile SingularAttribute<Employeeaddress, String> empCity;
    public static volatile SingularAttribute<Employeeaddress, Integer> empAddressId;
    public static volatile SingularAttribute<Employeeaddress, String> empState;
    public static volatile SingularAttribute<Employeeaddress, Date> dateUpdated;

}