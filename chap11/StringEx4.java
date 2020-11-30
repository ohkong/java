package chap11;


/*
 *  숫자<=문자열
 */
public class StringEx4 {
	public static void main(String[] args) {
		//Integer.parseInt : 정수형 <=문자열
		int i = Integer.parseInt("100");
		System.out.println(i+1);
		//Double.parseDouble : 실수형 <=문자열
		//Float.parseFloat : 실수형 <=문자열
		double d = Double.parseDouble("100.5"); 
		System.out.println(d+0.1);
		System.out.println(++d);
		//2진수 문자열 <=정수형
		String binary = Integer.toBinaryString(i); //2진수형 문자열
		System.out.println(binary);
		//8진수 문자열 <=정수형
		String octal = Integer.toOctalString(i); //8진수형 문자열
		System.out.println(octal);
		//16진수 문자열 <=정수형
		String hex = Integer.toHexString(i); //16진수형 문자열
		System.out.println(hex);
	}
}
