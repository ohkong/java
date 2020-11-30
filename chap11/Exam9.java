package chap11;

import java.util.Random;

/*
 * true/false 값을 난수로 발생하여 시스템과 사용자가 3번연속으로 
 * true가 나오면 한쪽 승리하도록 프로그램 구현하기
 */
public class Exam9 {
	public static void main(String[] args) {
		Random user = new Random();
		user.setSeed(System.currentTimeMillis());
		Random com = new Random();
		com.setSeed(System.currentTimeMillis()+100);
		int ccnt = 0;
		int ucnt = 0;
		while (true) {
		//	System.out.println("시스템 " + com.nextBoolean() + "\t사용자" + user.nextBoolean());
			if (user.nextBoolean()) {
				ucnt++;
				System.out.print("사용자 true");
			} else {
				ucnt = 0;
				System.out.print("사용자 false");
			}
			if (com.nextBoolean()) {
				ccnt++;
				System.out.println("\t시스템 true");
			} else {
				ccnt = 0;
				System.out.println("\t시스템 false");
			}
			if (ucnt == 3 || ccnt == 3)
				break;
		}
		if (ccnt == 3) {
			System.out.println("시스템승리");
		} 
		if(ucnt == 3 ){
			System.out.println("사용자승리");
		}

	}
}
