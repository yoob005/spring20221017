package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example1 {
	
	@Autowired
	private Example2 ex2;
	
	@Autowired
	public Example2 getEx2() {
		return ex2;
	}
}
