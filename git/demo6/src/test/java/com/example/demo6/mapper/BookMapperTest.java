package com.example.demo6.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo6.dto.BookDTO;



@SpringBootTest
public class BookMapperTest {
    
    // BookMapper mapper = new BookMApper(); 원래 이렇게 썼었잖슴

    @Autowired
    BookMapper mapper;

    @Test
    void testSelectDate() {
        String date = mapper.selectDate();
        // 예상결과와 실행결과 비교
        assertNotNull(date);
        // assertEquals(date, date); 앞뒤 똑같은지 비교
    }

    @Test
    void testSelectDateXml() {
        String date = mapper.selectDateXml();
        assertNotNull(date);
    }

    @Test
    void testSelectBook() {
        BookDTO book = mapper.selectBook("B00200");
        // 예상한 값을 앞에 // 메서드 실행결과 확인
        assertEquals("나인원한남",book.getTitle());
    }

    @Test
    void testInsertBook() {
        // Book은 생성자를 사용해서 만들어주고
        BookDTO book = new BookDTO();
        // 생성자 만든 이유는 테스트 하는데 BookDTO 갖다 쓸 방법이;;
        book.setTitle("제목테스트");
        book.setAuthor("작가테스트");
        int res = mapper.insertBook(book);
        assertEquals(1, res);
        // 난 1을 예상해 실제 값과 비교해줘
        
    }

    @Test
    void testSelectBookList() {
        
    }
}
