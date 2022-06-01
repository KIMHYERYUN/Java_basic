package gmail.jaydenkhr.part18;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class SingerMain {

	public static void main(String[] args) {
		//SingerDAO 인스턴스 생성
		SingerDAO singerDAO = SingerDAOImpl.sharedInstance();

		//데이터 가져오기 호출
		List<Singer> list = singerDAO.getList();
		for(Singer singer : list) {
			//System.out.println(singer);
		}
		
		/*
		//데이터 1개 가져오기
		Singer singer = singerDAO.getSinger(5);
		if(singer == null) {
			System.out.println("데이터가 존재하지 않습니다");
		}else {
			System.out.println(singer);
		}
		singer= new Singer();
		singer.setName("비");
		singer.setSongs("Raining");
		singer.setHometown("강원");
		Calendar cal = new GregorianCalendar(1980, 05, 19);
		singer.setBirthday(new Date(cal.getTimeInMillis()));
		*/
		
		/*
		//데이터 삽입
		int r = singerDAO.insertSinger(singer);
		if(r>=0) {
			System.out.println("삽입 성공");
		}else {
			System.out.println("삽입 실패");
		}
		//전체 데이터 목록을 가져와서 출력
		list = singerDAO.getList();
		for(Singer s : list) {
			System.out.println(s);
		}
		*/
		
		/*
		//데이터 수정
		int r = singerDAO.updateSinger(singer);
		if(r>=0) {
			System.out.println("수정 성공");
		}else {
			System.out.println("수정 실패");
		}
		//전체 데이터 목록을 가져와서 출력
		list = singerDAO.getList();
		for(Singer s : list) {
			System.out.println(s);
		}
		*/
		
		//데이터 삭제
		int r = singerDAO.deleteSinger(22);
		if(r >= 0) {
			System.out.println("삭제 성공");
		}else{
			System.out.println("삭제 실패");	
		}
		//전체 데이터 목록을 가져와서 출력
		list = singerDAO.getList();
		for(Singer s : list) {
			System.out.println(s);
		}
	}
}
