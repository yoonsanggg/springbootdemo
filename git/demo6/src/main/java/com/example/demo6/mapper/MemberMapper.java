package com.example.demo6.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo6.dto.BookDTO;
import com.example.demo6.dto.MemberDto;

@Mapper
public interface MemberMapper {

    // 쿼리를 실행 할 때 매개변수로 받아온 값을 이용
    MemberDto selectMember(String m_no);

    MemberDto insertMember(BookDTO book);
}
