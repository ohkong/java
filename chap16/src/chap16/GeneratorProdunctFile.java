package chap16;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * ��뷮 ������ ������ �����ϱ�
 */
public class GeneratorProdunctFile {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		String[] cars = {"�ƹ���","�׷���","SM7","BMW","����","K9"};
		String[] remarks = {"�����","�Ⱦ��","�׳ɱ׷���","���ƿ�"};
		int limit =0;
		int con = 0;
		fos = new FileOutputStream("product.txt");
		PrintStream ps = new PrintStream(fos);
		while(limit++<1000) {
			//1~12 �� ������ ���� ���Ͽ� ����.=> ��
			ps.print((int)(Math.random()*12)+1+",");
			//1.���� , 2.�Ǹ�, 3.��ǰ
			con = (int)(Math.random()*3)+1;
			ps.print(con+",");
			ps.print(cars[(int)(Math.random()*cars.length)]+",");
			//1~5������ �� : �Ǹż���
			ps.print((int)(Math.random()*5)+1);
			if(con==3) {//��ǰ ����
				ps.print(",");
				ps.print(remarks[(int)(Math.random()*3)]);
			}
			ps.println();
		}
		ps.flush();ps.close();
	}
}
