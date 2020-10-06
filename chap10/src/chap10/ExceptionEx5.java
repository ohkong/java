package chap10;
/*
 * throws 구문 : 예외 처리
 */
public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
			first();
		}catch(Exception e) {
			System.out.println("숫자만 가능합니다.");
			e.printStackTrace();
		}
	}

	private static void first() throws RuntimeException{
		System.out.println("first 메서드");
		second();
	}

	private static void second() throws RuntimeException{
		System.out.println("second 메서드");
		System.out.println(Integer.parseInt("abc"));
	}
}
