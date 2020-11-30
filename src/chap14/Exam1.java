package chap14;
/*
 * LambdaInterface3 인터페이스를 이용하여 람다방식으로 
 * 입력된 숫자까지의 합을 출력하는 프로그램 구현하기
 */

public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface3 f = (a) -> {
			int sum = 0;
			for(int i = 1;i<=a;i++)sum+=i;
			System.out.println(sum);
		};
		f.method(4); 	//10
		f.method(10);   //55
		f.method(100);  //5050
	}
}
