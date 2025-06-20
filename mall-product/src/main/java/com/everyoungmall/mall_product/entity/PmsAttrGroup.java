package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_attr_group", schema = "mall_pms")
public class PmsAttrGroup {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "attr_group_id", nullable = false)
  private Long id;

  @Column(name = "attr_group_name", length = 20)
  private String attrGroupName;

  @Column(name = "sort")
  private Integer sort;

  @Column(name = "descript")
  private String descript;

  @Column(name = "icon")
  private String icon;

  @Column(name = "catelog_id")
  private Long catelogId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAttrGroupName() {
    return attrGroupName;
  }

  public void setAttrGroupName(String attrGroupName) {
    this.attrGroupName = attrGroupName;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getDescript() {
    return descript;
  }

  public void setDescript(String descript) {
    this.descript = descript;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Long getCatelogId() {
    return catelogId;
  }

  public void setCatelogId(Long catelogId) {
    this.catelogId = catelogId;
  }

}