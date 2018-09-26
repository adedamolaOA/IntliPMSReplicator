package com.intlipms.entities;

import com.intlipms.entities.BookingLog;
import com.intlipms.entities.Customer;
import com.intlipms.entities.RoomType;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:39")
@StaticMetamodel(Checkinlog.class)
public class Checkinlog_ { 

    public static volatile SingularAttribute<Checkinlog, Integer> checkintype;
    public static volatile SingularAttribute<Checkinlog, String> checkoutdate;
    public static volatile SingularAttribute<Checkinlog, BigDecimal> amountBilled;
    public static volatile SingularAttribute<Checkinlog, String> updatedBy;
    public static volatile SingularAttribute<Checkinlog, String> checkindate;
    public static volatile SingularAttribute<Checkinlog, Customer> customerpayid;
    public static volatile SingularAttribute<Checkinlog, BigDecimal> amountCollected;
    public static volatile SingularAttribute<Checkinlog, RoomType> roomtypeid;
    public static volatile SingularAttribute<Checkinlog, Boolean> replicationStatus;
    public static volatile SingularAttribute<Checkinlog, String> checkouttime;
    public static volatile SingularAttribute<Checkinlog, BookingLog> bookingid;
    public static volatile SingularAttribute<Checkinlog, Date> dateUpdated;
    public static volatile SingularAttribute<Checkinlog, Integer> checkinlog;
    public static volatile SingularAttribute<Checkinlog, Customer> customercheckinid;
    public static volatile SingularAttribute<Checkinlog, Date> dateCreated;
    public static volatile SingularAttribute<Checkinlog, String> createdBy;
    public static volatile SingularAttribute<Checkinlog, String> checkintime;

}