package chap5;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// 1��
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 2; j <= 5; j++) {
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//			}
//			System.out.println("");
//		}
//		System.out.println();
//		for (int k = 2; k <= 9; k++) {
//			for (int l = 6; l <= 9; l++) {
//				System.out.print(l + "*" + k + "=" + (l * k) + "\t");
//			}
//			System.out.println("");
//		}

		// �����
//		for(int k=2;k<=9;k+=4) {
//		for(int i=0;i<4;i++) {
//			System.out.print((i+k)+"��\t");
//		}
//		System.out.println();
//		for(int j=2;j<=9;j++) {
//			for(int i=k;i<k+4;i++) {
//				System.out.print(i+ "*"+ j + "=" +(i*j) + "\t");
//			}
//			System.out.println();
//			
//			}
//		System.out.println();
//		}

		// 2��
//		System.out.println("2x + 4y = 10 �� �� �Դϴ�.");
//		int sum =10;
//		for(int x = 0;x<=10;x++) {
//			for(int y =0;y<=10;y++) {
//				if(sum==(2*x)+(4*y)) {
//					System.out.println( "x = "+ x + ", y = " + y);
//				}
//			}
//		}

		// 3��
//		int sum =0;
//		for(int i=1;i<=10;i++) {
//			int sum1 =0;
//			for(int j=1;j<=i;j++) {
//				sum1 += j;
//			}
//			sum += sum1;
//		}
//		System.out.println(sum);

		// �����
//		int sum =0;
//		for(int i=1;i<=10;i++) {
//			System.out.print("(");
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+((j==i)?"":"+"));
//				sum += j;
//			}
//			System.out.print(")"+((i==10)?"=" : "+"));
//		}
//		System.out.println(sum);

		// 4�� �����Ѱ� �ݴ�� ����;;
//		System.out.println("�ﰢ���� ���̸� �Է����ּ���");
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j<i+1; j++) {
//				System.out.print("*"); 
//			}
//			System.out.println(" ");
//		}		

		// �����
//		System.out.println("�ﰢ���� ���̸� �Է����ּ���");
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		for (int i = h; i >= 1; i--) {
//			for (int j = 1; j <= h; j++) {
//				if (i <= j) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		}

		
		
		// 5�� ����� 
//		System.out.println("�ﰢ���� ���̸� �Է����ּ���");
//		Scanner scan = new Scanner(System.in);
//		int h = scan.nextInt();
//		int bot = h * 2 -1;
//		int m =bot/2;
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j <bot; j++) {
//				if (j >=m-i && j<=m-i) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println(" ");
//		}
		
			
		// 6�� ����� 
		System.out.println("�迭�� ũ�⸦ Ȧ���� �Է����ּ���");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		for (int i = 0; i <= h/2; i++) {  //������ �ݱ��� ���
			for (int j = 0; j <h-i; j++) {
				if (j <i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
		for (int i = h/2+1; i < h; i++) {  //������ �ݺ��� 1�Ʒ����� ���
			for (int j = 0; j <=i; j++) {
				if (j>=h-i-1&&j<=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
		
		
		
	}

}
