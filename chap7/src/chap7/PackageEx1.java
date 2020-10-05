package chap7;

import java.util.Date;

import chap7.test.Pack2;

/*
 * 패키지 예제
 * package
 * 		클래스들의 모임
 * 		클래스의 이름은 패키지명을 포함한다.
 * 		package 설정은 파일의 처음에 한번만 가능하다.
 * 		=> 하나의 파일의 모든 클래스는 같은 패키지에 속한 클래스다.
 * 
 * import : 클래스 이름의 패키지명을 생략 할 수 있도록 미리 사용될 클래스의 이름을 선언.
 * 			클래스의 이름을 선언.
 * 클래스의 패키지명을 생략 할 수 있는경우
 * 	1. 같은 패키지에 속한 클래스는 패키지 명을 생략 가능함
 * 	2. java.langm 패키지에 속한 클래스들은 패키지 명을 생략 가능함
 * 	3. import 구문으로 설정된 클래스는 패키지명을 생략 가능함
 * 
 */
class Pack1{
	void method() {
		System.out.println("chap7.Pack1 zmffotmdml method ");
	}
}
public class PackageEx1 {

	public static void main(String[] args) {
		java.util.Date today = new java.util.Date();
		System.out.println(today);
		Date today2 = new Date();
		Pack1 p = new Pack1();
		p.method();
		//Pack2d의 method 호출하기
		Pack2 p2 =new Pack2();
		p2.method();
		
	}

}
