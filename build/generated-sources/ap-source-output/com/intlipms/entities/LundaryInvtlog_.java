package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(LundaryInvtlog.class)
public class LundaryInvtlog_ { 

    public static volatile SingularAttribute<LundaryInvtlog, String> itemid;
    public static volatile SingularAttribute<LundaryInvtlog, Integer> qtyPre;
    public static volatile SingularAttribute<LundaryInvtlog, String> updatedBy;
    public static volatile SingularAttribute<LundaryInvtlog, Date> dateCreated;
    public static volatile SingularAttribute<LundaryInvtlog, Integer> itemlistid;
    public static volatile SingularAttribute<LundaryInvtlog, String> createdBy;
    public static volatile SingularAttribute<LundaryInvtlog, Integer> qtyPost;
    public static volatile SingularAttribute<LundaryInvtlog, Date> recordDate;
    public static volatile SingularAttribute<LundaryInvtlog, Boolean> replicationStatus;
    public static volatile SingularAttribute<LundaryInvtlog, Integer> qtyCurrent;
    public static volatile SingularAttribute<LundaryInvtlog, String> employeeid;
    public static volatile SingularAttribute<LundaryInvtlog, Date> dateUpdated;

}