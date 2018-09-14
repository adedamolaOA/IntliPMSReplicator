package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(CompanyCustomer.class)
public class CompanyCustomer_ { 

    public static volatile SingularAttribute<CompanyCustomer, String> updatedBy;
    public static volatile SingularAttribute<CompanyCustomer, String> contacttype;
    public static volatile SingularAttribute<CompanyCustomer, Boolean> contactisReport;
    public static volatile SingularAttribute<CompanyCustomer, Boolean> contactisBooking;
    public static volatile SingularAttribute<CompanyCustomer, String> rightsLevel;
    public static volatile SingularAttribute<CompanyCustomer, String> departmentid;
    public static volatile SingularAttribute<CompanyCustomer, String> employeeId;
    public static volatile SingularAttribute<CompanyCustomer, Boolean> replicationStatus;
    public static volatile SingularAttribute<CompanyCustomer, Hotel> hotelId;
    public static volatile SingularAttribute<CompanyCustomer, Date> dateUpdated;
    public static volatile SingularAttribute<CompanyCustomer, Boolean> contactisPayment;
    public static volatile SingularAttribute<CompanyCustomer, String> companyid;
    public static volatile SingularAttribute<CompanyCustomer, Date> dateCreated;
    public static volatile SingularAttribute<CompanyCustomer, Integer> compCustId;
    public static volatile SingularAttribute<CompanyCustomer, String> createdBy;
    public static volatile SingularAttribute<CompanyCustomer, Boolean> contactisFandB;
    public static volatile SingularAttribute<CompanyCustomer, String> customerid;

}