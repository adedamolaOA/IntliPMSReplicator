package com.intlipms.entities;

import com.intlipms.entities.Employeemaster;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(RoomInsplog.class)
public class RoomInsplog_ { 

    public static volatile SingularAttribute<RoomInsplog, Integer> inspgroupid;
    public static volatile SingularAttribute<RoomInsplog, String> updatedBy;
    public static volatile SingularAttribute<RoomInsplog, Date> dateCreated;
    public static volatile SingularAttribute<RoomInsplog, String> inspGroupName;
    public static volatile SingularAttribute<RoomInsplog, Integer> numofRooms;
    public static volatile SingularAttribute<RoomInsplog, String> createdBy;
    public static volatile SingularAttribute<RoomInsplog, Boolean> replicationStatus;
    public static volatile SingularAttribute<RoomInsplog, Employeemaster> managerid;
    public static volatile SingularAttribute<RoomInsplog, Employeemaster> fDsupervisor;
    public static volatile SingularAttribute<RoomInsplog, Integer> insstatus;
    public static volatile SingularAttribute<RoomInsplog, Date> inspdate;
    public static volatile SingularAttribute<RoomInsplog, Date> dateUpdated;

}