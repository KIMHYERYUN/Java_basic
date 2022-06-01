package gmail.jaydenkhr.eleventh;

import java.util.ArrayList;
import java.util.List;

public class Receipt {


	//표현할 속성 나열
	//점포명-문자열
	//구매월-정수
	//구매일-정수
	//구매요일-문자열
	//구매수량-정수
	//구매품목-문자열 목록(개수는 유동적 - List)
	//구매단가-정수
	//총물품가액 = 구매수량 * 구매단가로 계산 (파생속성:다른 속성으로 인해 생성)
	//부가세-소수 = 구매금액 * 세금율(10%) 계산
	//합계-정수 = 구매금액 + 부가세 계산
	//카드번호-정수
	//결제구분-문자열
	//포인트번호-문자열
	//포인트-소수 = 합계 * 포인트육(1%) 계싼
		
		private String store;
		private int month;
		private int date;
		private char day;
		private int count;
		//데이터 목록
		private List<String> item;
		private int unitprice;
		private int price;
		private double tax;
		private double pay;
		private long cardnumber;
		private String howtopay;
		private int pointnumber;
		private double point;

		
		
		public String getStore() {
			return store;
		}
		public void setStore(String store) {
			this.store = store;
		}
		public int getMonth() {
			return month;
		}
		public void setMonth(int month) {
			this.month = month;
		}
		public int getDate() {
			return date;
		}
		public void setDate(int date) {
			this.date = date;
		}
		public char getDay() {
			return day;
		}
		public void setDay(char day) {
			this.day = day;
		}
		public int getCount() {
			return count;
		}
		public void setCount(int count) {
			this.count = count;
		}
		public List<String> getItem() {
			return item;
		}
		public void setItem(List<String> item) {
			this.item = item;
		}
		public int getUnitprice() {
			return unitprice;
		}
		public void setUnitprice(int unitprice) {
			this.unitprice = unitprice;
		}
		public int getPrice() {
			//파생 속성은 가져오기 전에 계산을 하면 된다.
			price = count * unitprice;
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public double getTax() {
			tax = price * 0.1;
			return tax;
		}
		public void setTax(double tax) {
			this.tax = tax;
		}
		public double getPay() {
			pay = price + tax;
			return pay;
		}
		public void setPay(double pay) {
			this.pay = pay;
		}
		public long getCardnumber() {
			return cardnumber;
		}
		public void setCardnumber(long cardnumber) {
			this.cardnumber = cardnumber;
		}
		public String getHowtopay() {
			return howtopay;
		}
		public void setHowtopay(String howtopay) {
			this.howtopay = howtopay;
		}
		public int getPointnumber() {
			return pointnumber;
		}
		public void setPointnumber(int pointnumber) {
			this.pointnumber = pointnumber;
		}
		public double getPoint() {
			point = pay * 0.01;
			return point;
		}
		public void setPoint(double point) {
			this.point = point;
		}

	
		@Override
		public String toString() {
			return "Receipt [store=" + store + ", month=" + month + ", date=" + date + ", day=" + day + ", count="
					+ count + ", item=" + item + ", unitprice=" + unitprice + ", price=" + price + ", tax=" + tax
					+ ", pay=" + pay + ", cardnumber=" + cardnumber + ", howtopay=" + howtopay + ", pointnumber="
					+ pointnumber + ", point=" + point + "]";
		}
		//생성자 초기화 작업
		//메모리 할당을 해야하는 속성들의 메모리 할당을 생성자에서
		//미리해주면 외부에서 메모리 할당을 하지 않아서 발생하는
		//NullPointerException을 줄일 수 있다.
		public Receipt() {
				//점포당 고객이름을 저장할 List에 메모리 할당
				item = new ArrayList<>();
		}
		
		
	}


