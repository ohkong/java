package chap11;
/*
 * ���Խ� ����
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {
		/*
		 * c[a-z] : ù��° ���ڰ� c�̸鼭,  ������ ���ڰ� �ҹ��ڷ� �̷���� ���ڿ�
		 * c[a-z]* : ù��° ���ڰ� c�̸鼭,  ������ ���ڰ� �ҹ��ڷ� �̷���� ���ڿ�
		 * 			* : 0���̻�.
		 * c[a-z]+ : ù��° ���ڰ� c�̸鼭,  ������ ���ڰ� �ҹ��ڷ� �̷���� ���ڿ�
		 * 			+ : 1���̻�.
		 * c[a-z]? : ù��° ���ڰ� c�̸鼭,  ������ ���ڰ� �ҹ��ڷ� �̷���� ���ڿ�
		 * 			? : 0,1�ΰ��
		 */
		String[] data = { "bat", "baby", "bonus", "cA", 
				"ca", "co", "c.",
				"car", "combat", "count", "cTT", "data",
				"disk", "c" };
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		for (String s : data) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.print(s + ",");
			}
		}
		System.out.println();
		String names = "Ȧ�浿,     ���,�̸���    , ������    ,   �Ӳ���";
		String[] arr = names.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
