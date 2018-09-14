package com.intlipms.entities;

import com.intlipms.entities.Employeemaster;
import com.intlipms.entities.Roomcleanlog;
import com.intlipms.entities.Rooms;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Roomcleandtlslog.class)
public class Roomcleandtlslog_ { 

    public static volatile SingularAttribute<Roomcleandtlslog, String> cleantime;
    public static volatile SingularAttribute<Roomcleandtlslog, String> updatedBy;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleantypeid;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanisTissueqty;
    public static volatile SingularAttribute<Roomcleandtlslog, Employeemaster> cleanhousekeeper;
    public static volatile SingularAttribute<Roomcleandtlslog, Boolean> replicationStatus;
    public static volatile SingularAttribute<Roomcleandtlslog, Rooms> roomid;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanisBedsheetqyt;
    public static volatile SingularAttribute<Roomcleandtlslog, Date> dateUpdated;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanisTowelqty;
    public static volatile SingularAttribute<Roomcleandtlslog, Date> dateCreated;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanid;
    public static volatile SingularAttribute<Roomcleandtlslog, String> createdBy;
    public static volatile SingularAttribute<Roomcleandtlslog, Employeemaster> cleansupervisor;
    public static volatile SingularAttribute<Roomcleandtlslog, String> cleandate;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanisWaterqty;
    public static volatile SingularAttribute<Roomcleandtlslog, Roomcleanlog> cleanGroupId;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanisCupqty;
    public static volatile SingularAttribute<Roomcleandtlslog, Integer> cleanroomstatus;

}