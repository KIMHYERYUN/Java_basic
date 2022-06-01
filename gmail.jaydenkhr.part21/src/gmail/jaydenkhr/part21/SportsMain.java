package gmail.jaydenkhr.part21;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class SportsMain {

	public static void main(String[] args) {
		//MongoDB 연결
		MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
		//데이터베이스 연결
		MongoDatabase database = mongoClient.getDatabase("user");
		
		//데이터베이스 내의 모든 컬렉션 이름을 조회
		for(String name : database.listCollectionNames()) {
			System.out.println(name);
		}
	}

}
