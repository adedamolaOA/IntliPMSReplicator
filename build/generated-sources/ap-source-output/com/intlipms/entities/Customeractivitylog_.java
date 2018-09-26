package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:39")
@StaticMetamodel(Customeractivitylog.class)
public class Customeractivitylog_ { 

    public static volatile SingularAttribute<Customeractivitylog, String> acttypeid;
    public static volatile SingularAttribute<Customeractivitylog, String> updatedBy;
    public static volatile SingularAttribute<Customeractivitylog, String> actdepartid;
    public static volatile SingularAttribute<Customeractivitylog, Long> actdebit;
    public static volatile SingularAttribute<Customeractivitylog, Boolean> replicationStatus;
    public static volatile SingularAttribute<Customeractivitylog, Hotel> hotelId;
    public static volatile SingularAttribute<Customeractivitylog, String> actrefinfo;
    public static volatile SingularAttribute<Customeractivitylog, Date> dateUpdated;
    public static volatile SingularAttribute<Customeractivitylog, Integer> activityid;
    public static volatile SingularAttribute<Customeractivitylog, Long> actcredit;
    public static volatile SingularAttribute<Customeractivitylog, Date> dateCreated;
    public static volatile SingularAttribute<Customeractivitylog, String> createdBy;
    public static volatile SingularAttribute<Customeractivitylog, String> customerid;
    public static volatile SingularAttribute<Customeractivitylog, Long> actBalance;

}