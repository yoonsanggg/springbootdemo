package com.example.demo8.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo8.dto.BookDto;

// Spring IOC 컨테이너를 생성하고 객체릴 미리 생성해둡니다.
@SpringBootTest
public class BookMapperTest {
    @Autowired
    BookDto book;

    @Autowired
    BookMapper mapper;

    @BeforeEach
    public void before(){
        book.setB_no(null);
        book.setAuthor("작가명");
        book.setTitle("도서명");
    }

    @Test
    void testSelectDateg() {
        assertNotNull(book.getB_no());
    }

    @Test
    void testSelectDate() {
        String date =mapper.selectDate();
        assertNotEquals("date", date);

    }

    @Test
    public void testSelectBook() {
        BookDto book = mapper.selectBook("B00001");
        assertEquals(book.getTitle(),"제목");
    }

    @Test
    public void testSelectBookList() {
        List<BookDto> list = mapper.selectBookList();
        assertEquals(19, list.size() );
    }

    @Test
    void testDeleteBook() {
        
    }

    @Test
    void testInsertBook() {
       int res = mapper.insertBook(book);
       assertEquals(1, res);
    }

    @Test
    void testUpdateBook() {
        
    }
}
