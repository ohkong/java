package chap11;
/*
 * delChar�޼��� �����ϱ�
 * StringBuffer delChar(�������ڿ�, �������ڿ�)
 */
public class Exam8 {
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)" , "~!@#$%^&*()")); //12345
		System.out.println(delChar("(1!2@3^4~5)" , "12345")); //(!@^~)
	}
	static StringBuffer delChar(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if(del.indexOf(str.charAt(i))<0) {  //if(!del.contains(str.charAt(i)+""))   �Ѵ� �Ȱ��� ���
				sb.append(str.charAt(i));
			}
		}
		return sb;
	}
}
