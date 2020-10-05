package chap5;

public class ArrayEx1 {

	public static void main(String[] args) {
		//1. 배열의선언
		//int[] arr1;  //참조변수 선언
		//2. 배열의 생성
		//arr1 = new int[5]; //배열 객체
		int[] arr1 = new int[5];
		//3. 배열값초기화
		arr1[0] = 100;
		arr1[1] = 200;
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1[" + i + "]=" + arr1[i]);
		}
		
		int[] arr2 = new int[10];
		arr2 = arr1;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2[" + i + "]=" + arr2[i]);
		}
		arr2[4]=350;
		System.out.println(arr1[4]+ ","+arr2[4]);
		
		//개선된 for 
		for(int i :arr2)
			System.out.println(i);
	}

}
