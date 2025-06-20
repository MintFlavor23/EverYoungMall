package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_spu_images", schema = "mall_pms")
public class PmsSpuImage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "img_name", length = 200)
  private String imgName;

  @Column(name = "img_url")
  private String imgUrl;

  @Column(name = "img_sort")
  private Integer imgSort;

  @Column(name = "default_img")
  private Byte defaultImg;

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

  public String getImgName() {
    return imgName;
  }

  public void setImgName(String imgName) {
    this.imgName = imgName;
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

  public Byte getDefaultImg() {
    return defaultImg;
  }

  public void setDefaultImg(Byte defaultImg) {
    this.defaultImg = defaultImg;
  }

}