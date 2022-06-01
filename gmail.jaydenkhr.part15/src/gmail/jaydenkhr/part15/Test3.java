package gmail.jaydenkhr.part15;

import org.junit.Test;
import junit.framework.Assert;

public class Test3 {
	@Test
	public void test() {
		int result = new Sample().intAddWithInt(10, 50);
		int i = 60;
		Assert.assertEquals(result, i);
		//결과 값이 같은 지 확인
		//같으면 정상종료, 다르면 예외 발생
	}
}
