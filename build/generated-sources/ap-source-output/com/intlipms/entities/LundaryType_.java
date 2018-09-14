package com.intlipms.entities;

import com.intlipms.entities.LundaryInboundlog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(LundaryType.class)
public class LundaryType_ { 

    public static volatile CollectionAttribute<LundaryType, LundaryInboundlog> lundaryInboundlogCollection;
    public static volatile SingularAttribute<LundaryType, Integer> lundrytypeid;
    public static volatile SingularAttribute<LundaryType, String> updatedBy;
    public static volatile SingularAttribute<LundaryType, String> lundrytypedesc;
    public static volatile SingularAttribute<LundaryType, Date> dateCreated;
    public static volatile SingularAttribute<LundaryType, String> createdBy;
    public static volatile SingularAttribute<LundaryType, Integer> expressrate;
    public static volatile SingularAttribute<LundaryType, Boolean> replicationStatus;
    public static volatile SingularAttribute<LundaryType, byte[]> expectedWait;
    public static volatile SingularAttribute<LundaryType, String> laundrycatid;
    public static volatile SingularAttribute<LundaryType, Date> dateUpdated;
    public static volatile SingularAttribute<LundaryType, Integer> rateperitem;

}