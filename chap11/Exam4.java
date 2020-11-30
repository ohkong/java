package chap11;
/*
 * 한곳만 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Exam4 {
	public static void main(String[] args) {
		String str = "base";//basket
		System.out.println(str=str.replace('e', 'k')+"et");
		str+="ball";
		System.out.println(str);
		
	}
}
