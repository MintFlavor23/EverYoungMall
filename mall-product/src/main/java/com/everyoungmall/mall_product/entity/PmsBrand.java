package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_brand", schema = "mall_pms")
public class PmsBrand {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "brand_id", nullable = false)
  private Long id;

  @Column(name = "name", length = 50)
  private String name;

  @Column(name = "logo", length = 2000)
  private String logo;

  @Lob
  @Column(name = "descript")
  private String descript;

  @Column(name = "show_status")
  private Byte showStatus;

  @Column(name = "first_letter")
  private Character firstLetter;

  @Column(name = "sort")
  private Integer sort;

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

  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public String getDescript() {
    return descript;
  }

  public void setDescript(String descript) {
    this.descript = descript;
  }

  public Byte getShowStatus() {
    return showStatus;
  }

  public void setShowStatus(Byte showStatus) {
    this.showStatus = showStatus;
  }

  public Character getFirstLetter() {
    return firstLetter;
  }

  public void setFirstLetter(Character firstLetter) {
    this.firstLetter = firstLetter;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

}