package com.example.demo4.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookMapper {
    
    @Select("select sysdate from dual")
    String selectTime();

    String selectTimeXml();

}
