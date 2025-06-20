package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsSpuComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsSpuCommentRepository extends JpaRepository<PmsSpuComment, Long>,
    JpaSpecificationExecutor<PmsSpuComment> {

}