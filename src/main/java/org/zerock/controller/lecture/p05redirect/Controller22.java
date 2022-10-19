package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex22")
public class Controller22 {
	
	@RequestMapping("sub01")
	public String method1(Model model) {
		return "redirect:/ex22/sub02";
	}
	
	@RequestMapping("sub02")
	public void method2(Model model) {
		boolean hasName = model.containsAttribute("name");
		
		System.out.println(hasName);
	}
	
	@RequestMapping("sub03")
	public String method3(HttpSession session) {
		session.setAttribute("name" , "park jisung");
		
		return "redirect: /ex22/sub04";
	}
	
	@RequestMapping("sub04")
	public void method4(HttpSession session) {
		String name = (String) session.getAttribute("name");
		
		System.out.println(name);
	}
	
	@RequestMapping("sub05")
	public String method5(HttpSession session) {
		Student s = new Student();
		s.setClassName("son");
		s.setName("cha");
		s.setStudentNumber("park");
		session.setAttribute("name", s.getName());
		session.setAttribute("className", s.getClassName());
		session.setAttribute("studentNumber", s.getStudentNumber());
		
		return "redirect:/ex22/sub06";
	}
	
	@RequestMapping("sub06")
	public void method6(HttpSession session) {
		String name = (String) session.getAttribute("name");
		String className = (String) session.getAttribute("className");
		String studentName = (String) session.getAttribute("studentNumber");
		
		System.out.println(className);
		System.out.println(name);
		System.out.println(studentName);
	}
	
	
	//redirectAttribute로 객체 넘기기
	@RequestMapping("sub07")
	public String method7(RedirectAttributes rttr){
		Student student = new Student();
		student.setName("lee");
		student.setClassName("spring");
		student.setStudentNumber("99");
		
		rttr.addFlashAttribute("student", student);
		
		return "redirect: /ex22/sub08";
	}
	
	@RequestMapping("sub08")
	public void method8(@ModelAttribute Student student) {
		System.out.println(student);
	}
	
	@RequestMapping("sub09")
	public String method9(RedirectAttributes rttr) {
		JavaBean03 j = new JavaBean03();
		j.setAvg(85.5);
		j.setClassName("son");
		j.setLocation("london");
		j.setScore(7);
		j.setStudentNumber("hm7");
		
		rttr.addFlashAttribute("jb" , j);
		return "redirect:/ex22/sub10";
	}
	
	@RequestMapping("sub10")
	public void method10(JavaBean03 jb) {
		System.out.println(jb);
	}
	
}























