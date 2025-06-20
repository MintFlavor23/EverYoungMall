package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "sms_coupon_history", schema = "mall_sms")
public class SmsCouponHistory {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "coupon_id")
  private Long couponId;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "member_nick_name", length = 64)
  private String memberNickName;

  @Column(name = "get_type")
  private Boolean getType;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "use_type")
  private Boolean useType;

  @Column(name = "use_time")
  private Instant useTime;

  @Column(name = "order_id")
  private Long orderId;

  @Column(name = "order_sn")
  private Long orderSn;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getCouponId() {
    return couponId;
  }

  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }

  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }

  public String getMemberNickName() {
    return memberNickName;
  }

  public void setMemberNickName(String memberNickName) {
    this.memberNickName = memberNickName;
  }

  public Boolean getGetType() {
    return getType;
  }

  public void setGetType(Boolean getType) {
    this.getType = getType;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Boolean getUseType() {
    return useType;
  }

  public void setUseType(Boolean useType) {
    this.useType = useType;
  }

  public Instant getUseTime() {
    return useTime;
  }

  public void setUseTime(Instant useTime) {
    this.useTime = useTime;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(Long orderSn) {
    this.orderSn = orderSn;
  }

}