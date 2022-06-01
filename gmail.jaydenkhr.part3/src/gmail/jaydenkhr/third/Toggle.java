package gmail.jaydenkhr.third;

public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //3초마다 2가지 동작을 번갈아 가면서 10번하기
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(3000);
			}catch(Exception e) {}
			
			if(i%2==0) {
				System.out.println("on");
			}else {
				System.out.println("off");
			
			}
		}
		
		//오미크론, 라투, 다크스펙터를 순서대로 출력
		for(int i=0; i<10; i=i+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
		
			if(i % 3 ==0) {
			   System.out.println("오미크론");
			}else if(i % 3 ==1) {
			   System.out.println("라투");
			}else if(i % 3 ==2) {
			   System.out.println("다크스펙터");	
			}
			}
		
		
		//일부 더 많이 생성하고 싶을 때
		for(int j=0; j<10; j=j+1) {
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
			if(j % 5 ==0) {
				System.out.println("오마크론");
			}else if(j % 5 ==1) {
				System.out.println("라투");
			}else if(j % 5 ==2) {
				System.out.println("다크스펙터");
			}else if(j % 5 == 3) {
				System.out.println("오미크론");
			}else if(j % 5 == 4) {
				System.out.println("다크스펙터");
			}
		}
			
		}
}
	

