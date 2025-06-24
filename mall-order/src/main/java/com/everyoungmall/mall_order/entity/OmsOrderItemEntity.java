package com.everyoungmall.mall_order.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "oms_order_item", schema = "mall_oms")
public class OmsOrderItemEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "order_id")
  private Long orderId;

  @Column(name = "order_sn", length = 32)
  private String orderSn;

  @Column(name = "spu_id")
  private Long spuId;

  @Column(name = "spu_name")
  private String spuName;

  @Column(name = "spu_pic", length = 500)
  private String spuPic;

  @Column(name = "spu_brand", length = 200)
  private String spuBrand;

  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "sku_id")
  private Long skuId;

  @Column(name = "sku_name")
  private String skuName;

  @Column(name = "sku_pic", length = 500)
  private String skuPic;

  @Column(name = "sku_price", precision = 18, scale = 4)
  private BigDecimal skuPrice;

  @Column(name = "sku_quantity")
  private Integer skuQuantity;

  @Column(name = "sku_attrs_vals", length = 500)
  private String skuAttrsVals;

  @Column(name = "promotion_amount", precision = 18, scale = 4)
  private BigDecimal promotionAmount;

  @Column(name = "coupon_amount", precision = 18, scale = 4)
  private BigDecimal couponAmount;

  @Column(name = "integration_amount", precision = 18, scale = 4)
  private BigDecimal integrationAmount;

  @Column(name = "real_amount", precision = 18, scale = 4)
  private BigDecimal realAmount;

  @Column(name = "gift_integration")
  private Integer giftIntegration;

  @Column(name = "gift_growth")
  private Integer giftGrowth;

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

  public String getOrderSn() {
    return orderSn;
  }

  public void setOrderSn(String orderSn) {
    this.orderSn = orderSn;
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

  public String getSpuPic() {
    return spuPic;
  }

  public void setSpuPic(String spuPic) {
    this.spuPic = spuPic;
  }

  public String getSpuBrand() {
    return spuBrand;
  }

  public void setSpuBrand(String spuBrand) {
    this.spuBrand = spuBrand;
  }

  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public Long getSkuId() {
    return skuId;
  }

  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  public String getSkuName() {
    return skuName;
  }

  public void setSkuName(String skuName) {
    this.skuName = skuName;
  }

  public String getSkuPic() {
    return skuPic;
  }

  public void setSkuPic(String skuPic) {
    this.skuPic = skuPic;
  }

  public BigDecimal getSkuPrice() {
    return skuPrice;
  }

  public void setSkuPrice(BigDecimal skuPrice) {
    this.skuPrice = skuPrice;
  }

  public Integer getSkuQuantity() {
    return skuQuantity;
  }

  public void setSkuQuantity(Integer skuQuantity) {
    this.skuQuantity = skuQuantity;
  }

  public String getSkuAttrsVals() {
    return skuAttrsVals;
  }

  public void setSkuAttrsVals(String skuAttrsVals) {
    this.skuAttrsVals = skuAttrsVals;
  }

  public BigDecimal getPromotionAmount() {
    return promotionAmount;
  }

  public void setPromotionAmount(BigDecimal promotionAmount) {
    this.promotionAmount = promotionAmount;
  }

  public BigDecimal getCouponAmount() {
    return couponAmount;
  }

  public void setCouponAmount(BigDecimal couponAmount) {
    this.couponAmount = couponAmount;
  }

  public BigDecimal getIntegrationAmount() {
    return integrationAmount;
  }

  public void setIntegrationAmount(BigDecimal integrationAmount) {
    this.integrationAmount = integrationAmount;
  }

  public BigDecimal getRealAmount() {
    return realAmount;
  }

  public void setRealAmount(BigDecimal realAmount) {
    this.realAmount = realAmount;
  }

  public Integer getGiftIntegration() {
    return giftIntegration;
  }

  public void setGiftIntegration(Integer giftIntegration) {
    this.giftIntegration = giftIntegration;
  }

  public Integer getGiftGrowth() {
    return giftGrowth;
  }

  public void setGiftGrowth(Integer giftGrowth) {
    this.giftGrowth = giftGrowth;
  }

}