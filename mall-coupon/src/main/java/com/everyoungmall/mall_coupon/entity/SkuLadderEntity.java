package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "sms_sku_ladder", schema = "mall_sms")
public class SkuLadderEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "full_count")
  private Integer fullCount;

  @Column(name = "discount", precision = 4, scale = 2)
  private BigDecimal discount;

  @Column(name = "price", precision = 18, scale = 4)
  private BigDecimal price;

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

  public Integer getFullCount() {
    return fullCount;
  }

  public void setFullCount(Integer fullCount) {
    this.fullCount = fullCount;
  }

  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Boolean getAddOther() {
    return addOther;
  }

  public void setAddOther(Boolean addOther) {
    this.addOther = addOther;
  }

}