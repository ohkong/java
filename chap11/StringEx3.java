package chap11;
/*
 * String Ŭ���� : format �޼��� ����
 * 				=> ����ȭ ���ڸ� ����� �� �ִ� �޼���
 * 				=> Ŭ���� �޼�����
 */
public class StringEx3 {
	public static void main(String[] args) {
		//�Ҽ������� 2�ڸ��� ��� . �Ҽ������� 3�ڸ����� �ݿø�
		String sf = String.format("%.2f", 0.124);//0.12
		System.out.println(sf);
		System.out.println(String.format("%10d",12345));
		System.out.println(String.format("%-10d",12345));
		System.out.println(String.format("%010d",12345));
		
		System.out.println(String.format("%,10d",12345));
		System.out.println(String.format("%x",12345));
		System.out.println(String.format("%x",12345));
		System.out.println(String.format("%o",12345));
		
		System.out.println(String.format("%s","ȫ�浿"));
		System.out.println(String.format("%c",'A'));
		System.out.println(String.format("%s�������� %c�Դϴ�","ȫ�浿",'A'));
	}
}
