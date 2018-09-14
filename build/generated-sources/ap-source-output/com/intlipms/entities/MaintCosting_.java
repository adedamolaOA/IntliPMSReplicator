package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(MaintCosting.class)
public class MaintCosting_ { 

    public static volatile SingularAttribute<MaintCosting, Integer> costingId;
    public static volatile SingularAttribute<MaintCosting, String> cost;
    public static volatile SingularAttribute<MaintCosting, String> updatedBy;
    public static volatile SingularAttribute<MaintCosting, String> costBy;
    public static volatile SingularAttribute<MaintCosting, Boolean> replicationStatus;
    public static volatile SingularAttribute<MaintCosting, String> hotelId;
    public static volatile SingularAttribute<MaintCosting, Date> dateUpdated;
    public static volatile SingularAttribute<MaintCosting, Date> costDate;
    public static volatile SingularAttribute<MaintCosting, Date> dateCreated;
    public static volatile SingularAttribute<MaintCosting, String> createdBy;
    public static volatile SingularAttribute<MaintCosting, Integer> requestid;
    public static volatile SingularAttribute<MaintCosting, String> fundsReleasedTo;
    public static volatile SingularAttribute<MaintCosting, String> status;

}