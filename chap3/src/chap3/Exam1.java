package chap3;

/*
 * 12345가 몇시간 몇분 몇초인지 출력
 * [결과]
 * xx시간 xx분 xx초
 */

import java.util.Scanner; // 입력 임포트

public class Exam1 {

	public static void main(String[] args) {
		// int second = 12345;
	    //키보드에서 입력받아 시간 구하기
		System.out.println("계산할 초를 입력하세요.");
		//System.in : 표준 입력, 키보드 입력
		Scanner scan = new Scanner(System.in);
		int second = scan.nextInt();
		int h = second/3600;
		int m = (second%3600)/60;
		int s = second%60;
		//System.out.printf(second/3600 + "시간 " + (second%3600)/60 +"분 "+ second%60 +"초");
		System.out.println(h + "시간 " + m + "분 " + s +"초");
	}

}
