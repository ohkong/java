package chap9;
/*
 * 내부클래스 객체에서 사용되는 this
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner{
		int iv = 100;
		void method1() {
			int iv =300;
			System.out.println("iv=" +iv); //300  method의 iv
			System.out.println("iv2=" +iv2); //20  외부클래스 외에 iv2가 따로 없기에 외부클래스의 값을 받는다.
			//this : 내부클래스의 객체(InstancInner)
			System.out.println("this.iv=" +this.iv); //100  InstancInner의 iv 
			//외부클래스명.this : 외부클래스의 멤버
			System.out.println("Outer3.this.iv=" +Outer3.this.iv); //10  Outer3의 iv
			}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3.InstanceInner inner = new Outer3().new InstanceInner();
		inner.method1();
	}

}
