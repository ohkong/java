package chap14;
/*
 * 
 */
interface LambdaInterface5{
	void method();
}
class Outer{
	public int iv = 10; 
	void method() {
		int iv =20; //함수객체에서 지역 변수 접근시 상수화
		//iv++;
		LambdaInterface5 f = () -> {
			System.out.println("Outer.this.iv="+Outer.this.iv);
			System.out.println("this.iv="+this.iv);
			System.out.println("iv="+iv);
		};
		f.method();
	}
}
public class LambdaEx5 {
	public static void main(String[] args) {
		new Outer().method();
	}
}
