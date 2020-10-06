package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기
 99숫자가 입력되면 프로그램 종료하기
 입력값이 숫자가 아닌경우 : Exception 예외를 발생시키고
 숫자만 입력하세요 메시지 출력하고, 다시입력받도록 프로그램 수정
 입력값이 1~10의 범위가 아닌경우 : Exception 예외를 발생시키고 
 1~10까지의 숫자만 입력하세요 메세지 출력하고, 다시입력받도록 프로그램 작성하기
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1~10까지의 숫자를 입력하세요 (종료 :99) ");
			try {
				//정수값입력. InputMismatchException 예외 발생가능
				int num = scan.nextInt();
				if (num == 99)
					break;
				if (num < 1 || num > 10) {
					throw new Exception("1부터10까지의 숫자만 입력하세요");
				}
				System.out.print(num + ":");
				for (int i = 1; i <= num; i++) {
					System.out.print("*");
				}
				System.out.println();
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "는 숫자가 아닙니다. 숫자만 입력하세요");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("프로그램 종료");
	}
}
