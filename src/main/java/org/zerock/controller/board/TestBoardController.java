package org.zerock.controller.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	
	@GetMapping("testModify")
	public void modify(int id, Model model) {
		TestBoardDto board = service.get(id);
		model.addAttribute("board", board);
	}
	
	@PostMapping("testModify")
	public String modify(TestBoardDto board, RedirectAttributes rttr) {
		
		int cnt = service.update(board);

		if(cnt==1) {
			System.out.println("수정완료");
		} else {
			System.out.println("수정 ㄴㄴ");
		}
		
		return "redirect:/board/testList";
	}
	
	@PostMapping("testRemove")
	public String remove(TestBoardDto board, RedirectAttributes rttr) {
		
		int cnt = service.delete(board);
		
		if(cnt==1) {
			System.out.println("삭제완료");
		} else {
			System.out.println("삭제 ㄴㄴ");
		}
		
		return "redirect:/board/testList";
	}
}












