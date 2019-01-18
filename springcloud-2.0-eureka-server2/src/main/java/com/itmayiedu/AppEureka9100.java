package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-17 上午 11:05
 */
@SpringBootApplication
@EnableEurekaServer  //标识开启EurekaServer服务，开启注册中心
public class AppEureka9100 {
    public static void main(String[] args) {
        SpringApplication.run(AppEureka9100.class);
    }
}
