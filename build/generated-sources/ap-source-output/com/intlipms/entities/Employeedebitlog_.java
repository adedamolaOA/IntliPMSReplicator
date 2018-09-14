package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Employeedebitlog.class)
public class Employeedebitlog_ { 

    public static volatile SingularAttribute<Employeedebitlog, Date> dateCreated;
    public static volatile SingularAttribute<Employeedebitlog, String> updatedBy;
    public static volatile SingularAttribute<Employeedebitlog, String> createdBy;
    public static volatile SingularAttribute<Employeedebitlog, Integer> empDebitId;
    public static volatile SingularAttribute<Employeedebitlog, String> employeeId;
    public static volatile SingularAttribute<Employeedebitlog, String> debitReason;
    public static volatile SingularAttribute<Employeedebitlog, Boolean> replicationStatus;
    public static volatile SingularAttribute<Employeedebitlog, String> debitAmount;
    public static volatile SingularAttribute<Employeedebitlog, Date> dateUpdated;

}