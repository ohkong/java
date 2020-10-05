package chap5;

import java.util.Scanner;
//깃허브 보기
/*
 * 삼각형의 높이를 입력하세요
 * 5
 * 15 14 13 12 11
 *    10  9  8  7
 *        6  5  4
 *           3  2
 *              1
 */
public class Exam7 {

	public static void main(String[] args) {		
		System.out.println("삼각형의 높이를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i ++)
			sum += i;
		int data = sum * 2 - 1;
			
		for (int i = 0; i<num; i++) {
			for (int j = 0; j < num; j++) {
				if(j<i) {
					System.out.print("    ");
					
				} else {
					System.out.printf("%4d",sum--);
				}
			}
			System.out.println();
		}	
		//매트릭스로 찍기
		

	}

}
