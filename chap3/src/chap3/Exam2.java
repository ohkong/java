package chap3;

import java.util.Scanner;

/*
 * ȭ�鿡�� 3�ڸ� ������ �Է� �޾� 100�ڸ� �̸��� ������ ����ϱ�
 * [���]
 * ���ڸ� ������ �Է� �ϼ���
 * 321
 * 300
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("���ڸ� ������ �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(x-x%100);
		System.out.println(x/100 * 100);
		
		
	}

}
