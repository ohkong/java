package chap6;
/*
 * �������� ���� : ���������� �ݵ�� �ʱ�ȭ �Ǿ�� �Ѵ�.
 */
public class LocalValEx1 {

	public static void main(String[] args) {
		int num;
		boolean b =true;
		if(b) {
			num =100;
		}else {
			num = 200;
		}
		System.out.println(num);
		String grade;
		int score = 80;
		switch(score/10) {
		case 9 : grade="A";break;
		case 8 : grade="B";break;
		case 7 : grade="C";break;
		default : grade="D";break;
		}
		System.out.println(grade);
	}

}
