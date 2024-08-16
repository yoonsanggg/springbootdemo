package com.example.demo8.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo8.dto.MemberDto;

@SpringBootTest
public class MemberMapperTest {

    @Autowired
    MemberMapper mapper;

    @Autowired
    MemberDto member;

    @Test
    void testSelectMember() {
        member = mapper.selectMember("M00002");
        assertEquals("김윤상", member.getName());
    }

    @Test
    void testSelectMemberList() {
    List<MemberDto> list = mapper.selectMemberList();
    assertEquals(5, list.size());

    }
}
