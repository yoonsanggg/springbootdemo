package com.example.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo3.mapper.BookMapper;


@Controller

public class BookController {
    
    
    // 3. 메퍼 주입
    @Autowired
    BookMapper mapper;

    // 1. 모델 객체 받을 때 인터페이스로
    @GetMapping("/")
    public String getMethodName(Model model) {
        //  2.데이터베이스로부터 데이터를 조회
        String date = mapper.selectDate();
        // 화면에 출력하기위해 모델 객체에 저장
        model.addAttribute("date", date);
        // 화면 이름을 반환한다
        return "hello";


    }
    

}
