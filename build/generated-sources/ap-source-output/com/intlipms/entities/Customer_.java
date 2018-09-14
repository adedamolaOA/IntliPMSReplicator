package com.intlipms.entities;

import com.intlipms.entities.BookingLog;
import com.intlipms.entities.Checkinlog;
import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Customer.class)
public class Customer_ { 

    public static volatile SingularAttribute<Customer, String> custothername;
    public static volatile SingularAttribute<Customer, String> custsex;
    public static volatile CollectionAttribute<Customer, BookingLog> bookingLogCollection;
    public static volatile SingularAttribute<Customer, String> custreligion;
    public static volatile SingularAttribute<Customer, Date> dateCreated;
    public static volatile SingularAttribute<Customer, String> maxCredit;
    public static volatile CollectionAttribute<Customer, BookingLog> bookingLogCollection2;
    public static volatile SingularAttribute<Customer, String> custstate;
    public static volatile CollectionAttribute<Customer, BookingLog> bookingLogCollection1;
    public static volatile SingularAttribute<Customer, Boolean> custphone1whatsapp;
    public static volatile CollectionAttribute<Customer, Checkinlog> checkinlogCollection;
    public static volatile SingularAttribute<Customer, String> custDOB;
    public static volatile SingularAttribute<Customer, String> custaddress;
    public static volatile SingularAttribute<Customer, String> custfirstName;
    public static volatile SingularAttribute<Customer, String> updatedBy;
    public static volatile SingularAttribute<Customer, String> custphone2;
    public static volatile SingularAttribute<Customer, String> custphone1;
    public static volatile SingularAttribute<Customer, String> custcity;
    public static volatile SingularAttribute<Customer, String> custemail;
    public static volatile SingularAttribute<Customer, String> employeeId;
    public static volatile SingularAttribute<Customer, Boolean> replicationStatus;
    public static volatile SingularAttribute<Customer, Hotel> hotelId;
    public static volatile SingularAttribute<Customer, String> depertmentid;
    public static volatile SingularAttribute<Customer, Date> dateUpdated;
    public static volatile SingularAttribute<Customer, String> custlistedname;
    public static volatile SingularAttribute<Customer, String> custlastname;
    public static volatile CollectionAttribute<Customer, Checkinlog> checkinlogCollection1;
    public static volatile SingularAttribute<Customer, String> createdBy;
    public static volatile SingularAttribute<Customer, Integer> customerid;
    public static volatile SingularAttribute<Customer, Boolean> custphone1sms;
    public static volatile SingularAttribute<Customer, Boolean> custphone1call;
    public static volatile SingularAttribute<Customer, String> custcountry;
    public static volatile SingularAttribute<Customer, Integer> vIPstatusid;

}