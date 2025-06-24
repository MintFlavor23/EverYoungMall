package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sms_home_subject", schema = "mall_sms")
public class HomeSubjectEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 200)
  private String name;

  @Column(name = "title")
  private String title;

  @Column(name = "sub_title")
  private String subTitle;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "url", length = 500)
  private String url;

  @Column(name = "sort")
  private Integer sort;

  @Column(name = "img", length = 500)
  private String img;

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

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }

}