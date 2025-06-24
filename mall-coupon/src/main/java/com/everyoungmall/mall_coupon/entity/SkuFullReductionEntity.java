package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_sku_full_reduction", schema = "mall_sms")
public class SkuFullReductionEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "full_price", precision = 18, scale = 4)
  private BigDecimal fullPrice;

  @Column(name = "reduce_price", precision = 18, scale = 4)
  private BigDecimal reducePrice;

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

  public BigDecimal getFullPrice() {
    return fullPrice;
  }

  public void setFullPrice(BigDecimal fullPrice) {
    this.fullPrice = fullPrice;
  }

  public BigDecimal getReducePrice() {
    return reducePrice;
  }

  public void setReducePrice(BigDecimal reducePrice) {
    this.reducePrice = reducePrice;
  }

  public Boolean getAddOther() {
    return addOther;
  }

  public void setAddOther(Boolean addOther) {
    this.addOther = addOther;
  }

}