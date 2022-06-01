package gmail.jaydenkhr.part21;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;

public class SportDAOImpl implements SportDAO {
	//싱글톤을 만들어주는 코드
	private SportDAOImpl() {}
	//인스턴스 하나만 만드는 것
	//자기 자신의 인스턴스를 저장할 변수
	//하위 클래스는 상위클래스를 대입할 수 있기때문에 SportDAOImpl -> SportDAO
	//이유 : 인터페이스의 목적(메뉴판 : 유저한테 보여지는 것은 음식이 아닌 메뉴판, 무얼 해줘야하는 것에 초점이지 어떻게 했는지가 중요가 아님)
	//static 변수의 목적 : 공유 - 하나만 존재	
	private static SportDAO obj;
	
	static SportDAO sharedInstance() {
		if(obj == null) {
			obj = new SportDAOImpl();
		}
		return obj;
	}

	@Override
	public List<Document> allSport() {
		//리턴할 데이터 생성
		List<Document> list = new ArrayList<Document>();
		
		//MongoDB 연결
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		//데이터베이스 연결
		MongoDatabase database = mongoClient.getDatabase("khr");
		
		try {
			//컬렉션 연결하기
			MongoCollection<Document> collection = database.getCollection("sports");
			//모든 데이터 가져오기
			MongoCursor<Document> cursor = collection.find().iterator();
			//데이터 순회
			while(cursor.hasNext()) {
				Document document = cursor.next();
				list.add(document);
			}
			cursor.close();

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//연결해제
		mongoClient.close();	
		
		return list;
	}

	@Override
	public void insertSport(Document document) {
		//Mongo DB 연결
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		//데이터베이스 연결
		MongoDatabase database = mongoClient.getDatabase("khr");
		try {
			//컬렉션 연결하기
			MongoCollection<Document> collection = database.getCollection("sports");
			collection.insertOne(document);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		mongoClient.close();
		
	}
	//service 인터페이스에 

	@Override
	public void deleteSport(Document document) {
		//Mongo 연결
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		//Mongo 데이터베이스 연결
		MongoDatabase database = mongoClient.getDatabase("khr");
		//컬렉션 연결
		try {
			MongoCollection<Document> collection = database.getCollection("sports");
			collection.deleteOne(document);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		mongoClient.close();
	}
}
