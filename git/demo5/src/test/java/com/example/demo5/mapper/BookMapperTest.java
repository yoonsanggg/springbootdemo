package com.example.demo5.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class BookMapperTest {
    
    @Autowired
    BookMapper mapper;

    @Test
    void testSelectTime() {
        String time = mapper.selectTime();
        assertNotNull(time);
    }


}
