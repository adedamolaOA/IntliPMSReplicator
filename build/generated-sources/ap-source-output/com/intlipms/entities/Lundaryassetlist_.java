package com.intlipms.entities;

import com.intlipms.entities.Lundaryasset;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Lundaryassetlist.class)
public class Lundaryassetlist_ { 

    public static volatile SingularAttribute<Lundaryassetlist, Date> dateCreated;
    public static volatile SingularAttribute<Lundaryassetlist, String> updatedBy;
    public static volatile SingularAttribute<Lundaryassetlist, String> createdBy;
    public static volatile SingularAttribute<Lundaryassetlist, Lundaryasset> assetid;
    public static volatile SingularAttribute<Lundaryassetlist, Integer> assetQty;
    public static volatile SingularAttribute<Lundaryassetlist, Date> recordDate;
    public static volatile SingularAttribute<Lundaryassetlist, Boolean> replicationStatus;
    public static volatile SingularAttribute<Lundaryassetlist, Integer> assetlistid;
    public static volatile SingularAttribute<Lundaryassetlist, Date> dateUpdated;

}