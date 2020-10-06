package chap9;
class Outer2{
	private int outeriv =10;
	private static int outercv =20;
	class InstanceInner{
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
//		int siv = outeriv; //error.  ��üȭ �ʿ�.
		int siv = new Outer2().outeriv;
		static int scv = outercv;
	}
	void method(int pv) {
		//pv : method(int) �޼����� �������� 
		final int num = pv;
		class LocalInner{
			int liv = outeriv;
			int liv2 = outercv;
			void method() {
//				num++;
// ��������Ŭ�������� ���Ǵ� �޼����� ���������� ���ȭ �Ǿ���Ѵ�.
// ���������� ������ ���� ��쵵 ����� ����.
// ���������� ������ �ִ� ��� ���� �߻�.
				System.out.println("pv="+num); // pv ��ü�� ������  �ؿ��� ���������� ���� ������ƴ� ������ �Ǿ �����߻�.
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
		//InstanceINner, StaticInner Ŭ������ ��� ���� ����ϱ�
		Outer2.InstanceInner inner1 = out2.new InstanceInner();
		System.out.println(inner1.iiv);
		System.out.println(inner1.iiv2);
		Outer2.StaticInner inner2= new Outer2.StaticInner();
		System.out.println(inner2.siv);
		System.out.println(Outer2.StaticInner.scv);
	}

}
