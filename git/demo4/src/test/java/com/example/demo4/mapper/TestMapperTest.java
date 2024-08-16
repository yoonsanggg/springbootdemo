package com.example.demo4.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 이거 없으면 자동주입 안됨
@SpringBootTest
public class TestMapperTest {
    @Autowired
    TestMapper test;

    @Test
    void testSelectTimeXml() {
        String timexml = test.selectTimeXml();
        assertNotNull(timexml);
    }
}
