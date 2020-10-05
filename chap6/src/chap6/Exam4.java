package chap6;
/*
 * Exam2구동프로그램을 수정하여 다음의 결과가 나오도록
 * Rectangle3 클래스 구현하기
 * [결과]
 * 1/5 사각형 : (10,20) 면적 :200, 둘레 :60
 * 2/5 사각형 : (10,20) 면적 :200, 둘레 :60
 * 3/5 사각형 : (10,20) 면적 :200, 둘레 :60
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
		return serialNo +"/" + sno + "사각형 (" + width + "," + height + ") 면적 :" + area() + " 둘레 : "+length();
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
		System.out.println("전제 사각형 면적의 합" + totarea);
		System.out.println("전제 사각형 둘레의 합" + totlen);
		
		
	}

}
