package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:43")
@StaticMetamodel(Building.class)
public class Building_ { 

    public static volatile SingularAttribute<Building, String> buildingname;
    public static volatile SingularAttribute<Building, Integer> buildingnumfloors;
    public static volatile SingularAttribute<Building, Date> dateCreated;
    public static volatile SingularAttribute<Building, String> updatedBy;
    public static volatile SingularAttribute<Building, String> createdBy;
    public static volatile SingularAttribute<Building, String> buildingdes;
    public static volatile SingularAttribute<Building, Boolean> replicationStatus;
    public static volatile SingularAttribute<Building, Hotel> hotelId;
    public static volatile SingularAttribute<Building, Boolean> buildingStatus;
    public static volatile SingularAttribute<Building, Integer> buildingid;
    public static volatile SingularAttribute<Building, Date> dateUpdated;

}