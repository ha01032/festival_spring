package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.MemberDto;
import com.example.demo.dto.MemberRequestDto;


@Mapper
public interface MemberMapper {
	
	MemberDto findMember(MemberRequestDto member);
	
	int insertMember(MemberDto member);
}
