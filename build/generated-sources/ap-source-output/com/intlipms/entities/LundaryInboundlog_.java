package com.intlipms.entities;

import com.intlipms.entities.LundaryInbound;
import com.intlipms.entities.LundaryType;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(LundaryInboundlog.class)
public class LundaryInboundlog_ { 

    public static volatile SingularAttribute<LundaryInboundlog, Integer> itemqty;
    public static volatile SingularAttribute<LundaryInboundlog, String> updatedBy;
    public static volatile SingularAttribute<LundaryInboundlog, String> outboundDate;
    public static volatile SingularAttribute<LundaryInboundlog, Boolean> replicationStatus;
    public static volatile SingularAttribute<LundaryInboundlog, String> laundrynotes;
    public static volatile SingularAttribute<LundaryInboundlog, Date> dateUpdated;
    public static volatile SingularAttribute<LundaryInboundlog, byte[]> outboundtime;
    public static volatile SingularAttribute<LundaryInboundlog, Date> dateCreated;
    public static volatile SingularAttribute<LundaryInboundlog, Integer> inboundItemId;
    public static volatile SingularAttribute<LundaryInboundlog, String> createdBy;
    public static volatile SingularAttribute<LundaryInboundlog, LundaryInbound> inboundid;
    public static volatile SingularAttribute<LundaryInboundlog, String> laundrycatid;
    public static volatile SingularAttribute<LundaryInboundlog, BigDecimal> rateperitem;
    public static volatile SingularAttribute<LundaryInboundlog, LundaryType> laundrytypeid;

}