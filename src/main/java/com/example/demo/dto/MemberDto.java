package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public class MemberDto {
	
	private int userid;
	private String email;
	private String passwd;
	private String name;
	private LocalDateTime joindate;
	
	

}
