package com.everyoungmall.mall_ware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wms_ware_sku", schema = "mall_wms")
public class WareSkuEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "ware_id")
  private Long wareId;

  @Column(name = "stock")
  private Integer stock;

  @Column(name = "sku_name", length = 200)
  private String skuName;

  @Column(name = "stock_locked")
  private Integer stockLocked;

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

  public Long getWareId() {
    return wareId;
  }

  public void setWareId(Long wareId) {
    this.wareId = wareId;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public Integer getStockLocked() {
    return stockLocked;
  }

  public void setStockLocked(Integer stockLocked) {
    this.stockLocked = stockLocked;
  }

}