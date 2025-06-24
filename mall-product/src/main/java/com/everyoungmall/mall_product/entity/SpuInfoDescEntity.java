package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_spu_info_desc", schema = "mall_pms")
public class SpuInfoDescEntity {

  @Id
  @Column(name = "spu_id", nullable = false)
  private Long id;

  @Lob
  @Column(name = "decript")
  private String decript;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDecript() {
    return decript;
  }

  public void setDecript(String decript) {
    this.decript = decript;
  }

}