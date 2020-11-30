package chap11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date Ŭ���� ����
 * SimpleDateFormat : ����ȭ Ŭ����. Date ��ü�� ����ȭ�� ���ڿ��� ����
 * 		String format(Date) : Date ��ü�� ������ format ���Ŀ� �µ��� ���ڿ��� ����
 * 		Date parse(String) : ���Ŀ� �´� ���ڿ��� Date ��ü�� ����.
 * 							 ParesException ����ó�� �ʿ�
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		SimpleDateFormat sf = new SimpleDateFormat("yyyy��MM��dd HH��mm��ss�� E a");
		System.out.println(sf.format(now));
		
		/*
		 * ��¥ format�� ���Ǵ� ����
		 * yyyy: �⵵ 4�ڸ�
		 * MM : ���� 2�ڸ�
		 * dd : ���� 2�ڸ�
		 * HH : �ð��� 2�ڸ�
		 * mm : ���� 2�ڸ�
		 * ss : �ʸ� 2�ڸ�
		 * E : ����
		 * a : ����/����
		 */
		System.out.println(sf.format(now));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr = "2020-12-25 10:00:00";
		Date day = null;
		try {day = sf2.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(day);
		
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E����");
		System.out.println(sf.format(day));
	}
}
