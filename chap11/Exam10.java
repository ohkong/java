package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 년월의 마지막 일자와 요일 출력하기
 */
public class Exam10 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("년도와 월을 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		String sday = year + "-"+(mon+1) + "-01";
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf.parse(sday);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		day.setTime(day.getTime()-(1000*60*60*24-1));
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
		
	}
}
