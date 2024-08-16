package com.example.demo6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo6.dto.MemberDto;
import com.example.demo6.mapper.MemberMapper;



@Service
public class MemberService {

    @Autowired
    MemberMapper mapper;

    public MemberDto selectMember(String no){
        return mapper.selectMember(no);
    }

    public void insertMember(MemberDto member) {
        // int res = mapper.insertMember(member);
    }





}
