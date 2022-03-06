package com.yixihan.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 一. 想要远程调用别的服务
 *      1. 引入 OpenFeign
 *      2. 变成一个接口, 告诉 SpringCloud 这个接口需要调用远程服务
 *          1. 声明接口的每一个方法都是调用哪个远程服务的哪个请流
 *      3. 开启远程调用功能
 */
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yixihan.gulimall.member.feign")
@MapperScan("com.yixihan.gulimall.member.dao")
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run (GulimallMemberApplication.class, args);
    }

}
