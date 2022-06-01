package ordermanagement;

import java.util.Scanner;

public class OrderController {

	public static void main(String[] args) {
		// 콘솔로부터 입력받는 객체 만들기
		Scanner sc = new Scanner(System.in);
		
		final String REGISTER = "1";
		final String CANCLE = "2";
		final String INFO = "3";
		final String UPDATE = "4";
		final String EXIT = "5";
		
		
		
		OrderService orderService = new OrderServiceImpl();
		
		while(true) {
			System.out.println("메뉴입력:");
			String menu = sc.nextLine();
			switch(menu) {
			case REGISTER :
				orderService.orderregister(null);
				break;	
			case CANCLE :
				orderService.ordercancle(null, null);
				break;
			case INFO:
				orderService.orderinfo(null, null);
				break;
			case UPDATE:
				orderService.orderupdate(null);
				break;
			case EXIT:
				System.out.println("종료");
				break;
			default :
				System.out.println("잘못된 메뉴 선택");
				break;
		}
			if(menu.equals("5")) {
				break;
			}
			
		}

		sc.close();
}
}
