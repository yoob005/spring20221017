package org.zerock.controller.lecture.p01mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Controller01 {
	//서블릿에서 주로 했던일
	//1 요청 받고
	//2 리퀘스트 파라미터 수집
	//3 리퀘스트 파라미터 가공
	//4 비지니스 로직
	//5 애드 어트리뷰터
	//6 포워드
	
	@RequestMapping("/ex01/sub01")
	public void method1() {
		System.out.println("메소드 1번 일함.");
	}
	
	@RequestMapping("/ex01/sub02")
	public void method02() {
		System.out.println("메소드 2번 일함");
	}
	
	@RequestMapping("/ex01/sub03")
	public void method3() {
		System.out.println("메소드 3번 일함.");
	}
}
