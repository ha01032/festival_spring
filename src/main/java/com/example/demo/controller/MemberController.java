package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MemberDto;
import com.example.demo.dto.MemberRequestDto;
import com.example.demo.service.MemberService;

import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberController {

	@Autowired
	private final MemberService memberService;
	
    @PostMapping("/login")
    public MemberDto login(@RequestBody final MemberRequestDto member) {
        return memberService.findMember(member);
    }
    
    @PostMapping("/signup")
    public String signup(@RequestBody final MemberDto member) {
        int check = memberService.insertMember(member);
        String checking = "fail";
        if (check == 1) {
        	checking = "success";
        }
        return checking;
    }

	
	
	
}
