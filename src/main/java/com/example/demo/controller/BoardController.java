package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BoardDto;
import com.example.demo.dto.BoardRequestDto;
import com.example.demo.service.BoardService;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BoardController {

	@Autowired
	private final BoardService boardService;
	
    @PostMapping("/board/write")
    public void write(@RequestBody final BoardRequestDto board) {
        boardService.BoardWrite(board);
    }
    @GetMapping("/board/list")
    public List<BoardDto> list () {
    	return boardService.BoardList();
    }
    
    @GetMapping("/board/select/{id}")
    public BoardDto select(@PathVariable("id") Long id) {
    	System.out.println(id);
    	return boardService.BoardSelect(id);
    }
    
    @GetMapping("/board/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	boardService.BoardDelete(id);
    }
}
