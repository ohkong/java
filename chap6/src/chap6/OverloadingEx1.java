package chap6;
/*
 * �����ε� ����(�޼����� ������)
 * 	1. Ŭ���� ���ο� ���� �̸��� �޼��尡 ������ ������ �� �ִ�.
 * 	2. �� �Ű����� ����� �޶�� �Ѵ�. (�ڷ���, ����, ����)
 * 
 */
class Math2{
	int a =100;
	int add(int b) {
		System.out.print("1:");
		return a+b;
	}
	double add(double b) {
		System.out.print("2:");
		return a+b;
	}
	String add(String b) {
		System.out.print("3:");
		return a+b;
	}
}
public class OverloadingEx1 {

	public static void main(String[] args) {
		Math2 m = new Math2();
		System.out.println(m.add(10));
		System.out.println(m.add(10.5));
		System.out.println(m.add("��"));
		System.out.println(m.add(10L));
	}

}
