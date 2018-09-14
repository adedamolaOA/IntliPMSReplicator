package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(RoomAsset.class)
public class RoomAsset_ { 

    public static volatile SingularAttribute<RoomAsset, String> expecteddayslifespan;
    public static volatile SingularAttribute<RoomAsset, String> recommededDaysService;
    public static volatile SingularAttribute<RoomAsset, Date> dateCreated;
    public static volatile SingularAttribute<RoomAsset, String> updatedBy;
    public static volatile SingularAttribute<RoomAsset, String> createdBy;
    public static volatile SingularAttribute<RoomAsset, Integer> roomassetid;
    public static volatile SingularAttribute<RoomAsset, Boolean> replicationStatus;
    public static volatile SingularAttribute<RoomAsset, String> hotelId;
    public static volatile SingularAttribute<RoomAsset, String> assetdesc;
    public static volatile SingularAttribute<RoomAsset, Date> dateUpdated;

}