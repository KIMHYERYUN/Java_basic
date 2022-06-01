package gmail.jaydenkhr.tenth;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] ar = {20, 30, 40, 10, 70, 90, 80};
		//정렬을 하지 않은 상태에서의 이분 검색
		System.out.println(Arrays.binarySearch(ar, 30));
		//출력값 : -5 / 이유는 정렬을 하지 않아서
		
		//정렬을 한 후 검색
		Arrays.sort(ar);
		//ar = {10, 20, 30, 40, 70, 80, 90};
		System.out.println(Arrays.binarySearch(ar, 30));
		
		//start + ends / 2 -> 찾고 0이면 찾음
		//0보다 크면 오른쪽 이동 및 start+1 + ends / 2 
		//0보다 작으면 왼쪽 이동 및 start + ends-1 /2
	}

}
