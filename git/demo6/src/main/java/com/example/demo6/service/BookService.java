package com.example.demo6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo6.dto.BookDTO;
import com.example.demo6.mapper.BookMapper;

@Service
public class BookService {

    // 자동 주입받고
    @Autowired
    // 매퍼를 자동 주입받음, 
    BookMapper mapper;

    public BookDTO selectBook(String no){
        return mapper.selectBook(no);
    }
    public int insertBook(BookDTO book){
        // 도서정보 등록 = DB에 입력한다
        int res = mapper.insertBook(book);
        return res;
    }
    public List<BookDTO> selectBookList() {
       return mapper.selectBookList();
    }
    
    
}
