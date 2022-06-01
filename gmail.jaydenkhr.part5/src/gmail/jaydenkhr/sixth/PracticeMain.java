package gmail.jaydenkhr.sixth;

public class PracticeMain {

	public static void main(String[] args) {
		//메서드 사용
		//static이 있는지 없는지 확인 : 인스턴스를 만들어야 하는지 그렇지 않은지
		//()안에 매개변수가 있는지 확인 : 있으면 맞는 데이터를 넣어주어야 함
		//리턴 타입이 void인지 아닌지 : void가 아니면 결과를 변수에 저장하고 사용
		
		//1.Practice클래스의 staticMethod 호출
		//2.Practice클래스의 disp 호출
		//3.Practice클래스의 sum 메서드를 이용해서 1부터 100까지의 합계 출력
		//4.Practice클래스의 prime 메소드를 호출해서 2부터 1000까지의 소수 개수
		
		Practice.staticMethod(); //1. static이 존재하므로 클래스 이름으로 바로 불러들여올 수있음
		
		Practice ins1= new Practice(); //2. static이 없어 인스턴스 생성 후 호출해서 적용
        ins1.disp();
        
        ins1.sum(100);  //3. 매개변수가 정수 1개이므로 생성된 인스턴스에 정수 1개 대입해서 호출
        
        int result = ins1.prime();  //4. 생성된 인스턴스에 메소드를 호출해서 적용
        System.out.println(result);
        
	}

}
