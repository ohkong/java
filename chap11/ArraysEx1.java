package chap11;

import java.util.Arrays;

/*
 * Arrays Ŭ���� ���� :
 *   �迭�� ����, ��, ���� �� ����� �����ϰ� �ִ� Ŭ����
 */
public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = {"����","�̸���","���","����"};
		for(String s : arr1)System.out.print(s+",");
		System.out.println();
		//arr1 �迭�� ���� "������" ������ ä���
		Arrays.fill(arr1, "������");
		for(String s : arr1)System.out.print(s+",");
		System.out.println();
		Arrays.fill(arr1,1,3,"������");
		for(String s : arr1)System.out.print(s+",");
		System.out.println();
		int[] intArr = new int[10];
		Arrays.fill(intArr,10);
		for(int i : intArr)System.out.print(i+",");
		System.out.println();
		String[] arr2 = {"����","�̸���","���","����"};
		Arrays.sort(arr2); //�����ϱ�
		for(String s : arr2)System.out.print(s+",");
		System.out.println();
		intArr = new int[] {3,2,1,6,9,4,8,5,7};
		Arrays.sort(intArr);
		for(int i : intArr)System.out.print(i+",");
	}
}
