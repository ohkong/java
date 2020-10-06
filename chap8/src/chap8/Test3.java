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
		super("강아지",4);
	}
	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다.");
	}
	@Override
	void sound() {
		System.out.println("멍멍짖는다.");
	}
}
class Lion extends Animal2{
	Lion(){
		super("사자",4);
	}
	@Override
	void eat() {
		System.out.println("초식동물을 잡아 먹는다.");
	}
	@Override
	void sound() {
		System.out.println("어흥거린다.");
	}
}
class Eagle extends Animal2 implements Flyable2{
	Eagle(){
		super("독수리",4);
	}
	@Override
	void eat() {
		System.out.println("동물을 잡아 먹는다.");
	}
	@Override
	void sound() {
		System.out.println("모른다.");
	}
	@Override
	public void fly() {
		System.out.println("독수리는 날아 다닌다.");
	}
}

public class Test3 {

	public static void main(String[] args) {
		Animal2[] animal = new Animal2[3];
	    animal[0] = new Dog();
	    animal[1] = new Lion();
	    animal[2] = new Eagle();
	    for (Animal2 a : animal) {
	         System.out.print(a.type + ",다리수:" + a.leg + "개 =>");
	         a.sound();
	         a.eat();
	         if(a instanceof Flyable2) {
	             ((Flyable2) a).fly();
	        }
	    }
	}
}
