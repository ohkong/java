package chap16;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductGroupEx1 {
	public static void main(String[] args) throws IOException{
		ProductGroupEx1 pg = new ProductGroupEx1();
		Stream<Car> car = pg.makeCar();
		//월별 판매 수량을 Map 객체 생성하기
		//groupingBy
		Map<Integer,List<Car>> map = car.filter(s->s.getCon()==2)
				.collect(Collectors.groupingBy(s->s.getMonth()));
//		System.out.println(map);
//		for(Map.Entry<Integer, List<Car>> e : map.entrySet()) {
//			System.out.println(e.getKey()+"월별 판매 목록:");
//			for(Car c : e.getValue())System.out.println(c);
//		}
		
//		System.out.println("월별 판매 건수");
//		for(Map.Entry<Integer, List<Car>> e : map.entrySet()) {
//			System.out.println(e.getKey()+"월:" + 
//		   e.getValue().size() + "건");
//		}
		//Stream 에서 count 리턴
		System.out.println("월별 판매 건수");
		Map<Integer, Long> mapCount = pg.makeCar().filter(s->s.getCon()==2)
				.collect(Collectors
						.groupingBy(s->s.getMonth(),Collectors.counting()));
		for(Map.Entry<Integer, Long> e : mapCount.entrySet()) {
			System.out.println(e.getKey()+"월:" + e.getValue() + "건");
		}
		
		System.out.println("월별 판매 수량");
		Map<Integer, Integer> mapSum = pg.makeCar().filter(s->s.getCon()==2)
				.collect(Collectors
						.groupingBy(s->s.getMonth()
								,Collectors.summingInt(Car::getQty)));
		for(Map.Entry<Integer, Integer> e : mapSum.entrySet()) {
			System.out.println(e.getKey()+"월:" + e.getValue() + "대");
		}
		
		//자동차별 반품 수량 출력하기
		System.out.println("자동차별 반품 수량");
		Map<String, Integer> mapReturn = pg.makeCar().filter(s->s.getCon()==3)
				.collect(Collectors
						.groupingBy(s->s.getCar()
								,Collectors.summingInt(Car::getQty)));
		for(Map.Entry<String, Integer> e : mapReturn.entrySet()) {
			System.out.println(e.getKey()+":" + e.getValue() + "대");
		}
	}
	//product.txt 파일의 내용을 읽어서 Stream<Car> 객체로 리턴
	private Stream<Car> makeCar() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("product.txt"));
		Stream<Car> car = br.lines().map(s->{
			String str[] = s.split(",");
			String temp = "";
			try {
				temp = str[4];
			}catch(ArrayIndexOutOfBoundsException e){}
			return new Car(Integer.parseInt(str[0]),
					Integer.parseInt(str[1]),str[2],
					Integer.parseInt(str[3]),temp);
		});
		return car;
		
	}
}
