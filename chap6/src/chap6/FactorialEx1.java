package chap6;
/*
 * 재귀 함수 : Recursive Call
 * 			자기 자신의 함수를 다시 호출하는 함수
 */
public class FactorialEx1 {

	public static void main(String[] args) {
		System.out.println("4! = " + factorial(4));
	}

	private static int factorial(int i) {
		return (i==1)?1:i*factorial(i-1);
	}

}
