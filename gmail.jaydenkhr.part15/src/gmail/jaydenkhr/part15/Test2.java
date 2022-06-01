package gmail.jaydenkhr.part15;

import org.junit.Test;

public class Test2 {
//2.상속받지 않은 클래스에 대한 test는 Annotation 이용
 @Test
	public void test() {
		System.out.println(new Sample().intAddWithInt(10, 50));
		}
}
