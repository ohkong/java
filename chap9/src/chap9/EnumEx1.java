package chap9;
/*
 * 열거형 예제
 */
public class EnumEx1 {
	public enum Car{  //enum 예약어 jdk5이후 추가
		AVANTE,SONATA,GRANDURE,SM5
	}
	public static void main(String[] args) {
		Car car = Car.AVANTE;
		System.out.println(car);
		Car[] cars = Car.values();
		for(Car c : cars) {
			System.out.println(c + ":" + c.ordinal());
		}
		//car Object의 하위클래스?
		if(car instanceof Object) {
			System.out.println("car객체는 Object객체다");
		}
		
	}
}
