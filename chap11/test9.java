package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
		String oneday = scan.nextLine();
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
		String twoday = scan.nextLine();
		Date one = null;
		Date two = null;
		try {
			one = sf.parse(oneday);
			two = sf.parse(twoday);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		long cha = one.getTime()- two.getTime();
		System.out.println(oneday + " - " + twoday + " 일자의 차이 : "+(cha/(1000*60*60*24)));
	}
}
