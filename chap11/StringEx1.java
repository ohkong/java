package chap11;
/*
 * String Ŭ���� : ������ ���ڿ�(����Ұ���ü)
 *   Ŭ���� �� �����ϰ� ���� �����ڷ� ��ü ������ ������.
 *   Ŭ���� �� �����ϰ� + �����ڻ���� ������.
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		if(s1==s2)System.out.println("s1��s2�� ���� ��ü��");
		else System.out.println("s1��s2�� �ٸ� ��ü��");
		if(s1.equals(s2))System.out.println("s1��s2�� ���� ������ ��ü��");
		else System.out.println("s1��s2�� �ٸ� ������ ��ü��");
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s3==s4)System.out.println("s3��s4�� ���� ��ü��");
		else System.out.println("s3��s4�� �ٸ� ��ü��");
		if(s3.equals(s4))System.out.println("s3��s4�� ���� ������ ��ü��");
		else System.out.println("s3��s4�� �ٸ� ������ ��ü��");
		
	}
}
