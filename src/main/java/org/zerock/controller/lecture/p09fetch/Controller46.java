package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("ex46")
@Controller
public class Controller46 {
	
	@RequestMapping("sub")
	public void method() {
		
	}
	
	@GetMapping("sub01")
	public String method1() throws Exception {
		
		System.out.println("db 작업중");
		
		Thread.sleep(5000);
		
		System.out.println("db 작업끝");
		
		return "hello world";
	}
} 
