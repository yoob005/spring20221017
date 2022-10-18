package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.Getter;

@Controller
@RequestMapping("ex05")
public class Controller05 {
	
	@RequestMapping(value = "sub01", method = RequestMethod.GET)
	private void method1() {
		System.out.println("method1 !!!");
	}
	
	//requestMapping (method = requestMethod.get)
	@GetMapping("sub02")
	private void method2() {
		System.out.println("method22222");
	}
	@PostMapping("sub03")
	private void method3() {
		System.out.println("method3333");

	}
	
	@GetMapping("sub04")
	private void method4() {
		System.out.println("method444");

	}
	
	@PostMapping("sub05")
	private void method5() {
		System.out.println("method555");

	}
	
}
