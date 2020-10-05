package chap7;
/*
 * ��ӿ���
 * 	1. ���Ŭ������ ObjectŬ������ ��ӹ޴´�.
 * 	2. �ڼ�Ŭ������ ��ü ������ �θ�Ŭ������ ��ü�� ���� �����Ѵ�.
 * 	3. Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
 * 	4. ���Ŭ������ ��ü�� Object ��ü�� �����Ѵ�.
 * 		=>���Ŭ������ ��ü�� Object Ŭ������ ����� ������.
 */
class Phone extends Object{
	boolean power;
	int number;
	void power() {
		power=!power;
	}
	void send() {
		if(power)System.out.println("��ȭ �ɱ�");
	}
	void receive() {
		if(power)System.out.println("��ȭ �ޱ�");
	}
}
class SmartPhone extends Phone{
	void setApp(String name) {
		System.out.println(name + "�� ��ġ��");
	}
}
public class PhoneEx1 {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("���̹�");
	}

}
