package com.example.jeffrey.apollostudyone;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableApolloConfig
public class ApolloStudyOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApolloStudyOneApplication.class, args);
        Config config = ConfigService.getAppConfig();
        System.out.println("读取到test.message：" + config.getProperty("test.message", "未找到"));
    }

}
