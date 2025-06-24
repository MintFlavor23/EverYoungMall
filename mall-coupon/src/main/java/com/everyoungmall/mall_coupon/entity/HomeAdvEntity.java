package com.everyoungmall.mall_coupon.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;

@Entity
@Table(name = "sms_home_adv", schema = "mall_sms")
public class HomeAdvEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name", length = 100)
  private String name;

  @Column(name = "pic", length = 500)
  private String pic;

  @Column(name = "start_time")
  private Instant startTime;

  @Column(name = "end_time")
  private Instant endTime;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "click_count")
  private Integer clickCount;

  @Column(name = "url", length = 500)
  private String url;

  @Column(name = "note", length = 500)
  private String note;

  @Column(name = "sort")
  private Integer sort;

  @Column(name = "publisher_id")
  private Long publisherId;

  @Column(name = "auth_id")
  private Long authId;

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

  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

  public Instant getStartTime() {
    return startTime;
  }

  public void setStartTime(Instant startTime) {
    this.startTime = startTime;
  }

  public Instant getEndTime() {
    return endTime;
  }

  public void setEndTime(Instant endTime) {
    this.endTime = endTime;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Integer getClickCount() {
    return clickCount;
  }

  public void setClickCount(Integer clickCount) {
    this.clickCount = clickCount;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Integer getSort() {
    return sort;
  }

  public void setSort(Integer sort) {
    this.sort = sort;
  }

  public Long getPublisherId() {
    return publisherId;
  }

  public void setPublisherId(Long publisherId) {
    this.publisherId = publisherId;
  }

  public Long getAuthId() {
    return authId;
  }

  public void setAuthId(Long authId) {
    this.authId = authId;
  }

}