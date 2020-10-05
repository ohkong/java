package chap5;

/*
 * command 라인에 문자열을 입력였을때
 * 숫자로만 이루어진 문자열의 각 자리수 합을 출력하기
 * 숫자가 아닌 다른문자가 섞여있을시 문자열 제외
 */
public class Exam5 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Command 라인에 파라미터를 입력하세요");
			System.out.println("java chap5. Exam5 123 456");
			return; // 메서드를 종료
		}
		int sum = 0;
		for (int a = 0; a < args.length; a++) {
			// 숫자로 이루어진 문자열 검증
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
