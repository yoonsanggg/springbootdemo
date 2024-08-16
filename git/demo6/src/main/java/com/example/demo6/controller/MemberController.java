package com.example.demo6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.example.demo6.dto.MemberDto;
import com.example.demo6.service.MemberService;

import lombok.extern.slf4j.Slf4j;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@Slf4j
public class MemberController {

    @Autowired
    MemberService service;

    @GetMapping("/member")
    public String getMethodName(@RequestParam(required = false, name = "m_no") String no
                                ,Model model) {
        log.info("============="+no);
        MemberDto member = service.selectMember(no);
        model.addAttribute("member",member);
        return "member";
    }
    
    @GetMapping("/insertMember")
    public String getMethodName(MemberDto member, Model model) {
        // MemberService.insertMember(member);

        return new String();
    }
    

}
