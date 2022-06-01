package gmail.jaydenkhr.part20;

import java.util.List;

public interface ItemDAO {
	//데이터 삽입
	//데이터 수정
	//데이터 삭제
	//데이터 조회
	//데이터 조회(itemname에 포함된)
	//데이터 조회(itemname에 포함된, 2개씩)
	
	public int insertItem(Item item);
	
	public int modifyItem(Item item);
	
	public int deleteItem(Item item);
	
	public List<Item> allItem();
	
	public List<Item> searchItem(String itemname);
	
	public List<Item> searchItem(String itemname, int pageno);
	
	

}
