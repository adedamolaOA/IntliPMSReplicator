package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(FASoftAssetAudit.class)
public class FASoftAssetAudit_ { 

    public static volatile SingularAttribute<FASoftAssetAudit, Integer> inspectionAssetQty;
    public static volatile SingularAttribute<FASoftAssetAudit, Date> dateCreated;
    public static volatile SingularAttribute<FASoftAssetAudit, String> updatedBy;
    public static volatile SingularAttribute<FASoftAssetAudit, String> createdBy;
    public static volatile SingularAttribute<FASoftAssetAudit, Boolean> replicationStatus;
    public static volatile SingularAttribute<FASoftAssetAudit, Integer> id;
    public static volatile SingularAttribute<FASoftAssetAudit, String> hotelId;
    public static volatile SingularAttribute<FASoftAssetAudit, String> fSoftAsset;
    public static volatile SingularAttribute<FASoftAssetAudit, Date> inspectionDate;
    public static volatile SingularAttribute<FASoftAssetAudit, Date> dateUpdated;

}