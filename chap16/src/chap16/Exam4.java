package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * product.txt������ �Ҿ� 6����, �׷��� �Ǹż����� ����ϱ�
 */
public class Exam4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		int sum = br.lines().map(s->{
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			}catch(ArrayIndexOutOfBoundsException e) {
				temp= "";
			}
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]),str[2],
					Integer.parseInt(str[3]),temp);
		}).filter(c->c.getMonth()==6&&c.getCar().equals("�׷���")&&c.getCon()==2)
				.mapToInt(Car::getQty).sum();
		System.out.println(sum);
	}
}