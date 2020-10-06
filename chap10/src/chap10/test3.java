package chap10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ran = (int)(Math.random() * 100)+1;
		int count = 0;
		while (true) {
			System.out.println("1~100까지의 숫자를 입력하세요  ");
			try {
				int num = scan.nextInt();
				if (num < 1 || num > 100) {
					count++;
					throw new Exception("1부터100까지의 숫자만 입력하세요");
				}
				if (num == ran) {
					count++;
					System.out.println("정답입니다. 입력횟수:" + count + "회");
					break;
				}else if(num >ran) {
					System.out.println("작은수를 입력하세요");
					count++;
				}else {
					System.out.println("큰수를 입력하세요");
					count++;
				}
				
			} catch (InputMismatchException e) {
				String str = scan.next();
				System.out.println(str + "는 숫자가 아닙니다. 숫자만 입력하세요");
				count++;
			} catch (Exception e) {
				System.out.println(e.getMessage());
				count++;
			}
		}
		System.out.println("프로그램 종료");

	}

}
