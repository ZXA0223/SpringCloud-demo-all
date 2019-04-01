package com.zongyi.demoucenter.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ucenterTestController")
public class UCenterTestController {

    @Value("${testValue}")
    private String testValue;

    @RequestMapping("testMethod")
    public String testMethod(String name){
        System.out.println("UCenter收到数据"+name);
        return "hello "+name+"--"+testValue;
    }

}
