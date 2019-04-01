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

    @RequestMapping("test")
    public String test(String name){
        return testService.test(name);
    }
}
