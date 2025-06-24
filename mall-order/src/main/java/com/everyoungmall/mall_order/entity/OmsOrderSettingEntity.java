package com.everyoungmall.mall_order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "oms_order_setting", schema = "mall_oms")
public class OmsOrderSettingEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "flash_order_overtime")
  private Integer flashOrderOvertime;

  @Column(name = "normal_order_overtime")
  private Integer normalOrderOvertime;

  @Column(name = "confirm_overtime")
  private Integer confirmOvertime;

  @Column(name = "finish_overtime")
  private Integer finishOvertime;

  @Column(name = "comment_overtime")
  private Integer commentOvertime;

  @Column(name = "member_level")
  private Byte memberLevel;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Integer getFlashOrderOvertime() {
    return flashOrderOvertime;
  }

  public void setFlashOrderOvertime(Integer flashOrderOvertime) {
    this.flashOrderOvertime = flashOrderOvertime;
  }

  public Integer getNormalOrderOvertime() {
    return normalOrderOvertime;
  }

  public void setNormalOrderOvertime(Integer normalOrderOvertime) {
    this.normalOrderOvertime = normalOrderOvertime;
  }

  public Integer getConfirmOvertime() {
    return confirmOvertime;
  }

  public void setConfirmOvertime(Integer confirmOvertime) {
    this.confirmOvertime = confirmOvertime;
  }

  public Integer getFinishOvertime() {
    return finishOvertime;
  }

  public void setFinishOvertime(Integer finishOvertime) {
    this.finishOvertime = finishOvertime;
  }

  public Integer getCommentOvertime() {
    return commentOvertime;
  }

  public void setCommentOvertime(Integer commentOvertime) {
    this.commentOvertime = commentOvertime;
  }

  public Byte getMemberLevel() {
    return memberLevel;
  }

  public void setMemberLevel(Byte memberLevel) {
    this.memberLevel = memberLevel;
  }

}