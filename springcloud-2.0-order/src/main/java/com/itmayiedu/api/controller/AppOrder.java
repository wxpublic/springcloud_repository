package com.itmayiedu.api.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-17 下午 2:35
 */
@SpringBootApplication
@EnableEurekaClient
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class);
    }

    /**
     * 解决restTemplate找不到的异常，应该把restTemplate注册到spring容器中，
     * 如果使用rest方式以别名方式进行调用依赖,需要添加@LoadBalanced，使用Ribbon负载均衡器能力。
     * @LoadBalanced 就能让这个RestTemplate在请求时，拥有客户端负载均衡的能力
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
