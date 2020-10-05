package chap6;
class Value{
	int val;
}
public class ParameterEx1 {

	public static void main(String[] args) {
		Value v= new Value();
		v.val=100;
		change1(v.val);
		System.out.println("change1() 이후 : " + v.val);
		change2(v);
		System.out.println("change2() 이후 : " + v.val);
	}
	private static void change1(int val) {
		val +=100;
		System.out.println("change1() 메서드 : " + val);
	}
	private static void change2(Value v) {
		v.val +=100;
		System.out.println("change2() 메서드 : " + v.val);
	}

}
