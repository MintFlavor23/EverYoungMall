package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_seckill_sku_relation", schema = "mall_sms")
public class SeckillSkuRelationEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "promotion_id")
  private Long promotionId;

  @Column(name = "promotion_session_id")
  private Long promotionSessionId;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "seckill_price", precision = 10)
  private BigDecimal seckillPrice;

  @Column(name = "seckill_count", precision = 10)
  private BigDecimal seckillCount;

  @Column(name = "seckill_limit", precision = 10)
  private BigDecimal seckillLimit;

  @Column(name = "seckill_sort")
  private Integer seckillSort;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }

  public Long getPromotionSessionId() {
    return promotionSessionId;
  }

  public void setPromotionSessionId(Long promotionSessionId) {
    this.promotionSessionId = promotionSessionId;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public BigDecimal getSeckillPrice() {
    return seckillPrice;
  }

  public void setSeckillPrice(BigDecimal seckillPrice) {
    this.seckillPrice = seckillPrice;
  }

  public BigDecimal getSeckillCount() {
    return seckillCount;
  }

  public void setSeckillCount(BigDecimal seckillCount) {
    this.seckillCount = seckillCount;
  }

  public BigDecimal getSeckillLimit() {
    return seckillLimit;
  }

  public void setSeckillLimit(BigDecimal seckillLimit) {
    this.seckillLimit = seckillLimit;
  }

  public Integer getSeckillSort() {
    return seckillSort;
  }

  public void setSeckillSort(Integer seckillSort) {
    this.seckillSort = seckillSort;
  }

}