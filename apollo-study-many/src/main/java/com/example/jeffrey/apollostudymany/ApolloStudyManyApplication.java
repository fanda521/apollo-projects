package com.example.jeffrey.apollostudymany;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class ApolloStudyManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloStudyManyApplication.class, args);
    }

}
