package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:40")
@StaticMetamodel(CompanyStaffType.class)
public class CompanyStaffType_ { 

    public static volatile SingularAttribute<CompanyStaffType, Date> dateCreated;
    public static volatile SingularAttribute<CompanyStaffType, String> updatedBy;
    public static volatile SingularAttribute<CompanyStaffType, String> createdBy;
    public static volatile SingularAttribute<CompanyStaffType, String> memo;
    public static volatile SingularAttribute<CompanyStaffType, Boolean> replicationStatus;
    public static volatile SingularAttribute<CompanyStaffType, Integer> id;
    public static volatile SingularAttribute<CompanyStaffType, String> hotelId;
    public static volatile SingularAttribute<CompanyStaffType, String> staffType;
    public static volatile SingularAttribute<CompanyStaffType, Date> dateUpdated;

}