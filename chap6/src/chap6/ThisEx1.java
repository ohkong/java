package chap6;
/* 
 * this 예약어 예제
 * 
 * this() 생성자 : 클래스 내부의 다른 생성자 호출시 사용
 * 				반드시 첫줄에 구현해야 한다.
 * this 참조변수  : 자기 참조 변수.
 * 				인스턴스멤버를 참조할때 사용
 * 				인스턴스메서드에서 사용가능함 =>인스턴스 메서드에 지역변수로 자동 설정됨
 * 				같은 이름의 지역변수와 멤버변수를 구분시 사용함
 * 				
 */
class Car3{
	String color;
	int number;
	int serialNo;
	static int sno;
	Car3(String color, int number){
		System.out.println("Car3(String , int)");
		this.color = color;
		this.number = number;
		serialNo = ++sno;
	}
	Car3(){
		this("white",1111);//생성자의 첫줄에 구현해야함.
		System.out.println("Car3()");
	}
	Car3(String color){
		this(color,1111);
		System.out.println("Car3(String)");
	}
	Car3(int number){
		this("white",number);
		System.out.println("Car3(int)");
	}
	Car3(Car3 c){
		this(c.color,c.number);
	}
	public String toString() {
		return serialNo + "번자동차 : "+this.color + ","+this.number;
	}
}
public class ThisEx1 {

	public static void main(String[] args) {
		Car3 c1=new Car3("blue",1234); 
		Car3 c2=new Car3();				
		Car3 c3=new Car3("red");		
		Car3 c4=new Car3(1234);			
		Car3 c5=new Car3(c1);
		System.out.println(c1);//1번 자동차:blue,1234
		System.out.println(c2);//2번 자동차:white,1111
		System.out.println(c3);//3번 자동차:red,1111
		System.out.println(c4);//4번 자동차:white,1234
		System.out.println(c5);//5번 자동차 :blue,1234
	}

}
