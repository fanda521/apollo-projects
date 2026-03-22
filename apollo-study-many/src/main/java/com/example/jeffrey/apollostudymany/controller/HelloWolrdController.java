package com.example.jeffrey.apollostudymany.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lucksoul
 * @version 1.0
 * @date 2026/3/22 12:24
 */

@RestController
@RequestMapping("/apolloMany")
public class HelloWolrdController {

    @Value("${many.message}")
    private String message;


    @Value("${many.mysql.url}")
    private String url;

    @Value("${many.mysql.username}")
    private String username;

    @Value("${many.mysql.password}")
    private String password;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World! " + message + " " + url + " " + username + " " + password;
    }
}
