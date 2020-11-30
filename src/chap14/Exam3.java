package chap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

/*
 * Predicate �������̽��� ����Ͽ� 1���� 100������ �����Ǽ�10����
 * �迭�� �����ϰ�, ���� ¦��, Ȧ�� ����� �����Ͽ� ����ϰ�,
 * ¦���� �հ� Ȧ���� ���� ����ϴ� ���α׷� �ۼ��ϱ�
 */
public class Exam3 {
	private static int[] arr = new int[10];

	public static void main(String[] args) {
		for(int i = 0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.print("¦��");
		numlist(a->a%2==0);
		System.out.print("Ȧ��");
		numlist(a->a%2!=0);

	}

	private static void numlist(IntPredicate p) {
		int sum =0;
		List<Integer> nums= new ArrayList<>();
		for(int a : arr) {
			if(p.test(a)) nums.add(a);
		}
		for(int i = 0;i<nums.size();i++) {
			System.out.print(nums.get(i)+
			((i<nums.size()-1)?"+":""));
			sum+=nums.get(i);
		}
		System.out.println("="+sum);
	}
	
}
