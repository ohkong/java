package chap8;
/*
 * jdk8 ���Ŀ� �������̽��� �����θ� ���� �޼��带 ����� ������ �ִ�
 * default �޼��� : �ν��Ͻ� ���
 * 		�������̽��� ���� ������ �����ϹǷ�, ������ü�� �Ȱ���
 * 		default method�� ������ �����Ҽ� �����Ƿ� �̷� ��� �ݵ��
 * 		���� Ŭ������ default �޼��带 �������̵�
 * static �޼��� : Ŭ���� ���
 */
interface MyInterface1{
	void method();
	default void method1() {
		System.out.println("MyInterface1�� default �޼��� : method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface1�� static �޼��� : staticMethod");
	}
}
class Parent{
	public void method2() {
		System.out.println("Parent Ŭ������ ��� �޼��� : method2");
	}
}
interface MyInterface2{
	void method();
	default void method1() {
		System.out.println("MyInterface2�� default �޼��� : method1");
	}
	static void staticMethod() {
		System.out.println("MyInterface2�� static �޼��� : staticMethod");
	}
}
class Child extends Parent implements MyInterface1,MyInterface2{
	@Override
	public void method1() {
		System.out.println("Child�� default �޼��� �������̵� : method");
	}
	@Override
	public void method() {
		System.out.println("Child Ŭ������ method");
	}
}
public class InterfaceEx5 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
		c.method1();
		c.method2();
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}
