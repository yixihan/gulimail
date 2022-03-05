package com.yixihan.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 一. 整合 mybatis-plus
 *      1. 导入依赖
 *         <dependency>
 *             <groupId>com.baomidou</groupId>
 *             <artifactId>mybatis-plus-boot-starter</artifactId>
 *             <version>3.2.0</version>
 *         </dependency>
 *      2. 配置
 *          1. 配置数据源
 *              1). 导入数据库驱动
 *              <dependency>
 *                  <groupId>mysql</groupId>
 *                  <artifactId>mysql-connector-java</artifactId>
 *                  <version>8.0.27</version>
 *              </dependency>
 *              2). 在 application.yaml 配置数据源相关信息
 *              spring:
 *                  datasource:
 *                      url: jdbc:mysql://175.24.229.41:2233/gulimail?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai
 *                      driver-class-name: com.mysql.cj.jdbc.Driver
 *                      username: root
 *                      password: root
 *          2. 配置 mybatis-plus
 *              1). 使用 @MapperScan 注解
 *              @MapperScan("com.yixihan.gulimail.product.dao")
 *              2). 告诉 mybatis-plus, sql 映射文件位置
 *
 * @author : yixihan
 * @create : 2022-03-05-21:07
 */
@EnableDiscoveryClient
@MapperScan("com.yixihan.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run (GulimallProductApplication.class);
    }
}
