package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(CustomerAudit.class)
public class CustomerAudit_ { 

    public static volatile SingularAttribute<CustomerAudit, Integer> auditId;
    public static volatile SingularAttribute<CustomerAudit, String> updatedBy;
    public static volatile SingularAttribute<CustomerAudit, Boolean> replicationStatus;
    public static volatile SingularAttribute<CustomerAudit, String> hotelId;
    public static volatile SingularAttribute<CustomerAudit, Long> previousTotalSales;
    public static volatile SingularAttribute<CustomerAudit, Date> dateUpdated;
    public static volatile SingularAttribute<CustomerAudit, Long> totalDebitPending;
    public static volatile SingularAttribute<CustomerAudit, Date> dateCreated;
    public static volatile SingularAttribute<CustomerAudit, String> auditedBy;
    public static volatile SingularAttribute<CustomerAudit, String> createdBy;
    public static volatile SingularAttribute<CustomerAudit, Long> totalCreditPending;
    public static volatile SingularAttribute<CustomerAudit, Date> auditDate;
    public static volatile SingularAttribute<CustomerAudit, Integer> customerCount;

}