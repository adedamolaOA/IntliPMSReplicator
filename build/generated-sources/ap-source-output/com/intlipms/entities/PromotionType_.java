package com.intlipms.entities;

import com.intlipms.entities.Hotel;
import com.intlipms.entities.RoomType;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-26T11:52:38")
@StaticMetamodel(PromotionType.class)
public class PromotionType_ { 

    public static volatile SingularAttribute<PromotionType, BigDecimal> amountdiscount;
    public static volatile SingularAttribute<PromotionType, String> promotionname;
    public static volatile SingularAttribute<PromotionType, RoomType> roomtypeid;
    public static volatile SingularAttribute<PromotionType, Hotel> hotelId;
    public static volatile SingularAttribute<PromotionType, Date> startdate;
    public static volatile SingularAttribute<PromotionType, Integer> promotionId;
    public static volatile SingularAttribute<PromotionType, Integer> isWeekdays;
    public static volatile SingularAttribute<PromotionType, String> promotiondesc;
    public static volatile SingularAttribute<PromotionType, Date> enddate;
    public static volatile SingularAttribute<PromotionType, Integer> isWeekends;
    public static volatile SingularAttribute<PromotionType, Integer> isBlackoutdates;
    public static volatile SingularAttribute<PromotionType, Integer> percentdiscount;
    public static volatile SingularAttribute<PromotionType, Integer> status;

}