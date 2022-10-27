package org.zerock.mapper.lecture;

import java.util.List;

import org.zerock.domain.lecture.JavaBean04;
import org.zerock.domain.lecture.JavaBean16;
import org.zerock.domain.lecture.JavaBean17;

public interface Mapper09 {
	
	String getCustomerNameById(int id);
	
	String getEmployeeFirstNameById(int id);
	
	List<String> getCustomerNameByCityAndCountry( String country, String city);
	
	String getSupplierNameByCityAndCountry(String country, String city);
	
	String getContactName(JavaBean04 bean1);
	
	String getSupplierContactName(JavaBean04 b1);

	List<String> getProductName(JavaBean16 p1, JavaBean17 p2);
}
