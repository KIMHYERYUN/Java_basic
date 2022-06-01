package gmail.jaydenkhr.part21;

import java.util.List;

import org.bson.Document;

public class SportServiceImpl implements SportService {
	//DAO 주입받기 위한 변수
	private SportDAO sportDAO;
	//싱글톤 만들어주는 코드
	private SportServiceImpl() {
		//DAO 주입
		sportDAO = SportDAOImpl.sharedInstance();
	}
	//자기자신의 인스턴스를 저장할 변수
	private static SportService obj;
	
	static SportService sharedInstance() {
		if(obj == null) {
			obj = new SportServiceImpl();
		}
		return obj;
	}

	@Override
	public List<Document> allSport() {
		return sportDAO.allSport();
	}

	@Override
	public void insertSport(Document document) {
		sportDAO.insertSport(document);		
	}

	@Override
	public void deleteSport(Document document) {
		sportDAO.deleteSport(document);
		
	}
}