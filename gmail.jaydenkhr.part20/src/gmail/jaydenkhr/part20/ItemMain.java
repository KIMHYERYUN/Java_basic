package gmail.jaydenkhr.part20;

import java.util.List;


public class ItemMain {

	public static void main(String[] args) {
		//연결확인
		//new DAO();

		//인스턴스 형성 - ItemDAO의 변수 = ItemDAOImpl의 인스턴스 생성
		ItemDAO dao = new ItemDAOImpl();
		
		/*
		//실제 데이터 삽입 테스트
		Item item = new Item();
		item.setItempart("과자");
		item.setItemname("촉촉한초코칩");
		item.setItemprice(3200);
		
		//데이터 삽입 성공여부 확인
		int result = dao.insertItem(item);
		if(result > 0) {
			System.out.println("데이터 삽입 성공");
		}else {
			System.out.println("데이터 삽입 실패");
		}
		*/
		/*
		Item item = new Item();
		item.setItemprice(3700);
		item.setItemname("촉촉한초코칩");
		
		int result = dao.modifyItem(item);
		if(result > 0) {
			System.out.println("데이터 수정 성공");
		}else {
			System.out.println("데이터 수정 실패");
		}
		*/
		/*
		//모든 테이블 가져오기
		List<Item> list = dao.allItem();
		for(Item item : list) {
			System.out.println(item);
		}
		*/
		
		List<Item> list = dao.searchItem("바", 1);
		if(list.size()==0) {
			System.out.println("데이터가 존재하지 않습니다.");
		}else {
			for(Item item : list) {
				System.out.println(item);
			}
		}
	}
}


