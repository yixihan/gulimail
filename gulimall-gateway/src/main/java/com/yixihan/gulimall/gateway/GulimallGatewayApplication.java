package com.yixihan.gulimall.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1. 开启服务注册发现
 *      配置 nacos 的注册中心地址
 */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run (GulimallGatewayApplication.class, args);
    }

}
