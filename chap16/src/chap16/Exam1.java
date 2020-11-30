package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * 1���� 100������ ������ �� 10���� IntStream �� �����ϰ�
 * ����� ���� ����, ���, ¦���� ���, Ȧ���� ��� ����ϱ�
 * ¦���� ����, Ȧ���� ����
 */
public class Exam1 {
	public static void main(String[] args) {
		int[] arr =new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("���� :" + Arrays.stream(arr).sum());
		System.out.println("��� :" + Arrays.stream(arr).average().getAsDouble());
		System.out.println("¦�� ��� :" + Arrays.stream(arr).filter(i->i%2==0).average().getAsDouble());
		System.out.println("Ȧ�� ��� :" + Arrays.stream(arr).filter(i->i%2==1).average().getAsDouble());
		System.out.println("¦�� ���� :" + Arrays.stream(arr).filter(i->i%2==0).count());
		System.out.println("Ȧ�� ���� :" + Arrays.stream(arr).filter(i->i%2==1).count());
		System.out.println("�ߺ��� ���� ���� �� ���� :" + 
		Arrays.stream(arr).distinct().count());
	}
}
