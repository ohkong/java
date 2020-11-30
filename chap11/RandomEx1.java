package chap11;

import java.util.Random;
/*
 * Random Ŭ���� : �����߻� Ŭ����
 *   1. �ڷ������� ���� �߻�
 *       nextInt() : ������ ����
 *   	 nextInt(n) : 0 <= x < n ������ ���� ����
 *   	 nextDouble() : 0 <= x < 1.0  �Ǽ��� ���� ����  
 *   	 nextBoolean() : true/false �� �ϳ�
 *   2. seed �� ���� ����.
 */

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random();
		rand.setSeed(1);	//�������� �پ��ϰ� �����ϵ��� ����
		Random rand2 = new Random();
		rand2.setSeed(System.currentTimeMillis());
		/*
		 * System.currentTimeMillis() : 1970�� ���ۺ��� ��������� �ð��� msec�� ���� 
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
