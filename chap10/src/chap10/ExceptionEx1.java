package chap10;
/*
 * 예외처리 : 발생된 예외를 정상화 하는 과정
 * 	 try 블럭 : 예외가 발생할 수 있는 가능성이 있는 문장들	
 * 	 catch 블럭 : try 블럭에서 예외발생시 실행되는 블럭
 * 				try 블럭과 함께 사용되어야함.
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.println(args[0]);			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 값을 입력하세요");
		}
		System.out.println("프로그램 종료");			
	}
}
