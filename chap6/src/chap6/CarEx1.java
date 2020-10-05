package chap6;
/*
 * 선언위치에 따른 변수의 종류
 *           선언위치            선언방법                            메모리 할당시점                메모리 할당위치
 *클래스 변수  : 클래스 내부        static int num; 		클래스 정보 로드시		클래스영역
 *          객체화와 관련없음. 모든 객체의 공통변수로 사용됨.
 *          클래스명.변수명  호출됨
 *          기본값으로 초기화 됨
 * 인스턴스 변수 : 클래스 내부      int num;				객체화시			힙영역
 *           반드시 객체화 되어야 함. 
 *           참조변수명.변수명 화출됨
 *           기본값으로 초기화 됨
 *           기본값 : 참조자료형 : null.
 *           		숫자형 : 0
 *           		논리형 : false
 * 지역 변수 : 메서드 내부           int num;				선언문 실행시		스택영역
 * 			메서드 내부에서만 사용가능함.
 * 			반드시 초기화 되어야 함.
 * 			매개변수는 지역변수다.
 * 
 */

class Car {
	String color; //인스턴스변수 , 객체변수
	int number; //인스턴스변수
	static int width = 200; //클래스변수
	static int height = 120; //클래스변수

	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		System.out.println("자동차의 크기 : " + Car.width + "," + Car.height);
		Car car1 = new Car();//객체화, 인스턴스 변수들이 메모이 힙영역에 할당됨
		System.out.println(car1);
		car1.color = "White";
		car1.number = 1234;
		//참조변수를 화면출력시 자동으로 toString() 메서드 호출됨
		//toString() : 객체를 문자열로 변환시키는 메서드
		System.out.println("car1 : " + car1);  //car1 => car1.toString()
		Car car2 = new Car(); //객체화
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2 : " + car2);
		Car.width = 300; //클래스변수 호출시 클래스명.변수명으로 호출함
		car1.height = 200;//참조변수명.클래스변수면 사용사 경고메세지표시
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
	}

}
