package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * 1. 사용자의 요청을 수집
 * 2. 처리하기 위해 Secvice를 호출
 * 3. 처리결과를 저장하고
 * 4. 응답할 화면의 이름을 반환합니다.
 */

@Controller
public class HelloController {

    /** 
     * get 방식의 경로가 호출되었을 때
     * 내부적으로 얘를 실행시켜주는거임
    */
    @GetMapping("/hello")
    public String getMethodName() {
        /**
         * 응답할 화면의 이름을 반환한다
         * 만약 templates폴더의 하위 폴더에 파일이 위치한경우
         * 폴더의 경로를 함께 작성해야함!!
         * ViewResolver에 의해 설정파일에서 지정한 경로와 확장자가 붙여진다
         */
        return "first/hello123";
    }
    

}
