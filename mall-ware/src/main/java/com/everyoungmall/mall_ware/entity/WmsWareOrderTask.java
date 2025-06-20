package com.everyoungmall.mall_ware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "wms_ware_order_task", schema = "mall_wms")
public class WmsWareOrderTask {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "order_id")
  private Long orderId;

  @Column(name = "order_sn")
  private String orderSn;

  @Column(name = "consignee", length = 100)
  private String consignee;

  @Column(name = "consignee_tel", length = 15)
  private String consigneeTel;

  @Column(name = "delivery_address", length = 500)
  private String deliveryAddress;

  @Column(name = "order_comment", length = 200)
  private String orderComment;

  @Column(name = "payment_way")
  private Boolean paymentWay;

  @Column(name = "task_status")
  private Byte taskStatus;

  @Column(name = "order_body")
  private String orderBody;

  @Column(name = "tracking_no", length = 30)
  private String trackingNo;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "ware_id")
  private Long wareId;

  @Column(name = "task_comment", length = 500)
  private String taskComment;

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

  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }

  public String getConsignee() {
    return consignee;
  }

  public void setConsignee(String consignee) {
    this.consignee = consignee;
  }

  public String getConsigneeTel() {
    return consigneeTel;
  }

  public void setConsigneeTel(String consigneeTel) {
    this.consigneeTel = consigneeTel;
  }

  public String getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(String deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  public String getOrderComment() {
    return orderComment;
  }

  public void setOrderComment(String orderComment) {
    this.orderComment = orderComment;
  }

  public Boolean getPaymentWay() {
    return paymentWay;
  }

  public void setPaymentWay(Boolean paymentWay) {
    this.paymentWay = paymentWay;
  }

  public Byte getTaskStatus() {
    return taskStatus;
  }

  public void setTaskStatus(Byte taskStatus) {
    this.taskStatus = taskStatus;
  }

  public String getOrderBody() {
    return orderBody;
  }

  public void setOrderBody(String orderBody) {
    this.orderBody = orderBody;
  }

  public String getTrackingNo() {
    return trackingNo;
  }

  public void setTrackingNo(String trackingNo) {
    this.trackingNo = trackingNo;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Long getWareId() {
    return wareId;
  }

  public void setWareId(Long wareId) {
    this.wareId = wareId;
  }

  public String getTaskComment() {
    return taskComment;
  }

  public void setTaskComment(String taskComment) {
    this.taskComment = taskComment;
  }

}