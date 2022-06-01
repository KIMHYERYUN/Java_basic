package gmail.jaydenkhr.sixth_1;

public class Derived extends Based {
       //에러 발생
	   //상위 클래스에 매개변수가 없는 생성자가 없어서 생성자를 만들고
	   //상위 클래스의 생성자를 직접 호출
	   public Derived() {
		   super(1);

	}

}
