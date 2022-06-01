package gmail.jaydenkhr.eleventh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class DataFrameMain {

	public static void main(String[] args) {
		List<Receipt> list = new ArrayList<>();

		Receipt receipt = new Receipt();
		receipt.setStore("편의점");
		receipt.setMonth(6);
		receipt.setDate(19);
		receipt.setDay('금');		//Char 형태는 작은따옴표 사용
		receipt.setCount(3);
		receipt.getItem().add("몽쉘");
		receipt.getItem().add("아리수");
		receipt.setUnitprice(1200);
		receipt.setCardnumber(9087128389872637L);   //Long 뒤에는 "L" 꼭 입력
		receipt.setHowtopay("일시불");
		receipt.setPointnumber(26089019);
		
		list.add(receipt);
		
		//새로운 데이터 생성해서 추가
		
		receipt = new Receipt();
		receipt.setStore("약국");
		receipt.setMonth(8);
		receipt.setDate(6);
		receipt.setDay('수');		//Char 형태는 작은따옴표 사용
		receipt.setCount(4);
		receipt.getItem().add("타이레놀");
		receipt.getItem().add("파스");
		receipt.getItem().add("텐텐");
		receipt.setUnitprice(2000);
		receipt.setCardnumber(123465746789L);   //Long 뒤에는 "L" 꼭 입력
		receipt.setHowtopay("6개월할부");
		receipt.setPointnumber(12093);
		
		list.add(receipt);
		
		
		receipt = new Receipt();
		receipt.setStore("푸드코트");
		receipt.setMonth(7);
		receipt.setDate(29);
		receipt.setDay('토');		//Char 형태는 작은따옴표 사용
		receipt.setCount(2);
		receipt.getItem().add("순두부찌개");
		receipt.getItem().add("콩국수");
		receipt.setUnitprice(8000);
		receipt.setCardnumber(123465746789L);   //Long 뒤에는 "L" 꼭 입력
		receipt.setHowtopay("일시불");
		receipt.setPointnumber(376801);
		
		list.add(receipt);
		
		
		//데이터 전체 읽어오기
		//빠른 열거 사용
		//읽어와야 계산값도 적용(주의)
		for(Receipt r : list) {
			System.out.print(r.getStore()+ "\t");
			System.out.print(r.getPrice() + "\t");
			System.out.print(r.getTax() + "\t");
			System.out.print(r.getPay() + "\t");
			System.out.print(r.getPoint()+"\t");
			//내부에 배열이나 List가 있으면 다시 순회
			for(String items : r.getItem()) {
			System.out.print(items + " ");
			}
			System.out.println();
		}
		System.out.println("==========================");
		//데이터 1개 가져오기
		//데이터 1개를 가져올 때는 인덱스나 구분에 사용하는 키를 알아야함
		System.out.println(list.get(0));
			
		System.out.println("==========================");
		//데이터 일부분 출력하기-2개만 출력하기
		int i=0;
		for(i=0; i<2; i=i+1) {
			System.out.println(list.get(i));
		}
		
		
		
		System.out.println("==========================");
		//데이터 정렬하기
		//이 경우에는 누구를 가지고 정렬할 것인지 결정필요
		//스캐너를 이용해서 문자열을 입력받아서 1을 누르면 팀이름의 오름차순으로
		//2를 누르면 승점의 내림차순으로 정렬해서 팀 이름만 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1.점포이름 오름차순 2.구매금액 내림차순 3.종료");
			String menu = sc.nextLine();
			//먼저 if구문을 이용해 각 경우를 먼저 열거
			if(menu.equals("1")) {
				list.sort(new Comparator<Receipt>() {
					@Override
					public int compare(Receipt o1, Receipt o2) {
						return o1.getStore().compareTo(o2.getStore());
					}					
				});				
			}else if(menu.equals("2")) {
				list.sort(new Comparator<Receipt>() {
					@Override
					public int compare(Receipt o1, Receipt o2) {
						//return o1.getPay() - o2.getPay();  -> 실수로 나오기때문에 오류
						//만일 실수라면(정수도 아래 방법 가능)
						double cha = o2.getPay() - o1.getPay();
						if(cha > 0) {
							return 1;
						}else if(cha < 0) {
							return -1;
						}else {
							return 0;
						}
						//꼭 정수를 리턴해야하기 때문이다
						//(실수를 정수로 변형해야하는데 가제형 변형은 안된다. 예를들어 0.2는 0이 된거기 때문에)
					}
				});
			}else if(menu.equals("3")) {
				System.out.println("종료");
				break;
			}else {
				System.out.println("잘못된 메뉴 선택");
			}
			//위에만 적을경우 데이터는 출력이 안되므로
			//전체 데이터를 출력
			for(Receipt r : list) {
				System.out.println(r.getStore());
			}
			}
		
	}


}

