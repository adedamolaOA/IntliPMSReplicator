package com.intlipms.entities;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-07-31T18:01:15")
@StaticMetamodel(UserPermissions.class)
public class UserPermissions_ { 

    public static volatile SingularAttribute<UserPermissions, Integer> userPermId;
    public static volatile SingularAttribute<UserPermissions, String> updatedBy;
    public static volatile SingularAttribute<UserPermissions, Boolean> mAdd;
    public static volatile SingularAttribute<UserPermissions, String> module;
    public static volatile SingularAttribute<UserPermissions, Boolean> mDelete;
    public static volatile SingularAttribute<UserPermissions, Boolean> replicationStatus;
    public static volatile SingularAttribute<UserPermissions, Date> dateUpdated;
    public static volatile SingularAttribute<UserPermissions, String> mForm;
    public static volatile SingularAttribute<UserPermissions, Date> dateCreated;
    public static volatile SingularAttribute<UserPermissions, String> createdBy;
    public static volatile SingularAttribute<UserPermissions, Boolean> mView;
    public static volatile SingularAttribute<UserPermissions, Boolean> mUpdate;
    public static volatile SingularAttribute<UserPermissions, String> permName;

}