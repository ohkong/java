package chap10;

public class ExceptionEx2 {

	public static void main(String[] args) {
		System.out.print(1/0);
		try {
			System.out.print(2);
			System.out.print(3);
			System.out.print(4);
		}catch(ArithmeticException e) {
			System.out.print(5);
		}
		System.out.println(6);
	}

}
