package ordermanagement;

//주문자이름-문자열, 중복가능, 필수, 30자이내
//주문자전화번호 - 정수, 중복가능, 필수, 8자이내
//수령인이름-문자열, 중복가능, 필수, 30자이내
//수령인전화번호 - 정수, 중복가능, 필수, 8자이내
//수령인주소지 - 문자열, 중복가능, 필수, 80자이내
//희망배송일 - 정수, 중복가능, 필수, 8자이내
//배송전달사항 - 문자열, 중복가능, 선택, 20자이내

//주문등록-주문정보, 성공과 실패 -boolean
//주문취소-주문자이름, 주문자전화번호 - boolean
//주문조회-주문자이름, 주문자전화번호, 성공과 실패 - 회원정보 1개
//주문수정-주문정보, 성공과 실패-boolean

public class Order {
	private String opname;
	private int opphone;
	private String rpname;
	private int rpphone;
	private String rpaddress;
	private int orderdate;
	private String ordermessage;
	
	public String getOpname() {
		return opname;
	}
	public void setOpname(String opname) {
		this.opname = opname;
	}
	public int getOpphone() {
		return opphone;
	}
	public void setOpphone(int opphone) {
		this.opphone = opphone;
	}
	public String getRpname() {
		return rpname;
	}
	public void setRpname(String rpname) {
		this.rpname = rpname;
	}
	public int getRpphone() {
		return rpphone;
	}
	public void setRpphone(int rpphone) {
		this.rpphone = rpphone;
	}
	public String getRpaddress() {
		return rpaddress;
	}
	public void setRpaddress(String rpaddress) {
		this.rpaddress = rpaddress;
	}
	public int getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(int orderdate) {
		this.orderdate = orderdate;
	}
	public String getOrdermessage() {
		return ordermessage;
	}
	public void setOrdermessage(String ordermessage) {
		this.ordermessage = ordermessage;
	}
	@Override
	public String toString() {
		return "Order [opname=" + opname + ", opphone=" + opphone + ", rpname=" + rpname + ", rpphone=" + rpphone
				+ ", rpaddress=" + rpaddress + ", orderdate=" + orderdate + ", ordermessage=" + ordermessage + "]";
	}
	
	

}

