
package chap11;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2, 4); //2번부터 4번 전까지 지움
		System.out.println(sb);
		sb.deleteCharAt(4); //4번을 지움
		System.out.println(sb);
		sb.insert(5, "=="); //5번에 == 넣음
		System.out.println(sb);
		sb.insert(6, 1.23);
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0,3,"abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
