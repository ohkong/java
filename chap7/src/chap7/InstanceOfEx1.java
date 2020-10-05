package chap7;

//instanceOf : 객체와 참조변수의 관계를 알려줌
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent3 p = new Child3();
		if(p instanceof Child3) {
			System.out.println("p 참조변수 객체는 Child3 객체다");
			Child3 c= (Child3)p;
			System.out.println(c.x);
		}
		if(p instanceof Parent3) {
			System.out.println("p 참조변수 객체는 Parent3 객체다");
		}
		if(p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o= (Object)p;
			//System.out.println(o.x);
		}
	}

}
