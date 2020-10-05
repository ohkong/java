package chap5;

/*
 * int arr[][] = {{1},{10,20,3,4,5,6},{30,40,50},{60,70,80,90}};
 * 
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 * [���]
 * 0������ :1
 * 1������ :48
 * 2������ :120
 * 3������ :300
 * 0������ :101
 * 1������ :130
 * 2������ :133
 * 3������ :94
 * 4������ :5
 * 5������ :6
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
			System.out.println(i + "���� �� : " + sum);
		}
		for (int i = 0; i < col.length; i++) {
			System.out.println(i + "���� �� : " + col[i]);
		}
	}
}




//int arr[][] = { { 1 }, { 10, 20, 3, 4, 5, 6 }, { 30, 40, 50 }, { 60, 70, 80, 90 } };
//int sum[] = new int[8];
//for (int i = 0; i < arr[i].length + 1; i++) {
//	for (int j = 0; j < arr[j].length + 1; j++) {
//		sum[i] = arr[i][j];
//		System.out.println(i + "���� �� : " + sum[i]);
//	}
//	}