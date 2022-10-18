package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex06")
public class Controller06 {

	//좀 더 구체적으로 requestMapping을 작성한 메소드가 우선권 갖는다.
	
	
	@GetMapping("sub01")
	private void method1() {
		System.out.println("method1 !!!");

	}
	
	@RequestMapping("sub01")
	private void method2() {
		System.out.println("method2 @@@");

	}
	
	@PostMapping("sub01")
	private void method3() {
		System.out.println("method3 ###");

	}
}
