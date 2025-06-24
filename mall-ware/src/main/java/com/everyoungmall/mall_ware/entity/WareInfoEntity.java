package com.everyoungmall.mall_ware.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wms_ware_info", schema = "mall_wms")
public class WareInfoEntity {

  @Id
  @Column(name = "id", nullable = false)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "address")
  private String address;

  @Column(name = "areacode", length = 20)
  private String areacode;

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

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAreacode() {
    return areacode;
  }

  public void setAreacode(String areacode) {
    this.areacode = areacode;
  }

}