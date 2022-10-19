package org.zerock.controller.lecture.p03forward;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ex15")
public class Controller15 {
	
	@RequestMapping("sub01")
	public void method1() {
		System.out.println("메소드 1 일함.");
	}
	
	@RequestMapping("sub02")
	public void method2() {		
	}
	
	@RequestMapping("sub03")
	public String method3() {
		return null
				; // void 처럼 default view name을 사용해서 view로 포워드함.
	}
	
	@RequestMapping("sub04")
	public String method4() {
		return null;
	}
	
	//sub05 요청
	//name request param이 있으면
	
	
	@RequestMapping("sub05")
	public String method5(String name) {
		if(name == null) {
			return null;
		} else {
			return "ex15/sub051";
		}
	}
	
	@RequestMapping(path = "sub06", params="address")
	public String method6() {
		return "ex15/sub061";
	}
	
	@RequestMapping("sub06")
	public void method7() {
		
	}
}





























