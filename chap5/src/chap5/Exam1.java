package chap5;

import java.util.Scanner;

/*
 * 10������ �Է� �޾� 2������ ����ϱ�
 */
public class Exam1 {

	public static void main(String[] args) {
		int [] binary = new int[32];
		System.out.println("10������ ���ڸ� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int div= num, index =0;
		while(div>0) {
			binary[index++] = div %2;
			div/=2;
		}
		System.out.print(num + "�� 2���� : ");
		for(int i =index -1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();

	}

}
