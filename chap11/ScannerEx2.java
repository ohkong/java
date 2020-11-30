package chap11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Scanner를 이용하여 파일의 정보 읽기
 */
public class ScannerEx2 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(new File("score.txt"));
		int cnt = 0,totalSum=0;
		while(scan.hasNextLine()) { // 읽을 수 있는 line 존재?
			String line = scan.nextLine(); // nextLine() : 한줄 읽어오기
			Scanner scan2 = new Scanner(line);
			scan2 = scan2.useDelimiter("\\s*,\\s*");
			double sum = 0;
			int i =0;
			String name = scan2.next(); //홍길동
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
		System.out.println("처리인원수:"+cnt);
	}
}
