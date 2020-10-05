package chap6;

/*
 * 추상화 : 클래스 생성의 과정
 * 클래스 : 사용자 정의 자료형
 *      속성	: 멤버변수
 *      기능 : 멤버메서드
 * 
 */
class Phone {
	String color;
	boolean power;
	String no;

	void power() {
		power = !power;
	}

	void send(String no) {
		System.out.println(no + "번호로 전화 송신중 ~~~");
	}

	void receive(String no) {
		System.out.println(no + "번호로 전화 수신중 ~~~");
	}
}

//구동 클래스 : main메서드를 가지고 있는 클래스
public class phoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); //객체화, 인스턴스
		p1.color = "검정";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01098765432");
		p1.receive("01098765432"); 
		Phone p2 = new Phone();  //객체화, 인스턴스
		p2.color = "빨강";
		p2.power = false;
		p2.no = "01098765432";
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2=p1;
		p2.color= "빨강";
		
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}

}
