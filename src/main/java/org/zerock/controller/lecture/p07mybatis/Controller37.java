package org.zerock.controller.lecture.p07mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.domain.lecture.JavaBean19;
import org.zerock.mapper.lecture.Mapper11;

@Controller
@RequestMapping("ex37")
public class Controller37 {
	@Autowired
	private Mapper11 mapper;

	@GetMapping("sub01")
	public void method(
			@RequestParam(name="id",defaultValue = "0") int id,
			Model model) {
		// 1. 수정하기 전 고객정보 얻기
		JavaBean18 customer = mapper.getCustomerById(id);
		// 2. 모델에 어트리뷰트로 추가하고
		model.addAttribute("customer", customer);
		// 3. forward
		
	}
	
	@PostMapping("sub01")
	public String method(JavaBean18 customer, RedirectAttributes rttr) {
		// 1. 파라미터 수집
		
		// 2. 비지니스 로직 처리
		int cnt = mapper.updateCustomer(customer);
		System.out.println(cnt + "개 고객 정보 수정됨");
		
		// 3. 어트리뷰트 추가
		rttr.addAttribute("id", customer.getId());
		
		// 4. 리다이렉트
		return "redirect:/ex37/sub01";
	}
	
	// 공급자정보 변경 코드 작성
	// 경로 : sub02
	// 빈 : JavaBean19
	@GetMapping("sub02")
	public void getMethod2(Integer id, Model model) {
		// id 파라미터 받고
		// 공급자정보 조회
		JavaBean19 supplier = mapper.getSupplierById(id);
		// 모델에 공급자정보 넣고
		model.addAttribute("supplier", supplier);
		// 포워드
	}
	
	@PostMapping("sub02")
	public String postMethod2(JavaBean19 supplier, RedirectAttributes rttr) {
		int cnt = mapper.updateSupplier(supplier);
		
		rttr.addAttribute("id", supplier.getId());
		return "redirect:/ex37/sub02";
	}
}









