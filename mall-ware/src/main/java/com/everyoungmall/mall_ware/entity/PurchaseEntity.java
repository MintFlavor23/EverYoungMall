package com.everyoungmall.mall_ware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "wms_purchase", schema = "mall_wms")
public class PurchaseEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "assignee_id")
  private Long assigneeId;

  @Column(name = "assignee_name")
  private String assigneeName;

  @Column(name = "phone", length = 13)
  private String phone;

  @Column(name = "priority")
  private Integer priority;

  @Column(name = "status")
  private Integer status;

  @Column(name = "ware_id")
  private Long wareId;

  @Column(name = "amount", precision = 18, scale = 4)
  private BigDecimal amount;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "update_time")
  private Instant updateTime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAssigneeId() {
    return assigneeId;
  }

  public void setAssigneeId(Long assigneeId) {
    this.assigneeId = assigneeId;
  }

  public String getAssigneeName() {
    return assigneeName;
  }

  public void setAssigneeName(String assigneeName) {
    this.assigneeName = assigneeName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Long getWareId() {
    return wareId;
  }

  public void setWareId(Long wareId) {
    this.wareId = wareId;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Instant getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Instant updateTime) {
    this.updateTime = updateTime;
  }

}