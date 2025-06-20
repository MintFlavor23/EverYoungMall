package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSkuInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSkuInfoRepository extends JpaRepository<PmsSkuInfo, Long>,
    JpaSpecificationExecutor<PmsSkuInfo> {

}