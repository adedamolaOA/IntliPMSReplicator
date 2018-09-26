package com.intlipms.entities;

import com.intlipms.entities.BookingLog;
import com.intlipms.entities.RoomType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:41")
@StaticMetamodel(BookingDtlsLog.class)
public class BookingDtlsLog_ { 

    public static volatile SingularAttribute<BookingDtlsLog, Integer> checkintype;
    public static volatile SingularAttribute<BookingDtlsLog, String> checkoutdate;
    public static volatile SingularAttribute<BookingDtlsLog, String> updatedBy;
    public static volatile SingularAttribute<BookingDtlsLog, String> checkindate;
    public static volatile SingularAttribute<BookingDtlsLog, Integer> breakfasttypeid;
    public static volatile SingularAttribute<BookingDtlsLog, RoomType> roomtypeid;
    public static volatile SingularAttribute<BookingDtlsLog, Boolean> replicationStatus;
    public static volatile SingularAttribute<BookingDtlsLog, String> roomtyperate;
    public static volatile SingularAttribute<BookingDtlsLog, String> checkouttime;
    public static volatile SingularAttribute<BookingDtlsLog, String> promotionrate;
    public static volatile SingularAttribute<BookingDtlsLog, BookingLog> bookingid;
    public static volatile SingularAttribute<BookingDtlsLog, Date> dateUpdated;
    public static volatile SingularAttribute<BookingDtlsLog, Integer> bookingdtlsid;
    public static volatile SingularAttribute<BookingDtlsLog, Date> dateCreated;
    public static volatile SingularAttribute<BookingDtlsLog, String> createdBy;
    public static volatile SingularAttribute<BookingDtlsLog, Integer> numOfRooms;
    public static volatile SingularAttribute<BookingDtlsLog, String> checkintime;

}