package chap11;
/*
 * ���ڿ� 1,234�� ������ �����Ͽ� *10 �� ���� ���ڸ� ���� , ��� ����ϱ�
 * 12,340
 */
public class Exam6 {
	public static void main(String[] args) {
		String str = "1,234";
		int i = Integer.parseInt(str.replace(",",""));
		System.out.println(String.format("%,d", i*10));
		System.out.printf("%,d\n", i*10);
		
	}
}
