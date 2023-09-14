package com.yoo.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    //打印示例
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello";
    }


}
