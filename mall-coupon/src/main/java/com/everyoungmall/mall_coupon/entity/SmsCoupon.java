package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "sms_coupon", schema = "mall_sms")
public class SmsCoupon {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "coupon_type")
  private Boolean couponType;

  @Column(name = "coupon_img", length = 2000)
  private String couponImg;

  @Column(name = "coupon_name", length = 100)
  private String couponName;

  @Column(name = "num")
  private Integer num;

  @Column(name = "amount", precision = 18, scale = 4)
  private BigDecimal amount;

  @Column(name = "per_limit")
  private Integer perLimit;

  @Column(name = "min_point", precision = 18, scale = 4)
  private BigDecimal minPoint;

  @Column(name = "start_time")
  private Instant startTime;

  @Column(name = "end_time")
  private Instant endTime;

  @Column(name = "use_type")
  private Boolean useType;

  @Column(name = "note", length = 200)
  private String note;

  @Column(name = "publish_count")
  private Integer publishCount;

  @Column(name = "use_count")
  private Integer useCount;

  @Column(name = "receive_count")
  private Integer receiveCount;

  @Column(name = "enable_start_time")
  private Instant enableStartTime;

  @Column(name = "enable_end_time")
  private Instant enableEndTime;

  @Column(name = "code", length = 64)
  private String code;

  @Column(name = "member_level")
  private Boolean memberLevel;

  @Column(name = "publish")
  private Boolean publish;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Boolean getCouponType() {
    return couponType;
  }

  public void setCouponType(Boolean couponType) {
    this.couponType = couponType;
  }

  public String getCouponImg() {
    return couponImg;
  }

  public void setCouponImg(String couponImg) {
    this.couponImg = couponImg;
  }

  public String getCouponName() {
    return couponName;
  }

  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Integer getPerLimit() {
    return perLimit;
  }

  public void setPerLimit(Integer perLimit) {
    this.perLimit = perLimit;
  }

  public BigDecimal getMinPoint() {
    return minPoint;
  }

  public void setMinPoint(BigDecimal minPoint) {
    this.minPoint = minPoint;
  }

  public Instant getStartTime() {
    return startTime;
  }

  public void setStartTime(Instant startTime) {
    this.startTime = startTime;
  }

  public Instant getEndTime() {
    return endTime;
  }

  public void setEndTime(Instant endTime) {
    this.endTime = endTime;
  }

  public Boolean getUseType() {
    return useType;
  }

  public void setUseType(Boolean useType) {
    this.useType = useType;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Integer getPublishCount() {
    return publishCount;
  }

  public void setPublishCount(Integer publishCount) {
    this.publishCount = publishCount;
  }

  public Integer getUseCount() {
    return useCount;
  }

  public void setUseCount(Integer useCount) {
    this.useCount = useCount;
  }

  public Integer getReceiveCount() {
    return receiveCount;
  }

  public void setReceiveCount(Integer receiveCount) {
    this.receiveCount = receiveCount;
  }

  public Instant getEnableStartTime() {
    return enableStartTime;
  }

  public void setEnableStartTime(Instant enableStartTime) {
    this.enableStartTime = enableStartTime;
  }

  public Instant getEnableEndTime() {
    return enableEndTime;
  }

  public void setEnableEndTime(Instant enableEndTime) {
    this.enableEndTime = enableEndTime;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Boolean getMemberLevel() {
    return memberLevel;
  }

  public void setMemberLevel(Boolean memberLevel) {
    this.memberLevel = memberLevel;
  }

  public Boolean getPublish() {
    return publish;
  }

  public void setPublish(Boolean publish) {
    this.publish = publish;
  }

}