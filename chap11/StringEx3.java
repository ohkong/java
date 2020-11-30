package chap11;
/*
 * String 클래스 : format 메서드 예제
 * 				=> 형식화 문자를 사용할 수 있는 메서드
 * 				=> 클래스 메서드임
 */
public class StringEx3 {
	public static void main(String[] args) {
		//소숫점이하 2자리로 출력 . 소숫점이하 3자리에서 반올림
		String sf = String.format("%.2f", 0.124);//0.12
		System.out.println(sf);
		System.out.println(String.format("%10d",12345));
		System.out.println(String.format("%-10d",12345));
		System.out.println(String.format("%010d",12345));
		
		System.out.println(String.format("%,10d",12345));
		System.out.println(String.format("%x",12345));
		System.out.println(String.format("%x",12345));
		System.out.println(String.format("%o",12345));
		
		System.out.println(String.format("%s","홍길동"));
		System.out.println(String.format("%c",'A'));
		System.out.println(String.format("%s의학점은 %c입니다","홍길동",'A'));
	}
}
