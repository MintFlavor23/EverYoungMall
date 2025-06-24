package com.everyoungmall.mall_order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "oms_order_return_apply", schema = "mall_oms")
public class OmsOrderReturnApplyEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "order_id")
  private Long orderId;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "order_sn", length = 32)
  private String orderSn;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "member_username", length = 64)
  private String memberUsername;

  @Column(name = "return_amount", precision = 18, scale = 4)
  private BigDecimal returnAmount;

  @Column(name = "return_name", length = 100)
  private String returnName;

  @Column(name = "return_phone", length = 20)
  private String returnPhone;

  @Column(name = "status")
  private Boolean status;

  @Column(name = "handle_time")
  private Instant handleTime;

  @Column(name = "sku_img", length = 500)
  private String skuImg;

  @Column(name = "sku_name", length = 200)
  private String skuName;

  @Column(name = "sku_brand", length = 200)
  private String skuBrand;

  @Column(name = "sku_attrs_vals", length = 500)
  private String skuAttrsVals;

  @Column(name = "sku_count")
  private Integer skuCount;

  @Column(name = "sku_price", precision = 18, scale = 4)
  private BigDecimal skuPrice;

  @Column(name = "sku_real_price", precision = 18, scale = 4)
  private BigDecimal skuRealPrice;

  @Column(name = "reason", length = 200)
  private String reason;

  @Column(name = "`description述`", length = 500)
  private String description述;

  @Column(name = "desc_pics", length = 2000)
  private String descPics;

  @Column(name = "handle_note", length = 500)
  private String handleNote;

  @Column(name = "handle_man", length = 200)
  private String handleMan;

  @Column(name = "receive_man", length = 100)
  private String receiveMan;

  @Column(name = "receive_time")
  private Instant receiveTime;

  @Column(name = "receive_note", length = 500)
  private String receiveNote;

  @Column(name = "receive_phone", length = 20)
  private String receivePhone;

  @Column(name = "company_address", length = 500)
  private String companyAddress;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }

  public Instant getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Instant createTime) {
    this.createTime = createTime;
  }

  public String getMemberUsername() {
    return memberUsername;
  }

  public void setMemberUsername(String memberUsername) {
    this.memberUsername = memberUsername;
  }

  public BigDecimal getReturnAmount() {
    return returnAmount;
  }

  public void setReturnAmount(BigDecimal returnAmount) {
    this.returnAmount = returnAmount;
  }

  public String getReturnName() {
    return returnName;
  }

  public void setReturnName(String returnName) {
    this.returnName = returnName;
  }

  public String getReturnPhone() {
    return returnPhone;
  }

  public void setReturnPhone(String returnPhone) {
    this.returnPhone = returnPhone;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Instant getHandleTime() {
    return handleTime;
  }

  public void setHandleTime(Instant handleTime) {
    this.handleTime = handleTime;
  }

  public String getSkuImg() {
    return skuImg;
  }

  public void setSkuImg(String skuImg) {
    this.skuImg = skuImg;
  }

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public String getSkuBrand() {
    return skuBrand;
  }

  public void setSkuBrand(String skuBrand) {
    this.skuBrand = skuBrand;
  }

  public String getSkuAttrsVals() {
    return skuAttrsVals;
  }

  public void setSkuAttrsVals(String skuAttrsVals) {
    this.skuAttrsVals = skuAttrsVals;
  }

  public Integer getSkuCount() {
    return skuCount;
  }

  public void setSkuCount(Integer skuCount) {
    this.skuCount = skuCount;
  }

  public BigDecimal getSkuPrice() {
    return skuPrice;
  }

  public void setSkuPrice(BigDecimal skuPrice) {
    this.skuPrice = skuPrice;
  }

  public BigDecimal getSkuRealPrice() {
    return skuRealPrice;
  }

  public void setSkuRealPrice(BigDecimal skuRealPrice) {
    this.skuRealPrice = skuRealPrice;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public String getDescription述() {
    return description述;
  }

  public void setDescription述(String description述) {
    this.description述 = description述;
  }

  public String getDescPics() {
    return descPics;
  }

  public void setDescPics(String descPics) {
    this.descPics = descPics;
  }

  public String getHandleNote() {
    return handleNote;
  }

  public void setHandleNote(String handleNote) {
    this.handleNote = handleNote;
  }

  public String getHandleMan() {
    return handleMan;
  }

  public void setHandleMan(String handleMan) {
    this.handleMan = handleMan;
  }

  public String getReceiveMan() {
    return receiveMan;
  }

  public void setReceiveMan(String receiveMan) {
    this.receiveMan = receiveMan;
  }

  public Instant getReceiveTime() {
    return receiveTime;
  }

  public void setReceiveTime(Instant receiveTime) {
    this.receiveTime = receiveTime;
  }

  public String getReceiveNote() {
    return receiveNote;
  }

  public void setReceiveNote(String receiveNote) {
    this.receiveNote = receiveNote;
  }

  public String getReceivePhone() {
    return receivePhone;
  }

  public void setReceivePhone(String receivePhone) {
    this.receivePhone = receivePhone;
  }

  public String getCompanyAddress() {
    return companyAddress;
  }

  public void setCompanyAddress(String companyAddress) {
    this.companyAddress = companyAddress;
  }

}