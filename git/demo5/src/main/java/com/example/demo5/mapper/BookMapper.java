package com.example.demo5.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookMapper {

    String selectTime();
}
