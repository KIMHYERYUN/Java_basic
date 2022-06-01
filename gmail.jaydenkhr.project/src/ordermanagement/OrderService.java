package ordermanagement;

public interface OrderService {
    //주문정보 입력을 위한 처리
	public boolean orderregister(Order order);
	//주문취소를 위한 처리
	public boolean ordercancle(String ordername, String orderphone);
	//주문조회를 위한 처리
	public Order orderinfo(String ordername, String orderphone);
	//주문수정을 위한 처리
	public boolean orderupdate(Order order);
	
	
	//주문처리-주문정보, 성공과 실패 -boolean
	//주문취소-주문자이름, 주문자전화번호 - boolean
	//주문조회-주문자이름, 주문자전화번호, 성공과 실패 - 회원정보 1개
	//주문수정-주문정보, 성공과 실패-boolean
	
}
