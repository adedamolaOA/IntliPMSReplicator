package com.intlipms.entities;

import com.intlipms.entities.PropertyAreas;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Propertyschmaint.class)
public class Propertyschmaint_ { 

    public static volatile SingularAttribute<Propertyschmaint, Integer> maintsch;
    public static volatile SingularAttribute<Propertyschmaint, String> maintitem;
    public static volatile SingularAttribute<Propertyschmaint, Date> dateCreated;
    public static volatile SingularAttribute<Propertyschmaint, String> updatedBy;
    public static volatile SingularAttribute<Propertyschmaint, PropertyAreas> areaid;
    public static volatile SingularAttribute<Propertyschmaint, String> createdBy;
    public static volatile SingularAttribute<Propertyschmaint, String> maintdesc;
    public static volatile SingularAttribute<Propertyschmaint, Integer> schmaintID;
    public static volatile SingularAttribute<Propertyschmaint, Boolean> replicationStatus;
    public static volatile SingularAttribute<Propertyschmaint, Date> dateUpdated;

}