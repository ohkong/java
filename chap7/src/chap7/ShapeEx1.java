package chap7;
/*
 * 추상클래스 예제
 * 
 * 추상클래스
 * 	1. 추상메서드를 가질수 있는 클래스. abstract 예약어를 이용하여 구현함
 *	2. 객체화 불가 => 상속을 통해서 자손클래스의 객체화를 통해 객체화가 가능함
 *	3. 그외는 일반 클래스와 동일(생성자, 멤버변수, 멤버메서드, 초기화블럭, 상속...)
 *	4. 기능의 표준화
 * 
 * 추상 메서드 : 메서드의 선언부만 존재하는 메서드. 구현부가 없다.
 * 		=> 자손클래스에서 반드시 오버라이딩 해야함.
 */
abstract class Shape{ //추상클래스
	String type;
	Shape(String type){
		this.type=type;
	}
	abstract double area();		//추상메서드
	abstract double length();	//추상메서드 
}
class Circle extends Shape{
	int r;
	Circle(int r){
		super("원");
		this.r=r;
	}
	@Override
	double area() {
		return r*r*Math.PI;
	}
	@Override
	double length() {
		return 2*r*Math.PI;
	}
	public String toString() {
		return type + ":"+"반지름" + r + ", 넓이 : " + area() + ", 둘레 : "+ length();
	}
}
class Rectangle extends Shape{
	int width,height;
	Rectangle(int width,int height){
		super("사각형");
		this.width=width;
		this.height=height;
	}
	@Override
	double area() {
		return width*height;
	}
	@Override
	double length() {
		return 2*(width+height);
	}
	public String toString() {
		return type + ":"+" 가로 : " + width + ", 세로 : " + height + ", 넓이 : " + area() + ", 둘레 : "+ length();
	}
}
public class ShapeEx1 {

	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0] = new Circle(10);
		arr[1] = new Rectangle(10,10);
		for(Shape s : arr)
			System.out.println(s);
		
	}

}
