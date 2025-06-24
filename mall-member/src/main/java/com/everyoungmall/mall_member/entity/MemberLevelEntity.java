package com.everyoungmall.mall_member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "ums_member_level", schema = "mall_ums")
public class MemberLevelEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 100)
  private String name;

  @Column(name = "growth_point")
  private Integer growthPoint;

  @Column(name = "default_status")
  private Byte defaultStatus;

  @Column(name = "free_freight_point", precision = 18, scale = 4)
  private BigDecimal freeFreightPoint;

  @Column(name = "comment_growth_point")
  private Integer commentGrowthPoint;

  @Column(name = "priviledge_free_freight")
  private Byte priviledgeFreeFreight;

  @Column(name = "priviledge_member_price")
  private Byte priviledgeMemberPrice;

  @Column(name = "priviledge_birthday")
  private Byte priviledgeBirthday;

  @Column(name = "note")
  private String note;

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

  public Integer getGrowthPoint() {
    return growthPoint;
  }

  public void setGrowthPoint(Integer growthPoint) {
    this.growthPoint = growthPoint;
  }

  public Byte getDefaultStatus() {
    return defaultStatus;
  }

  public void setDefaultStatus(Byte defaultStatus) {
    this.defaultStatus = defaultStatus;
  }

  public BigDecimal getFreeFreightPoint() {
    return freeFreightPoint;
  }

  public void setFreeFreightPoint(BigDecimal freeFreightPoint) {
    this.freeFreightPoint = freeFreightPoint;
  }

  public Integer getCommentGrowthPoint() {
    return commentGrowthPoint;
  }

  public void setCommentGrowthPoint(Integer commentGrowthPoint) {
    this.commentGrowthPoint = commentGrowthPoint;
  }

  public Byte getPriviledgeFreeFreight() {
    return priviledgeFreeFreight;
  }

  public void setPriviledgeFreeFreight(Byte priviledgeFreeFreight) {
    this.priviledgeFreeFreight = priviledgeFreeFreight;
  }

  public Byte getPriviledgeMemberPrice() {
    return priviledgeMemberPrice;
  }

  public void setPriviledgeMemberPrice(Byte priviledgeMemberPrice) {
    this.priviledgeMemberPrice = priviledgeMemberPrice;
  }

  public Byte getPriviledgeBirthday() {
    return priviledgeBirthday;
  }

  public void setPriviledgeBirthday(Byte priviledgeBirthday) {
    this.priviledgeBirthday = priviledgeBirthday;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}