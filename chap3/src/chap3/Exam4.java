package chap3;
/*
 * ���ڸ� �Է¹޾Ƽ� ����ΰ��� "���", �����ΰ�� "����", 0�ΰ��"0"�� ����ϱ�
 */

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
//		System.out.println("���ڸ� �Է��ϼ���.");
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		String num2 = (num>0)?"���":(num<0)?"����":"��";
//		System.out.println(num + "�� "+ num2 +" �Դϴ�.");
		//¦������ Ȧ������ ���
		System.out.println("���ڸ� �Է��ϼ���.");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String num2 = (num%2==0)?"¦��":"Ȧ��";
		System.out.println(num +"��(��) "+num2+" �Դϴ�.");
		
	}

}
