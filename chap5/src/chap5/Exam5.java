package chap5;

/*
 * command ���ο� ���ڿ��� �Է¿�����
 * ���ڷθ� �̷���� ���ڿ��� �� �ڸ��� ���� ����ϱ�
 * ���ڰ� �ƴ� �ٸ����ڰ� ���������� ���ڿ� ����
 */
public class Exam5 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Command ���ο� �Ķ���͸� �Է��ϼ���");
			System.out.println("java chap5. Exam5 123 456");
			return; // �޼��带 ����
		}
		int sum = 0;
		for (int a = 0; a < args.length; a++) {
			// ���ڷ� �̷���� ���ڿ� ����
			boolean b = true;
			for (int i = 0; i < args[a].length(); i++) {
				if (args[a].charAt(i) < '0' || args[a].charAt(i) > '9') {
					b = false;
					break;
				}
			}
			if (b) {
				for (int i = 0; i < args[a].length(); i++) {
					System.out.print(
							args[a].charAt(i) + ((a == args.length - 1 && i == args[a].length() - 1) ? "=" : "+"));
					sum += args[a].charAt(i) - '0';
				}
			}

		}
		System.out.println(sum);
	}
}
