package chap11;
/*
 *  hashcode : �����ǹ̴� JVM�� ��ü�� �����ϱ� ���� ������
 *  		       ������ ���� ��� ���� hashcode���� �������� �������̵���(�������)
 *  ����񱳸� ���Ͽ� equals �޼��带 �������̵� �ϴ°��
 *  hashcode �޼��嵵 �Բ� �������̵��ϴ°��� ������
 *  => ���� ��� �񱳿� ����(Collection �����ӿ�ũ���� �ٽ� �ٷ�)
 */
public class HashcodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1==s2)System.out.println("s1��s2�� ���� ��ü��");
		else System.out.println("s1��s2�� �ٸ� ��ü��");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("s1 ��ü�� ���� hashcode �� : "+System.identityHashCode(s1));
		System.out.println("s2 ��ü�� ���� hashcode �� : "+System.identityHashCode(s2));
	}
}
