package chap10;

/*
 * 다중 catch 구문
 * 	  -한개의 try블럭에 여거래의 catch블럭이 존재
 * 	  -여러개의 예외가 발생 가능한 경우 예외별로 처리 가능
 * 	  -상위 예외클래스는 catch 구문의 하단에 배치해야 한다.
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt("abc"));
			System.out.println(10 / 0);
			System.out.println(args[0]);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력하세요");
		} catch (Exception e) {
			System.out.println("전산부로 전화요망 : 1234");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
