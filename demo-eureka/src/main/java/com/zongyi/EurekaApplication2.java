package com.zongyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //使其可以注册服务
public class EurekaApplication2 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication2.class, args);
    }

}
