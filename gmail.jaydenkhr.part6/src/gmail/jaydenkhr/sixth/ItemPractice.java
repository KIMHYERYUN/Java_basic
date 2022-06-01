package gmail.jaydenkhr.sixth;

public class ItemPractice {

	public static void main(String[] args) {
		//Item 클래스의 인스턴스 만드는 방법을 확인해보고
		//각각의 방법으로 인스턴스를 생성해보세요
		
		
		//생성된 인스턴스의 값을 출력해보세요
		
		//13열:왼쪽의 item(), 14열:왼쪽의 item(int,String,String,int,String)
		Item item1 = new Item();
		Item item2 = new Item(1, "vitamin", "for adult", 3000, "vitaminbox.png");
		
		System.out.println(item1.getItemid());
		System.out.println(item1.getItemname());
		System.out.println(item1.getDescription());
		System.out.println(item1.getPrice());
		System.out.println(item1.getPictureurl());
		
		

	}

}
