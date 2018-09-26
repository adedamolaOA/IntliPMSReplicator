package com.intlipms.entities;

import com.intlipms.entities.Employeemaster;
import com.intlipms.entities.Roomcleandtlslog;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:37")
@StaticMetamodel(Roomcleanlog.class)
public class Roomcleanlog_ { 

    public static volatile SingularAttribute<Roomcleanlog, Date> dateCreated;
    public static volatile SingularAttribute<Roomcleanlog, String> updatedBy;
    public static volatile SingularAttribute<Roomcleanlog, Integer> numofRooms;
    public static volatile SingularAttribute<Roomcleanlog, String> createdBy;
    public static volatile CollectionAttribute<Roomcleanlog, Roomcleandtlslog> roomcleandtlslogCollection;
    public static volatile SingularAttribute<Roomcleanlog, Date> cleandate;
    public static volatile SingularAttribute<Roomcleanlog, Date> replicationStatus;
    public static volatile SingularAttribute<Roomcleanlog, Employeemaster> fDsupervisor;
    public static volatile SingularAttribute<Roomcleanlog, Integer> cleanGroupId;
    public static volatile SingularAttribute<Roomcleanlog, Date> dateUpdated;

}