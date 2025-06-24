package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sms_coupon_spu_category_relation", schema = "mall_sms")
public class CouponSpuCategoryRelationEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "coupon_id")
  private Long couponId;

  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "category_name", length = 64)
  private String categoryName;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCouponId() {
    return couponId;
  }

  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

}