package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sms_home_subject_spu", schema = "mall_sms")
public class HomeSubjectSpuEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 200)
  private String name;

  @Column(name = "subject_id")
  private Long subjectId;

  @Column(name = "spu_id")
  private Long spuId;

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

  public Long getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(Long subjectId) {
    this.subjectId = subjectId;
  }

  public Long getSpuId() {
    return spuId;
  }

  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

}