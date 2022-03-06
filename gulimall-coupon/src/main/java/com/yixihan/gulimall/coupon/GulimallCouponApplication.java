package com.yixihan.gulimall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 一. 如何使用 nacos 作为配置中心统一管理配置
 *      1. 引入依赖
 *      <dependency>
 *         <groupId>com.alibaba.cloud</groupId>
 *         <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *     </dependency>
 *
 *     2. 创建一个 bootstrap.yaml
 *     spring:
 *       application:
 *         name: gulimall-coupon
 *       profiles:
 *         active: dev
 *      cloud:
 *        nacos:
 *          config:
 *            server-addr: 127.0.0.1:8848
 *            file-extension: yaml #指定yaml格式的配置
 *
 *     3. 给配置中心添加一个数据集 (Data Id)
 *     默认规则 ${spring.application.name}-${spring.profile.active}.${spring.cloud.nacos.config.file-extension}
 *
 *     4. 给 数据集添加任何配置

 *     4. 动态获取配置
 *          1. 添加注解
 *          @RefreshScope : 动态获取并刷新配置
 *          @Value ("${配置项的名}") : 获取到配置
 *          ps : 如果配置中心和当前应用的配置文件中都配置了相同的项, 优先使用配置中心的配置
 *
 * 二. 细节
 *      1. 命名空间 : 配置隔离 :
 *          默认 : public (保留空间) : 默认新增的所有配置都在 public 空间
 *          1. 开发, 测试, 生产 : 利用命名空间来做环境隔离
 *              注意 : 在 bootstrap.yaml 配置上, 需要使用哪个命名空间下的配置 :
 *              namespace: c0cc683f-debd-4063-adb9-1eedf85a8d65
 *          2. 每一个微服务之间互相隔离配置, 每一个微服务都创建自己的命名空间, 只加载自己命名空间下的配置
 *
 *      2. 配置集
 *          所有的配置的集合
 *
 *      3. 配置集 id
 *          Data Id : 类似文件名
 *      4. 配置分组
 *          默认所有的配置集都属于 : DEFAULT_GROUP'
 *          项目中的使用 : 每个微服务创建自己的命名空间, 使用配置分组区分环境, dev, test, prop
 *
 * 三. 同时加载多个配置集
 *      1. 每一个微服务, 任何配置文件, 都可以放在配置中心中
 *      2. 只需要在 bootstrap.yaml 中说明加载配置中心中的哪些配置文件即可
 *      3. @Value, @ConfigurationProperties ...
 *      以前 SpringBoot 中任何从配置文件获取值的方法, 都能使用
 *      配置中心有的优先使用配置中心中的
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yixihan.gulimall.coupon.feign")
@MapperScan("com.yixihan.gulimall.coupon.dao")
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run (GulimallCouponApplication.class, args);
    }

}
