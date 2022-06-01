package gmail.jaydenkhr.tenth;

import java.util.TreeSet;

public class SetMain {

	public static void main(String[] args) {
		//Set은 중복된 데이터를 저장하지 않음
		//TreeSet은 순차적으로 접근하면 데이터를 크기 순서대로 리턴
		TreeSet<String> songs = new TreeSet<>();
		songs.add("어디쯤 가고 있을까");
		songs.add("말리꽃");
		songs.add("가을 타나봐");
		songs.add("가을 타나봐");
		songs.add("인연");
		songs.add("말리꽃");
		for(String song : songs) {
			System.out.println(song);
		}

		
		
		
	}

}
