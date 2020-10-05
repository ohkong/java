package chap7;
/* 
 * 오버라이딩 예제
 * 
 * 오버라이딩 : 상속관계에서 나타남. 메서드의 재정의
 * 			부모클래스의 메서드를 자손 클래스에서 재정의함
 * 			부모클래스의 메서드의 선언부와, 자손클래스의 메서드의 선언부가 동일해야함.
 * 			단 접근제어자는 넓은 범위로, 예외처리는 좁은 범위로 가능함.
 * 
 */
class Bike{
	int wheel;
	Bike(int wheel){
		this.wheel=wheel;
	}
	String drive() {
		return "폐달을 밟는다";
	}
	String stop() {
		return "브레이크를 잡는다";
	}
	@Override
	public String toString() {
		return "부모 클래스의 바퀴수: " + wheel;
	}
}
class AutoBike extends Bike{
	boolean power;
	AutoBike(int wheel){
		super(wheel);
	}
	void power() {
		power = !power;
	}
	@Override //오버라이딩 검증을 위한 어노테이션
	String drive() {
		System.out.println(super.drive());
		return "출발버튼을 누른다";
	}
	@Override
	String stop() {
		return "정지버튼을 누른다";
	}
}
public class BikeEx1 {

	public static void main(String[] args) {
		AutoBike ab = new AutoBike(2);
		System.out.println(ab.drive());
		System.out.println(ab.stop());
		Bike b = new Bike(2);
		System.out.println(b.drive());
		System.out.println(b.stop());
	}

}
