package chap10;
/*
 * throws ���� : ���� ó��
 */
public class ExceptionEx5 {
	public static void main(String[] args) {
		try {
			first();
		}catch(Exception e) {
			System.out.println("���ڸ� �����մϴ�.");
			e.printStackTrace();
		}
	}

	private static void first() throws RuntimeException{
		System.out.println("first �޼���");
		second();
	}

	private static void second() throws RuntimeException{
		System.out.println("second �޼���");
		System.out.println(Integer.parseInt("abc"));
	}
}
