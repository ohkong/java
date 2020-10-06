package chap8;
/* 
 * 인터페이스 예제
 * 
 * 인터페이스
 * 1.인터페이스의 멤버는 상수, 추상메서드, default메서드, static메서드만 가능함. 
 * 		인터페이스의 모든 멤버는 public 멤버임.
 * 		상수 : (public static final)자료형 상수명;
 * 			   int NUM = 100; (o)
 * 			   static int NUM = 100; (o)
 * 			   final int NUM = 100; (o)
 * 			   protected int NUM = 100; (x)
 * 		추상메서드 : (public abstract) 리턴타입 메서드명(매개변수);
 * 				int getA(); (o)
 * 				abstract int getA(); (o)
 * 		default 메서드 : jdk8 이후 버전에서 사용가능. 구현부 존재
 * 				public default 리턴타입 메서드명(매개변수) {...}
 *		static 메서드 : jdk8 이후 버전에서 사용가능. 구현부 존재
 *				public static 리턴타입 메서드명(매개변수) {...}
 * 2. 객체화 불가 => 구현클래스의 객체화를 통해서 객체화 가능
 * 3. 클래스와 인터페이스간은 구현으로 표현한다. implements 예약어 사용.
 * 	  => 다중 구현이 가능함. 
 * 4. 인터페이스간의 상속이 가능함. => 다중 상속이 가능함.
 */
interface Printerable {
//	(public static final) int INK = 100;
	int INK = 100; //상수
	// (public abstract) print();
	void print(); //추상메서드
}
interface Scannerable{
	void scan();
}
interface Faxable{
	String FAX_NO = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
}
interface Complexerable
	extends Printerable,Scannerable,Faxable{}
//구현클래스 : 인터페이스를 구현한 클래스
class Complexer implements Complexerable{
	int ink;
	Complexer(){
		this.ink =INK;
	}
	@Override
	public void print() {
		System.out.println("종이에 출력합니다. 남은 잉크량 " + --ink);
	}
	@Override
	public void scan() {
		System.out.println("이미지를 스캔하여 파일에 저장합니다.");
	}
	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "에서"+ tel + "번호로 FAX를 전송합니다.");
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "에서"+ FAX_NO + "로 FAX를 받았습니다.");
	}
}
public class InterfaceEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("기본잉크량 : "+ Printerable.INK);
		System.out.println("기본잉크량 : "+ Complexerable.INK);
		System.out.println("기본잉크량 : "+ Complexer.INK);
		System.out.println("FAX 번호 : "+ Faxable.FAX_NO);
		System.out.println("FAX 번호 : "+ Complexerable.FAX_NO);
		System.out.println("FAX 번호 : "+ Complexer.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678-1234");
		com.send("02-5678-1234");
		if(com instanceof Complexer) {
			System.out.println("com 객체는 Complexer 객체임");
		}
		if(com instanceof Complexerable) {
			System.out.println("com 객체는 Complexerable 객체임");
		}
		if(com instanceof Printerable) {
			System.out.println("com 객체는 Printerable 객체임");
			Printerable p =com;
			System.out.println(p.INK);
			p.print();
		}
		if(com instanceof Scannerable) {
			System.out.println("com 객체는 Scannerable 객체임");
			Scannerable s = com;
			s.scan();
		}
		if(com instanceof Faxable) {
			System.out.println("com 객체는 Faxable 객체임");
			Faxable f = com;
			System.out.println(f.FAX_NO);
			f.send("02-111");
			f.receive("02-222");
		}
	}

}
