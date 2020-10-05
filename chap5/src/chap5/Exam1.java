package chap5;

import java.util.Scanner;

/*
 * 10진수를 입력 받아 2진수로 출력하기
 */
public class Exam1 {

	public static void main(String[] args) {
		int [] binary = new int[32];
		System.out.println("10진수의 숫자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int div= num, index =0;
		while(div>0) {
			binary[index++] = div %2;
			div/=2;
		}
		System.out.print(num + "의 2진수 : ");
		for(int i =index -1;i>=0;i--) {
			System.out.print(binary[i]);
		}
		System.out.println();

	}

}
