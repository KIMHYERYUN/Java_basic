package gmail.jaydenkhr.third;

public class InfinityLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        while(true) {
        	try {
        	     Thread.sleep(5000);
            }catch(Exception e) {}
        	System.out.println("무한반복");
            //5초동안 반복되는 현상
        	//자바는 1/1000초 단위 사용
        	//알람, 정기적인 분수 등 사용
	}

   }
}
