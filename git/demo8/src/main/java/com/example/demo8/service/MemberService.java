package com.example.demo8.service;

import java.lang.reflect.Member;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo8.dto.MemberDto;
import com.example.demo8.mapper.MemberMapper;

@Service
public class MemberService {

    @Autowired
    MemberMapper mapper;
    
    public List<MemberDto> selectBookList(){
    return mapper.selectMemberList();
    }


    public MemberDto selectmember(String m_no){
    return mapper.selectMember(m_no);
    }

}
