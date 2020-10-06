package chap8;
/*
 * 인터페이스의 객체 생성하기
 */
interface Action{
	void action();
}
abstract class Abs{
	abstract void method();
}
public class InterfaceEx4 {

	public static void main(String[] args) {
		//이름없는 내부 클래스 => 일회성 객체로 생성되고 사용됨.
		Action a = new Action(){
			@Override
			public void action() {
				System.out.println("Action 인터페이스객체");
			}
		};
		a.action();
		
		a = new Action() {
			@Override
			public void action() {
				System.out.println("Action 인터페이스객체 2");
			}
		};
		a.action();
		
		Abs a1=new Abs() {
			@Override
			void method() {
				System.out.println("Abs 추상클래스객체");
			}
		};
		a1.method();
		//람다 방식으로 생성하기 => 인터페이스만 가능. jdk8 이후
		a = ()->System.out.println("Action 인터페이스 객체를 람다로 생성");
		a.action();
	}

}
