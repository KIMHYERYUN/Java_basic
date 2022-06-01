package gmail.jaydenkhr.ninth;

public class StringMethod3 {

	public static void main(String[] args) {
		String filename1 = "String.png";
		String filename2 = "String";
		//확장자는 마지막 . 뒤의 글자들을 확장자라고 합니다.
		//위 2개의 문자열에서 확장자 부분을 추출하는데 확장자가 없으면 없다고 출력
		
		//split을 이용해서 할 수 있고
		//indexOf(lastIndexOf)와 substring을 이용할 수 있다
		
		String [] result1 = filename1.split("\\.");
		String [] result2 = filename2.split("\\.");
		
		//1. .이 있는지 없는지 확인
		//.은 특수문자로 \\을 추가해야 한다
		//\를 찾을 때는 \\\\을 추가해야 한다
		

		if(result1.length < 2) {
			System.out.println("확장자 없음");
		}else {
			//배열의 가장 마지막 요소를 출력
			System.out.println(result1[result1.length-1]);
		}

		if(result2.length < 2) {
			System.out.println("확장자 없음");
		}else {
			//배열의 가장 마지막 요소를 출력
			System.out.println(result2[result2.length-1]);
		}
		
		
		System.out.println("=========indexOf=========");
		int idx = filename1.indexOf(".");
		System.out.println(idx);
		idx = filename2.indexOf(".");
		System.out.println(idx);
		//substring은 인덱스를 1개 주면 그 인덱스부터 마지막까지 잘라준다.
		//인덱스를 2개주면 첫번째 인덱스부터 두번째 인덱스 앞까지 잘라준다.
		System.out.println(filename1.substring(2));
		System.out.println(filename1.substring(2,5));
		
		//데이터를 찾으면 확장자를 찾으러 가면 되지만 데이터를 못찾으면 없다고 하면 된다.
		//찾은 위치에서 다음 칸부터 잘라오면 된다.
		idx = filename1.indexOf(".");
		if(idx < 0) {
			System.out.println("확장자 없음");
		}else {
			System.out.println(filename1.substring(idx+1));
		}
		
		idx = filename2.indexOf(".");
		if(idx <0) {
			System.out.println("확장자 없음");
		}else {
			System.out.println(filename2.substring(idx+1));
		}
	}

	}

		