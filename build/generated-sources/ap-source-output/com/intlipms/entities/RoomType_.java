package com.intlipms.entities;

import com.intlipms.entities.BookingDtlsLog;
import com.intlipms.entities.Checkinlog;
import com.intlipms.entities.Hotel;
import com.intlipms.entities.PromotionType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:38")
@StaticMetamodel(RoomType.class)
public class RoomType_ { 

    public static volatile SingularAttribute<RoomType, Integer> roomtypeStatus;
    public static volatile SingularAttribute<RoomType, String> updatedBy;
    public static volatile SingularAttribute<RoomType, Integer> roomtypeid;
    public static volatile SingularAttribute<RoomType, Boolean> replicationStatus;
    public static volatile SingularAttribute<RoomType, Integer> roomtyperate;
    public static volatile SingularAttribute<RoomType, Hotel> hotelId;
    public static volatile CollectionAttribute<RoomType, PromotionType> promotionTypeCollection;
    public static volatile SingularAttribute<RoomType, Date> dateUpdated;
    public static volatile SingularAttribute<RoomType, Date> dateCreated;
    public static volatile SingularAttribute<RoomType, String> createdBy;
    public static volatile SingularAttribute<RoomType, String> roomtypename;
    public static volatile CollectionAttribute<RoomType, Checkinlog> checkinlogCollection;
    public static volatile CollectionAttribute<RoomType, BookingDtlsLog> bookingDtlsLogCollection;
    public static volatile SingularAttribute<RoomType, String> roomtypedes;

}