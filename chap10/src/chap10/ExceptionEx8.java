package chap10;

/*
 * ���� ��߻���Ű�� : ���ܰ� �߻��� �޼��忡�� ���� ó�� �� 
 * 				ȣ���� �޼��忡 �߻��� ���ܸ� ������ �� �ִ�.
 */
public class ExceptionEx8 {

	public static void main(String[] args) {
		try {
			badmethod();
		} catch (Exception e) {
			System.out.println("main :"+e.getMessage());
		}
	}

	private static void badmethod() throws Exception {
		try {
			throw new Exception("���� ���� �߻�");
		} catch (Exception e) {
			System.out.println("badmethod :" + e.getMessage());
			throw e; //���� ��߻�
		}
	}
}
