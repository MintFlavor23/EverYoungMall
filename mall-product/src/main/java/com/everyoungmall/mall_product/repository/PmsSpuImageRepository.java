package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSpuImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSpuImageRepository extends JpaRepository<PmsSpuImage, Long>,
    JpaSpecificationExecutor<PmsSpuImage> {

}