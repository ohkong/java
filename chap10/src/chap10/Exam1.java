package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 ȭ�鿡�� 1���� 10������ ���ڸ� �Է¹޾Ƽ� ���ڸ�ŭ * ���η� ����ϱ�
 99���ڰ� �ԷµǸ� ���α׷� �����ϱ�
 �Է°��� ���ڰ� �ƴѰ�� : Exception ���ܸ� �߻���Ű��
 ���ڸ� �Է��ϼ��� �޽��� ����ϰ�, �ٽ��Է¹޵��� ���α׷� ����
 �Է°��� 1~10�� ������ �ƴѰ�� : Exception ���ܸ� �߻���Ű�� 
 1~10������ ���ڸ� �Է��ϼ��� �޼��� ����ϰ�, �ٽ��Է¹޵��� ���α׷� �ۼ��ϱ�
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1~10������ ���ڸ� �Է��ϼ��� (���� :99) ");
			try {
				//�������Է�. InputMismatchException ���� �߻�����
				int num = scan.nextInt();
				if (num == 99)
					break;
				if (num < 1 || num > 10) {
					throw new Exception("1����10������ ���ڸ� �Է��ϼ���");
				}
				System.out.print(num + ":");
				for (int i = 1; i <= num; i++) {
					System.out.print("*");
				}
				System.out.println();
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("���α׷� ����");
	}
}
