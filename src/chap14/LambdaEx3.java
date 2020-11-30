package chap14;
/*
 * 추상메서드의 매개변수 있고, 리턴 타입이 없는 경우
 * (매개변수)->{.....}
 * 매개변수의 갯수가 한개인 경우 () 생략가능
 * 실행 구문이 한문장인경우 {} 생략 가능
 */
@FunctionalInterface
interface LambdaInterface3{
	void method(int a);
}
public class LambdaEx3 {
	public static void main(String[] args) {
		LambdaInterface3 fi = (a) -> {
			System.out.println(a*5);
		};
		fi.method(2); //10
		fi.method(10); //50
		fi = x->System.out.println(x+x);
		fi.method(2); //4
		fi.method(10); //20
		//calc 메서드를 이용하여 x+x 인 함수 호출.
		calc(fi);
		//calc 메서드를 이용하여 x*x 인 함수 호출.
		calc(x->System.out.println(x*x));
	}
	static void calc(LambdaInterface3 f) {
		f.method(10);
	}
}
