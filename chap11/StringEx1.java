package chap11;
/*
 * String 클래스 : 정적인 문자열(변경불가객체)
 *   클래스 중 유일하게 대입 연산자로 객체 생성이 가능함.
 *   클래스 중 유일하게 + 연산자사용이 가능함.
 */
public class StringEx1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		if(s1==s2)System.out.println("s1과s2는 같은 객체임");
		else System.out.println("s1과s2는 다른 객체임");
		if(s1.equals(s2))System.out.println("s1과s2는 같은 내용의 객체임");
		else System.out.println("s1과s2는 다른 내용의 객체임");
		String s3 = new String("abc");
		String s4 = new String("abc");
		if(s3==s4)System.out.println("s3과s4는 같은 객체임");
		else System.out.println("s3과s4는 다른 객체임");
		if(s3.equals(s4))System.out.println("s3과s4는 같은 내용의 객체임");
		else System.out.println("s3과s4는 다른 내용의 객체임");
		
	}
}
