package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_product_attr_value", schema = "mall_pms")
public class ProductAttrValueEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "attr_id")
  private Long attrId;

  @Column(name = "attr_name", length = 200)
  private String attrName;

  @Column(name = "attr_value", length = 200)
  private String attrValue;

  @Column(name = "attr_sort")
  private Integer attrSort;

  @Column(name = "quick_show")
  private Byte quickShow;

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

  public Byte getQuickShow() {
    return quickShow;
  }

  public void setQuickShow(Byte quickShow) {
    this.quickShow = quickShow;
  }

}