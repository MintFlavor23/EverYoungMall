package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSpuInfoDesc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSpuInfoDescRepository extends JpaRepository<PmsSpuInfoDesc, Long>,
    JpaSpecificationExecutor<PmsSpuInfoDesc> {

}