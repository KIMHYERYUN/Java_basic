package ordermanagement;

import java.util.Scanner;

public class OrderServiceImpl implements OrderService {

	//주문등록을 위한 처리
	@Override
	public boolean orderregister(Order order){
		System.out.println("주문정보 입력");
		return false;
	}
	
	//주문취소를 위한 처리
	@Override
	public boolean ordercancle(String ordername, String orderphone){
		System.out.println("주문정보 취소");
		return false;
	}
	//주문조회를 위한 처리
	@Override
	public Order orderinfo(String ordername, String orderphone){
		System.out.println("주문조회");
		return null;
	}
	//주문수정을 위한 처리
	@Override
	public boolean orderupdate(Order order){
		System.out.println("주문수정");
		return false;
	}
}
