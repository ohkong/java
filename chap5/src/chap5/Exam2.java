package chap5;
/*
 * 10������ �Է¹޾� 8������ �ٲٱ�
 */
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int [] octa = new int[32];
		System.out.println("8������ ��ȯ�� 10������ ���ڸ� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int div= num, index =0;
		while(div>0) {
			octa[index++] = div %8;
			div/=8;
		}
		System.out.print(num + "�� 8���� : ");
		for(int i =index -1;i>=0;i--) {
			System.out.print(octa[i]);
		}
		System.out.println();

	}

}
