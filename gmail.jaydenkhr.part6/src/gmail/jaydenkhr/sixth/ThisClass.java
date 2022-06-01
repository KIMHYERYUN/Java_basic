package gmail.jaydenkhr.sixth;

public class ThisClass {
	private int num;   //값은 0
	
	public void method() {
     	//System.out.println(num);  //가까운 4열의 num 사용 = 0
     	//num = 10;				  //10
     	//System.out.println(num);  //10
		
		int num = 100;
		System.out.println("num:" + num);  //가까운 num = 100
		System.out.println("this.num:" + this.num);  //외부에서 찾기 때문에 0
		//this.를 붙이면 메서드 내부에서 찾지않고 메서드 외부에서부터 찾아서 사용
	}
	
	static {
		System.out.println("맨 처음 한번만 불러지는 코드");
	}
	
	{
		System.out.println("new를 호출할 때 마다 불러지는 코드");
	}
}
