package chap16;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * 1���� 100������ ������ �� 10���� IntStream �� �����ϰ�
 * ����� ���� ����, ���, ¦���� ���, Ȧ���� ��� ����ϱ�
 * ¦���� ����, Ȧ���� ����
 * Random Ŭ������ �̿��Ͽ� ���� ��Ʈ������ �����ϱ�
 * 
 */
public class Exam2 {
	public static void main(String[] args) {
		IntStream is = new Random().ints(10,1,101);
		int[] arr = is.toArray();
		for(int a : arr)System.out.print(a+" ");
		System.out.println();
		System.out.println("���� :" + Arrays.stream(arr).sum());
		System.out.println("��� :" + Arrays.stream(arr).average().getAsDouble());
		System.out.println("¦�� ��� :" + Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("Ȧ�� ��� :" + Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("¦�� ���� :" + Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("Ȧ�� ���� :" + Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("�ߺ��� ���� ���� �� ���� :" + 
		Arrays.stream(arr).distinct().count());
		System.out.println("���� �� ���� ū��:" + 
				Arrays.stream(arr).max().getAsInt());
		System.out.println("���� �� ���� ����:" + 
				Arrays.stream(arr).min().getAsInt());
		System.out.println("¦�� �� ���� ū��:" + 
				Arrays.stream(arr).filter(i->i%2==0).max().getAsInt());
		System.out.println("¦�� �� ���� ����:" + 
				Arrays.stream(arr).filter(i->i%2==0).min().getAsInt());
		System.out.println("Ȧ�� �� ���� ū��:" + 
				Arrays.stream(arr).filter(i->i%2==1).max().getAsInt());
		System.out.println("Ȧ�� �� ���� ����:" + 
				Arrays.stream(arr).filter(i->i%2==1).min().getAsInt());
		
	}
}
