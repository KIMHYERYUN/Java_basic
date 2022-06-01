package gmail.jaydenkhr.fourth;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1~45까지 6개의 숫자를 중복없이 저장하고 작은 것부터 큰 것 순으로 출력
		//6개의 숫자는 키보드로부터 입력받기
		
		//데이터: 1~45사이의 숫자 6개, 아직 숫자의 값은 결정되지 않음
		//1. 1~45까지의 숫자 6개를 저장할 수 있는 공간을 생성
		//크기 비교 필요함 -> 작은 것부터 큰 것으로 출력
		//초기값이 없는 상태로 만들면 정수나 실수는 0, boolean은 false, 나머지는 null
		int [] lotto = new int[6];
		
		//키보드로 부터 입력받기
		//한번만 수행 - 키보드로 입력받는 인스턴스를 생성
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//입력받기
		//변수 = sc.next자료형(); 정수는 Int, 실수는 Double, boolean은 Boolean, 문자열은 Line이라고 자료형을 설정
		
		//배열의 크기만큼 정수를 입력받아서 배열에 저장
		//입력받은 내용을 임시변수에 저장한 후 배열로 옮기는 것이 좋다(이유는 유효성 검사를 위해)
		
		
		//데이터의 개수 저장
		int len = lotto.length;
		
		//인덱스를 이용해서 배열의 모든 데이터를 접근
		for(int i=0; i<len; i=i+1) {
			//정수를 입력받아서 input에 저장
			System.out.print("1~45의 숫자 입력:");
			int input = sc.nextInt();
			//1부터 45사이의 숫자가 아니면 경고문을 발생시키고 다시 입력하도록 하기
			//input이 1부터 45사이가 아니라면
			if (input < 1 || input>45){  //if(!(input >= 1 && input <=45))
			   System.out.println("범위를 초과하였습니다. 1부터 45사이의 숫자를 다시 입력하시오");
			   //이번에 한 행위는 무효
			   i = i-1;
			   continue;
			}
			//중복체크
			//이미 저장된 숫자를 입력하는 경우에는 무효
			//현재 입력받은 숫자가 배열에 있는지 조사
			//비효율적인 알고리즘은 배열의 모든 데이터와 비교하는 것
		    boolean flag = true;
		    
			for(int imsi : lotto) {
			    if(input == imsi) {
				    System.out.println("중복된 숫자입니다. 다른 숫자를 입력하시오");
				    // i = i-1; // 위에 if구문에 적용된 i로 불가
				    //중복되었다고 표시
				    flag = false;
				    break;
				    //break와 continue는 가까운 반복문에 적용된다.
				    //break는 for에 적용
	     		}
		    }
		    
		    //중복확인
		    if(flag == false) {
		    	i = i-1;
		    	continue;
		    }
			//현재 배열에 있는 모든 데이터와 입력받은 데이터가 같은지 확인			
			//효율적인 알고리즘은 이전에 입력된 데이터들과만 비교
		    
			//input에 입력된 내용을 배열에 순서대로 저장
		    lotto[i] = input;
		}
		
		//데이터 정렬
		//위치는 마지막에 정렬해서 출력
		len = lotto.length;
		for(int i=0; i<len-1; i=i+1) {
			for(int j=i+1; j<len; j=j+1) {
				if(lotto[i] > lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		   

		//lotto배열에 저장된 데이터를 한줄로 전부 출력
		for(int su : lotto) {
	    	System.out.print(su + "\t");
	    }
		
		//사용이 종료되면
		sc.close();
			
		}
	
	}

