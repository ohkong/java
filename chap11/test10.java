package chap11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test10 {

	public static void main(String[] args) {
		String[] phoneNumberArr = { "012-3456-7890", "099-2456-7980", "088-2346-9870", "013-3456-7890", };
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("ã���� �ϴ� ��ȣ�� �Է��ϼ���(����:q)");
			String str = scan.next();
			if (str.equals("q")) {
				System.out.println("�����մϴ�");
				break;
			}
			int cnt = 0;
			Pattern p = Pattern.compile("(0\\d{2})-(\\d{4})-(\\d{4})");
			for (String s : phoneNumberArr) {
				Matcher m = p.matcher(str);
				if(m.matches()) {
					System.out.println(s);
					cnt++;
				}
			}
			if (cnt == 0) {
				{
					System.out.println("ã�¹�ȣ�� �����ϴ�.");
				}
			}

		}
	}
}
