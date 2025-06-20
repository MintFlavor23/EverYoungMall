package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsAttr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsAttrRepository extends JpaRepository<PmsAttr, Long>,
    JpaSpecificationExecutor<PmsAttr> {

}