package chap14;
/*
 * �߻�޼����� �Ű����� �ְ�, ���� Ÿ���� ���� ���
 * (�Ű�����)->{.....}
 * �Ű������� ������ �Ѱ��� ��� () ��������
 * ���� ������ �ѹ����ΰ�� {} ���� ����
 */
@FunctionalInterface
interface LambdaInterface3{
	void method(int a);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 fi = (a) -> {
			System.out.println(a*5);
		};
		fi.method(2); //10
		fi.method(10); //50
		fi = x->System.out.println(x+x);
		fi.method(2); //4
		fi.method(10); //20
		//calc �޼��带 �̿��Ͽ� x+x �� �Լ� ȣ��.
		calc(fi);
		//calc �޼��带 �̿��Ͽ� x*x �� �Լ� ȣ��.
		calc(x->System.out.println(x*x));
	}
	static void calc(LambdaInterface3 f) {
		f.method(10);
	}
}
