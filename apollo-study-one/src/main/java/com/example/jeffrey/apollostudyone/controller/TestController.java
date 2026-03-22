package com.example.jeffrey.apollostudyone.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 测试接口
@RestController
class TestController {

    // 直接读取 Apollo 配置
    @Value("${test.message}")
    private String testMessage;

    @Value("${test.timeout}")
    private Integer testTimeout;

    @Value("${test.switch}")
    private Boolean testSwitch;


    @Value("${url}")
    private String url;

    @Value("${driver}")
    private String driver;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;


    @Value("${redis.url}")
    private String redisUrl;

    @Value("${redis.password}")
    private String redisPassword;

    @Value("${redis.username}")
    private String redisUsername;

    @GetMapping("/apollo")
    public String getApolloConfig() {
        return "Apollo配置：<br>" +
                "消息：" + testMessage + "<br>" +
                "超时时间：" + testTimeout + "<br>" +
                "开关状态：" + testSwitch;
    }

    @GetMapping("/db")
    public String getDbConfig() {
        return "数据库配置：<br>" +
                "url：" + url + "<br>" +
                "driver：" + driver + "<br>" +
                "username：" + username + "<br>" +
                "password：" + password + "<br>" +
                "redisUrl：" + redisUrl + "<br>" +
                "redisPassword：" + redisPassword + "<br>" +
                "redisUsername：" + redisUsername + "<br>";
    }
}