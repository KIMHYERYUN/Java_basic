package gmail.jaydenkhr.part21;

import java.util.List;

import org.bson.Document;

public interface SportDAO {

	//데이터 조회
	public List<Document> allSport();

	//데이터 삽입
	public void insertSport(Document document);
	//데이터 삭제
	public void deleteSport(Document document);
	

	
	
}
