package gmail.jaydenkhr.part15;

import junit.framework.TestCase;

//1. TestCase 상속받은 class 생성
public class Test1 extends TestCase {
	public void test() {
		System.out.println(new Sample().intAddWithInt(10, 50));
	}
	//run - Junit test 실행 : 문제여부 확인
	
}
