package com.intlipms.entities;

import com.intlipms.entities.EmployeeDepartment;
import com.intlipms.entities.Hotel;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:40")
@StaticMetamodel(Inventoryaudit.class)
public class Inventoryaudit_ { 

    public static volatile SingularAttribute<Inventoryaudit, Integer> auditId;
    public static volatile SingularAttribute<Inventoryaudit, Date> dateCreated;
    public static volatile SingularAttribute<Inventoryaudit, Integer> updatedBy;
    public static volatile SingularAttribute<Inventoryaudit, byte[]> effectivetime;
    public static volatile SingularAttribute<Inventoryaudit, Integer> createdBy;
    public static volatile SingularAttribute<Inventoryaudit, EmployeeDepartment> departid;
    public static volatile SingularAttribute<Inventoryaudit, Boolean> replicationStatus;
    public static volatile SingularAttribute<Inventoryaudit, Hotel> hotelId;
    public static volatile SingularAttribute<Inventoryaudit, String> effectivedate;
    public static volatile SingularAttribute<Inventoryaudit, Integer> inventlocationid;
    public static volatile SingularAttribute<Inventoryaudit, Date> dateUpdated;

}