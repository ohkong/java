package chap11;
/*
 * 정규식 예제
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
	public static void main(String[] args) {
		/*
		 * c[a-z] : 첫번째 문자가 c이면서,  이후의 문자가 소문자로 이루어진 문자열
		 * c[a-z]* : 첫번째 문자가 c이면서,  이후의 문자가 소문자로 이루어진 문자열
		 * 			* : 0개이상.
		 * c[a-z]+ : 첫번째 문자가 c이면서,  이후의 문자가 소문자로 이루어진 문자열
		 * 			+ : 1개이상.
		 * c[a-z]? : 첫번째 문자가 c이면서,  이후의 문자가 소문자로 이루어진 문자열
		 * 			? : 0,1인경우
		 */
		String[] data = { "bat", "baby", "bonus", "cA", 
				"ca", "co", "c.",
				"car", "combat", "count", "cTT", "data",
				"disk", "c" };
		Pattern p = Pattern.compile("c[a-zA-Z]*");
		for (String s : data) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.print(s + ",");
			}
		}
		System.out.println();
		String names = "홀길동,     김삿갓,이몽룡    , 성춘향    ,   임꺽정";
		String[] arr = names.split(",");
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
