package chap11;

import java.util.Random;

/*
 * true/false ���� ������ �߻��Ͽ� �ý��۰� ����ڰ� 3���������� 
 * true�� ������ ���� �¸��ϵ��� ���α׷� �����ϱ�
 */
public class Exam9 {
	public static void main(String[] args) {
		Random user = new Random();
		user.setSeed(System.currentTimeMillis());
		Random com = new Random();
		com.setSeed(System.currentTimeMillis()+100);
		int ccnt = 0;
		int ucnt = 0;
		while (true) {
		//	System.out.println("�ý��� " + com.nextBoolean() + "\t�����" + user.nextBoolean());
			if (user.nextBoolean()) {
				ucnt++;
				System.out.print("����� true");
			} else {
				ucnt = 0;
				System.out.print("����� false");
			}
			if (com.nextBoolean()) {
				ccnt++;
				System.out.println("\t�ý��� true");
			} else {
				ccnt = 0;
				System.out.println("\t�ý��� false");
			}
			if (ucnt == 3 || ccnt == 3)
				break;
		}
		if (ccnt == 3) {
			System.out.println("�ý��۽¸�");
		} 
		if(ucnt == 3 ){
			System.out.println("����ڽ¸�");
		}

	}
}
