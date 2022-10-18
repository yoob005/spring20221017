package org.zerock.controller.lecture.p02param;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex12")
public class Controller12 {

	@GetMapping("sub01")
	private void method1(@RequestParam("city") String city) {
		System.out.println(city);

	}
	
	@GetMapping("sub02")
	private void method2(@RequestParam("city") String[] city) {
		System.out.println(Arrays.toString(city));

	}
	
	@GetMapping("sub03")
	private void method3(@RequestParam("city") List<String> city) {
		System.out.println(city);

	}
	
	@RequestMapping("sub04")
	private void method4(String name, String address, int age, String email, String password) {
		System.out.println("method4 일함.");
		System.out.println("이름 = " + name );
		System.out.println("주소 = " + address );
		System.out.println("나이 = " + age );
		System.out.println("이메일 = " + email );
		System.out.println("암호 = " + password );
	}
}
