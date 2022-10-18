package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("ex04")
public class Controller04 {
	@RequestMapping("sub01")
	private void method1() {
		System.out.println("메소드01 일함.");
	}
	
	@RequestMapping(value = "sub02", method=RequestMethod.GET)
	private void method2() {
		System.out.println("메소드02 일함.");

	}
	
	@RequestMapping(value = "sub02", method=RequestMethod.POST)
	private void method3() {
		System.out.println("메소드03 post 일함.");

	}
	@RequestMapping(value="sub03", method = {RequestMethod.GET, RequestMethod.POST})
	private void method5() {
		System.out.println("ex04 method5");

	}
	
	@RequestMapping(value="sub04" , method = {RequestMethod.GET, RequestMethod.POST})
	private void method6() {
		System.out.println("ex04 method6");

	}
	
	@RequestMapping(value = "sub05" , method = {RequestMethod.GET,RequestMethod.POST})
	private void method7() {
		// TODO Auto-generated method stub

	}
}
