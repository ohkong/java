package chap7;
/*
 * ������ ����
 * 
 * �ڼ�Ÿ���� ��ü�� �θ�Ÿ���� ���������� ������ �����ϴ�.
 * �θ�Ÿ���� ���������� �ڼ� ��ü ������, �θ�Ÿ���� ����鸸 ������ �����ϴ�.
 * ���Ŭ������ ��ü�� Object Ÿ���� ���������� ������ �����ϴ�.
 * �� Object Ŭ������ ����� ������ �����ϴ�.
 */
class Bike2{
	int wheel;
	Bike2(int wheel){
		this.wheel=wheel;
	}
	void drive() {
		System.out.println("�д��� ��´�");
	}
	void stop() {
		System.out.println("�극��ũ�� ��´�");
	}
}
class AutoBike2 extends Bike2{
	boolean power;
	AutoBike2(int wheel){
		super(wheel);
	}
	void power() {
		power =!power;
		if(power)System.out.println("������ �������ϴ�");
		else System.out.println("������ �������ϴ�");
	}
}
public class BikeEx2 {

	public static void main(String[] args) {
		AutoBike2 ab = new AutoBike2(2);
		Bike2 b;
		ab.power();
		ab.drive();
		System.out.println("����" + ab.wheel + "���� ��������.");
		ab.stop();
		b = ab;
	//	b.power();	//power() �޼���� Bike2 Ŭ������ ����� �ƴϹǷ� Bike2 �� ���������� ȣ�� �Ұ�
		Object obj =b;
	//	obj.wheel =4; //wheel ��������� Object Ŭ������ ����� �ƴϹǷ�, Object �� ���������� ���Ұ�
		
	}

}
