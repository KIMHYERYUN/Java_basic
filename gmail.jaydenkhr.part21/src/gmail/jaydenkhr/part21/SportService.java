package gmail.jaydenkhr.part21;

import java.util.List;

import org.bson.Document;

public interface SportService {
	//컬렉션의 전체 데이터 가져오기
	public List<Document> allSport();
	
	//컬렉션의 데이터를 삽입하는 메서드
	public void insertSport(Document document);
	
	//컬렉션의 데이터를 삭제하는 메서드
	public void deleteSport(Document document);
}
