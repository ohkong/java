package chap10;

import java.util.Scanner;

/*
 * ������ ���� �����
 */
class LoginFailException extends Exception {
	LoginFailException(String msg) {
		super(msg);
	}
}

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			String id = "hong";
			String pw = "1234";
			Scanner scan = new Scanner(System.in);
			System.out.println("���̵� �Է��ϼ���");
			String inputId = scan.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String inputPw = scan.nextLine();
			if (id.equals(inputId) && pw.equals(inputPw)) {
				System.out.println("�α��� ����");
			} else if (!id.equals(inputId)) {
				throw new LoginFailException("���̵� Ʋ���ϴ�");
			} else {
				throw new LoginFailException("��й�ȣ�� Ʋ���ϴ�");
			}
		} catch (LoginFailException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
