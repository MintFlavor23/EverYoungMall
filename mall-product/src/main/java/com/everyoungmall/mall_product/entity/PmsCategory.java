package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_category", schema = "mall_pms")
public class PmsCategory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cat_id", nullable = false)
  private Long id;

  @Column(name = "name", length = 50)
  private String name;

  @Column(name = "parent_cid")
  private Long parentCid;

  @Column(name = "cat_level")
  private Integer catLevel;

  @Column(name = "show_status")
  private Byte showStatus;

  @Column(name = "sort")
  private Integer sort;

  @Column(name = "icon")
  private String icon;

  @Column(name = "product_unit", length = 50)
  private String productUnit;

  @Column(name = "product_count")
  private Integer productCount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Long getParentCid() {
    return parentCid;
  }

  public void setParentCid(Long parentCid) {
    this.parentCid = parentCid;
  }

  public Integer getCatLevel() {
    return catLevel;
  }

  public void setCatLevel(Integer catLevel) {
    this.catLevel = catLevel;
  }

  public Byte getShowStatus() {
    return showStatus;
  }

  public void setShowStatus(Byte showStatus) {
    this.showStatus = showStatus;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getProductUnit() {
    return productUnit;
  }

  public void setProductUnit(String productUnit) {
    this.productUnit = productUnit;
  }

  public Integer getProductCount() {
    return productCount;
  }

  public void setProductCount(Integer productCount) {
    this.productCount = productCount;
  }

}