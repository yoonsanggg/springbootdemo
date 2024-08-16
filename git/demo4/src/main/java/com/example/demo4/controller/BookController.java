package com.example.demo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo4.service.BookService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class BookController {
    
    @Autowired
    BookService service;


    @GetMapping("/bookList")
    //required  필수값에 대한 정보
    // 사용자가 넘긴 param이라는 변수를 param에 저장할거야
    public String getMethodName(

        


        //사용자의 입력정보 수집
        // required : 필수, name : name속성의 값
        // 쿼리스트링~
        // http://localhost/bookList?title= 여기에 넣은 값 바로 타이틀로 나옴

        // name으로 받아서 value 로 반환한다
        @RequestParam(required = false, name = "title") String title
        , Model model) {

            model.addAttribute("title", "도서목록");
            model.addAttribute("title", title);
            
            String time = service.selectTime();
            log.info(time + "================");
            model.addAttribute("time", time);
            
            String timexml = service.selectTimeXml();
            model.addAttribute("timexml", timexml);
            return "book/bookList";
    }
    

}
