
package chap11;
/*
 * Math 클래스 : 수치 계산 가능
 * 			메서드 : static 메서드
 * 			상수    : PI (원주율)
 * 				  E (자연로그)
 */
public class MathEx1 {
	public static void main(String[] args) {
		//절대값
		System.out.println("Math.abs(5)="+Math.abs(5));
		
		System.out.println("Math.abs(-5)="+Math.abs(-5));
		System.out.println("Math.abs(3.14)="+Math.abs(3.14));
		System.out.println("Math.abs(-3.14)="+Math.abs(-3.14));
		//근사정수
		//ceil : 큰 수 중 가까운 정수
		System.out.println("Math.ceil(5.4)="+Math.ceil(5.4));
		System.out.println("Math.ceil(-5.4)="+Math.ceil(-5.4));
		//floor : 작은 수 중 가까운 정수
		System.out.println("Math.floor(5.4)="+Math.floor(5.4));
		System.out.println("Math.floor(-5.4)="+Math.floor(-5.4));
		//rint : 가까운 정수
		System.out.println("Math.rint(5.4)="+Math.rint(5.4));
		System.out.println("Math.rint(-5.4)="+Math.rint(-5.4));
		//최소,최대값
		System.out.println("Math.min(5,4)="+Math.min(5,4));
		System.out.println("Math.min(5.4, 5.3)="+Math.min(5.4 , 5.3));
		System.out.println("Math.max(5,4)="+Math.max(5,4));
		System.out.println("Math.max(5.4, 5.3)="+Math.max(5.4 , 5.3));
		//반올림
		System.out.println("Math.round(5.4)="+Math.round(5.4));
		System.out.println("Math.round(5.5)="+Math.round(5.5));
		//난수 
		System.out.println("Math.random()="+Math.random());
		//삼각함수
		System.out.println("Math.sin(Math.PI/2)="+Math.sin(Math.PI/2));
		System.out.println("Math.cos(Math.toRadians(60))="+Math.cos(Math.toRadians(60)));
		System.out.println("Math.tan(Math.PI/4)="+Math.tan(Math.PI/4));
		System.out.println("Math.toDegrees(Math.PI/2)="+Math.toDegrees(Math.PI/2));
		//log
		System.out.println("Math.log(Math.E)="+Math.log(Math.E));
		//제곤근
		System.out.println("Math.sqrt(25)="+Math.sqrt(25));
		//제곱
		System.out.println("Math.pow(5,3)="+Math.pow(5,3));
		
	}
}
