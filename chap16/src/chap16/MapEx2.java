package chap16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Car{
	private int month;
	private int con;
	private String car;
	private int qty;
	private String remark;
	public Car(){}
	public Car(int month, int con, String car, int qty, String remark) {
		this.month=month;
		this.con=con;
		this.car=car;
		this.qty=qty;
		this.remark=remark;
	}
	public int getMonth() {return month;}
	public int getCon() {return con;}
	public String getCar() {return car;}
	public int getQty() {return qty;}
	public String getRemark() {return remark;}
	public String toString() {
		return String.format("[month=%d,con=%d,car=%s,qty=%d,remark=%s]",month,con,car,qty,remark);
	}
}
public class MapEx2 {
	public static void main(String[] args) throws IOException {
	//1.file�� ������ Stream���� 
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
	//Stream<String> br.lines() : br������ �����ϴ� ������ ������
	//								���κ��� Stream<String> ��ü�� ����
	//2.������ ������ Car��ü�� ��Ʈ������ ����
	//map() �޼��� ��� : Stream<String> => Stream<Car> 
		br.lines().map(s->{
			String[] str = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			}catch(ArrayIndexOutOfBoundsException e) {
				temp= "";
			}
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]),str[2],
					Integer.parseInt(str[3]), temp);
		}).filter(c->c.getCar().equals("����"))
		.forEach(c->System.out.println(c));
	}
}
