package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardRequestDto;
import com.example.demo.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {
	@Autowired
    private final BoardMapper boardMapper;

    public void BoardWrite(final BoardRequestDto board){
        boardMapper.BoardWrite(board);
    }
    public List<BoardDto> BoardList() {
    	return boardMapper.BoardList();
    }
    
    public BoardDto BoardSelect(Long id) {
    	return boardMapper.BoardSelect(id);
    }
    
    public void BoardDelete(Long id) {
    	boardMapper.BoardDelete(id);
    }
}
