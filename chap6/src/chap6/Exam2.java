package chap6;
/*
 * 
 */

public class Exam2 {

	public static void main(String[] args) {
		Rectangle2[] rarr = new Rectangle2[5];
		// 20~50������ ������ ����, ���� ���̸� ���� 5���� �����ϰ�,
		//��� �簢���� ����, �ѷ��� ���� ����ϱ�
		//������ �簢���� ��ȣ, ����, ����, ������ �簢������, ����, �ѷ� ����ϱ�
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
		System.out.println("��ü �簢�� ������ �� : " + totala);
		System.out.println("��ü �簢�� �ѷ��� �� : " + totall);
	}

}
