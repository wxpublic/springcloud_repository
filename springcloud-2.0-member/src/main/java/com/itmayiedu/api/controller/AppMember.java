package com.itmayiedu.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-17 下午 12:55
 */
@SpringBootApplication
@EnableEurekaClient //将当前服务注册到Eureka上
public class AppMember {
    public static void main(String[] args) {
        SpringApplication.run(AppMember.class);
    }
}
