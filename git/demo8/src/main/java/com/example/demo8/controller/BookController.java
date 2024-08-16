package com.example.demo8.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo8.dto.BookDto;
import com.example.demo8.service.BookService;


@Controller
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/book/bookList")
    public String selectBookList(Model model) {
        // 이거랑 아래 두줄이랑 똑같음
        // model.addAttribute("list", service.selectBookList());
        List<BookDto> list = service.selectBookList();
        model.addAttribute("list", list);

        // 화면에 보여줄 떄 데이터를 담는 객체
        model.addAttribute("title", "도서목록");
        // 표현식으로 ${}
        // @{link} 링크 지정하기 위해서 사용
        // *{field}  ex) book.title // th:ojbect 로 지정후 사용
        return "book/bookList";
    }

    /**
     * 상세페이지
     * 
     * 요청경로와 반환값이 동일 한 경우, return 문은 생략 가능
     * @param param
     */
    @GetMapping("/book/bookDetail")
    public void getMethodName(@RequestParam(required = false, name ="b_no") String no, 
    Model model ) {
        BookDto book = service.selectBook(no);
        if (book != null) {
            model.addAttribute("b_no", book);
        } 
        else if (book == null) {
            System.out.println("잘못된 멤버번호 입니다.");
        }
        

    }
    
    

}
