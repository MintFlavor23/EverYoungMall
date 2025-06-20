package com.everyoungmall.mall_order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "oms_order_operate_history", schema = "mall_oms")
public class OmsOrderOperateHistory {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "order_id")
  private Long orderId;

  @Column(name = "operate_man", length = 100)
  private String operateMan;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "order_status")
  private Byte orderStatus;

  @Column(name = "note", length = 500)
  private String note;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public String getOperateMan() {
    return operateMan;
  }

  public void setOperateMan(String operateMan) {
    this.operateMan = operateMan;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Byte getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(Byte orderStatus) {
    this.orderStatus = orderStatus;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}