package chap11;

import java.util.Scanner;

//���� : str ���ڿ����� ���� ����ϱ�
public class Exam12 {
	public static void main(String[] args) {
		String str = "Java and JSP and Spring"+ " and HTML and JavaScript and Jquery";
		String[] arr = str.split("\\s*and\\s*");
		System.out.println("String.split �޼��� �̿�:");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println();
		System.out.println("Scanner �̿�:");
		Scanner scan = new Scanner(str);
		scan.useDelimiter("\\s*and\\s*");
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}
