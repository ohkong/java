package chap6;
/*
 * static 변수로 사각형 번호 생성하기
 * 맴버메서드
 *    int area()
 *    int length()
 *    boolean isSquare()
 *    public String toString() 
 *       =>사각형의 가로, 세로, 사각형번호, 생성된 사각형 갯수, 정사각형여부 출력하기 
 */
class Rectangle2{
	int width,height,serialNo;
	static int sno;
	int area() {
		return width*height;
	}
	int length() {
		return 2*(width+height);
	}
	boolean isSquare() {
		return width==height;
	}
	public String toString() {
		return   serialNo+ "번 사각형 : ("+  width + "," + height + ") " + (isSquare()?"정사각형":"직사각형") 
				+ ", 지금 까지 생성된 사각형갯수 : "+sno+", 면적 : " +area() +", 둘레 : "+length();
	}
}
public class RectangleEx1 {

	public static void main(String[] args) {
		Rectangle2 r1= new Rectangle2();
		Rectangle2 r2= new Rectangle2();
		Rectangle2 r3= new Rectangle2();
		r1.width = 10;
		r1.height = 20;
		r1.serialNo = ++Rectangle2.sno;
		r2.width = 10;
		r2.height = 30;
		r2.serialNo = ++Rectangle2.sno;
		r3.width = 20;
		r3.height = 20;
		r3.serialNo = ++Rectangle2.sno;
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

	}

}
