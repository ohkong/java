package chap3;
/*
 * 숫자를 입력받아서 양수인경우는 "양수", 음수인경우 "음수", 0인경우"0"을 출력하기
 */

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
//		System.out.println("숫자를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		String num2 = (num>0)?"양수":(num<0)?"음수":"영";
//		System.out.println(num + "은 "+ num2 +" 입니다.");
		//짝수인지 홀수인지 출력
		System.out.println("숫자를 입력하세요.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String num2 = (num%2==0)?"짝수":"홀수";
		System.out.println(num +"는(은) "+num2+" 입니다.");
		
	}

}
