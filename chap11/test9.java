package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ��¥�� �Է��ϼ���(yyyy-MM-dd)");
		String oneday = scan.nextLine();
		System.out.println("�ι�° ��¥�� �Է��ϼ���(yyyy-MM-dd)");
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
		System.out.println(oneday + " - " + twoday + " ������ ���� : "+(cha/(1000*60*60*24)));
	}
}
