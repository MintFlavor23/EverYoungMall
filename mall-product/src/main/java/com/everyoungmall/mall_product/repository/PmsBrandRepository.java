package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsBrand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsBrandRepository extends JpaRepository<PmsBrand, Long>,
    JpaSpecificationExecutor<PmsBrand> {

}