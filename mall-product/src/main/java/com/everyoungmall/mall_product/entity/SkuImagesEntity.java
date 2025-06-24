package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_sku_images", schema = "mall_pms")
public class SkuImagesEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "img_url")
  private String imgUrl;

  @Column(name = "img_sort")
  private Integer imgSort;

  @Column(name = "default_img")
  private Integer defaultImg;

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

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Integer getImgSort() {
    return imgSort;
  }

  public void setImgSort(Integer imgSort) {
    this.imgSort = imgSort;
  }

  public Integer getDefaultImg() {
    return defaultImg;
  }

  public void setDefaultImg(Integer defaultImg) {
    this.defaultImg = defaultImg;
  }

}