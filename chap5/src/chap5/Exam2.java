package chap5;
/*
 * 10진수를 입력받아 8진수로 바꾸기
 */
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int [] octa = new int[32];
		System.out.println("8진수로 변환할 10진수의 숫자를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int div= num, index =0;
		while(div>0) {
			octa[index++] = div %8;
			div/=8;
		}
		System.out.print(num + "의 8진수 : ");
		for(int i =index -1;i>=0;i--) {
			System.out.print(octa[i]);
		}
		System.out.println();

	}

}
