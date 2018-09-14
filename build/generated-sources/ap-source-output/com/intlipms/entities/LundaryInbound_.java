package com.intlipms.entities;

import com.intlipms.entities.LundaryInboundlog;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(LundaryInbound.class)
public class LundaryInbound_ { 

    public static volatile SingularAttribute<LundaryInbound, BigDecimal> amountCharged;
    public static volatile CollectionAttribute<LundaryInbound, LundaryInboundlog> lundaryInboundlogCollection;
    public static volatile SingularAttribute<LundaryInbound, String> updatedBy;
    public static volatile SingularAttribute<LundaryInbound, Date> outboundDate;
    public static volatile SingularAttribute<LundaryInbound, Date> inbounddate;
    public static volatile SingularAttribute<LundaryInbound, Boolean> replicationStatus;
    public static volatile SingularAttribute<LundaryInbound, Date> dateUpdated;
    public static volatile SingularAttribute<LundaryInbound, byte[]> outboundtime;
    public static volatile SingularAttribute<LundaryInbound, Date> dateCreated;
    public static volatile SingularAttribute<LundaryInbound, String> createdBy;
    public static volatile SingularAttribute<LundaryInbound, Integer> inboundid;
    public static volatile SingularAttribute<LundaryInbound, Integer> totalNumItems;
    public static volatile SingularAttribute<LundaryInbound, String> custId;

}