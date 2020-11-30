package chap14;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator �������̽�
 *   Function �������̽��� ���� �������̽�
 *   �Ű����� ����, ���ϰ� ����. -> �Ű������� ���ϰ��� �ڷ����� ����
 *   
 */
public class LambdaEx9 {
	private static Student[] list= {
			new Student("ȫ�浿",90,80,"�濵"),
            new Student("���",95,70,"�İ�"),
            new Student("�̸���",85,70,"���")
	};
	public static void main(String[] args) {
		System.out.println("�ִ��������:");
		System.out.println(maxOrMinMath((a,b)->(a>=b)?a:b));
		System.out.println("�ּҼ�������:");
		System.out.println(maxOrMinMath((a,b)->(a<=b)?a:b));
		System.out.println("�ִ뿵������:");
		System.out.println(maxOrMinEng((a,b)->(a>=b)?a:b));
		System.out.println("�ּҿ�������:");
		System.out.println(maxOrMinEng((a,b)->(a<=b)?a:b));
		System.out.println("�ִ����:");
		System.out.println(maxOrMinAvg((a,b)->(a>=b)?a:b));
		System.out.println("�ּ����:");
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
