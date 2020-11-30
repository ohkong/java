package chap13;
class Box2<T>{ //제네릭 클래스
	private T t;
	public T get() {return t;}
	public void set(T t) {
		this.t=t;
	}
}
public class BoxEx2 {
	public static void main(String[] args) {
		Box2<String> b1 = new Box2<String>();
		b1.set("Hello");
		String s= b1.get();
		Box2<Apple> b2 = new Box2<Apple>();
		b2.set(new Apple());
		Apple a= b2.get();
		Box2 b3 = new Box2();
		b3.set("Hello2");
		String obj =(String)b3.get();
	}
}
