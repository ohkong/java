package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random() * 100)+1;
		int count = 0;
		while (true) {
			System.out.println("1~100������ ���ڸ� �Է��ϼ���  ");
			try {
				int num = scan.nextInt();
				if (num < 1 || num > 100) {
					count++;
					throw new Exception("1����100������ ���ڸ� �Է��ϼ���");
				}
				if (num == ran) {
					count++;
					System.out.println("�����Դϴ�. �Է�Ƚ��:" + count + "ȸ");
					break;
				}else if(num >ran) {
					System.out.println("�������� �Է��ϼ���");
					count++;
				}else {
					System.out.println("ū���� �Է��ϼ���");
					count++;
				}
				
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "�� ���ڰ� �ƴմϴ�. ���ڸ� �Է��ϼ���");
				count++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				count++;
			}
		}
		System.out.println("���α׷� ����");

	}

}
