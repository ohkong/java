package chap7;
class Parent2{
	int x=10;
}
class Child2 extends Parent2{
	int x= 20;
}
public class Exam1 {

	public static void main(String[] args) {
		Child2 c = new Child2();
		Parent2 p =c;
		System.out.println(c.x); //20
		System.out.println(p.x); //10
		Child2 c2 =(Child2) p;
	}

}
