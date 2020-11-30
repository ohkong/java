package chap11;
/*
 *  hashcode : 원래의미는 JVM이 객체를 구별하기 위한 참조값
 *  		       내용이 같은 경우 같은 hashcode값을 가지도록 오버라이딩함(권장사항)
 *  내용비교를 위하여 equals 메서드를 오버라이딩 하는경우
 *  hashcode 메서드도 함께 오버라이딩하는것을 권장함
 *  => 논리적 동등성 비교에 사용됨(Collection 프레임워크에서 다시 다룸)
 */
public class HashcodeEx1 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");
		if(s1==s2)System.out.println("s1과s2는 같은 객체임");
		else System.out.println("s1과s2는 다른 객체임");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("s1 객체의 원래 hashcode 값 : "+System.identityHashCode(s1));
		System.out.println("s2 객체의 원래 hashcode 값 : "+System.identityHashCode(s2));
	}
}
