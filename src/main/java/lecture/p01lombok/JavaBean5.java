package lecture.p01lombok;

import lombok.Data;


//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
//@RequiredArgsConstructor
@Data // 위 5개의 어노테이션을 한번에 적용함.
public class JavaBean5 {
	private String name;
	private int age;
}
