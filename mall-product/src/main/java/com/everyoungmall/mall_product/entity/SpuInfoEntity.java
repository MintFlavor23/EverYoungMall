package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "pms_spu_info", schema = "mall_pms")
public class SpuInfoEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "spu_name", length = 200)
  private String spuName;

  @Column(name = "spu_description", length = 1000)
  private String spuDescription;

  @Column(name = "catalog_id")
  private Long catalogId;

  @Column(name = "brand_id")
  private Long brandId;

  @Column(name = "weight", precision = 18, scale = 4)
  private BigDecimal weight;

  @Column(name = "publish_status")
  private Byte publishStatus;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "update_time")
  private Instant updateTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSpuName() {
    return spuName;
  }

  public void setSpuName(String spuName) {
    this.spuName = spuName;
  }

  public String getSpuDescription() {
    return spuDescription;
  }

  public void setSpuDescription(String spuDescription) {
    this.spuDescription = spuDescription;
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

  public BigDecimal getWeight() {
    return weight;
  }

  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }

  public Byte getPublishStatus() {
    return publishStatus;
  }

  public void setPublishStatus(Byte publishStatus) {
    this.publishStatus = publishStatus;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Instant getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Instant updateTime) {
    this.updateTime = updateTime;
  }

}