package com.example.demo6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo6.dto.BookDTO;
import com.example.demo6.service.BookService;

import lombok.extern.slf4j.Slf4j;



@Controller
// 로그남기기위해서 밑 어노테이션
@Slf4j
public class BookController {

    @Autowired
    BookService service;
    

    // RequestParam  =사용자가 요청한 값을 b_no의 값에 넣어줄거야
    // required : 필수여부 (기본값 : 필수) false로 한 이유는 필수 아니니까 안적어도 실행되게
    // b_no라는 이름으로 넘어온 값(name = "b_no")을 no변수에 저장

    @GetMapping("/book")
    public String getMethodName(@RequestParam(required = false, name ="b_no") String no
        // 화면에 데이터를 넘길 때 사용하는 객체
        , Model model) {
            log.info(no+"==================");
            BookDTO book = service.selectBook(no);
            if (no == null) {
                model.addAttribute("msg", "도서번호를 입력해주세요");
            return "book";
            }
            // 걍 로그 찍는거임

        if (book == null) {
            model.addAttribute("msg", no+ "도서를 찾을 수 없습니다");
            return "book";
        }
        model.addAttribute("book", book);
        return "book";
    }

    @GetMapping("/bookInsert")
    public String getMethodName(BookDTO book, Model model) {
        // title, author
        log.info(book.toString());
        if (book.getTitle()== null || book.getAuthor() == null) {
            model.addAttribute("msg", "데이터가 충분하지 않아요!");
            return "bookInsert";
            
        }
        int res = service.insertBook(book);
        // "res" 라는 이름으로 res에 담아주는거임
        model.addAttribute("res", res);
        return "bookInsert";
    }

    @GetMapping("/bookList")
    public String getMethodName(Model model) {
        List<BookDTO> list = service.selectBookList();
        // "list" : 화면에서 사용될 이름 ${list}
        model.addAttribute("list", list);
        return "bookList";
    }
    
    


}
