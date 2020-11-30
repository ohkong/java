package chap14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;

/*
 * Predicate 인터페이스를 사용하여 1부터 100까지의 임의의수10개를
 * 배열에 저장하거, 그중 짝수, 홀수 목록을 구분하여 출력하고,
 * 짝수의 합과 홀수의 합을 출력하는 프로그램 작성하기
 */
public class Exam3 {
	private static int[] arr = new int[10];

	public static void main(String[] args) {
		for(int i = 0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		System.out.print("짝수");
		numlist(a->a%2==0);
		System.out.print("홀수");
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
