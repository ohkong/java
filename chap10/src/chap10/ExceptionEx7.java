package chap10;

public class ExceptionEx7 {

	public static void main(String[] args) {
		try {
			//throw : 예외 강제 발생. JVM 예외 발생 통지함
			throw new Exception("예외 강제 발생");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		e.printStackTrace();
		}
	}

}
