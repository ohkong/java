package chap11;

import java.util.Arrays;

/*
 * Arrays 클래스 예제 :
 *   배열의 복사, 비교, 정렬 등 기능을 포함하고 있는 클래스
 */
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"월매","이몽룡","향단","방자"};
		for(String s : arr1)System.out.print(s+",");
		System.out.println();
		//arr1 배열의 값을 "성춘향" 값으로 채우기
		Arrays.fill(arr1, "성춘향");
		for(String s : arr1)System.out.print(s+",");
		System.out.println();
		Arrays.fill(arr1,1,3,"춘향전");
		for(String s : arr1)System.out.print(s+",");
		System.out.println();
		int[] intArr = new int[10];
		Arrays.fill(intArr,10);
		for(int i : intArr)System.out.print(i+",");
		System.out.println();
		String[] arr2 = {"월매","이몽룡","향단","방자"};
		Arrays.sort(arr2); //정렬하기
		for(String s : arr2)System.out.print(s+",");
		System.out.println();
		intArr = new int[] {3,2,1,6,9,4,8,5,7};
		Arrays.sort(intArr);
		for(int i : intArr)System.out.print(i+",");
	}
}
