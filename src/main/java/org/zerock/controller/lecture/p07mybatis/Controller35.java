package org.zerock.controller.lecture.p07mybatis;

import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean17;
import org.zerock.mapper.lecture.Mapper09;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("ex35")
public class Controller35 {
	
		@Autowired
		private Mapper09 mapper;
	
		@RequestMapping("sub01")
		public void method1() {
			String name1 = mapper.getCustomerNameById(1);
			String name2 = mapper.getCustomerNameById(2);
			
			System.out.println(name1);
			System.out.println(name2);
		}
		
		@RequestMapping("sub02")
		public void method2() {
			String name1 = mapper.getEmployeeFirstNameById(1);
			String name2 = mapper.getEmployeeFirstNameById(2);
			
			System.out.println(name1);
			System.out.println(name2);
		}
		
		@RequestMapping("sub03")
		public void method3() {
			List<String> berlin = mapper.getCustomerNameByCityAndCountry("Germany","Berlin");
			List<String> london = mapper.getCustomerNameByCityAndCountry("UK","London" );
			
			System.out.println(berlin);
			System.out.println(london);
		}
		
		@RequestMapping("sub04")
		public void method4() {
			String londona = mapper.getSupplierNameByCityAndCountry("USA","New Orleans");
			String newOl = mapper.getSupplierNameByCityAndCountry("UK","Londona" );
			
			System.out.println(londona);
			System.out.println(newOl);
		}
		
		@RequestMapping("sub05")
		public void method5(JavaBean04 p) {
			String c1 = mapper.getContactName(p);
			System.out.println(c1);
		}
		
		@RequestMapping("sub06")
		public void method6(JavaBean04 b) {
			String c = mapper.getSupplierContactName(b);
			System.out.println(c);
		}
		
		@RequestMapping("sub07")
		public void method7(JavaBean16 p1, JavaBean17 p2) {
			List<String> list = mapper.getProductName(p1, p2);
			list.forEach(System.out::println);
		}
}
























