package com.yoo.common.mapper;

import com.yoo.common.bean.Stu3;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface Stu3Mapper {

    @Select("select * from stu3 where id = #{id}")
    public Stu3 getById(int id);
}

