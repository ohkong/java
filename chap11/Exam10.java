package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * �⵵�� ���� �Է¹޾Ƽ� ����� ������ ���ڿ� ���� ����ϱ�
 */
public class Exam10 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println("�⵵�� ���� �Է��ϼ���.");
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
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E����").format(day));
		
	}
}
