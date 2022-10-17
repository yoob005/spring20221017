package lecture.p03core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		String configLocation = "/lecture/p03core/context.xml";
		ApplicationContext context; //spring
		context = new ClassPathXmlApplicationContext(configLocation);
		
		Servlet s = context.getBean(Servlet.class);
		Dao d = context.getBean(Dao.class);
		
		System.out.println(s);
		
		System.out.println("프로그램 계속 실행");
		
		
	}
}
