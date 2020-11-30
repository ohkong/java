package chap11;

import java.util.Scanner;

/*
 * Scanner 예제
 */
public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0, cnt = 0;
		System.out.println("두자리 자연수를 입력하세요 종료(0)");
		while(true) {
			int num = scan.nextInt();
			if(num==0)break;
			if(num<10||num>99)continue;
			sum+=num;
			cnt++;
		}
		System.out.println("입력된 데이터건수:" + cnt + ", 입력데이터 합계:"+sum);
	}
}
