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
		int iv =20; //�Լ���ü���� ���� ���� ���ٽ� ���ȭ
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
