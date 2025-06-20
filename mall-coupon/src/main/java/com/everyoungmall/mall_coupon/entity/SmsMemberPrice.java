package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_member_price", schema = "mall_sms")
public class SmsMemberPrice {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "member_level_id")
  private Long memberLevelId;

  @Column(name = "member_level_name", length = 100)
  private String memberLevelName;

  @Column(name = "member_price", precision = 18, scale = 4)
  private BigDecimal memberPrice;

  @Column(name = "add_other")
  private Boolean addOther;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public Long getMemberLevelId() {
    return memberLevelId;
  }

  public void setMemberLevelId(Long memberLevelId) {
    this.memberLevelId = memberLevelId;
  }

  public String getMemberLevelName() {
    return memberLevelName;
  }

  public void setMemberLevelName(String memberLevelName) {
    this.memberLevelName = memberLevelName;
  }

  public BigDecimal getMemberPrice() {
    return memberPrice;
  }

  public void setMemberPrice(BigDecimal memberPrice) {
    this.memberPrice = memberPrice;
  }

  public Boolean getAddOther() {
    return addOther;
  }

  public void setAddOther(Boolean addOther) {
    this.addOther = addOther;
  }

}