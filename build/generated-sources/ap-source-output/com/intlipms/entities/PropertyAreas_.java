package com.intlipms.entities;

import com.intlipms.entities.Propertyschmaint;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:43")
@StaticMetamodel(PropertyAreas.class)
public class PropertyAreas_ { 

    public static volatile SingularAttribute<PropertyAreas, Integer> areaid;
    public static volatile SingularAttribute<PropertyAreas, Date> dateCreated;
    public static volatile SingularAttribute<PropertyAreas, String> updatedBy;
    public static volatile SingularAttribute<PropertyAreas, String> areaname;
    public static volatile SingularAttribute<PropertyAreas, String> createdBy;
    public static volatile CollectionAttribute<PropertyAreas, Propertyschmaint> propertyschmaintCollection;
    public static volatile SingularAttribute<PropertyAreas, String> areadesc;
    public static volatile SingularAttribute<PropertyAreas, Boolean> replicationStatus;
    public static volatile SingularAttribute<PropertyAreas, String> hotelId;
    public static volatile SingularAttribute<PropertyAreas, Date> dateUpdated;

}