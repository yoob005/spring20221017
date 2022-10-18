package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex10")
public class Controller10 {
	
	@GetMapping(path = "sub01", params = "name")
	private void method1(@RequestParam("name") String name) {
		System.out.println(name);

	}
	
	@GetMapping("sub01")
	private void method2() {
		System.out.println("name 파라미터 없을때 일함.");

	}
	
	@GetMapping("sub02")
	private void method3(@RequestParam(name = "city", required = false) String c) {
		System.out.println(c);

	}
	
	@GetMapping("sub03")
	private void method4(@RequestParam(name = "address", required = false) String add) {
		System.out.println(add);

	}
	
	@GetMapping("sub04")
	private void method5(@RequestParam(name="city", defaultValue = "seoul") String c) {
		System.out.println(c);

	}
	
	@GetMapping("sub05")
	private void method7(@RequestParam(name="address", defaultValue = "seoul") String add) {
			System.out.println(add);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
