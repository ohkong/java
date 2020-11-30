package chap11;

import java.util.Calendar;
import java.util.Scanner;

/*
 * �⵵�� ���� �Է¹޾Ƽ� ����� ������ ���ڿ� ���� ����ϱ�
 * Calendar Ŭ������ �����ϱ�
 */
public class Exam11 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("�⵵�� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int mon = scan.nextInt();
		
		cal.set(year, (mon-1),1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year, (mon-1), lastday);
		System.out.print(year +"-"+mon+"�� ���ڹ� ��¥:");
		String[] week = {"","��","��","ȭ","��","��","��","��"};
		System.out.println("��¥:"+cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"
				+ cal.get(Calendar.DATE)+"�� "+week[cal.get(Calendar.DAY_OF_WEEK)]+"����");
		
	}
}
