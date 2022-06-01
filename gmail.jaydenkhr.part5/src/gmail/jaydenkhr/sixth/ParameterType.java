package gmail.jaydenkhr.sixth;

public class ParameterType {
    //매개변수의 자료형이 int(기본형)
	//메서드 내에서 매개변수의 값을 변경해도 호출할 때 대입된 데이터는 영향이 없음
	public static void valueSwap(int a, int b) {
		// TODO Auto-generated method stub
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
	}
	
	//매개변수의 자료형이 int [](배열)
	//메서드 내에서 매개변수의 값을 변경하면 호출할 때 대입된 데이터도 영향을 받음
	public static void refSwap(int []ar) {
		//값을 교환
		int temp = ar[0];
		ar[0] = ar[1];
		ar[1] = temp;
		System.out.println("ar[0]:" + ar[0]);
		System.out.println("ar[1]:" + ar[1]);
	}

}
