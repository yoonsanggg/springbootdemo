package com.example.demo8.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo8.dto.BookDto;
import com.example.demo8.dto.MemberDto;
import com.example.demo8.service.MemberService;

import lombok.extern.slf4j.Slf4j;


@Controller
@Slf4j
public class MemberController {
    
    @Autowired
    MemberService service;

    @GetMapping("/member/memberList")
    public void memberList(Model model) {
        List<MemberDto> list = service.selectBookList();
        // 화면에 출력 ㄱㄱ혓
        model.addAttribute("list", list);
        log.info("/member/memberList");

    }

    @GetMapping("/member/memberDetail")
    public void getMethodName(@RequestParam (required = false ,name ="m_no")String m_no, Model model ) {
        log.info("/member/memberDetail");
        log.info("m_no : "+ m_no);
        if (m_no == null) {
            model.addAttribute("msg","사용자번호가 올바르지 않습니다.");
            return;
        }
        MemberDto member = service.selectmember(m_no);
        model.addAttribute("member", member);
    }

    
    @GetMapping("/member/memberWrite")
    public void getMethodName() {
    }
    
    
}
