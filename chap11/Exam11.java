package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 * Calendar 클래스로 구현하기
 */
public class Exam11 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("년도와 월을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		
		cal.set(year, (mon-1),1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year, (mon-1), lastday);
		System.out.print(year +"-"+mon+"월 마자믹 날짜:");
		String[] week = {"","일","월","화","수","목","금","토"};
		System.out.println("날짜:"+cal.get(Calendar.YEAR)+"년"+(cal.get(Calendar.MONTH)+1)+"월"
				+ cal.get(Calendar.DATE)+"일 "+week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");
		
	}
}
