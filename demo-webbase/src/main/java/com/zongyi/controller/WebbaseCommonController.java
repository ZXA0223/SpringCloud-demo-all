package com.zongyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebbaseCommonController {

    @RequestMapping("index")
    public String index() {
        System.out.println("-------");
        return "index";
    }
}
