package gmail.jaydenkhr.sixth;

import java.util.Arrays;

public class Purchase {
	
	//구매자명을 저장할 속성
	
	//구매가격을 저장할 속성
	
	//구매품목을 저장할 속성

	private String person;
	private int price;
	private String [] items;
	
	//매개변수가 없는 생성자 만듦-리턴이 없음
	//매개변수가 없는 생성자를 Default Constructor라고 함
	public Purchase() {
		person = "KHR";
		price = 59000;
		items = new String[3];
	}
	
	//매개변수가 있는 생성자
	//외부에서 주입받아서 초기화시키기 위한 생성자
	//매개변수가 없는 생성자가 있어서 생성자가 2개이므로 Overloading
    public Purchase(String irum, int n, String [] ar) {
	      person = irum;
          price = n;
          items = ar;
    }
	
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}


	//인스턴스를 문자열로 변환해주는 메서드
	//디버깅을 편리하게 하기위한 메서드
	//출력하는 메서드에 인스턴스 이름을 대입하면 자동으로 호출되기 깨문에
	@Override
	public String toString() {
		return "Purchase [person=" + person + ", price=" + price + ", items=" + Arrays.toString(items) + "]";
	}

	
}
