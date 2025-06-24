package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "pms_sku_info", schema = "mall_pms")
public class SkuInfoEntity {

  @Id
  @Column(name = "sku_id", nullable = false)
  private Long id;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "sku_name")
  private String skuName;

  @Column(name = "sku_desc", length = 2000)
  private String skuDesc;

  @Column(name = "catalog_id")
  private Long catalogId;

  @Column(name = "brand_id")
  private Long brandId;

  @Column(name = "sku_default_img")
  private String skuDefaultImg;

  @Column(name = "sku_title")
  private String skuTitle;

  @Column(name = "sku_subtitle", length = 2000)
  private String skuSubtitle;

  @Column(name = "price", precision = 18, scale = 4)
  private BigDecimal price;

  @Column(name = "sale_count")
  private Long saleCount;

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

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public String getSkuDesc() {
    return skuDesc;
  }

  public void setSkuDesc(String skuDesc) {
    this.skuDesc = skuDesc;
  }

  public Long getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }

  public Long getBrandId() {
    return brandId;
  }

  public void setBrandId(Long brandId) {
    this.brandId = brandId;
  }

  public String getSkuDefaultImg() {
    return skuDefaultImg;
  }

  public void setSkuDefaultImg(String skuDefaultImg) {
    this.skuDefaultImg = skuDefaultImg;
  }

  public String getSkuTitle() {
    return skuTitle;
  }

  public void setSkuTitle(String skuTitle) {
    this.skuTitle = skuTitle;
  }

  public String getSkuSubtitle() {
    return skuSubtitle;
  }

  public void setSkuSubtitle(String skuSubtitle) {
    this.skuSubtitle = skuSubtitle;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public Long getSaleCount() {
    return saleCount;
  }

  public void setSaleCount(Long saleCount) {
    this.saleCount = saleCount;
  }

}