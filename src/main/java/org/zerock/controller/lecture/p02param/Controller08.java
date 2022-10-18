package org.zerock.controller.lecture.p02param;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex08")
public class Controller08 {

	@GetMapping("sub01")
	private void method1() {
		System.out.println("method1 !!!");

	}
	
	@GetMapping("sub02")
	private void Method2(HttpServletRequest request) {
		System.out.println("method222");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		System.out.println(name);
		System.out.println(age);

	}
	
	@GetMapping("sub03")
	private void method3(HttpServletRequest request) {
		System.out.println("method3");
		
		String address = request.getParameter("address");
		
		System.out.println(address);

	}
	
}
