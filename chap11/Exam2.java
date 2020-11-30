package chap11;

public class Exam2 {
	public static void main(String[] args) {
		String str  = "ABC123";
		System.out.println("main :" + str);
		change(str);
		System.out.println("change ÀÌÈÄ main :" + change(str));

	}

	private static String change(String str) {
		str += "456";
		System.out.println("change :"+str);
		return str;
	}
	
}
