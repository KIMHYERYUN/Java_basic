package gmail.jaydenkhr.sixth;

public class Business1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 상품이름 설정 - static - 클래스 이름으로 사용가능
		BusinessBasic.category = "건강기능식품";
		
		//각가의 메뉴 생성
		BusinessBasic sale1 = new BusinessBasic();
		sale1.item = "비타민C";
	    sale1.grade = 'B';
	    sale1.stock = 126;
	    sale1.review = 3.85;
	    
	    BusinessBasic sale2 = new BusinessBasic();
	    sale2.item = "루테인";
	    sale2.grade = 'A';
	    sale2.stock = 5;
	    sale2.review = 4.3;
	    
	    //출력
	    //약국판매
	    System.out.println(BusinessBasic.category);
	    
	    System.out.println(sale1.item + ":" + sale1.grade + "등급" +","+ sale1.stock + "개 남음" +","+ sale1.review + "점");
	    System.out.println(sale2.item + ":" + sale2.grade + "등급" +","+ sale2.stock + "개 남음" +","+ sale2.review + "점");
	    
	    
	}

}
