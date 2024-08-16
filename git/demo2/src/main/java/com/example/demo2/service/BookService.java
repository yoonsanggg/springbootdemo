package com.example.demo2.service;

import org.springframework.stereotype.Service;

@Service
public class BookService {


    // 제어의 역전?
    // 프레임워크가 객체의 생명주기를 관리한다
    public String selectDate(){
        String str = "날짜를 조회 후 반환";
        return str;

    };

}
