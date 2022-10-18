package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex07")
public class Controller07 {

	@GetMapping("sub01")
	private void method1() {
		System.out.println("method1 !!!");
	}
	
	@GetMapping(value = "sub01", params="name")
	private void method2() {
		System.out.println("method2 @@@@");

	}
	
	@GetMapping("sub02")
	private void method3() {
		System.out.println("method3 ###");
	}
	
	@GetMapping(value = "sub02", params="address")
	private void method4() {
		System.out.println("method4 $$$");

	}
	@GetMapping(value = "sub03", params="address=seoul")
	private void method5() {
		System.out.println("method4 $$$");

	}
	
	@GetMapping
	private void method7() {
		System.out.println("7메소드");

	}
	
	@GetMapping(path="sub04" , params= {"name" , "age"})
	private void method8() {
		System.out.println("8 메소드");
		
	}
}
