package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSpuInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSpuInfoRepository extends JpaRepository<PmsSpuInfo, Long>,
    JpaSpecificationExecutor<PmsSpuInfo> {

}