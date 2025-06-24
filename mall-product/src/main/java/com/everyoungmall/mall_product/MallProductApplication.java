package com.everyoungmall.mall_product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * EverYoungMall 产品服务启动类
 *
 * 技术栈变更说明：
 * 1、数据持久化：MyBatis-Plus → Spring Data JPA + Hibernate
 *      - 使用 @EnableJpaRepositories 替代 @MapperScan
 *      - Repository 接口替代 Mapper 接口
 *      - JPA 实体注解替代 MyBatis-Plus 注解
 *
 * 2、实体类生成：使用 Hibernate Tools 从数据库反向生成
 *      - 配置在 pom.xml 的 hibernate-tools-maven 插件中
 *      - 生成路径：com.everyoungmall.product.entity
 *
 * 3、DTO 转换：使用 MapStruct 进行实体与 DTO 之间的转换
 *      - 替代手动编写转换代码
 *      - 编译时生成高性能转换代码
 *
 * 4、数据校验：JSR303 Bean Validation（保持不变）
 *      - 使用 @Valid 和 @Validated 进行参数校验
 *      - 支持分组校验和自定义校验器
 *      - 统一异常处理 @ControllerAdvice
 *
 * 5、缓存和会话管理（保持不变）
 *      - Redis 缓存：@EnableCaching
 *      - Spring Session：@EnableRedisHttpSession
 *
 * 6、微服务组件（保持不变）
 *      - 服务发现：@EnableDiscoveryClient
 *      - 服务调用：@EnableFeignClients
 */

@EnableRedisHttpSession     // 开启 Spring Session，会话存储到 Redis
@EnableCaching              // 开启缓存功能，支持 Redis 缓存
@EnableFeignClients(basePackages = "com.everyoungmall.product.feign")  // 启用 Feign 客户端
@EnableDiscoveryClient      // 启用服务发现，支持 Nacos/Consul 等
@EnableJpaRepositories(basePackages = "com.everyoungmall.product.repository")  // 启用 JPA Repository
@SpringBootApplication
public class MallProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallProductApplication.class, args);
	}
}