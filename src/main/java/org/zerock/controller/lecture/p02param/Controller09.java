package org.zerock.controller.lecture.p02param;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("ex09")
public class Controller09 {
	
	@GetMapping("sub01")
	private void method1(@RequestParam(name="address") String a) {
		System.out.println(a);

	}
	
	@GetMapping("sub02")
	private void method2(@RequestParam(name="name") String str) {
		System.out.println(str);

	}
	
	@GetMapping("sub03")
	private void method3(@RequestParam(value="name") String str) {
		System.out.println(str);

	}
	
	@GetMapping("sub04")
	private void method4(@RequestParam("name") String str) {
		System.out.println(str);

	}
	
	@GetMapping("sub05")
	private void method5(@RequestParam("name") String a,
							@RequestParam("address") String b)
	{
		System.out.println(a);
		System.out.println(b);

	}
	
	@GetMapping("sub06")
	
	private void method6(@RequestParam("q") String a, @RequestParam("age") String b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	@GetMapping("sub07")
	private void method7(@RequestParam int age) {
		System.out.println(age);

	}
	@GetMapping("sub08")
	private void method8(@RequestParam int num1 , @RequestParam int num2) {
		System.out.println(num1 + num2);

	}

	//request param => method param 바인딩 될 때
	//자동 형변환되는 type:
	// String , 기본타입 , wrapper
	
	@GetMapping("sub09")
	private void method9(@RequestParam("a") String a, @RequestParam("b") double b,
						@RequestParam("c") Double c, @RequestParam("d") int d,
						@RequestParam("e") Integer e
			) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}
}







































































