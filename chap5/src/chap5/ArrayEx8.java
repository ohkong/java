package chap5;
/*
 * 가변배열의 초기화
 */
public class ArrayEx8 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];
		for(int[] a:arr) {
			for(int i : a) {
			System.out.printf("%3d\t",i);
		}
			System.out.println();
		}
	}

}
