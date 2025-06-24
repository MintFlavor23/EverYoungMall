package com.everyoungmall.mall_order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "oms_order_return_reason", schema = "mall_oms")
public class OmsOrderReturnReasonEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 200)
  private String name;

  @Column(name = "sort")
  private Integer sort;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "create_time")
  private Instant createTime;

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

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

}