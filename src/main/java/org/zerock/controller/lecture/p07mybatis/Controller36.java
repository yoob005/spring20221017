package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;
import org.zerock.mapper.lecture.Mapper10;

@Controller
@RequestMapping("ex36")
public class Controller36 {
	
	@Autowired
	private Mapper10 mapper;
		
	@RequestMapping("sub01")
	public void method1() {
		int cnt = mapper.removeCustomer();
		System.out.println(cnt + " 개 삭제");
	}
	
	@RequestMapping("sub02")
	public void method2() {
		int cnt = mapper.removeEmployee(); // 1번 직원 삭제
		System.out.println(cnt + "개 직원 레코드 삭제됨");
	}
	
	@RequestMapping("sub03")
	public void method3(@RequestParam(name="id", defaultValue = "0") int id) {
		int cnt = mapper.removeCustomerById(id);
		System.out.println(cnt + "개 고객 삭제");
	}
	@RequestMapping("sub04")
	public void method4(@RequestParam(name="id", defaultValue = "0") int id) {
		int cnt = mapper.removeEmployeeById(id);
		System.out.println(cnt + "개 직원 레코드 삭제");
	}
	
	@RequestMapping("sub05")
	public void method5() {
		int cnt = mapper.addCustomer();
		System.out.println(cnt + "개 고객 정보 입력됨");
	}
	
	@RequestMapping("sub06")
	public void method6() {
		int cnt = mapper.addSupplier();
		System.out.println(cnt + " 개 공급자 정보 입력");
	}
	
	@RequestMapping("sub07")
	public void method7(JavaBean18 customer) {
		int cnt = mapper.insertCustomer(customer);
		
		System.out.println(cnt + " 개 고객 정보 입력됨");
				
				
	}
	
	@RequestMapping("sub08")
	public void method8(JavaBean19 supplier) {
		//1. req param 수집 / 가공
		//2 business logic
		int cnt = mapper.insertSupplier(supplier);
		System.out.println(cnt + " 개 공급자 입력됨");
		// 3. add attribute
		// 4. forward/redirect 
		// 1,3,4 안보이지만 다해주는중 
		
	}
	
	@GetMapping("sub09")
	public String getMethod9() {
		
		return "/ex36/sub07";
	}
	@PostMapping("sub09")
	public String postMethod9(JavaBean18 customer, RedirectAttributes rttr) {
		System.out.println("key:" + customer.getId()); // 0
		int cnt = mapper.insertCustomerAndGetKey(customer);
		System.out.println(cnt + " 개 고객정보 입력");
		System.out.println("key:" + customer.getId()); // 생성된 키값
		
		rttr.addFlashAttribute("message", customer.getId()+ "번 고객 등룍완료");
		return "redirect:/ex36/sub09";
	}
	
	@GetMapping("sub10")
	public String method10() {
		return "/ex36/sub08";
	}
	@PostMapping("sub10")
		public String postMethod10(JavaBean19 supplier, RedirectAttributes rttr) {
			
		int cnt = mapper.insertSupplierAndGetKey(supplier);
		System.out.println(cnt + " 개 공급자 정보 입력");
		rttr.addFlashAttribute("message", supplier.getId());
		return "redirect:/ex36/sub10";
		}
	
}























