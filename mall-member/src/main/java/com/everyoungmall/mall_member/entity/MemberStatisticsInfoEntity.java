package com.everyoungmall.mall_member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "ums_member_statistics_info", schema = "mall_ums")
public class MemberStatisticsInfoEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "consume_amount", precision = 18, scale = 4)
  private BigDecimal consumeAmount;

  @Column(name = "coupon_amount", precision = 18, scale = 4)
  private BigDecimal couponAmount;

  @Column(name = "order_count")
  private Integer orderCount;

  @Column(name = "coupon_count")
  private Integer couponCount;

  @Column(name = "comment_count")
  private Integer commentCount;

  @Column(name = "return_order_count")
  private Integer returnOrderCount;

  @Column(name = "login_count")
  private Integer loginCount;

  @Column(name = "attend_count")
  private Integer attendCount;

  @Column(name = "fans_count")
  private Integer fansCount;

  @Column(name = "collect_product_count")
  private Integer collectProductCount;

  @Column(name = "collect_subject_count")
  private Integer collectSubjectCount;

  @Column(name = "collect_comment_count")
  private Integer collectCommentCount;

  @Column(name = "invite_friend_count")
  private Integer inviteFriendCount;

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

  public BigDecimal getConsumeAmount() {
    return consumeAmount;
  }

  public void setConsumeAmount(BigDecimal consumeAmount) {
    this.consumeAmount = consumeAmount;
  }

  public BigDecimal getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(BigDecimal couponAmount) {
    this.couponAmount = couponAmount;
  }

  public Integer getOrderCount() {
    return orderCount;
  }

  public void setOrderCount(Integer orderCount) {
    this.orderCount = orderCount;
  }

  public Integer getCouponCount() {
    return couponCount;
  }

  public void setCouponCount(Integer couponCount) {
    this.couponCount = couponCount;
  }

  public Integer getCommentCount() {
    return commentCount;
  }

  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }

  public Integer getReturnOrderCount() {
    return returnOrderCount;
  }

  public void setReturnOrderCount(Integer returnOrderCount) {
    this.returnOrderCount = returnOrderCount;
  }

  public Integer getLoginCount() {
    return loginCount;
  }

  public void setLoginCount(Integer loginCount) {
    this.loginCount = loginCount;
  }

  public Integer getAttendCount() {
    return attendCount;
  }

  public void setAttendCount(Integer attendCount) {
    this.attendCount = attendCount;
  }

  public Integer getFansCount() {
    return fansCount;
  }

  public void setFansCount(Integer fansCount) {
    this.fansCount = fansCount;
  }

  public Integer getCollectProductCount() {
    return collectProductCount;
  }

  public void setCollectProductCount(Integer collectProductCount) {
    this.collectProductCount = collectProductCount;
  }

  public Integer getCollectSubjectCount() {
    return collectSubjectCount;
  }

  public void setCollectSubjectCount(Integer collectSubjectCount) {
    this.collectSubjectCount = collectSubjectCount;
  }

  public Integer getCollectCommentCount() {
    return collectCommentCount;
  }

  public void setCollectCommentCount(Integer collectCommentCount) {
    this.collectCommentCount = collectCommentCount;
  }

  public Integer getInviteFriendCount() {
    return inviteFriendCount;
  }

  public void setInviteFriendCount(Integer inviteFriendCount) {
    this.inviteFriendCount = inviteFriendCount;
  }

}