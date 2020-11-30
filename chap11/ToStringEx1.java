package chap11;
/*
 * Object 클래스 : toString() => 객체의 문자열 변환
 *  => 참조변수값을 출력하면 자동으로 호출되는 메서드
 *  => 클래스명@16진수해쉬코드 리턴.
 *  => 객체의 내용을 출력하기 위해서는 오버라이딩 필요
 */
class ToString {
	int value;
	ToString(int v){
		this.value=v;
	}
	@Override
	public String toString() {
		return "value="+value;
	}
}
public class ToStringEx1 {
	public static void main(String[] args) {
		ToString t1 = new ToString(10);
		ToString t2 = new ToString(20);
		System.out.println(t1);
		System.out.println(t2);
	}
}
