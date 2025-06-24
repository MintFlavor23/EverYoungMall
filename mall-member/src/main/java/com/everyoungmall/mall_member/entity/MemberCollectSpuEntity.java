package com.everyoungmall.mall_member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "ums_member_collect_spu", schema = "mall_ums")
public class MemberCollectSpuEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "spu_name", length = 500)
  private String spuName;

  @Column(name = "spu_img", length = 500)
  private String spuImg;

  @Column(name = "create_time")
  private Instant createTime;

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

  public Long getSpuId() {
    return spuId;
  }

  public void setSpuId(Long spuId) {
    this.spuId = spuId;
  }

  public String getSpuName() {
    return spuName;
  }

  public void setSpuName(String spuName) {
    this.spuName = spuName;
  }

  public String getSpuImg() {
    return spuImg;
  }

  public void setSpuImg(String spuImg) {
    this.spuImg = spuImg;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

}