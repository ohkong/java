package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ݾ��� �Է¹޾Ƽ� 500, 100, 50, 10, 1�� �������� �ٲٱ�.
 * �ʿ��� ������ ���� ����ϱ�, ��ü������ �ּ� ������ �ٲ۴�.
 * [���]
 * �ݾ��� �Է��ϼ���
 * 5641
 * 500�� : 11��
 * 100�� : 1��
 * 50�� : 0��
 * 10�� : 4��
 * 1�� : 1��
 *
 * 
 */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("�ݾ��� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("500�� : "+ x/500 + "��");
		System.out.println("100�� : "+ x%500/100 +"��");
		System.out.println("50�� : "+ x%100/50 +"��");
		System.out.println("10�� : "+ x%50/10 +"��");
		System.out.println("1�� : "+ x%10/1 +"��");
	}

}
