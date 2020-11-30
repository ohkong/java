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
	//1.file의 내용을 Stream으로 
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
	//Stream<String> br.lines() : br변수가 참조하는 파일의 내용을
	//								라인별로 Stream<String> 객체로 생성
	//2.파일의 내용을 Car객체의 스트림으로 변경
	//map() 메서드 기능 : Stream<String> => Stream<Car> 
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
		}).filter(c->c.getCar().equals("벤즈"))
		.forEach(c->System.out.println(c));
	}
}
