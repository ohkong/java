package chap5;
/*
 * 10������ �Է¹޾� 16������ �ٲٱ�
 */
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] hex =new char[8];
		System.out.println("16������ ��ȯ�� 10������ ���ڸ� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int div= num;
		int index =0;
		while(div>0) {
			hex[index++] =data[div%16];
			div/=16;
		}
		System.out.print(num + "�� 16���� : ");
		for(int i =index -1;i>=0;i--) {
			System.out.print(hex[i]);
		}
		System.out.println();

	}

}
