package com.intlipms.entities;

import com.intlipms.entities.Lundaryassetlist;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:37")
@StaticMetamodel(Lundaryasset.class)
public class Lundaryasset_ { 

    public static volatile SingularAttribute<Lundaryasset, String> expecteddayslifespan;
    public static volatile SingularAttribute<Lundaryasset, Date> dateCreated;
    public static volatile SingularAttribute<Lundaryasset, String> updatedBy;
    public static volatile SingularAttribute<Lundaryasset, String> createdBy;
    public static volatile SingularAttribute<Lundaryasset, Integer> assetid;
    public static volatile SingularAttribute<Lundaryasset, String> recommendedDaysService;
    public static volatile SingularAttribute<Lundaryasset, Boolean> replicationStatus;
    public static volatile CollectionAttribute<Lundaryasset, Lundaryassetlist> lundaryassetlistCollection;
    public static volatile SingularAttribute<Lundaryasset, String> assetdesc;
    public static volatile SingularAttribute<Lundaryasset, Date> dateUpdated;

}