package com.everyoungmall.mall_member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "ums_growth_change_history", schema = "mall_ums")
public class GrowthChangeHistoryEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "change_count")
  private Integer changeCount;

  @Lob
  @Column(name = "note")
  private String note;

  @Column(name = "source_type")
  private Byte sourceType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getMemberId() {
    return memberId;
  }

  public void setMemberId(Long memberId) {
    this.memberId = memberId;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Integer getChangeCount() {
    return changeCount;
  }

  public void setChangeCount(Integer changeCount) {
    this.changeCount = changeCount;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Byte getSourceType() {
    return sourceType;
  }

  public void setSourceType(Byte sourceType) {
    this.sourceType = sourceType;
  }

}