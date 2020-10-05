package chap7;

/*
 * 부모클래스의 멤버와 자손클래스의 멤버가 동일한 경우 예제
 * 		멤버변수 : 참조변수의 자료형을 따른다.
 * 		멤버메서드 : 객체의 최종 오버라이딩된 메서드가 호출된다.
 * 
 * 다형성 java.lang.ClassCastExeption : 
 *     객체와 참조변수 자료형이 문제있는 경우 발생됨.
 */
class Parent3 {
	int x = 10;

	void method() {
		System.out.println("Parent3 클래스의 method");
	}
}

class Child3 extends Parent3 {
	int x = 20;

	@Override
	void method() {
		System.out.println("Child3 클래스의 method");
		System.out.println("x= " + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class BindingEx1 {

	public static void main(String[] args) {
//		Parent3 p = new Parent3(); //이걸로 하면 오류남
		Parent3 p = new Child3();
		Child3 c = (Child3) p;
		System.out.println(p.x);
		System.out.println(c.x);
		p.method();
		c.method();
	}

}
