package com.example.demo8.dto;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * setter, getter, toString,constructor(생성자) 자동완성
 */
@Data
@Component
public class BookDto {

    private String b_no;
    private String title;
    private String author;
    private String price;
    private String p_no;
    private String rentyn;
    private String r_no;
    private String regdate;

}
