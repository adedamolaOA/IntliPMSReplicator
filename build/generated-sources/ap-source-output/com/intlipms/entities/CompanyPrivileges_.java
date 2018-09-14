package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(CompanyPrivileges.class)
public class CompanyPrivileges_ { 

    public static volatile SingularAttribute<CompanyPrivileges, Date> dateCreated;
    public static volatile SingularAttribute<CompanyPrivileges, String> updatedBy;
    public static volatile SingularAttribute<CompanyPrivileges, String> createdBy;
    public static volatile SingularAttribute<CompanyPrivileges, String> memo;
    public static volatile SingularAttribute<CompanyPrivileges, Integer> pid;
    public static volatile SingularAttribute<CompanyPrivileges, String> company;
    public static volatile SingularAttribute<CompanyPrivileges, Boolean> replicationStatus;
    public static volatile SingularAttribute<CompanyPrivileges, String> hotelId;
    public static volatile SingularAttribute<CompanyPrivileges, String> hotelAmentity;
    public static volatile SingularAttribute<CompanyPrivileges, Date> dateUpdated;

}