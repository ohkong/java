package chap11;
/*
 * switch 구문에서 조건값으로 사용할 수 있는 자료형 : 9가지 
 *   byte short int char String
 *   Byte Short Integer Character
 */
public class WrapperEx3 {
	public static void main(String[] args) {
		int data = 65;
		switch(data) {
		default : System.out.println("switch 테스트");
		}
	}
}

/*
	java.lang 패키지의 클래스
	  Object : 모든 클래스의 최상위 클래스. 
	  String : 문자열. 대입연산자로 객체생성 가능. +연산가능
	  StringBuffer : 문자열의 보조클래스
	  				  동적 문자열 클래스. equals 메서드 오버라이딩 안됨.
	  				  내용비교를 위해서는 String으로 변환(toString())이 필요함.
	  Math : 수치 계산을 위한 메서드를 멤버로 가짐. static 메서드임.
	  		 객체 생성 불가함.
	  Wrapper : 
	  		Boolean, Byte, Short, Integer, Long, Float, Double, Character
	  		통합하여 지칭하는 클래스
	  		Boxing, unBoxing => 자동 형변환
	  
*/