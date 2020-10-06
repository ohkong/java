package chap9;
class Outer2{
	private int outeriv =10;
	private static int outercv =20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = outeriv; //error.  객체화 필요.
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	void method(int pv) {
		//pv : method(int) 메서드의 지역변수 
		final int num = pv;
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
//				num++;
// 지역내부클래스에서 사용되는 메서드의 지역변수는 상수화 되어야한다.
// 지역변수의 변경이 없는 경우도 상수로 본다.
// 지역변수의 변경이 있는 경우 오류 발생.
				System.out.println("pv="+num); // pv 자체로 넣으면  밑에서 증감식으로 인해 상수가아닌 변수가 되어서 오류발생.
				System.out.println("liv="+liv);
				System.out.println("liv2="+liv2);
				System.out.println("outeriv="+outeriv);
				System.out.println("outercv="+outercv);
			}
		}
		LocalInner lc = new LocalInner();
		pv++;
		lc.liv++;
		lc.liv2++;
		outeriv++;
		outercv++;
		lc.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out2= new Outer2();
		out2.method(100);
		//InstanceINner, StaticInner 클래스의 멤버 변수 출력하기
		Outer2.InstanceInner inner1 = out2.new InstanceInner();
		System.out.println(inner1.iiv);
		System.out.println(inner1.iiv2);
		Outer2.StaticInner inner2= new Outer2.StaticInner();
		System.out.println(inner2.siv);
		System.out.println(Outer2.StaticInner.scv);
	}

}
