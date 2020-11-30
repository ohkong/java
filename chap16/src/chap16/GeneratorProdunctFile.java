package chap16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * 대용량 데이터 파일을 생성하기
 */
public class GeneratorProdunctFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		String[] cars = {"아반테","그랜저","SM7","BMW","벤즈","K9"};
		String[] remarks = {"몰라요","싫어요","그냥그래요","좋아요"};
		int limit =0;
		int con = 0;
		fos = new FileOutputStream("product.txt");
		PrintStream ps = new PrintStream(fos);
		while(limit++<1000) {
			//1~12 중 임의의 수를 파일에 쓰기.=> 월
			ps.print((int)(Math.random()*12)+1+",");
			//1.생산 , 2.판매, 3.반품
			con = (int)(Math.random()*3)+1;
			ps.print(con+",");
			ps.print(cars[(int)(Math.random()*cars.length)]+",");
			//1~5임의의 값 : 판매수량
			ps.print((int)(Math.random()*5)+1);
			if(con==3) {//반품 사유
				ps.print(",");
				ps.print(remarks[(int)(Math.random()*3)]);
			}
			ps.println();
		}
		ps.flush();ps.close();
	}
}
