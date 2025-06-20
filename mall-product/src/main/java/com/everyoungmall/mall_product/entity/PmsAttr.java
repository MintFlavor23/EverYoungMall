package com.everyoungmall.mall_product.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pms_attr", schema = "mall_pms")
public class PmsAttr {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "attr_id", nullable = false)
  private Long id;

  @Column(name = "attr_name", length = 30)
  private String attrName;

  @Column(name = "search_type")
  private Byte searchType;

  @Column(name = "value_type")
  private Byte valueType;

  @Column(name = "icon")
  private String icon;

  @Column(name = "value_select")
  private String valueSelect;

  @Column(name = "attr_type")
  private Byte attrType;

  @Column(name = "enable")
  private Long enable;

  @Column(name = "catelog_id")
  private Long catelogId;

  @Column(name = "show_desc")
  private Byte showDesc;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAttrName() {
    return attrName;
  }

  public void setAttrName(String attrName) {
    this.attrName = attrName;
  }

  public Byte getSearchType() {
    return searchType;
  }

  public void setSearchType(Byte searchType) {
    this.searchType = searchType;
  }

  public Byte getValueType() {
    return valueType;
  }

  public void setValueType(Byte valueType) {
    this.valueType = valueType;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getValueSelect() {
    return valueSelect;
  }

  public void setValueSelect(String valueSelect) {
    this.valueSelect = valueSelect;
  }

  public Byte getAttrType() {
    return attrType;
  }

  public void setAttrType(Byte attrType) {
    this.attrType = attrType;
  }

  public Long getEnable() {
    return enable;
  }

  public void setEnable(Long enable) {
    this.enable = enable;
  }

  public Long getCatelogId() {
    return catelogId;
  }

  public void setCatelogId(Long catelogId) {
    this.catelogId = catelogId;
  }

  public Byte getShowDesc() {
    return showDesc;
  }

  public void setShowDesc(Byte showDesc) {
    this.showDesc = showDesc;
  }

}