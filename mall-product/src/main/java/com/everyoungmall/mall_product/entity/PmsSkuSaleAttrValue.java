package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_sku_sale_attr_value", schema = "mall_pms")
public class PmsSkuSaleAttrValue {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "attr_id")
  private Long attrId;

  @Column(name = "attr_name", length = 200)
  private String attrName;

  @Column(name = "attr_value", length = 200)
  private String attrValue;

  @Column(name = "attr_sort")
  private Integer attrSort;

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

  public Long getAttrId() {
    return attrId;
  }

  public void setAttrId(Long attrId) {
    this.attrId = attrId;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }

  public String getAttrValue() {
    return attrValue;
  }

  public void setAttrValue(String attrValue) {
    this.attrValue = attrValue;
  }

  public Integer getAttrSort() {
    return attrSort;
  }

  public void setAttrSort(Integer attrSort) {
    this.attrSort = attrSort;
  }

}