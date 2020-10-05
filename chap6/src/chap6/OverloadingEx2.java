package chap6;
/*
 * 오버로딩 메서드 선택 기준
 * 		1. 호출시에 입력된 인자값의 자료형과 메서드의 선언부에 정의된 자료형이 동일한 메서드 선택
 * 		2. 1의 조건이 없는 경우
 * 			최소갯수로 자동 형변환이 가능한 메서드 선택
 * 			->동일한 조건의 메서드가 여러개인 경우 오류 발생.
 * 
 * 오버로딩의 조건
 * 		1. 메서드 명이 같아야 한다.
 * 		2. 매개변수가 달라야 한다.(자료형 기준)
 * 		3. 리턴타입, 접근제어자, 예외처리는 상관이 없다.
 */
class Math4{
	
	int add(int a,int b) {
		System.out.print("1.int int 메서드 결과:");
		return a+b;
	}
	
	long add(long a,int b) {
		System.out.print("2.long int 메서드 결과:");
		return a+b;
	}
	
	long add(int a,long b) {
		System.out.print("3.int long 메서드 결과:");
		return a+b;
	}
	
	long add(long a,long b) {
		System.out.print("4.long long 메서드 결과:");
		return a+b;
	}
}
public class OverloadingEx2 {

	public static void main(String[] args) {
		Math4 m4 = new Math4();
		System.out.println(m4.add(10, 10));
		System.out.println(m4.add(10, 10L));
		System.out.println(m4.add(10L, 10));
		System.out.println(m4.add(10L, 10L));
	}

}
