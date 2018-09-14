package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(UserMaster.class)
public class UserMaster_ { 

    public static volatile SingularAttribute<UserMaster, String> password;
    public static volatile SingularAttribute<UserMaster, Integer> userPermId;
    public static volatile SingularAttribute<UserMaster, Date> dateCreated;
    public static volatile SingularAttribute<UserMaster, String> updatedBy;
    public static volatile SingularAttribute<UserMaster, String> createdBy;
    public static volatile SingularAttribute<UserMaster, Integer> employeeId;
    public static volatile SingularAttribute<UserMaster, Boolean> replicationStatus;
    public static volatile SingularAttribute<UserMaster, Integer> id;
    public static volatile SingularAttribute<UserMaster, String> username;
    public static volatile SingularAttribute<UserMaster, Date> dateUpdated;

}