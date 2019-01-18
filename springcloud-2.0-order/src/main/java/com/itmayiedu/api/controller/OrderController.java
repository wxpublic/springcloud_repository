package com.itmayiedu.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-17 下午 1:28
 */
@RestController
public class OrderController {
    @Autowired  //是由SpringBoot web组件提供的,默认整合Ribbon负载均衡器，此种方式底层采用httpclient方式实现。
    private RestTemplate restTemplate;
    /**
     * 在SpringCloud中有两种调用方式rest和fein(SpringCloud中的技术)客户端；本处采用rest方式：
     * 订单服务调用会员服务接口
     * @return String
     */
    @RequestMapping("/getOrder")
    public String getOrder(){
        //调用方式有两种，一种是服务别名方式，另一种是直接通过具体IP方式；
        String url = "http://app-itmayiedu-member/getMember";
        String result = restTemplate.getForObject(url,String.class);
        System.out.println("订单服务调用会员服务："+result);
        return result;
    }
}


//直接使用IP通讯，没有走注册中心
///**
// * @version 1.0
// * @Description:
// * @author: ChenRuiQing.
// * Create Time:  2019-01-17 下午 1:28
// */
//@RestController
//public class OrderController {
//    @Autowired  //是由SpringBoot web组件提供的,默认整合Ribbon负载均衡器，此种方式底层采用httpclient方式实现。
//    private RestTemplate restTemplate;
//
//    /**
//     * 在SpringCloud中有两种调用方式rest和fein(SpringCloud中的技术)客户端；本处采用rest方式：
//     * 订单服务调用会员服务接口
//     * @return String
//     */
//    @RequestMapping("/getOrder")
//    public String getOrder(){
//        //调用方式有两种，一种是服务别名方式，另一种是直接通过具体IP方式；
//        String result = restTemplate.getForObject("http://192.168.1.99:8000/getMember",String.class);
//        System.out.println("订单服务调用会员服务："+result);
//        return result;
//    }
//}
