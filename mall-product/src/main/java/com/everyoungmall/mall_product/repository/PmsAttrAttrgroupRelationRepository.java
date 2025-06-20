package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsAttrAttrgroupRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsAttrAttrgroupRelationRepository extends
    JpaRepository<PmsAttrAttrgroupRelation, Long>,
    JpaSpecificationExecutor<PmsAttrAttrgroupRelation> {

}