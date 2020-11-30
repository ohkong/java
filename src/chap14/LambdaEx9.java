package chap14;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 *   Function 인터페이스의 하위 인터페이스
 *   매개변수 존재, 리턴값 존재. -> 매개변수와 리턴값의 자료형이 같다
 *   
 */
public class LambdaEx9 {
	private static Student[] list= {
			new Student("홍길동",90,80,"경영"),
            new Student("김삿갓",95,70,"컴공"),
            new Student("이몽룡",85,70,"통계")
	};
	public static void main(String[] args) {
		System.out.println("최대수학점수:");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?a:b));
		System.out.println("최소수학점수:");
		System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		System.out.println("최대영어점수:");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?a:b));
		System.out.println("최소영어점수:");
		System.out.println(maxOrMinEng((a,b)->(a<=b)?a:b));
		System.out.println("최대평균:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		System.out.println("최소평균:");
		System.out.println(maxOrMinAvg((a,b)->(a<=b)?a:b));
	}
	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list[0].getEng()+list[0].getMath())/2.0;
		for(Student s : list)
			result = op.applyAsDouble(result,(list[0].getEng()+list[0].getMath())/2.0);
		return result;
	}
	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list[0].getMath();
		for(Student s : list) result=op.applyAsInt(result, s.getMath());
		return result;
	}
	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list[0].getEng();
		for(Student s : list) result=op.applyAsInt(result, s.getEng());
		return result;
	}
}
