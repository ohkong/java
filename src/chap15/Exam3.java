package chap15;

import java.util.Random;
import java.util.TreeSet;

/*
 * TreeSet ���� : 
 * lotto ��ȣ (1~45)�� ������ ���ڸ� �ߺ����� 6���� ã�Ƽ� ����ϱ�
 * TreeSet �̿�
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
		
		//�����
		TreeSet<Integer> lotto = new TreeSet<>();
		Random ball = new Random();
		ball.setSeed(System.currentTimeMillis());
		while(lotto.size()<6) {
			lotto.add(ball.nextInt(45)+1);
		}
		System.out.println(lotto);
	}
}