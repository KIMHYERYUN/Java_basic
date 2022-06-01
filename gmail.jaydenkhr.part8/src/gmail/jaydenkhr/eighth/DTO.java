package gmail.jaydenkhr.eighth;

public class DTO {
	//번호 와 이름을 갖는 클래스
	private int num; //번호를 저장할 속성
	private String name; //이름을 저장할 속성
		
	//접근자 메서드
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//디버깅을 위한 메서드
	@Override
	public String toString() {
		return "DTO [num=" +num +", name="+name+"]";
	}
	
	//인스턴스의 내용이 같은지 비교하는 메서드
	public boolean equals(DTO other) {
		//클래스 DTO(대문자), 변수 other(소문자)
		//문자열은 등호가 아닌 equals로 비교
		if(num == other.num && name.equals(other.name)) {
			return true;
		}
		return false;
	}
	
	}


