package com.everyoungmall.mall_order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "oms_order", schema = "mall_oms")
public class OmsOrder {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "member_id")
  private Long memberId;

  @Column(name = "order_sn", length = 32)
  private String orderSn;

  @Column(name = "coupon_id")
  private Long couponId;

  @Column(name = "create_time")
  private Instant createTime;

  @Column(name = "member_username", length = 200)
  private String memberUsername;

  @Column(name = "total_amount", precision = 18, scale = 4)
  private BigDecimal totalAmount;

  @Column(name = "pay_amount", precision = 18, scale = 4)
  private BigDecimal payAmount;

  @Column(name = "freight_amount", precision = 18, scale = 4)
  private BigDecimal freightAmount;

  @Column(name = "promotion_amount", precision = 18, scale = 4)
  private BigDecimal promotionAmount;

  @Column(name = "integration_amount", precision = 18, scale = 4)
  private BigDecimal integrationAmount;

  @Column(name = "coupon_amount", precision = 18, scale = 4)
  private BigDecimal couponAmount;

  @Column(name = "discount_amount", precision = 18, scale = 4)
  private BigDecimal discountAmount;

  @Column(name = "pay_type")
  private Byte payType;

  @Column(name = "source_type")
  private Byte sourceType;

  @Column(name = "status")
  private Byte status;

  @Column(name = "delivery_company", length = 64)
  private String deliveryCompany;

  @Column(name = "delivery_sn", length = 64)
  private String deliverySn;

  @Column(name = "auto_confirm_day")
  private Integer autoConfirmDay;

  @Column(name = "integration")
  private Integer integration;

  @Column(name = "growth")
  private Integer growth;

  @Column(name = "bill_type")
  private Byte billType;

  @Column(name = "bill_header")
  private String billHeader;

  @Column(name = "bill_content")
  private String billContent;

  @Column(name = "bill_receiver_phone", length = 32)
  private String billReceiverPhone;

  @Column(name = "bill_receiver_email", length = 64)
  private String billReceiverEmail;

  @Column(name = "receiver_name", length = 100)
  private String receiverName;

  @Column(name = "receiver_phone", length = 32)
  private String receiverPhone;

  @Column(name = "receiver_post_code", length = 32)
  private String receiverPostCode;

  @Column(name = "receiver_province", length = 32)
  private String receiverProvince;

  @Column(name = "receiver_city", length = 32)
  private String receiverCity;

  @Column(name = "receiver_region", length = 32)
  private String receiverRegion;

  @Column(name = "receiver_detail_address", length = 200)
  private String receiverDetailAddress;

  @Column(name = "note", length = 500)
  private String note;

  @Column(name = "confirm_status")
  private Byte confirmStatus;

  @Column(name = "delete_status")
  private Byte deleteStatus;

  @Column(name = "use_integration")
  private Integer useIntegration;

  @Column(name = "payment_time")
  private Instant paymentTime;

  @Column(name = "delivery_time")
  private Instant deliveryTime;

  @Column(name = "receive_time")
  private Instant receiveTime;

  @Column(name = "comment_time")
  private Instant commentTime;

  @Column(name = "modify_time")
  private Instant modifyTime;

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

  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
  }

  public Long getCouponId() {
    return couponId;
  }

  public void setCouponId(Long couponId) {
    this.couponId = couponId;
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

  public BigDecimal getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(BigDecimal totalAmount) {
    this.totalAmount = totalAmount;
  }

  public BigDecimal getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(BigDecimal payAmount) {
    this.payAmount = payAmount;
  }

  public BigDecimal getFreightAmount() {
    return freightAmount;
  }

  public void setFreightAmount(BigDecimal freightAmount) {
    this.freightAmount = freightAmount;
  }

  public BigDecimal getPromotionAmount() {
    return promotionAmount;
  }

  public void setPromotionAmount(BigDecimal promotionAmount) {
    this.promotionAmount = promotionAmount;
  }

  public BigDecimal getIntegrationAmount() {
    return integrationAmount;
  }

  public void setIntegrationAmount(BigDecimal integrationAmount) {
    this.integrationAmount = integrationAmount;
  }

  public BigDecimal getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(BigDecimal couponAmount) {
    this.couponAmount = couponAmount;
  }

  public BigDecimal getDiscountAmount() {
    return discountAmount;
  }

  public void setDiscountAmount(BigDecimal discountAmount) {
    this.discountAmount = discountAmount;
  }

  public Byte getPayType() {
    return payType;
  }

  public void setPayType(Byte payType) {
    this.payType = payType;
  }

  public Byte getSourceType() {
    return sourceType;
  }

  public void setSourceType(Byte sourceType) {
    this.sourceType = sourceType;
  }

  public Byte getStatus() {
    return status;
  }

  public void setStatus(Byte status) {
    this.status = status;
  }

  public String getDeliveryCompany() {
    return deliveryCompany;
  }

  public void setDeliveryCompany(String deliveryCompany) {
    this.deliveryCompany = deliveryCompany;
  }

  public String getDeliverySn() {
    return deliverySn;
  }

  public void setDeliverySn(String deliverySn) {
    this.deliverySn = deliverySn;
  }

  public Integer getAutoConfirmDay() {
    return autoConfirmDay;
  }

  public void setAutoConfirmDay(Integer autoConfirmDay) {
    this.autoConfirmDay = autoConfirmDay;
  }

  public Integer getIntegration() {
    return integration;
  }

  public void setIntegration(Integer integration) {
    this.integration = integration;
  }

  public Integer getGrowth() {
    return growth;
  }

  public void setGrowth(Integer growth) {
    this.growth = growth;
  }

  public Byte getBillType() {
    return billType;
  }

  public void setBillType(Byte billType) {
    this.billType = billType;
  }

  public String getBillHeader() {
    return billHeader;
  }

  public void setBillHeader(String billHeader) {
    this.billHeader = billHeader;
  }

  public String getBillContent() {
    return billContent;
  }

  public void setBillContent(String billContent) {
    this.billContent = billContent;
  }

  public String getBillReceiverPhone() {
    return billReceiverPhone;
  }

  public void setBillReceiverPhone(String billReceiverPhone) {
    this.billReceiverPhone = billReceiverPhone;
  }

  public String getBillReceiverEmail() {
    return billReceiverEmail;
  }

  public void setBillReceiverEmail(String billReceiverEmail) {
    this.billReceiverEmail = billReceiverEmail;
  }

  public String getReceiverName() {
    return receiverName;
  }

  public void setReceiverName(String receiverName) {
    this.receiverName = receiverName;
  }

  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }

  public String getReceiverPostCode() {
    return receiverPostCode;
  }

  public void setReceiverPostCode(String receiverPostCode) {
    this.receiverPostCode = receiverPostCode;
  }

  public String getReceiverProvince() {
    return receiverProvince;
  }

  public void setReceiverProvince(String receiverProvince) {
    this.receiverProvince = receiverProvince;
  }

  public String getReceiverCity() {
    return receiverCity;
  }

  public void setReceiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
  }

  public String getReceiverRegion() {
    return receiverRegion;
  }

  public void setReceiverRegion(String receiverRegion) {
    this.receiverRegion = receiverRegion;
  }

  public String getReceiverDetailAddress() {
    return receiverDetailAddress;
  }

  public void setReceiverDetailAddress(String receiverDetailAddress) {
    this.receiverDetailAddress = receiverDetailAddress;
  }

  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public Byte getConfirmStatus() {
    return confirmStatus;
  }

  public void setConfirmStatus(Byte confirmStatus) {
    this.confirmStatus = confirmStatus;
  }

  public Byte getDeleteStatus() {
    return deleteStatus;
  }

  public void setDeleteStatus(Byte deleteStatus) {
    this.deleteStatus = deleteStatus;
  }

  public Integer getUseIntegration() {
    return useIntegration;
  }

  public void setUseIntegration(Integer useIntegration) {
    this.useIntegration = useIntegration;
  }

  public Instant getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(Instant paymentTime) {
    this.paymentTime = paymentTime;
  }

  public Instant getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(Instant deliveryTime) {
    this.deliveryTime = deliveryTime;
  }

  public Instant getReceiveTime() {
    return receiveTime;
  }

  public void setReceiveTime(Instant receiveTime) {
    this.receiveTime = receiveTime;
  }

  public Instant getCommentTime() {
    return commentTime;
  }

  public void setCommentTime(Instant commentTime) {
    this.commentTime = commentTime;
  }

  public Instant getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(Instant modifyTime) {
    this.modifyTime = modifyTime;
  }

}