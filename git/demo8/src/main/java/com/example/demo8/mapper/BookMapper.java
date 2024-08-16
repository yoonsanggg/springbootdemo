package com.example.demo8.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo8.dto.BookDto;

@Mapper
public interface BookMapper {

    @Select("select sysdate from dual")
    public String selectDate();
    


    // 도서 상세정보 1건 조회
    
    BookDto selectBook(String b_no);

    // 도서 입력
    // 여러개 하면 힘드니까 dto 객체로 운반 (하나의 객체에 담아서)
    List<BookDto> selectBookList();
    
    int insertBook(BookDto dto);

    // 도서 수정
    int updateBook(BookDto dto);

    // 도서 삭제 
    // 얘는 pk만 알고 있으면 삭제 할 수 있으니까
    // ${ } 는 문자 처리가 되지 않는다 매개변수로 받아와서 쓸 떄는 $
    @Delete("delete from tb_book where b_no = #{b_no}")
    int deleteBook(String b_no);


}
