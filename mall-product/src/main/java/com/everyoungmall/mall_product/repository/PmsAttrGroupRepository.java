package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsAttrGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsAttrGroupRepository extends JpaRepository<PmsAttrGroup, Long>,
    JpaSpecificationExecutor<PmsAttrGroup> {

}