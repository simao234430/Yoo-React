package com.yoo.common.controller;

import com.yoo.common.bean.Stu3;
import com.yoo.common.service.Stu3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Stu3Controller {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    Stu3Service stu3Service;

    @ResponseBody
    @GetMapping("/stu")
    public Stu3 getById(@RequestParam("id") int id) {
        return stu3Service.getById(id);
    }
}
