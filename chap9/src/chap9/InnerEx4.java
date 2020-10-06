package chap9;

/*
 * 이름 없는 내부 클래스
 */
interface I {
	void test();
}

public class InnerEx4 {
	public static void main(String[] args) {
		int iv = 100;
//		iv += 10; 
		System.out.println("iv=" + iv);
		I i = new I() { //이름없는 내부클래스. 지역 내부클래스 이기때문에 상수화가 필요.  13번줄때문에 변수 취급이기 때문에 20번줄에 오류발생
			@Override
			public void test() {
				//iv값은 main메서드의 지역변수이고,
				//지역내부크래스에서 접근하기 위해서는 상수화 되어야한다.
				System.out.println("iv=" + iv);
			}
		};
		i.test();
		//람다로 변경
		i = () -> System.out.println("iv=" + iv);
		i.test();
	}
}