package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_attr_attrgroup_relation", schema = "mall_pms")
public class PmsAttrAttrgroupRelation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "attr_id")
  private Long attrId;

  @Column(name = "attr_group_id")
  private Long attrGroupId;

  @Column(name = "attr_sort")
  private Integer attrSort;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAttrId() {
    return attrId;
  }

  public void setAttrId(Long attrId) {
    this.attrId = attrId;
  }

  public Long getAttrGroupId() {
    return attrGroupId;
  }

  public void setAttrGroupId(Long attrGroupId) {
    this.attrGroupId = attrGroupId;
  }

  public Integer getAttrSort() {
    return attrSort;
  }

  public void setAttrSort(Integer attrSort) {
    this.attrSort = attrSort;
  }

}