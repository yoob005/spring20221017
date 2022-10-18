package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex03")
public class Controller03 {
	
	@RequestMapping({"sub01", "sub02", "sub03"})
	public void method1() {
		System.out.println("ex03 method1");
	}
	
	@RequestMapping({"sub04", "sub05"})
	public void method2() {
		System.out.println("ex03 method2");
	}
	
	@RequestMapping(value = "sub06")
	public void method3() {
		System.out.println("ex03 method3");

	}
	
	@RequestMapping(path = "sub07")
	public void method4() {
		System.out.println("ex03 method4");

	}
	
}
