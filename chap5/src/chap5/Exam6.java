package chap5;

/*
 * int arr[][] = {{1},{10,20,3,4,5,6},{30,40,50},{60,70,80,90}};
 * 
 * 2차원 배열의 행의 합과 열의 합 구하기
 * [결과]
 * 0행의합 :1
 * 1행의합 :48
 * 2행의합 :120
 * 3행의합 :300
 * 0열의합 :101
 * 1열의합 :130
 * 2열의합 :133
 * 3열의합 :94
 * 4열의합 :5
 * 5열의합 :6
 */
public class Exam6 {

	public static void main(String[] args) {
		int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
		int maxcol = 0;
		for (int i = 0; i < arr.length; i++) {
			if (maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		int col[] = new int[maxcol];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				col[j] += arr[i][j];
			}
			System.out.println(i + "행의 합 : " + sum);
		}
		for (int i = 0; i < col.length; i++) {
			System.out.println(i + "열의 합 : " + col[i]);
		}
	}
}




//int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
//int sum[] = new int[8];
//for (int i = 0; i < arr[i].length + 1; i++) {
//	for (int j = 0; j < arr[j].length + 1; j++) {
//		sum[i] = arr[i][j];
//		System.out.println(i + "행의 합 : " + sum[i]);
//	}
//	}