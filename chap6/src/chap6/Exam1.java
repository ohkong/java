package chap6;
/*
 * width ���� , height ���� �� ���������
 * area(), length()�� ��� �޼���� ������ �ִ�
 * RactangleŬ���� �����ϱ�
 */
class Ractangle{
	int width, height;
	
	void area() {
		System.out.println("�簢���� ���� : " + width*height);
	}
	void length() {
		System.out.println("�簢���� �ѷ� : " + (width+height)*2);
	}
}

public class Exam1 {

	public static void main(String[] args) {
		Ractangle r1 = new Ractangle();
		Ractangle r2 = new Ractangle();
		r1.width =10;
		r1.height = 10;
		System.out.println("���� :" + r1.width + "\n���� :" + r1.height);
		r1.area();
		r1.length();
		r2.width = 20;
		r2.height = 5;
		System.out.println("���� :" + r2.width + "\n���� :" + r2.height);
		r2.area();
		r2.length();

	}

}
