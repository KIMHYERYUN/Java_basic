package gmail.jaydenkhr.tenth;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListMain {

	public static void main(String[] args) {

		ArrayList <Integer> al = new ArrayList<>();
		
		LinkedList <Integer> ll = new LinkedList<>();
		
		//샘플 데이터를 2개씩 삽입
		al.add(1);
		al.add(3);
		
		ll.add(1);
		ll.add(3);
		
		//삽입시간 비교
		long start = System.nanoTime();
		//1000000개의 데이터를 2번째에 삽입
		for(int i=0; i<1000000; i=i+1) {
			al.add(2);
		}
		long end = System.nanoTime();
		System.out.println("ArrayList 추가시간:" + (end -start));

		
		start = System.nanoTime();
		for(int i=0; i<1000000; i=i+1) {
			ll.add(1,2);  //그냥 add만 작성할 경우 끝에 삽입
		}
		end = System.nanoTime();
		System.out.println("LinkedList 추가시간:" + (end-start));

		
		//읽는 시간 비교
		start = System.nanoTime();
		for(int i=0; i<1000000; i=i+1) {
			al.get(1);  //그냥 add만 작성할 경우 끝에 삽입
		}
		end = System.nanoTime();
		System.out.println("ArrayList 읽기시간:" + (end-start));


		start = System.nanoTime();
		for(int i=0; i<1000000; i=i+1) {
			ll.get(1);  //그냥 add만 작성할 경우 끝에 삽입
		}
		end = System.nanoTime();
		System.out.println("LinkedList 읽기시간:" + (end-start));
	}	 //Arraylist
		 //순차적으로 읽음, 그 다음 자리에 있는 숫자들을 다음자리로 복사하고 중간에 끼어넣음)
		 //Linkedlist
		 //링크를 읽고 따라가니까 느림, 삽입 시 가리키는 포인터(링크 연결)만 수정
}        
		 //용량이 많은것보다 갯수가 많은 것을 지우는게 오래걸린다(하드)
