package com.everyoungmall.mall_ware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wms_ware_order_task_detail", schema = "mall_wms")
public class WareOrderTaskDetailEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "sku_name")
  private String skuName;

  @Column(name = "sku_num")
  private Integer skuNum;

  @Column(name = "task_id")
  private Long taskId;

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

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public Integer getSkuNum() {
    return skuNum;
  }

  public void setSkuNum(Integer skuNum) {
    this.skuNum = skuNum;
  }

  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

}