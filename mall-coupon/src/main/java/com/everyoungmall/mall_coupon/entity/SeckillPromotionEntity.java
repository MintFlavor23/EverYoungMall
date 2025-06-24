package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "sms_seckill_promotion", schema = "mall_sms")
public class SeckillPromotionEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "title")
  private String title;

  @Column(name = "start_time")
  private Instant startTime;

  @Column(name = "end_time")
  private Instant endTime;

  @Column(name = "status")
  private Byte status;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "user_id")
  private Long userId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public Byte getStatus() {
    return status;
  }

  public void setStatus(Byte status) {
    this.status = status;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

}