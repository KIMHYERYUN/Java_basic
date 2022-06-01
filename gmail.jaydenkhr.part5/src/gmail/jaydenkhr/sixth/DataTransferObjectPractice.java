package gmail.jaydenkhr.sixth;

public class DataTransferObjectPractice {

	public static void main(String[] args) {
       //한 사람의 전화번호만 저장
		DataTransferObject p1 = new DataTransferObject();
		//각 속성에 저장
		p1.setName("KHR");
		p1.setPurchase(3);
		p1.setAddress("서울시 양천구");
		p1.setGrade('A');
		p1.setPhone("01026089019");
		
		//각 속성을 출력
		System.out.println(p1.getName());       //이름만
		System.out.println(p1.getPurchase());   //구매수량만
		System.out.println(p1.getAddress());    //주소만
		System.out.println(p1.getGrade());      //등급만
		System.out.println(p1.getPhone());      //전화번호만
 		
		
	}

}
