package com.intlipms.entities;

import com.intlipms.entities.Employeemaster;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(Propertyschmaintlog.class)
public class Propertyschmaintlog_ { 

    public static volatile SingularAttribute<Propertyschmaintlog, Date> dateCreated;
    public static volatile SingularAttribute<Propertyschmaintlog, String> updatedBy;
    public static volatile SingularAttribute<Propertyschmaintlog, String> createdBy;
    public static volatile SingularAttribute<Propertyschmaintlog, String> datenextmaint;
    public static volatile SingularAttribute<Propertyschmaintlog, Integer> schmaintID;
    public static volatile SingularAttribute<Propertyschmaintlog, String> datemaint;
    public static volatile SingularAttribute<Propertyschmaintlog, Boolean> replicationStatus;
    public static volatile SingularAttribute<Propertyschmaintlog, Employeemaster> maintby;
    public static volatile SingularAttribute<Propertyschmaintlog, Employeemaster> verifiedby;
    public static volatile SingularAttribute<Propertyschmaintlog, Date> dateUpdated;

}