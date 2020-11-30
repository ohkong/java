package chap11;

import java.util.Random;

public class test5 {
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(1, -3) + ",");
		}
		System.out.println();
		for (int i = 0; i < 20; i++) {
			System.out.print(getRand(-1, 3) + ",");
		}
	}

	private static int getRand(int t, int f) {
		int max = Math.max(f, t);
		int min = Math.min(f, t);
		
		Random r = new Random();
		 int rand = r.nextInt(Math.abs(max) + Math.abs(min) + 1) - Math.abs(min);
		 return rand;
	}

}
