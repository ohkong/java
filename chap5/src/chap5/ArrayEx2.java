package chap5;
/*
 * 배열 선언 생성 초기화
 */
public class ArrayEx2 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		for (int a : arr)
			System.out.println(a);
		System.out.println("f");
		arr = new int [] {100,200,300};
		for (int a : arr)
			System.out.println(a);

	}

}
