package chap3;

/*
 * 12345�� ��ð� ��� �������� ���
 * [���]
 * xx�ð� xx�� xx��
 */

import java.util.Scanner; // �Է� ����Ʈ

public class Exam1 {

	public static void main(String[] args) {
		// int second = 12345;
	    //Ű���忡�� �Է¹޾� �ð� ���ϱ�
		System.out.println("����� �ʸ� �Է��ϼ���.");
		//System.in : ǥ�� �Է�, Ű���� �Է�
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second%60;
		//System.out.printf(second/3600 + "�ð� " + (second%3600)/60 +"�� "+ second%60 +"��");
		System.out.println(h + "�ð� " + m + "�� " + s +"��");
	}

}
