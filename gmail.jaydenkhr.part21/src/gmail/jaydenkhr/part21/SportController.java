package gmail.jaydenkhr.part21;

import java.util.List;
import java.util.Scanner;

import org.bson.Document;

public class SportController {
		// service 주입받기 위한 변수
		private static SportService sportService;
		
		//클래스를 호출할 때 1번만 수행되는 코드
		static {
			//DAO 주입
			sportService = SportServiceImpl.sharedInstance();
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
		mainLoop: while(true) {
				System.out.println("메뉴입력(1-전체데이터가져오기 2-삽입 3-삭제 0-종료):");
				String menu = sc.nextLine();
				
				switch(menu) {
				case"0" :
					System.out.println("프로그램 종료");
					break mainLoop;
				case"1":
					//서비스 메서드 호출
					List<Document> list = sportService.allSport();
					//출력
					for(Document doc : list) {
						System.out.println(doc);
					}
					break;
				case"2":
					//view에서 입력받아서 넘어온다.
					System.out.println("코드:");
					String code = sc.nextLine();
					System.out.println("이름:");
					String name = sc.nextLine();
					System.out.println("종목:");
					String contents = sc.nextLine();
					
					Document document = new Document();
					document.append("code", Integer.parseInt(code));
					document.append("name", name);
					document.append("contents", contents);
					
					//삽입
					sportService.insertSport(document);
					System.out.println("삽입성공");
					
					break;
				case "3" :
					System.out.println("삭제할 코드를 입력하시오.");
					String del_code = sc.nextLine();
					Document del_document = new Document();
					del_document.append("code", Integer.parseInt(del_code));
					
					sportService.deleteSport(del_document);
					System.out.println("삭제성공");
					
					break;
				}
			}		
			System.out.println(sportService);
	}

}
