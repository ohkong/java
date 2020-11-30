package chap11;
/*
 * 문자열 1,234를 정수로 변경하여 *10 한 값을 세자리 마다 , 찍어 출력하기
 * 12,340
 */
public class Exam6 {
	public static void main(String[] args) {
		String str = "1,234";
		int i = Integer.parseInt(str.replace(",",""));
		System.out.println(String.format("%,d", i*10));
		System.out.printf("%,d\n", i*10);
		
	}
}
