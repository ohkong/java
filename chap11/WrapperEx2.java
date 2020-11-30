package chap11;
/*
 * Character 클래스
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		char[] data = {'A','a','1','&','가'};
		for(char c :data) {
			if(Character.isUpperCase(c))
				System.out.println(c+" :대문자입니다.");
			else if (Character.isLowerCase(c))
				System.out.println(c+" :소문자입니다.");
			else if(Character.isDigit(c))
				System.out.println(c+" :숫자입니다.");
			else 
				System.out.println(c + ":일반문자입니다.");
			if (Character.isAlphabetic(c))
				System.out.println("문자입니다.");
			else
				System.out.println("문자가아닙니다.");
		}
	}
}
