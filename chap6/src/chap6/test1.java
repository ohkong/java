package chap6;

import java.util.Scanner;


public class test1 {

	public static void main(String[] args) {
		// 1번 강사님
//		//1.가변배열 선언
//		int[][]arr=new int[10][];
//		//2.각행의 1차원 배열 객체 생성
//		for(int i=0;i<arr.length;i++) {
//			arr[i]= new int[i+1];
//		}
//		//3.배열의 내부에 숫자 채우기
//		int data = 0;
//		for(int j=9;j>=0;j--) {
//			for(int i=j;i<arr.length;i++) {
//				arr[i][j]=++data;
//			}
//		}
//		//4.결과 출력
//		for(int i =0;i<arr.length;i++) {
//			for(int j =0;j<arr[i].length;j++) {
//				System.out.printf("%4d",arr[i][j]);
//			}
//			System.out.println();
//		}

		
		
		// 2번
//		System.out.println("숫자를 입력해주세요");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		if (num == 2 || num == 3 || num == 5 || num == 7) {
//			System.out.println("소수입니다");
//		} else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
//			System.out.println("소수가 아닙니다");
//		} else {
//			System.out.println("소수입니다");
//		}

		// 강사님
//		System.out.println("숫자를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		int cnt =0;
//		System.out.print(num + "의 약수 : ");
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				System.out.print(i+" ");
//			cnt++;
//			}
//		}
//		System.out.println();
//		System.out.print(num + " : ");
//		if(cnt==2)System.out.println("소수입니다");
//		else System.out.println("소수가 아닙니다");

		
		
		// 3번
//		System.out.println("금액을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int x = scan.nextInt();
//		if(x>3330) {
//			System.out.println("동전이 부족합니다.");
//		}
//			
//		x/500
//		x%500/100
//		x%100/50
//		x%50/10
//		x%10/1
		
		//강사님
//		int[] coin= {500,100,50,10,5,1};
//		int[] cnt= {5,5,5,5,5,5};
//		System.out.println("금액을 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int money = scan.nextInt();
//		int maxmoney = 0;
//		for(int i=0;i<coin.length;i++) {
//			maxmoney += coin[i]*cnt[i];
//		}
//		if (money>maxmoney) {
//			System.out.println("동전이 부족합니다.");
//			return;
//		}
//		//동전을 바꿀수 있는 금액
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
//			System.out.println(coin[i] + "원 : " + coinNum + "개");
//		}
//		for(int i=0;i<coin.length;i++) {
//			System.out.println("남은동전  " + coin[i] + "원 : " + cnt[i] + "개");
//		}
//		
		
		
		
		
		// 4번
//		System.out.println("강아지와 병아리의 합계를 입력하세요.");
//		Scanner scan = new Scanner(System.in);
//		int total = scan.nextInt();
//		System.out.println("강아지와 병아리의 다리의 합계를 입력하세요.");
//		int legs = scan.nextInt();
//		boolean x = true;
//		for (int i = 0; i <= legs; i++) {
//			for (int j = 0; j <= legs; j++) {
//				if (total == i + j && legs == (4 * i) + (2 * j)) {
//					System.out.println("강아지는 " + i + "마리이고, 병아리는 " + j + "마리이다.");
//					x=false;
//					break;
//				} 
//			
//			}
//
//		}
//		if (x == true) {
//			System.out.println("정답이 없습니다");
//	
//		}
		
		//강사님
		
		
		

	}
}
