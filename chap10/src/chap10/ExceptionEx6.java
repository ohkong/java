package chap10;
/*
 * �������̵����� ���� ó��
 */
class Parent{
	public void method() throws RuntimeException{
		System.out.println("Parent Ŭ������ method �޼���");
	}
}
class Child extends Parent{
	@Override
	public void method() throws ArithmeticException{
		System.out.println("Child Ŭ������ method�޼���");
	}
}
public class ExceptionEx6 {

	public static void main(String[] args) {
		Parent p = new Child();
		p.method();
	}

}
