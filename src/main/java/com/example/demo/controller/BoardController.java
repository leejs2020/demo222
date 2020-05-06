package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BoardService;
import com.example.demo.vo.BoardVo;

@RestController
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public List<BoardVo> boardListAll(){
		
		return boardService.getAllBoardList();
	}
}
