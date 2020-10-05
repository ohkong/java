package chap6;
/*
 * 
 */

public class Exam2 {

	public static void main(String[] args) {
		Rectangle2[] rarr = new Rectangle2[5];
		// 20~50사이의 임의의 가로, 세로 길이를 가진 5개를 생성하고,
		//모든 사각형의 넓이, 둘레의 합을 출력하기
		//각각의 사각형의 번호, 가로, 세로, 생성된 사각형갯수, 넓이, 둘레 출력하기
		int totala=0;
		int totall=0;
		for(int i=0;i<rarr.length;i++) {
			rarr[i]=new Rectangle2();
			rarr[i].width=(int)(Math.random()*31) + 20;
			rarr[i].height=(int)(Math.random()*31) + 20;
			rarr[i].serialNo = ++Rectangle2.sno;
			System.out.println(rarr[i]);
			totala += rarr[i].area();
			totall += rarr[i].length();
		}
		System.out.println("전체 사각형 면적의 합 : " + totala);
		System.out.println("전체 사각형 둘레의 합 : " + totall);
	}

}
