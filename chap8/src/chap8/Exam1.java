package chap8;
abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat();
}
interface Flyable{
	void fly();
}
class Dove extends Animal implements Flyable{
	Dove(){
		super("��ѱ�");
	}
	@Override
	public void fly() {
		System.out.println("��ѱ�� ���ƴٴѴ�.");
	}
	@Override
	void eat() {
		System.out.println("��ѱ�� ���� ������ ��� �Դ´�.");
	}
}
class Monkey extends Animal{
	Monkey(){
		super("������");
	}
	@Override
	void eat() {
		System.out.println("�����̴� �������� ���Ÿ� ���Դ´�.");
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat(); // ��ѱ�� ���� ������ ��� �Դ´�.
		if(a instanceof Flyable) {
			((Flyable)a).fly();  //��ѱ�� ���ƴٴѴ�
		}
		a = new Monkey();
		a.eat(); //�����̴� �������� ���Ÿ� ���Դ´�.
		if(a instanceof Flyable) {
			((Flyable)a).fly();  //���� �ȵ�.
		}
	}

}
