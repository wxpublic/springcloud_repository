package com.itmayiedu.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-17 下午 12:52
 */
@RestController
public class MemberApiController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/getMember")
    public String getMember(){
        return "this is Member; translation:我是会员服务!   服务端口号"+serverPort;
    }
}
