package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsCategoryBrandRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsCategoryBrandRelationRepository extends
    JpaRepository<PmsCategoryBrandRelation, Long>,
    JpaSpecificationExecutor<PmsCategoryBrandRelation> {

}