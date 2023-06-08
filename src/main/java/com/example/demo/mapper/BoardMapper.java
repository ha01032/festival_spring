package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardRequestDto;

@Mapper
public interface BoardMapper {
	void BoardWrite(BoardRequestDto board);
	List<BoardDto> BoardList();
	BoardDto BoardSelect(Long id);
	void BoardDelete(Long id);
}
