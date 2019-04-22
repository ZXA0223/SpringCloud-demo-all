package com.zongyi.demoucenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaServer  //注册+发现服务
@EnableFeignClients  //远程调用
/*服务的提供者也可能会调用其他服务 所以两个同时写也没关系*/
public class DemoUcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoUcenterApplication.class, args);
    }

}