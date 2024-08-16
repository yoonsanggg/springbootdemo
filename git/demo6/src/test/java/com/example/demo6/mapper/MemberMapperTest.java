package com.example.demo6.mapper;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo6.dto.MemberDto;

@SpringBootTest

public class MemberMapperTest {

    @Autowired
    MemberMapper mapper;

    @Test
    void testSelectMember() {
        MemberDto member = mapper.selectMember("M00002");
        assertEquals("GOGO",member.getId());
        
    }


}
