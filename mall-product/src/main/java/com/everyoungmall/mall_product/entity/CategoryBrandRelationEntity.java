package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_category_brand_relation", schema = "mall_pms")
public class CategoryBrandRelationEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "brand_id")
  private Long brandId;

  @Column(name = "catelog_id")
  private Long catelogId;

  @Column(name = "brand_name")
  private String brandName;

  @Column(name = "catelog_name")
  private String catelogName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public Long getCatelogId() {
    return catelogId;
  }

  public void setCatelogId(Long catelogId) {
    this.catelogId = catelogId;
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getCatelogName() {
    return catelogName;
  }

  public void setCatelogName(String catelogName) {
    this.catelogName = catelogName;
  }

}