package chap11;
/*
 * StringBuffer Ŭ���� : ���� ���ڿ�
 * 	  equals �޼��尡 �������̵� �Ǿ� ���� ����
 * 	   ���� �񱳸� ���ؼ��� ���ڿ��� �����Ͽ� ���ؾ� ��.
 */
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1==sb2) System.out.println("sb1�� sb2�� ���� ��ü��");
		else System.out.println("sb1�� sb2�� �ٸ� ��ü��");
		if(sb1.equals(sb2)) System.out.println("sb1�� sb2�� ���� ������ ��ü��");
		else System.out.println("sb1�� sb2�� �ٸ� ������ ��ü��");
	}

}
