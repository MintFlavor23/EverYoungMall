package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "pms_spu_comment", schema = "mall_pms")
public class PmsSpuComment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "spu_name")
  private String spuName;

  @Column(name = "member_nick_name")
  private String memberNickName;

  @Column(name = "star")
  private Boolean star;

  @Column(name = "member_ip", length = 64)
  private String memberIp;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "show_status")
  private Boolean showStatus;

  @Column(name = "spu_attributes")
  private String spuAttributes;

  @Column(name = "likes_count")
  private Integer likesCount;

  @Column(name = "reply_count")
  private Integer replyCount;

  @Column(name = "resources", length = 1000)
  private String resources;

  @Lob
  @Column(name = "content")
  private String content;

  @Column(name = "member_icon")
  private String memberIcon;

  @Column(name = "comment_type")
  private Byte commentType;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
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

  public String getMemberNickName() {
    return memberNickName;
  }

  public void setMemberNickName(String memberNickName) {
    this.memberNickName = memberNickName;
  }

  public Boolean getStar() {
    return star;
  }

  public void setStar(Boolean star) {
    this.star = star;
  }

  public String getMemberIp() {
    return memberIp;
  }

  public void setMemberIp(String memberIp) {
    this.memberIp = memberIp;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public Boolean getShowStatus() {
    return showStatus;
  }

  public void setShowStatus(Boolean showStatus) {
    this.showStatus = showStatus;
  }

  public String getSpuAttributes() {
    return spuAttributes;
  }

  public void setSpuAttributes(String spuAttributes) {
    this.spuAttributes = spuAttributes;
  }

  public Integer getLikesCount() {
    return likesCount;
  }

  public void setLikesCount(Integer likesCount) {
    this.likesCount = likesCount;
  }

  public Integer getReplyCount() {
    return replyCount;
  }

  public void setReplyCount(Integer replyCount) {
    this.replyCount = replyCount;
  }

  public String getResources() {
    return resources;
  }

  public void setResources(String resources) {
    this.resources = resources;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getMemberIcon() {
    return memberIcon;
  }

  public void setMemberIcon(String memberIcon) {
    this.memberIcon = memberIcon;
  }

  public Byte getCommentType() {
    return commentType;
  }

  public void setCommentType(Byte commentType) {
    this.commentType = commentType;
  }

}