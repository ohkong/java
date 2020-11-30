package chap15;

import java.util.Random;
import java.util.TreeSet;

/*
 * TreeSet 예제 : 
 * lotto 번호 (1~45)의 임의의 숫자를 중복없이 6개를 찾아서 출력하기
 * TreeSet 이용
 */
public class Exam3 {
	public static void main(String[] args) {
//		TreeSet<Integer> set = new TreeSet<>();
//		Random r = new Random();
//		int lotto =0;
//		r.setSeed(System.currentTimeMillis());
//		for(int i =0;i<=5;i++) {
//			lotto=r.nextInt(45)+1;
//			set.add(lotto);
//		}
//		System.out.println(set);
		
		//강사님
		TreeSet<Integer> lotto = new TreeSet<>();
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while(lotto.size()<6) {
			lotto.add(ball.nextInt(45)+1);
		}
		System.out.println(lotto);
	}
}