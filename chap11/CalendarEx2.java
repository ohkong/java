package chap11;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// cal  2020-12-30일로 설정
		cal.set(2020,(12-1),30);
		System.out.println("날짜:"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"
				+ cal.get(Calendar.DATE)+"일");
		//cal 2020-12-30일자의 요일을 출력하기
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println("날짜:"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"
				+ cal.get(Calendar.DATE)+"일 "+week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
	}

}