package org.zerock.controller.lecture.p05redirect;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex20")
public class Controller20 {
	//redirect때 데이터 넘겨 주는 방법
	
	@RequestMapping("sub01")
	public String method1() {		
		return "redirect:/ex20/sub02";
	}
	
	@RequestMapping("sub02")
	public String method2(String name) {
		System.out.println("리다이렉트 잘됨 sub02!!!");
		System.out.println(name);
		return null;
	}
	
	@RequestMapping("sub03")
	public String method3() {
		return "redirect:/ex20/sub04?address=seul&age=30";
	}
	
	@RequestMapping("sub04")
	public String method4(String address, String age) {
		System.out.println(address);
		System.out.println(age);
		return null;
	}
	
	
	
}
