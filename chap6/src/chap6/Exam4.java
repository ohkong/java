package chap6;
/*
 * Exam2�������α׷��� �����Ͽ� ������ ����� ��������
 * Rectangle3 Ŭ���� �����ϱ�
 * [���]
 * 1/5 �簢�� : (10,20) ���� :200, �ѷ� :60
 * 2/5 �簢�� : (10,20) ���� :200, �ѷ� :60
 * 3/5 �簢�� : (10,20) ���� :200, �ѷ� :60
 */
class Rectangle3{
	int width,height,serialNo;
	static int sno;
	int area() {
		return width*height;
	}
	int length() {
		return 2*(width+height);
	}
	
	Rectangle3(int a, int b){
		width = a;
		height = b;
		serialNo =++sno;
	}
	public String toString() {
		return serialNo +"/" + sno + "�簢�� (" + width + "," + height + ") ���� :" + area() + " �ѷ� : "+length();
	}
	
}
public class Exam4 {

	public static void main(String[] args) {
		Rectangle3[] rarr = new Rectangle3[5];
		int totarea = 0;
		int totlen=0;
		for(int i=0;i<rarr.length;i++) {
			int width=(int)(Math.random()*31) + 20;
			int height=(int)(Math.random()*31) + 20;
			rarr[i] = new Rectangle3(width,height);
			totarea+= rarr[i].area();
			totlen+= rarr[i].length();
		}
		for(Rectangle3 r :rarr) {
			System.out.println(r);
		}
		System.out.println("���� �簢�� ������ ��" + totarea);
		System.out.println("���� �簢�� �ѷ��� ��" + totlen);
		
		
	}

}
