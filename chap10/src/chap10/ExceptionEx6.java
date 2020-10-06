package chap10;
/*
 * 오버라이딩에서 예외 처리
 */
class Parent{
	public void method() throws RuntimeException{
		System.out.println("Parent 클래스의 method 메서드");
	}
}
class Child extends Parent{
	@Override
	public void method() throws ArithmeticException{
		System.out.println("Child 클래스의 method메서드");
	}
}
public class ExceptionEx6 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.method();
	}

}
