package gmail.jaydenkhr.tenth;

//하나의 행을 표현하기 위한 클래스 생성
//이 클래스를 DTO 또는 VO 라고 함
public class DTO {
		//이름과 나이
		private String name;
		private int age;
		private double tall;
		
		//접근자 메서드
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getTall() {
			return tall;
		}
		public void setTall(double tall) {
			this.tall = tall;
		}
		@Override
		public String toString() {
			return "DTO [name=" + name + ", age=" + age + ", tall=" + tall + "]";
		}

			
		}

		

