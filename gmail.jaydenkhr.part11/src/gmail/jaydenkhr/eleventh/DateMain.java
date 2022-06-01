package gmail.jaydenkhr.eleventh;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateMain {

	public static void main(String[] args) {
		//오늘부터 1990년 6월 19일까지 지나온 날짜 계산
		
		//1990년 6월 19일을 Calendar 객체로 생성
		Calendar meetday = new GregorianCalendar(1990, 5, 19);
		//월은 0부터 시작으로 -1한 값

		//오늘날짜 만들기
		Calendar today = Calendar.getInstance();

		
		//epoch time으로 변환해서 빼기
		long cha = meetday.getTimeInMillis() - today.getTimeInMillis();
		
		//초단위
		long second = cha / 1000;
		
		//분단위
		long minute = second / 60;
		
		//시간단위
		long hour = minute / 60;
		
		//날짜
		long day = hour / 24;
		System.out.println("내가 태어난지" + day + "일이 지났습니다.");
		
		//Calendar를 Date로 변환
		Date date = new Date(today.getTimeInMillis());
		System.out.println(date);
		
		//Date 객체를 Calendar로 변환
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(date);
	
	}

}
