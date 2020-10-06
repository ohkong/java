package chap10;

/*
 * ���� catch ����
 * 	  -�Ѱ��� try���� ���ŷ��� catch���� ����
 * 	  -�������� ���ܰ� �߻� ������ ��� ���ܺ��� ó�� ����
 * 	  -���� ����Ŭ������ catch ������ �ϴܿ� ��ġ�ؾ� �Ѵ�.
 */
public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.charAt(0));
			System.out.println(Integer.parseInt("abc"));
			System.out.println(10 / 0);
			System.out.println(args[0]);
		} catch (ArithmeticException e) {
			System.out.println("0���� ������ ������");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���");
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���");
		} catch (Exception e) {
			System.out.println("����η� ��ȭ��� : 1234");
			e.printStackTrace();
		}
		System.out.println("���α׷� ����");
	}

}
