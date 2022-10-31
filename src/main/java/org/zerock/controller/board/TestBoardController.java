package org.zerock.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.board.TestBoardDto;
import org.zerock.service.board.TestBoardService;

@Controller
@RequestMapping("board")
public class TestBoardController {
	
	@Autowired
	private TestBoardService service;
	
	@GetMapping("testRegister")
	public void register() {
	}
	
	@PostMapping("testRegister")
	public String register(TestBoardDto board) {
		int cnt = service.register(board);
		return "redirect:/board/testList";
	}
	
	@GetMapping("testList")
	public void	list(Model model) {
		List<TestBoardDto> list = service.listBoard();
		
		model.addAttribute("boardList",list);
	}
	
	@GetMapping("testGet")
	public void get(int id, Model model) {
		TestBoardDto board = service.get(id);
		
		model.addAttribute("board", board);
	}
}












