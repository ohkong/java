package chap11;

import java.util.Random;
/*
 * Random 클래스 : 난수발생 클래스
 *   1. 자료형별로 난수 발생
 *       nextInt() : 정수형 난수
 *   	 nextInt(n) : 0 <= x < n 정수형 난수 리턴
 *   	 nextDouble() : 0 <= x < 1.0  실수형 난수 리턴  
 *   	 nextBoolean() : true/false 중 하나
 *   2. seed 값 설정 가능.
 */

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);	//난수값을 다양하게 선택하도록 설정
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());
		/*
		 * System.currentTimeMillis() : 1970년 시작부터 현재까지의 시간을 msec로 리턴 
		 */
		System.out.println("rand==>");
		for(int i=0;i<5;i++)
			System.out.println(i + ":" + rand.nextInt(100));
		System.out.println();
		System.out.println("rand2==>");
		for(int i=0;i<5;i++)
			System.out.println(i + ":" + rand2.nextInt(100));
	}
}
