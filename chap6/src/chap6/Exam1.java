package chap6;
/*
 * width 가로 , height 세로 를 멤버변수로
 * area(), length()를 멤버 메서드로 가지고 있는
 * Ractangle클래스 구현하기
 */
class Ractangle{
	int width, height;
	
	void area() {
		System.out.println("사각형의 넓이 : " + width*height);
	}
	void length() {
		System.out.println("사각형의 둘레 : " + (width+height)*2);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Ractangle r1 = new Ractangle();
		Ractangle r2 = new Ractangle();
		r1.width =10;
		r1.height = 10;
		System.out.println("가로 :" + r1.width + "\n세로 :" + r1.height);
		r1.area();
		r1.length();
		r2.width = 20;
		r2.height = 5;
		System.out.println("가로 :" + r2.width + "\n세로 :" + r2.height);
		r2.area();
		r2.length();

	}

}
