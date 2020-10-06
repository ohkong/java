package chap8;
interface Flyable2{
	void fly();
}
abstract class Animal2{
	String type;
	int leg;
	Animal2(String type,int leg){
		this.type=type;
		this.leg=leg;
	}
	abstract void eat();
	abstract void sound();
}

class Dog extends Animal2{
	Dog(){
		super("������",4);
	}
	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�.");
	}
	@Override
	void sound() {
		System.out.println("�۸�¢�´�.");
	}
}
class Lion extends Animal2{
	Lion(){
		super("����",4);
	}
	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��� �Դ´�.");
	}
	@Override
	void sound() {
		System.out.println("����Ÿ���.");
	}
}
class Eagle extends Animal2 implements Flyable2{
	Eagle(){
		super("������",4);
	}
	@Override
	void eat() {
		System.out.println("������ ��� �Դ´�.");
	}
	@Override
	void sound() {
		System.out.println("�𸥴�.");
	}
	@Override
	public void fly() {
		System.out.println("�������� ���� �ٴѴ�.");
	}
}

public class Test3 {

	public static void main(String[] args) {
		Animal2[] animal = new Animal2[3];
	    animal[0] = new Dog();
	    animal[1] = new Lion();
	    animal[2] = new Eagle();
	    for (Animal2 a : animal) {
	         System.out.print(a.type + ",�ٸ���:" + a.leg + "�� =>");
	         a.sound();
	         a.eat();
	         if(a instanceof Flyable2) {
	             ((Flyable2) a).fly();
	        }
	    }
	}
}
