package com.zongyi.controller;

import com.zongyi.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("webTestController")
public class WebbaseTestController {

    @Autowired
    private TestService testService;
    private int i=0;

    @RequestMapping("test")
    public String test(String name){
        System.out.println(i++);
        return testService.test(name);
    }
}
