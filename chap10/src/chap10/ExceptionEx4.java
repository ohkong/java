package chap10;
/*
 * finally : try 블럭과 함께 사용됨
 * 			무조건 실행되는ㅂ
 */
public class ExceptionEx4 {

	public static void main(String[] args) {
		try {
			System.out.print(1);
			System.out.print(2/0);
			System.out.print(3);
		}catch(Exception e) {
			System.out.print(4);
			return;//메서드종료
		}finally {
			System.out.print(5);
		}
		System.out.println(6);
	}

}
