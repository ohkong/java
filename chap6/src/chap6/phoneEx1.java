package chap6;

/*
 * �߻�ȭ : Ŭ���� ������ ����
 * Ŭ���� : ����� ���� �ڷ���
 *      �Ӽ�	: �������
 *      ��� : ����޼���
 * 
 */
class Phone {
	String color;
	boolean power;
	String no;

	void power() {
		power = !power;
	}

	void send(String no) {
		System.out.println(no + "��ȣ�� ��ȭ �۽��� ~~~");
	}

	void receive(String no) {
		System.out.println(no + "��ȣ�� ��ȭ ������ ~~~");
	}
}

//���� Ŭ���� : main�޼��带 ������ �ִ� Ŭ����
public class phoneEx1 {
	public static void main(String[] args) {
		Phone p1 = new Phone(); //��üȭ, �ν��Ͻ�
		p1.color = "����";
		p1.power = true;
		p1.no = "01012345678";
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		p1.send("01098765432");
		p1.receive("01098765432"); 
		Phone p2 = new Phone();  //��üȭ, �ν��Ͻ�
		p2.color = "����";
		p2.power = false;
		p2.no = "01098765432";
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
		p2=p1;
		p2.color= "����";
		
		System.out.println(p1.color + "," + p1.power + "," + p1.no);
		System.out.println(p2.color + "," + p2.power + "," + p2.no);
	}

}
