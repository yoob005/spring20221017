package lecture.p09core;

import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
public class Servlet {

	private Dao dao;
}
