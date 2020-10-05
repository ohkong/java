package chap6;
/*
 * ������ġ�� ���� ������ ����
 *           ������ġ            ������                            �޸� �Ҵ����                �޸� �Ҵ���ġ
 *Ŭ���� ����  : Ŭ���� ����        static int num; 		Ŭ���� ���� �ε��		Ŭ��������
 *          ��üȭ�� ���þ���. ��� ��ü�� ���뺯���� ����.
 *          Ŭ������.������  ȣ���
 *          �⺻������ �ʱ�ȭ ��
 * �ν��Ͻ� ���� : Ŭ���� ����      int num;				��üȭ��			������
 *           �ݵ�� ��üȭ �Ǿ�� ��. 
 *           ����������.������ ȭ���
 *           �⺻������ �ʱ�ȭ ��
 *           �⺻�� : �����ڷ��� : null.
 *           		������ : 0
 *           		���� : false
 * ���� ���� : �޼��� ����           int num;				���� �����		���ÿ���
 * 			�޼��� ���ο����� ��밡����.
 * 			�ݵ�� �ʱ�ȭ �Ǿ�� ��.
 * 			�Ű������� ����������.
 * 
 */

class Car {
	String color; //�ν��Ͻ����� , ��ü����
	int number; //�ν��Ͻ�����
	static int width = 200; //Ŭ��������
	static int height = 120; //Ŭ��������

	public String toString() {
		return color + ":" + number + "(" + width + "," + height + ")";
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		System.out.println("�ڵ����� ũ�� : " + Car.width + "," + Car.height);
		Car car1 = new Car();//��üȭ, �ν��Ͻ� �������� �޸��� �������� �Ҵ��
		System.out.println(car1);
		car1.color = "White";
		car1.number = 1234;
		//���������� ȭ����½� �ڵ����� toString() �޼��� ȣ���
		//toString() : ��ü�� ���ڿ��� ��ȯ��Ű�� �޼���
		System.out.println("car1 : " + car1);  //car1 => car1.toString()
		Car car2 = new Car(); //��üȭ
		car2.color = "Black";
		car2.number = 2345;
		System.out.println("car2 : " + car2);
		Car.width = 300; //Ŭ�������� ȣ��� Ŭ������.���������� ȣ����
		car1.height = 200;//����������.Ŭ���������� ���� ���޼���ǥ��
		System.out.println("car1 : " + car1);
		System.out.println("car2 : " + car2);
	}

}
