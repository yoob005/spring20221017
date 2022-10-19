package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;

import lombok.Data;

@Controller
@RequestMapping("ex17")
public class Controller17 {
	
	@RequestMapping("sub01")
	public void method1(Model model) {
		model.addAttribute("myName" , "cha bum");
	}
	
	@RequestMapping("sub02")
	public void method2(Model model) {
		model.addAttribute("email", "abc@daum.net");
	}
	@RequestMapping("sub03")
	public void method3(Model model) {
		model.addAttribute("name", "Son");
		model.addAttribute("address", "London,UK");
		model.addAttribute("age", "31");
		model.addAttribute("email", "son@cha.park");
	}
	
	@RequestMapping("sub04")
	public void method4(Model model) {
		JavaBean03 obj = new JavaBean03();
		obj.setAvg(9.99);
		obj.setClassName("spring");
		obj.setLocation("seoul");
		obj.setScore(100);
		obj.setStudentNumber("s80");
		model.addAttribute("student", obj);
	}
	
	
	@RequestMapping("sub05")
	public void method5(Model model) {
		Student s = new Student();
		s.setStudentNumber("13");
		s.setClassName("soccer");
		s.setName("jisung park");;
//		model.addAttribute("student", s);
		model.addAttribute(s);
		model.addAttribute("hello");
	}
}


	















































