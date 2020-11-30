package chap14;
/*
 * 람다식 예제 : jdk8.0 이후 부터 사용가능
 * 			람다식에서 사용되는 인터페이스는 FuntionalInterface 여야함.
 * FuntionalInterface : 추상메서드가 한개만 존재하는 메서드.
 * 
 * 추상메서드의 매개변수가 없고, 리턴타입도 없는 경우
 * ()-> {......}
 * 람다식 내부에 실행되는 구문이 한개인 경우 {} 생략가능함.
 */ 
@FunctionalInterface //   @ -> 어노테이션
interface LambdaInterface1{
	void method();
}
public class LambdaEx1 {
	public static void main(String[] args) {
		//익명의 내부클래스의 객체.
		LambdaInterface1 fi = new LambdaInterface1() {
			@Override
			public void method() {
				System.out.println("기존방식으로 코딩");
			}
		};
		fi.method();
		fi = () ->{ String str = "람다 방식으로 코딩2";
		System.out.println(str);
		};
		fi.method();
		fi = () ->{ String str = "람다 방식으로 코딩2";
		System.out.println(str);
		};
		fi.method();
		fi = () -> System.out.println("람다 방식으로 코딩3");
		fi.method();
		execute(()->System.out.println("람다 방식으로 코딩4"));
	}

	private static void execute(LambdaInterface1 f) {
		f.method();
	}
}