package chap11;

import java.util.Calendar;
import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("�⵵�� ���� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		System.out.println("   "+year+"��"+month+"��");
		String[] week = {"��","��","ȭ","��","��","��","��"};
		for(int i = 0;i<week.length;i++) System.out.print(week[i]+"  ");
		System.out.println();
		int[][] arr=new int[6][7];
		cal.set(year, (month-1),1);
		
		int cnt = 1;
		for(int i = 0;i<arr.length;i++) {
			for(int j=0;j<7;j++) {
				if(arr[i][j]>=cal.get(Calendar.DAY_OF_WEEK)) {
					System.out.print(arr[i][j] + "  ");
					cnt++;
				}
			
			System.out.println();
		}
	}
		
	}

}
//[i+Calendar.DATE]