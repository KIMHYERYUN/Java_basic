package gmail.jaydenkhr.part20;

import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl extends DAO implements ItemDAO {

	@Override
	public int insertItem(Item item) {
		int result = -1;
		try {
			//sql 실행
			pstmt = con.prepareStatement("insert into item(itempart, itemname, itemprice) values(?,?,?)");
			//?바인딩
			pstmt.setString(1, item.getItempart());
			pstmt.setString(2, item.getItemname());
			pstmt.setInt(3, item.getItemprice());
			//pstmt 실행값 = result
			result = pstmt.executeUpdate();
			if(result >=0) {
				System.out.println("데이터 삽입 성공");
			}else {
				System.out.println("데이터 삽입 실패");
			}
			//데이터 정리
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public int modifyItem(Item item) {
		int result = -1;
		try {
			pstmt = con.prepareStatement("update item set itemprice=? where itemname=? ");
			
			pstmt.setInt(1, item.getItemprice());
			pstmt.setString(2, item.getItemname());
			
			result = pstmt.executeUpdate();
			if(result > 0) {
				System.out.println("데이터 수정 성공");
			}else {
				System.out.println("데이터 수정 실패");
			}			
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	public int deleteItem(Item item) {
		int result = -1;
		try {
			pstmt = con.prepareStatement("delete from Item where itemname = ?" );
			
			pstmt.setString(1, item.getItemname());
			
			result = pstmt.executeUpdate();
			if(result>0) {
				System.out.println("데이터 삭제 성공");
			}else {
				System.out.println("데이터 삭제 실패");
			}
			
			pstmt.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return result;
	}

	@Override
	//List를 리턴할 때는 데이터가 없으면 size 가 0
	public List<Item> allItem() {
		List<Item> list = new ArrayList<Item>();
		try {
			pstmt = con.prepareStatement("select * from item");
			
			rs = pstmt.executeQuery();
			
			//데이터 읽기
			while(rs.next()) {
				//하나의 데이터를 저장할 인스턴스를 생성
				Item item = new Item();
				
				item.setItemnum(rs.getInt("itemnum"));
				item.setItempart(rs.getString("itempart"));
				item.setItemname(rs.getString("itemname"));
				item.setItemprice(rs.getInt("itemprice"));
				
				//하나의 데이터를 list에 추가
				list.add(item);
			}
			pstmt.close();
			rs.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return list;
	}

	@Override
	public List<Item> searchItem(String itemname) {
		List<Item> list = new ArrayList<Item>();
		try {
			pstmt = con.prepareStatement("select * from item where item like ?");
			
			pstmt.setString(1, "%" + itemname + "%");
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				Item item = new Item();
				item.setItemnum(rs.getInt("itemnum"));
				item.setItempart(rs.getString("itempart"));
				item.setItemname(rs.getString("itemname"));
				item.setItemprice(rs.getInt("itemprice"));
				
				list.add(item);
			}
			pstmt.close();
			rs.close();
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		return list;
	}

	@Override
	public List<Item> searchItem(String itemname, int pageno) {
		List<Item> list = new ArrayList<Item>();
		
		try {
			pstmt = con.prepareStatement("select * from item where itemname like ? limit ?, 2");
			
			pstmt.setString(1, "%" + itemname + "%");
			//페이지번호는 1페이지:0, 2페이지:2, 3페이지:4
			pstmt.setInt(2, (pageno-1)*2);
		
			rs = pstmt.executeQuery();
			//데이터 읽기
			while(rs.next()) {
				Item item = new Item();
				item.setItemname(rs.getString("itemname"));
				item.setItemnum(rs.getInt("itemnum"));
				
				//데이터 추가
				list.add(item);

			}
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		return list;
	}

}
