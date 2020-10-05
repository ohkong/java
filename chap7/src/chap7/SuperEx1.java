package chap7;

/*
 * super �����
 * 
 * super() ������ : �θ�Ŭ������ ������ ȣ��
 * 				 �θ�Ŭ������ �������� �Ű������� �µ��� �ڼ�Ŭ�������� ȣ��
 * 				  �� �θ�Ŭ������ �Ű������� ���� �����ڰ� �ִٸ� ����������.
 * super �������� : �θ�Ŭ������ ��ü�� �����ϴ� ����
 */
class Parent {
	int x = 10;

	Parent(int x) { // ������
		this.x = x;
	}
}

class Child extends Parent {
	int x = 20;

	Child() {
		super(10);//this�� ���������� super�� ��ù�ٿ� �����ؾ���
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
