package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSkuImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSkuImageRepository extends JpaRepository<PmsSkuImage, Long>,
    JpaSpecificationExecutor<PmsSkuImage> {

}