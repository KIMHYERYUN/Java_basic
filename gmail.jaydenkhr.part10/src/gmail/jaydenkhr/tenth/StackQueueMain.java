package gmail.jaydenkhr.tenth;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		// 문자열 저장하는 Stack 생성
		Stack <String> stack = new Stack<>();
		
		//데이터 추가
		stack.push("벤자");
		stack.push("모하비");
		stack.push("랭글러");
		stack.push("그렌져");
		stack.push("랜드로바");
		
		//데이터를 삭제하면서 꺼내기
		String name = stack.pop(); //마지막 해당
		System.out.println(name);
		//더이상 데이터가 없는데 pop을 하면 underflow 에러
		
		//그 다음 데이터인 "그렌져" 삭제하면서 꺼내기
		//아래 string 위에 한번 나온것으로 작성 x(주의)
		name = stack.pop(); //마지막 해당
		System.out.println(name);
		
		//일반 큐는 ArrayList를 만들고 remove(0)을 하면 됩니다.
		//우선순위 큐는 데이터를 크기 순서대로 꺼내주는 큐입니다.
		//순서대로 저장되는 것이 아니다.
		PriorityQueue <String> queue = 
				new PriorityQueue<>();

		queue.offer("CANADA");
		queue.offer("NEWZILAND");
		queue.offer("USA");
		queue.offer("KOREA");
		queue.offer("FRANCE");

		
		//우선순위가 가장 낮은 CANADA를 꺼내옴(삭제하면서 리턴)
		System.out.println(queue.poll());  //CANADA
		System.out.println(queue.poll());  //FRANCE
		//System.out.println(queue);
		//알파벳 순서
		
		System.out.println("=================");
		for(String temp : queue) {
			System.out.println(temp);
		}
	}

}
