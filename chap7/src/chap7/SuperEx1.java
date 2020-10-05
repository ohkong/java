package chap7;

/*
 * super 예약어
 * 
 * super() 생성자 : 부모클래스의 생성자 호출
 * 				 부모클래스의 생성자의 매개변수에 맞도록 자손클래스에서 호출
 * 				  단 부모클래스에 매개변수가 없는 생성자가 있다면 생략가능함.
 * super 참조변수 : 부모클래스의 객체를 참조하는 변수
 */
class Parent {
	int x = 10;

	Parent(int x) { // 생성자
		this.x = x;
	}
}

class Child extends Parent {
	int x = 20;

	Child() {
		super(10);//this와 마찬가지로 super는 맨첫줄에 구현해야함
		System.out.println();
	}

	void method() {
		int x = 30;
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class SuperEx1 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}
