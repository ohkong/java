package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getTime());
		System.out.println(System.currentTimeMillis());
		//문제 : 2021년 3월 1일의 요일과 , 밀리초 출력하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = "2021-03-01";
		Date day = null;
		try {
			day = sf.parse(sday);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sday + ":" + new SimpleDateFormat("E요일").format(day));
		System.out.println(day.getTime());
		//now 3일 이후의 날짜와 요일 구하기
		day.setTime(now.getTime()+(1000*60*60*24*3));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일");
		System.out.println(sf2.format(day));
	}

}
