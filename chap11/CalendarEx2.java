package chap11;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// cal  2020-12-30�Ϸ� ����
		cal.set(2020,(12-1),30);
		System.out.println("��¥:"+cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"
				+ cal.get(Calendar.DATE)+"��");
		//cal 2020-12-30������ ������ ����ϱ�
		String[] week = {"","��","��","ȭ","��","��","��","��"};
		System.out.println("��¥:"+cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"
				+ cal.get(Calendar.DATE)+"�� "+week[cal.get(Calendar.DAY_OF_WEEK)]+"����");
	}

}