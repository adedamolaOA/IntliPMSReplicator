/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.intlipms.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Adedamola
 */
@Entity
@Table(name = "Promotion_Type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PromotionType.findAll", query = "SELECT p FROM PromotionType p")
    , @NamedQuery(name = "PromotionType.findByPromotionId", query = "SELECT p FROM PromotionType p WHERE p.promotionId = :promotionId")
    , @NamedQuery(name = "PromotionType.findByPromotionname", query = "SELECT p FROM PromotionType p WHERE p.promotionname = :promotionname")
    , @NamedQuery(name = "PromotionType.findByStartdate", query = "SELECT p FROM PromotionType p WHERE p.startdate = :startdate")
    , @NamedQuery(name = "PromotionType.findByEnddate", query = "SELECT p FROM PromotionType p WHERE p.enddate = :enddate")
    , @NamedQuery(name = "PromotionType.findByStatus", query = "SELECT p FROM PromotionType p WHERE p.status = :status")
    , @NamedQuery(name = "PromotionType.findByPercentdiscount", query = "SELECT p FROM PromotionType p WHERE p.percentdiscount = :percentdiscount")
    , @NamedQuery(name = "PromotionType.findByAmountdiscount", query = "SELECT p FROM PromotionType p WHERE p.amountdiscount = :amountdiscount")
    , @NamedQuery(name = "PromotionType.findByIsWeekdays", query = "SELECT p FROM PromotionType p WHERE p.isWeekdays = :isWeekdays")
    , @NamedQuery(name = "PromotionType.findByIsWeekends", query = "SELECT p FROM PromotionType p WHERE p.isWeekends = :isWeekends")
    , @NamedQuery(name = "PromotionType.findByIsBlackoutdates", query = "SELECT p FROM PromotionType p WHERE p.isBlackoutdates = :isBlackoutdates")})
public class PromotionType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Promotion_Id")
    private Integer promotionId;
    @Basic(optional = false)
    @Column(name = "Promotion_name")
    private String promotionname;
    @Lob
    @Column(name = "Promotion_desc")
    private String promotiondesc;
    @Column(name = "Start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startdate;
    @Column(name = "End_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date enddate;
    @Column(name = "Status")
    private Integer status;
    @Column(name = "Percent_discount")
    private Integer percentdiscount;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Amount_discount")
    private BigDecimal amountdiscount;
    @Column(name = "isWeekdays")
    private Integer isWeekdays;
    @Column(name = "isWeekends")
    private Integer isWeekends;
    @Column(name = "isBlackoutdates")
    private Integer isBlackoutdates;
    @JoinColumn(name = "Hotel_Id", referencedColumnName = "Hotel_Id")
    @ManyToOne(optional = false)
    private Hotel hotelId;
    @JoinColumn(name = "Room_type_id", referencedColumnName = "Room_type_id")
    @ManyToOne
    private RoomType roomtypeid;

    public PromotionType() {
    }

    public PromotionType(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public PromotionType(Integer promotionId, String promotionname) {
        this.promotionId = promotionId;
        this.promotionname = promotionname;
    }

    public Integer getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }

    public String getPromotionname() {
        return promotionname;
    }

    public void setPromotionname(String promotionname) {
        this.promotionname = promotionname;
    }

    public String getPromotiondesc() {
        return promotiondesc;
    }

    public void setPromotiondesc(String promotiondesc) {
        this.promotiondesc = promotiondesc;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPercentdiscount() {
        return percentdiscount;
    }

    public void setPercentdiscount(Integer percentdiscount) {
        this.percentdiscount = percentdiscount;
    }

    public BigDecimal getAmountdiscount() {
        return amountdiscount;
    }

    public void setAmountdiscount(BigDecimal amountdiscount) {
        this.amountdiscount = amountdiscount;
    }

    public Integer getIsWeekdays() {
        return isWeekdays;
    }

    public void setIsWeekdays(Integer isWeekdays) {
        this.isWeekdays = isWeekdays;
    }

    public Integer getIsWeekends() {
        return isWeekends;
    }

    public void setIsWeekends(Integer isWeekends) {
        this.isWeekends = isWeekends;
    }

    public Integer getIsBlackoutdates() {
        return isBlackoutdates;
    }

    public void setIsBlackoutdates(Integer isBlackoutdates) {
        this.isBlackoutdates = isBlackoutdates;
    }

    public Hotel getHotelId() {
        return hotelId;
    }

    public void setHotelId(Hotel hotelId) {
        this.hotelId = hotelId;
    }

    public RoomType getRoomtypeid() {
        return roomtypeid;
    }

    public void setRoomtypeid(RoomType roomtypeid) {
        this.roomtypeid = roomtypeid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (promotionId != null ? promotionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PromotionType)) {
            return false;
        }
        PromotionType other = (PromotionType) object;
        if ((this.promotionId == null && other.promotionId != null) || (this.promotionId != null && !this.promotionId.equals(other.promotionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.intlipms.entities.PromotionType[ promotionId=" + promotionId + " ]";
    }
    
}
