package chap6;

import java.util.Scanner;


public class test1 {

	public static void main(String[] args) {
		// 1�� �����
//		//1.�����迭 ����
//		int[][]arr=new int[10][];
//		//2.������ 1���� �迭 ��ü ����
//		for(int i=0;i<arr.length;i++) {
//			arr[i]= new int[i+1];
//		}
//		//3.�迭�� ���ο� ���� ä���
//		int data = 0;
//		for(int j=9;j>=0;j--) {
//			for(int i=j;i<arr.length;i++) {
//				arr[i][j]=++data;
//			}
//		}
//		//4.��� ���
//		for(int i =0;i<arr.length;i++) {
//			for(int j =0;j<arr[i].length;j++) {
//				System.out.printf("%4d",arr[i][j]);
//			}
//			System.out.println();
//		}

		
		
		// 2��
//		System.out.println("���ڸ� �Է����ּ���");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if (num == 2 || num == 3 || num == 5 || num == 7) {
//			System.out.println("�Ҽ��Դϴ�");
//		} else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
//			System.out.println("�Ҽ��� �ƴմϴ�");
//		} else {
//			System.out.println("�Ҽ��Դϴ�");
//		}

		// �����
//		System.out.println("���ڸ� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int cnt =0;
//		System.out.print(num + "�� ��� : ");
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.print(i+" ");
//			cnt++;
//			}
//		}
//		System.out.println();
//		System.out.print(num + " : ");
//		if(cnt==2)System.out.println("�Ҽ��Դϴ�");
//		else System.out.println("�Ҽ��� �ƴմϴ�");

		
		
		// 3��
//		System.out.println("�ݾ��� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		if(x>3330) {
//			System.out.println("������ �����մϴ�.");
//		}
//			
//		x/500
//		x%500/100
//		x%100/50
//		x%50/10
//		x%10/1
		
		//�����
//		int[] coin= {500,100,50,10,5,1};
//		int[] cnt= {5,5,5,5,5,5};
//		System.out.println("�ݾ��� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int money = scan.nextInt();
//		int maxmoney = 0;
//		for(int i=0;i<coin.length;i++) {
//			maxmoney += coin[i]*cnt[i];
//		}
//		if (money>maxmoney) {
//			System.out.println("������ �����մϴ�.");
//			return;
//		}
//		//������ �ٲܼ� �ִ� �ݾ�
//		for(int i=0;i<coin.length;i++) {
//			int coinNum = 0;
//			coinNum = money/coin[i];
//			if(cnt[i]<coinNum) {
//				coinNum=cnt[i];
//				cnt[i]=0;
//			}else {
//				cnt[i]-=coinNum;
//			}
//			money -= coinNum*coin[i];
//			System.out.println(coin[i] + "�� : " + coinNum + "��");
//		}
//		for(int i=0;i<coin.length;i++) {
//			System.out.println("��������  " + coin[i] + "�� : " + cnt[i] + "��");
//		}
//		
		
		
		
		
		// 4��
//		System.out.println("�������� ���Ƹ��� �հ踦 �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int total = scan.nextInt();
//		System.out.println("�������� ���Ƹ��� �ٸ��� �հ踦 �Է��ϼ���.");
//		int legs = scan.nextInt();
//		boolean x = true;
//		for (int i = 0; i <= legs; i++) {
//			for (int j = 0; j <= legs; j++) {
//				if (total == i + j && legs == (4 * i) + (2 * j)) {
//					System.out.println("�������� " + i + "�����̰�, ���Ƹ��� " + j + "�����̴�.");
//					x=false;
//					break;
//				} 
//			
//			}
//
//		}
//		if (x == true) {
//			System.out.println("������ �����ϴ�");
//	
//		}
		
		//�����
		
		
		

	}
}
