package com.intlipms.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Inventoryactivity.class)
public class Inventoryactivity_ { 

    public static volatile SingularAttribute<Inventoryactivity, Integer> acttypeid;
    public static volatile SingularAttribute<Inventoryactivity, Integer> updatedBy;
    public static volatile SingularAttribute<Inventoryactivity, Integer> actdepartid;
    public static volatile SingularAttribute<Inventoryactivity, BigDecimal> actdebit;
    public static volatile SingularAttribute<Inventoryactivity, Integer> acthotelid;
    public static volatile SingularAttribute<Inventoryactivity, Boolean> replicationStatus;
    public static volatile SingularAttribute<Inventoryactivity, String> actrefinfo;
    public static volatile SingularAttribute<Inventoryactivity, Date> dateUpdated;
    public static volatile SingularAttribute<Inventoryactivity, BigDecimal> actcredit;
    public static volatile SingularAttribute<Inventoryactivity, Date> dateCreated;
    public static volatile SingularAttribute<Inventoryactivity, Integer> createdBy;
    public static volatile SingularAttribute<Inventoryactivity, Integer> customerId;
    public static volatile SingularAttribute<Inventoryactivity, Integer> id;
    public static volatile SingularAttribute<Inventoryactivity, BigDecimal> actBalance;

}