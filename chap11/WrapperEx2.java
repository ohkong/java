package chap11;
/*
 * Character Ŭ����
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		char[] data = {'A','a','1','&','��'};
		for(char c :data) {
			if(Character.isUpperCase(c))
				System.out.println(c+" :�빮���Դϴ�.");
			else if (Character.isLowerCase(c))
				System.out.println(c+" :�ҹ����Դϴ�.");
			else if(Character.isDigit(c))
				System.out.println(c+" :�����Դϴ�.");
			else 
				System.out.println(c + ":�Ϲݹ����Դϴ�.");
			if (Character.isAlphabetic(c))
				System.out.println("�����Դϴ�.");
			else
				System.out.println("���ڰ��ƴմϴ�.");
		}
	}
}
