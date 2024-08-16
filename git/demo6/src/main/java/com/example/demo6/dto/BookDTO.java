package com.example.demo6.dto;

import lombok.Data;

@Data
public class BookDTO {


    private String b_no;
    private String title;
    private String author;
    private String price;
    // 데이터 담는 그릇 역할을 하는 애들은 직접 접근을 막아놔야함 setter랑 getter로 접근 ㄱㄱ혓

}
