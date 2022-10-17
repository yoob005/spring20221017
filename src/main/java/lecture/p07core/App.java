package lecture.p07core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lecture.p06core.Dao;
import lecture.p06core.Service;

public class App {
	public static void main(String[] args) {
		
		String loc = "/lecture/p06core/context.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(loc);
		
		Service s = context.getBean(Service.class);
		Dao d = context.getBean(Dao.class);
		
		System.out.println(s);
		System.out.println(d);
		
		System.out.println(s.getDao()); // 
		
		System.out.println("프로그램 계속 실행");
	}
}
