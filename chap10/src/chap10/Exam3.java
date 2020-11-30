package chap10;
/*
 * UnsupportFunctionException Ŭ���� �����ϱ�
 * 1. ������� : private final int ERR_CODE;
 * 2. ����޼��� :
 * 		public int getErrCode() : ERR_CODE �� ��ȯ
 * 		public String getMessage() : �������̵� �޼���.
 * 			�θ� Ŭ������ message ���� ERR_CODE �� ��ȯ
 * 3. ����ó���� ���ص� �ǵ��� ����  //RuntimeException
 * 4. �����ڴ� ����Ŭ������ ȣ�⿡ �µ��� ����
 */
class UnsupportFunctionException extends RuntimeException{
	private final int ERR_CODE;
	UnsupportFunctionException(String msg, int code){
		super(msg);
		ERR_CODE= code; //����� �����ڿ��� ��ü���� �ѹ��� �ʱ�ȭ ����
	}
	public int getErrCode() {
		return ERR_CODE; 
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "," + ERR_CODE;
	}
}
public class Exam3 {

	public static void main(String[] args) {
		try {
			throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.",200);
		}catch (UnsupportFunctionException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getErrCode());
		}
	}

}
