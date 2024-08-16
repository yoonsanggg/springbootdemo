package com.example.demo6.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.example.demo6.dto.BookDTO;
import java.util.List;

// properties 설정을 마치고 메퍼에 어노테이션
@Mapper
public interface BookMapper {

    @Select("select sysdate from dual")
    String selectDate();

    String selectDateXml();

    BookDTO selectBook(String no);
    
    
    int insertBook(BookDTO book);
    
    List<BookDTO> selectBookList();
}
