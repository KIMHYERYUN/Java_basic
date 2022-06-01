package gmail.jaydenkhr.sixth;

public class Business2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 인스턴스 배열 마들기 - 3개 저장하도록 하기
		BusinessBasic [] business = new BusinessBasic[3];
		
		//배열을 만들고 인스턴스를 대입할 때는 빠른 열거를 사용하면 안됨
	    for(int i=0; i<business.length; i=i+1) {
	    	//인스턴스 대입하기
	    	business[i] = new BusinessBasic();
	    }
	    
	    //데이터 저장하기
	    business[0].item = "비타민C";
	    business[0].stock = 126;
	    
	    business[1].item = "루테인";
	    business[1].stock = 5;
	    
	    business[2].item = "오메가3";
	    business[2].stock = 58;
	    
	    
	    //데이터 전부 출력
	    for(BusinessBasic businessin : business) {
	                      System.out.println(businessin.item + ":" + businessin.stock + "개");
	}

}
}
