package com.example.demo4.mapper;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.TestPropertySources;

// 빈 안에 넣어져야 실행 가능한데 테스트로 빈 만들어주는 어노테이션
// IOC 컨테이너에 been 객체를 생성
@SpringBootTest

public class BookMapperTest {

    @Autowired
    BookMapper mapper;


    @Test
    void testSelectTime() {
        String time = mapper.selectTime();
        // 테스트의 실행 결과값과 예상값을 비교하여 테스트의 성공유무를 판단
        assertNotNull(time);
    }

    @Test
    void testSelectTimeXml() {
        String timexml = mapper.selectTimeXml();
        assertNotNull(timexml);
    }

}
