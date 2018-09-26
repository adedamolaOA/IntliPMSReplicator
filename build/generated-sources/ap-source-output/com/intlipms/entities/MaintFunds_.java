package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:39")
@StaticMetamodel(MaintFunds.class)
public class MaintFunds_ { 

    public static volatile SingularAttribute<MaintFunds, Integer> fundId;
    public static volatile SingularAttribute<MaintFunds, String> updatedBy;
    public static volatile SingularAttribute<MaintFunds, Date> dateCreated;
    public static volatile SingularAttribute<MaintFunds, Date> fundDate;
    public static volatile SingularAttribute<MaintFunds, String> createdBy;
    public static volatile SingularAttribute<MaintFunds, Integer> requestid;
    public static volatile SingularAttribute<MaintFunds, Boolean> replicationStatus;
    public static volatile SingularAttribute<MaintFunds, String> hotelId;
    public static volatile SingularAttribute<MaintFunds, String> fundBy;
    public static volatile SingularAttribute<MaintFunds, String> fundSource;
    public static volatile SingularAttribute<MaintFunds, Date> dateUpdated;
    public static volatile SingularAttribute<MaintFunds, String> status;

}