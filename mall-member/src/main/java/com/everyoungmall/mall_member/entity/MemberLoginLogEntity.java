package com.everyoungmall.mall_member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "ums_member_login_log", schema = "mall_ums")
public class MemberLoginLogEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "ip", length = 64)
  private String ip;

  @Column(name = "city", length = 64)
  private String city;

  @Column(name = "login_type")
  private Boolean loginType;

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

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Boolean getLoginType() {
    return loginType;
  }

  public void setLoginType(Boolean loginType) {
    this.loginType = loginType;
  }

}