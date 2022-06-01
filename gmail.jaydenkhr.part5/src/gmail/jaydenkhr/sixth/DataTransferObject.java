package gmail.jaydenkhr.sixth;

public class DataTransferObject {
	//구매자 정보관련 데이터 형성
    // 구매자 이름 : 문자열
    // 구매 금액 : 정수
	// 배송지 주소 : 문자열
	// 구매등급 : 문자
	// 구매자 전화번호 : 문자열(앞에 0을 살리기 위해 문자열 사용)
    private String name;
    private int purchase;
    private String address;
    private char grade;
    private String phone;
    
    //접근자 메서드
    //[source]-[generate getters and setters]
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPurchase() {
		return purchase;
	}
	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
    

    
		
	
		
		
		
		
	}


