package chap10;
class Outer1 {
    class Inner1 {
          int iv = 100;
     }
    static class Inner2 {
          int iv = 200;
     }
}
public class test1 {
	public static void main(String[] args) {
		Outer1 out =new Outer1();
		Outer1.Inner1 inner1 = new Outer1().new Inner1();
		System.out.println(inner1.iv);
		Outer1.Inner2 inner2 = new Outer1.Inner2();
		System.out.println(inner2.iv);
	}
}
