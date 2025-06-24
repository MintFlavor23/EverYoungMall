package com.everyoungmall.mall_ware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "wms_purchase_detail", schema = "mall_wms")
public class PurchaseDetailEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "purchase_id")
  private Long purchaseId;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "sku_num")
  private Integer skuNum;

  @Column(name = "sku_price", precision = 18, scale = 4)
  private BigDecimal skuPrice;

  @Column(name = "ware_id")
  private Long wareId;

  @Column(name = "status")
  private Integer status;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getPurchaseId() {
    return purchaseId;
  }

  public void setPurchaseId(Long purchaseId) {
    this.purchaseId = purchaseId;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public Integer getSkuNum() {
    return skuNum;
  }

  public void setSkuNum(Integer skuNum) {
    this.skuNum = skuNum;
  }

  public BigDecimal getSkuPrice() {
    return skuPrice;
  }

  public void setSkuPrice(BigDecimal skuPrice) {
    this.skuPrice = skuPrice;
  }

  public Long getWareId() {
    return wareId;
  }

  public void setWareId(Long wareId) {
    this.wareId = wareId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}