package com.example.demo4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo4.mapper.BookMapper;

@Service
public class BookService {
    @Autowired
    BookMapper  mapper;
    
    public String selectTime(){
        return mapper.selectTime();
    }

    public String selectTimeXml(){
        return mapper.selectTimeXml();
    }

}
