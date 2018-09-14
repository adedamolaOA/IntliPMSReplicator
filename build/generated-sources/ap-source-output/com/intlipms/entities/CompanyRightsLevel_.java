package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(CompanyRightsLevel.class)
public class CompanyRightsLevel_ { 

    public static volatile SingularAttribute<CompanyRightsLevel, Date> dateCreated;
    public static volatile SingularAttribute<CompanyRightsLevel, String> updatedBy;
    public static volatile SingularAttribute<CompanyRightsLevel, String> rightsLevel;
    public static volatile SingularAttribute<CompanyRightsLevel, String> createdBy;
    public static volatile SingularAttribute<CompanyRightsLevel, String> memo;
    public static volatile SingularAttribute<CompanyRightsLevel, Boolean> replicationStatus;
    public static volatile SingularAttribute<CompanyRightsLevel, Integer> id;
    public static volatile SingularAttribute<CompanyRightsLevel, String> hotelId;
    public static volatile SingularAttribute<CompanyRightsLevel, Date> dateUpdated;

}