package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Customerroomrate.class)
public class Customerroomrate_ { 

    public static volatile SingularAttribute<Customerroomrate, Integer> roomrate;
    public static volatile SingularAttribute<Customerroomrate, String> updatedBy;
    public static volatile SingularAttribute<Customerroomrate, String> approvedby;
    public static volatile SingularAttribute<Customerroomrate, Integer> roomrateid;
    public static volatile SingularAttribute<Customerroomrate, String> roomtypeid;
    public static volatile SingularAttribute<Customerroomrate, Boolean> replicationStatus;
    public static volatile SingularAttribute<Customerroomrate, Hotel> hotelId;
    public static volatile SingularAttribute<Customerroomrate, Date> startdate;
    public static volatile SingularAttribute<Customerroomrate, Date> dateUpdated;
    public static volatile SingularAttribute<Customerroomrate, Date> enddate;
    public static volatile SingularAttribute<Customerroomrate, Date> dateCreated;
    public static volatile SingularAttribute<Customerroomrate, Integer> roomrateguest;
    public static volatile SingularAttribute<Customerroomrate, String> createdBy;
    public static volatile SingularAttribute<Customerroomrate, String> customerid;

}