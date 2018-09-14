package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import com.intlipms.entities.Roomcleandtlslog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Rooms.class)
public class Rooms_ { 

    public static volatile SingularAttribute<Rooms, String> updatedBy;
    public static volatile SingularAttribute<Rooms, String> roomsize;
    public static volatile CollectionAttribute<Rooms, Roomcleandtlslog> roomcleandtlslogCollection;
    public static volatile SingularAttribute<Rooms, Integer> roomnumber;
    public static volatile SingularAttribute<Rooms, String> roombedsize;
    public static volatile SingularAttribute<Rooms, String> roomtypeid;
    public static volatile SingularAttribute<Rooms, String> roomdesextra;
    public static volatile SingularAttribute<Rooms, Boolean> replicationStatus;
    public static volatile SingularAttribute<Rooms, Integer> roomHKStatus;
    public static volatile SingularAttribute<Rooms, Hotel> hotelId;
    public static volatile SingularAttribute<Rooms, Integer> roomid;
    public static volatile SingularAttribute<Rooms, String> buildingid;
    public static volatile SingularAttribute<Rooms, Date> dateUpdated;
    public static volatile SingularAttribute<Rooms, String> roomname;
    public static volatile SingularAttribute<Rooms, Integer> roompromrate;
    public static volatile SingularAttribute<Rooms, Date> dateCreated;
    public static volatile SingularAttribute<Rooms, String> roomnotes;
    public static volatile SingularAttribute<Rooms, Integer> roomstatus;
    public static volatile SingularAttribute<Rooms, String> createdBy;
    public static volatile SingularAttribute<Rooms, Integer> roombaserate;

}