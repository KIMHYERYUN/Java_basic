package gmail.jaydenkhr.sixth;

//클래스와 인스턴스
public class ClassInstancePractice {

	public static void main(String[] args) {
        //인스턴스 만들기
		ClassInstance class1 = new ClassInstance();
        System.out.println(class1);		
        
        //또다른 새로운 인스턴스 생성
        ClassInstance class2 = new ClassInstance();
        System.out.println(class2);
        
        //각기 다른 인스턴스에 대한 해시코드 다름
        
        //기존 인스턴스를 다른 이름으로 사용할 수 있도록 하기
        //new를 호출해야 새로운 인스턴스가 만들어집니다.
        ClassInstance class3 = class2;
        System.out.println(class3);
        
        
        //static이 붙은 것과 붙지 않은 것의 차이
        //	private String name vs public static String school;
    	// static이 붙지 않으면 인스턴스만 사용가능 - 별도로 메모리 할당을 받아서 사용
        class1.num = 1;
        class2.num = 2; 
        System.out.println(class1.num);
        System.out.println(class2.num);
        //아래 문장은 에러 - static이 없으면 클래스로 접근 못함
    	//System.out.println(ClassInstance.num);
        
        //static은 자바에서 클래스 이름과 인스턴스 이름으로 접근가능

        //static은 하나만 만들어서 모든 인스턴스가 공유한다. static 같이 쓰자는..
        ClassInstance.school="한국외대";
        class1.school = "덕원여고";
        //class2.school = "신월중"; -> 아래값은 모두 "신월중"으로 출력
        
        System.out.println(class1.school);
        System.out.println(class2.school);
        System.out.println(ClassInstance.school);
        
        //static 없는 경우-에러발생
        //class1.name = "KHR";
        //System.out.println(class1.name);
        
      
        
    	
	}

}
