package chap5;

import java.util.Scanner;

public class Exam9 {

	public static void main(String[] args) {
//		System.out.println("삼각형의 높이를 입력해주세요");
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int sum = 0;
//		int b = h*2-1;
//		for (int i = b; i >=1; i-=2)
//			sum += i;
////		for(int i= 1;i<=h;i++)
////			sum += i*2-1;
//		int data = sum;
//		int m = b/2;
//		for (int i = 0; i <h; i++) {
//			for (int j = 0; j <b; j++) {
//				if (j>=(m-i)&&j<=(m+i)) {
//					System.out.printf("%3d",data--);
//				} else {
//					System.out.print("   ");
//				}
//			}
//			System.out.println(" ");
//		}
		
		//2차배열로 만들기
		System.out.println("삼각형의 높이를 입력해주세요");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int sum = 0;
		int b = h*2-1;
		int m = b/2;
		for (int i = b; i >=1; i-=2)
			sum += i;
		int data =sum;
		int[][] arr = new int[h][b];
		for(int i=0;i<arr.length;i++) {
			for(int j = m-i;j<=m+i;j++) {
				arr[i][j]=data--;
			}
		}
		for(int[] a :arr) {
			for(int i : a) {
				if(i==0)System.out.printf("%3c",' ');
				else System.out.printf("%3d",i);
			}
			System.out.println();
		}

	}

}