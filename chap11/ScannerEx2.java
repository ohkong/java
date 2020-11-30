package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Scanner�� �̿��Ͽ� ������ ���� �б�
 */
public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0,totalSum=0;
		while(scan.hasNextLine()) { // ���� �� �ִ� line ����?
			String line = scan.nextLine(); // nextLine() : ���� �о����
			Scanner scan2 = new Scanner(line);
			scan2 = scan2.useDelimiter("\\s*,\\s*");
			double sum = 0;
			int i =0;
			String name = scan2.next(); //ȫ�浿
			System.out.print(name + ":");
			while(scan2.hasNextDouble()) {
				double score = scan2.nextDouble();
				sum += score;
				System.out.print(score + ",");
				i++;
			}
			System.out.printf("sum=%.1f,avg=%.2f\n",sum,sum/i);
			cnt++;
		}
		System.out.println("ó���ο���:"+cnt);
	}
}
