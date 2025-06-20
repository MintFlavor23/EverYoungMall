package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_spu_bounds", schema = "mall_sms")
public class SmsSpuBound {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "grow_bounds", precision = 18, scale = 4)
  private BigDecimal growBounds;

  @Column(name = "buy_bounds", precision = 18, scale = 4)
  private BigDecimal buyBounds;

  @Column(name = "work")
  private Boolean work;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSpuId() {
    return spuId;
  }

  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }

  public BigDecimal getGrowBounds() {
    return growBounds;
  }

  public void setGrowBounds(BigDecimal growBounds) {
    this.growBounds = growBounds;
  }

  public BigDecimal getBuyBounds() {
    return buyBounds;
  }

  public void setBuyBounds(BigDecimal buyBounds) {
    this.buyBounds = buyBounds;
  }

  public Boolean getWork() {
    return work;
  }

  public void setWork(Boolean work) {
    this.work = work;
  }

}