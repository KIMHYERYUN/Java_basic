package gmail.jaydenkhr.sixth;

public class PurchasePractice {

	public static void main(String[] args) {
		//메소드는 {} 안에서 만든 지역변수는 자동으로 초기화 되지 않습니다.
		int a = 0 ; //값을 줘야한다(int a;는 에러)
		System.out.println(a);
		
		//인스턴스 생성
		Purchase purchase1 = new Purchase();
		//멤버 변수는 자동으로 초기화
		//숫자는 0, boolean은 false, 그 이외는 null로 초기화
		System.out.println(purchase1.getPerson());
		System.out.println(purchase1.getPrice());
		System.out.println(purchase1.getItems());
		
		
		//nullPointerException : null의 값이 찾아가지 못함(stack -> heap)
		//System.out.println(purchase1.getItems()[0]); 
        //방법1.인스턴스를 만들고 setter 메서드 호출하여 속성값 설정
		
		//setter를 이용해서 데이터 주입(Dependency Injection)
		//purchase1.setPerson("KHR");
		//배열을 생성해서 대입
		//int [] ar = new int [3];
		//purchase1.setItems(ar);
		
		
		//방법2.생성자 이용
        //2-1. 매번 고정된 값으로 초기화
		
		//purchase.java 가서 매개변수가 없는 생성자 만들기 - 기본값을 무엇으로 할지 설정
		Purchase purchase2 = new Purchase("KWJ", 32000, new String[3]);
		System.out.println(purchase2.getPerson().toUpperCase());
		System.out.println(purchase2.getPrice());
		System.out.println(purchase2.getItems()[0]);
		
		
		//2-2. 
		//
		System.out.println(purchase1.getPerson().toUpperCase());
		System.out.println(purchase1.getPrice());
		System.out.println(purchase1.getItems()[0]);
		
		
		
		
	}

}
