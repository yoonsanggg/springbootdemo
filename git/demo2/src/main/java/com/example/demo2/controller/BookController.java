package com.example.demo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo2.service.BookService;

@Controller
@Slf4j

public class BookController {

    // 필요한 객체를 주입받는 어노테이션, 서비스 객체를 조립시켜준다~
    @Autowired
    BookService service;
 

    // 옆에있는 빈을 미리 만들어 놓고 (컨테이너 박스라고 생각)
    // 누가 부르면 Autowired 등 함수 이용해서 넣어주기만 하면됨



    @GetMapping("/bookList")
    // model : 화면에서 사용할 데이터를 저장하는 객체
    // 화면에 데이터 전달 하기 위해 Model 객체를 매개변수로 받아온다
    public String getMethodName(Model model) {
        
        
        // 어떤 이름으로 어떤 객체를 전달 여기서는 네임에서 이무진으로

        model.addAttribute("name", "이무진");
        // 서비스로부터 현재 날짜를 반환받아서 model 객체에 담아 화면에 출력
        String date = service.selectDate();
        model.addAttribute("date",date);
        return "book/bookList";
    }
    


}
