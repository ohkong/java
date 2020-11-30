package chap11;
/*
 * StringBuffer 클래스 : 동적 문자열
 * 	  equals 메서드가 오버라이딩 되어 있지 않음
 * 	   내용 비교를 위해서는 문자열로 변경하여 비교해야 함.
 */
public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		if(sb1==sb2) System.out.println("sb1과 sb2는 같은 객체임");
		else System.out.println("sb1과 sb2는 다른 객체임");
		if(sb1.equals(sb2)) System.out.println("sb1과 sb2는 같은 내용의 객체임");
		else System.out.println("sb1과 sb2는 다른 내용의 객체임");
	}

}
