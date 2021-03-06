package com.yixihan.gulimall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.yixihan.gulimall.order.feign")
@MapperScan("com.yixihan.gulimall.order.dao")
@SpringBootApplication
public class GulimallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run (GulimallOrderApplication.class, args);
    }

}
