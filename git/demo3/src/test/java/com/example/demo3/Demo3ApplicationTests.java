package com.example.demo3;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo3.mapper.BookMapper;

@SpringBootTest
class Demo3ApplicationTests {

	@Autowired
	BookMapper mapper;

	// Junit 단위테스트를 실행 하기 위해 Test 어노테이션을 작성
	@Test
	void contextLoads() {
		String date = mapper.selectDate();
		// 값이 null인지 아닌지 판단
		// 테스트의 성공/실패를 판단하는 메서드
		// 
		assertNotNull(date);
	}

}
