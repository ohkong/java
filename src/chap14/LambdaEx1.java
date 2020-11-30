package chap14;
/*
 * ���ٽ� ���� : jdk8.0 ���� ���� ��밡��
 * 			���ٽĿ��� ���Ǵ� �������̽��� FuntionalInterface ������.
 * FuntionalInterface : �߻�޼��尡 �Ѱ��� �����ϴ� �޼���.
 * 
 * �߻�޼����� �Ű������� ����, ����Ÿ�Ե� ���� ���
 * ()-> {......}
 * ���ٽ� ���ο� ����Ǵ� ������ �Ѱ��� ��� {} ����������.
 */ 
@FunctionalInterface //   @ -> ������̼�
interface LambdaInterface1{
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//�͸��� ����Ŭ������ ��ü.
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("����������� �ڵ�");
			}
		};
		fi.method();
		fi = () ->{ String str = "���� ������� �ڵ�2";
		System.out.println(str);
		};
		fi.method();
		fi = () ->{ String str = "���� ������� �ڵ�2";
		System.out.println(str);
		};
		fi.method();
		fi = () -> System.out.println("���� ������� �ڵ�3");
		fi.method();
		execute(()->System.out.println("���� ������� �ڵ�4"));
	}

	private static void execute(LambdaInterface1 f) {
		f.method();
	}
}