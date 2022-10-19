package org.zerock.controller.lecture.p04attribute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.lecture.JavaBean01;
import org.zerock.domain.lecture.JavaBean02;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex18")
public class Controller18 {
	
	
	@RequestMapping("sub01")
	public void method1(@ModelAttribute("bean") JavaBean01 b){
		
	}
	
	@RequestMapping("sub02")
	public void method2(@ModelAttribute("bean2") JavaBean02 b) {
		b.setAge(30);
		b.setEmail("aaa@bbb.ccc");
		b.setName("son");
		b.setPassword("qwer1234");
	}
	
	@RequestMapping("sub04")
	public void method3(Student s) {
		s.setClassName("soccer");
		s.setName("cha");
		s.setStudentNumber("10");
	}
}




































