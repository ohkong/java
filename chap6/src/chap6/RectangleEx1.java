package chap6;
/*
 * static ������ �簢�� ��ȣ �����ϱ�
 * �ɹ��޼���
 *    int area()
 *    int length()
 *    boolean isSquare()
 *    public String toString() 
 *       =>�簢���� ����, ����, �簢����ȣ, ������ �簢�� ����, ���簢������ ����ϱ� 
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
		return   serialNo+ "�� �簢�� : ("+  width + "," + height + ") " + (isSquare()?"���簢��":"���簢��") 
				+ ", ���� ���� ������ �簢������ : "+sno+", ���� : " +area() +", �ѷ� : "+length();
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
