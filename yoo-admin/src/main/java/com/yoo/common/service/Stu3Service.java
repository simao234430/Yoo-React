package com.yoo.common.service;

import com.yoo.common.bean.Stu3;
import com.yoo.common.mapper.Stu3Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Stu3Service {

    @Autowired
    Stu3Mapper stu3Mapper;

    public Stu3 getById(int id){
        return stu3Mapper.getById(id);
    }
}

