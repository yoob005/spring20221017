package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex11")
public class Controller11 {
	
	@GetMapping("sub01")
	private void method1(@RequestParam("address")String address) {
		System.out.println(address);

	}
	
	@GetMapping("sub02")
	private void method2(@RequestParam String address) {
		/*
		 * request param의 이름과 method argument의 이름이 같으면
		 * 
		 * @RequestParam의 value 속성 생략 가능
		 */
		System.out.println(address);

	}
	
	@GetMapping("sub03")
	private void method3(String address) {
		/*
		 * 메소드 파라미터가 기본타입(8개 또는 wrapper) , String 이면
		 * @RequestParam이 붙은 것으로 간주함.
		 */
		System.out.println(address);

	}
	
	@GetMapping("sub04")
	private void method4(String city, Integer age, String name) {
		System.out.println(city);
		System.out.println(age);
		System.out.println(name);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
































