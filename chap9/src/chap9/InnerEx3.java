package chap9;
/*
 * ����Ŭ���� ��ü���� ���Ǵ� this
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
			int iv =300;
			System.out.println("iv=" +iv); //300  method�� iv
			System.out.println("iv2=" +iv2); //20  �ܺ�Ŭ���� �ܿ� iv2�� ���� ���⿡ �ܺ�Ŭ������ ���� �޴´�.
			//this : ����Ŭ������ ��ü(InstancInner)
			System.out.println("this.iv=" +this.iv); //100  InstancInner�� iv 
			//�ܺ�Ŭ������.this : �ܺ�Ŭ������ ���
			System.out.println("Outer3.this.iv=" +Outer3.this.iv); //10  Outer3�� iv
			}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3.InstanceInner inner = new Outer3().new InstanceInner();
		inner.method1();
	}

}
