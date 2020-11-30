package chap11;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		// s 문자열에서 4번인덱스(5번째)문자를 리턴
		System.out.println(s.charAt(4)); //E
		//'A' - 'a' = -32리턴. 정렬시 사용되는 메서드
		System.out.println(s.compareTo("abc"));//-32
		// IgnoreCase :  대소문자 상관없이
		System.out.println(s.compareToIgnoreCase("abcdefgh"));
		//s+"abc" 의미
		System.out.println(s.concat("abc"));
		//s문자열의 끝이 GH?
		System.out.println(s.endsWith("GH"));//true
		//s문자열의 시작이 ABC?
		System.out.println(s.startsWith("ABC"));//true
		System.out.println(s.equals("ABCDEFGH"));//true
		System.out.println(s.equalsIgnoreCase("abcdEFGH"));//true
		
		s = new String("This is a String");
		//indexOf(문자) : 문자의 위치 인데스값 리턴
		System.out.println(s.indexOf('i')); //2
		//indexOf(문자,인덱스) : 인덱스 부터 문자의 위치 인덱스값 리턴
		System.out.println(s.indexOf('i',15)); //-1 없는경우
		//indexOf(문자열) : 문자의 위치 인데스값 리턴
		System.out.println(s.indexOf("is"));
		//lastindexOf(문자열) : is 문자열 뒤 쪽부터 검색하기
		System.out.println(s.lastIndexOf("is"));//5
		//length() : 문자열의 길이
		System.out.println(s.length());//16
		//replace(원본문자열,변경문자열)
		System.out.println(s.replace("is","QR"));
		//부분문자열 : substring  5번인덱스 이후의 문자열 리턴
		System.out.println(s.substring(5));
		//5번인덱스부터 13번인덱스 앞까지의 문자열 리턴
		System.out.println(s.substring(5,13)); //5~12
		//소문자로 변경
		System.out.println(s.toLowerCase());
		//대문자로 변경
		System.out.println(s.toUpperCase());
		//양쪽 공백 제거 : trim()
		System.out.println("    문자열  trim메서드    ".trim());
		System.out.println("    문자열  trim메서드    ");
		//문자열 분리 : split()
		String[] sarr = "홍길동,이몽룡,김삿갓".split(",");
		for(String ss : sarr)System.out.println(ss);
		
	}
}
