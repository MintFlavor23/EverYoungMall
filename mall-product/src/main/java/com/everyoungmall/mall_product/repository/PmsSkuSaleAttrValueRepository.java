package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSkuSaleAttrValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSkuSaleAttrValueRepository extends JpaRepository<PmsSkuSaleAttrValue, Long>,
    JpaSpecificationExecutor<PmsSkuSaleAttrValue> {

}