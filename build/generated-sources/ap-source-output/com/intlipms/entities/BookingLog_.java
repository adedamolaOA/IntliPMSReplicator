package com.intlipms.entities;

import com.intlipms.entities.BookingDtlsLog;
import com.intlipms.entities.Checkinlog;
import com.intlipms.entities.Customer;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(BookingLog.class)
public class BookingLog_ { 

    public static volatile SingularAttribute<BookingLog, Customer> relationshipcustid;
    public static volatile SingularAttribute<BookingLog, String> updatedBy;
    public static volatile SingularAttribute<BookingLog, Customer> customerpayid;
    public static volatile SingularAttribute<BookingLog, Integer> customersource;
    public static volatile SingularAttribute<BookingLog, BigDecimal> depositamount;
    public static volatile SingularAttribute<BookingLog, Boolean> replicationStatus;
    public static volatile SingularAttribute<BookingLog, Integer> bookingid;
    public static volatile SingularAttribute<BookingLog, Date> dateUpdated;
    public static volatile SingularAttribute<BookingLog, BigDecimal> totalAmount;
    public static volatile SingularAttribute<BookingLog, Date> dateCreated;
    public static volatile SingularAttribute<BookingLog, String> createdBy;
    public static volatile SingularAttribute<BookingLog, Integer> roomnumrooms;
    public static volatile SingularAttribute<BookingLog, Customer> customerid;
    public static volatile SingularAttribute<BookingLog, Integer> paytypeid;
    public static volatile CollectionAttribute<BookingLog, Checkinlog> checkinlogCollection;
    public static volatile CollectionAttribute<BookingLog, BookingDtlsLog> bookingDtlsLogCollection;

}