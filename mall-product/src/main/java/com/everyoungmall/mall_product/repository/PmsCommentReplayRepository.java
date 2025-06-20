package com.everyoungmall.mall_product.repository;

import com.everyoungmall.mall_product.entity.PmsCommentReplay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PmsCommentReplayRepository extends JpaRepository<PmsCommentReplay, Long>,
    JpaSpecificationExecutor<PmsCommentReplay> {

}