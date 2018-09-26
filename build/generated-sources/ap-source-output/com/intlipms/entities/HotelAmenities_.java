package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:40")
@StaticMetamodel(HotelAmenities.class)
public class HotelAmenities_ { 

    public static volatile SingularAttribute<HotelAmenities, Integer> amenityid;
    public static volatile SingularAttribute<HotelAmenities, Date> dateCreated;
    public static volatile SingularAttribute<HotelAmenities, String> updatedBy;
    public static volatile SingularAttribute<HotelAmenities, String> createdBy;
    public static volatile SingularAttribute<HotelAmenities, String> aminityDesc;
    public static volatile SingularAttribute<HotelAmenities, Boolean> replicationStatus;
    public static volatile SingularAttribute<HotelAmenities, Hotel> hotelId;
    public static volatile SingularAttribute<HotelAmenities, Date> dateUpdated;
    public static volatile SingularAttribute<HotelAmenities, Boolean> isKeyArea;

}