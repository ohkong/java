package chap9;

import chap9.Outer1.StaticInner;

/*
 * ���� Ŭ���� ����
 * 		�ν��Ͻ� ����Ŭ���� : Ŭ���� ����� ���� �� ����. ����� ����
 * 		static ����Ŭ���� : Ŭ���� ����� ���� �� �ִ�. 
 * 		���� ���� Ŭ���� : �޼��� ���ο��� ����� Ŭ����.
 * 					 ����� �޼��� ���ο����� ��� ����
 * 		
 * ���� Ŭ������ Ư¡
 * 	1. Ŭ���� ���ο� �����ϴ� Ŭ����.
 * 	2. �ڷ������� ����. ��üȭ ����. ObjectŬ������ ���� Ŭ����. 
 *     ������� ����, ������ ���� ����.
 *  3. �ܺ� Ŭ������ �����.
 *  	=> �ܺ�Ŭ������ private ����� ���� ����
 */
class Outer1 {
	class InstanceInner{ //�ν��Ͻ� ����Ŭ����
		int iv = 100;
//		static int cv = 10;   //static ����Ұ�
		final static int MAX = 200;  //����� ����
	}
	static class StaticInner{ //static ����Ŭ����
		int iv = 300;
		static int cv = 400;
		final static int MAX = 500;
	}
	void method() {
		class LocalInner{  // ���� ����Ŭ����
			int iv =600;
//			static int cv = 700; //Ŭ���� ��� �Ұ�
			final static int MAX = 800;
		}
		LocalInner lc = new LocalInner(); //��üȭ
		System.out.println("local ����Ŭ���� iv���� =" + lc.iv);
		System.out.println("local ����Ŭ���� MAX��� =" + LocalInner.MAX);
		}
	void method2() {
	//method() �޼��峻�ο����� ��밡��
//		LocalInner lc = new LocalInner(); 
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1 out = new Outer1();
		out.method();
//		Outer1.InstanceInner inner1 = out.new InstanceInner(); //����Ŭ������ ��üȭ
		Outer1.InstanceInner inner1 = new Outer1().new InstanceInner(); //����Ŭ������ ��üȭ   50=51
		System.out.println("InstanceInner Ŭ������ iv=" + inner1.iv);
		System.out.println("InstanceInner Ŭ������ MAX=" + inner1.MAX);
		System.out.println("InstanceInner Ŭ������ MAX=" + Outer1.InstanceInner.MAX);
		
		Outer1.StaticInner inner2 = new Outer1.StaticInner();
		System.out.println("StaticInner Ŭ������ iv=" + inner2.iv);
		System.out.println("StaticInner Ŭ������ cv=" + Outer1.StaticInner.cv);
		System.out.println("StaticInner Ŭ������ MAX=" + Outer1.StaticInner.MAX);
		if(inner1 instanceof Object) {
			System.out.println("inner1 ��ü�� Object ��ü��");
		}
	}

}
