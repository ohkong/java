package chap6;
/*
 * �����ε� �޼��� ���� ����
 * 		1. ȣ��ÿ� �Էµ� ���ڰ��� �ڷ����� �޼����� ����ο� ���ǵ� �ڷ����� ������ �޼��� ����
 * 		2. 1�� ������ ���� ���
 * 			�ּҰ����� �ڵ� ����ȯ�� ������ �޼��� ����
 * 			->������ ������ �޼��尡 �������� ��� ���� �߻�.
 * 
 * �����ε��� ����
 * 		1. �޼��� ���� ���ƾ� �Ѵ�.
 * 		2. �Ű������� �޶�� �Ѵ�.(�ڷ��� ����)
 * 		3. ����Ÿ��, ����������, ����ó���� ����� ����.
 */
class Math4{
	
	int add(int a,int b) {
		System.out.print("1.int int �޼��� ���:");
		return a+b;
	}
	
	long add(long a,int b) {
		System.out.print("2.long int �޼��� ���:");
		return a+b;
	}
	
	long add(int a,long b) {
		System.out.print("3.int long �޼��� ���:");
		return a+b;
	}
	
	long add(long a,long b) {
		System.out.print("4.long long �޼��� ���:");
		return a+b;
	}
}
public class OverloadingEx2 {

	public static void main(String[] args) {
		Math4 m4 = new Math4();
		System.out.println(m4.add(10, 10));
		System.out.println(m4.add(10, 10L));
		System.out.println(m4.add(10L, 10));
		System.out.println(m4.add(10L, 10L));
	}

}
