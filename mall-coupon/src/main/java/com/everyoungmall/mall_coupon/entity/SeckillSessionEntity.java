package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "sms_seckill_session", schema = "mall_sms")
public class SeckillSessionEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 200)
  private String name;

  @Column(name = "start_time")
  private Instant startTime;

  @Column(name = "end_time")
  private Instant endTime;

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