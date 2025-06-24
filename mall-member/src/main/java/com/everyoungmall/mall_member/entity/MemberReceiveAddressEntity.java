package com.everyoungmall.mall_member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ums_member_receive_address", schema = "mall_ums")
public class MemberReceiveAddressEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "name")
  private String name;

  @Column(name = "phone", length = 64)
  private String phone;

  @Column(name = "post_code", length = 64)
  private String postCode;

  @Column(name = "province", length = 100)
  private String province;

  @Column(name = "city", length = 100)
  private String city;

  @Column(name = "region", length = 100)
  private String region;

  @Column(name = "detail_address")
  private String detailAddress;

  @Column(name = "areacode", length = 15)
  private String areacode;

  @Column(name = "default_status")
  private Boolean defaultStatus;

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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getDetailAddress() {
    return detailAddress;
  }

  public void setDetailAddress(String detailAddress) {
    this.detailAddress = detailAddress;
  }

  public String getAreacode() {
    return areacode;
  }

  public void setAreacode(String areacode) {
    this.areacode = areacode;
  }

  public Boolean getDefaultStatus() {
    return defaultStatus;
  }

  public void setDefaultStatus(Boolean defaultStatus) {
    this.defaultStatus = defaultStatus;
  }

}