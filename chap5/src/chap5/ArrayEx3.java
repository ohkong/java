package chap5;

/*
 * 배열로 로또 번호 생성하기
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		// balls 1부터 45까지의 값을 저장하기
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		// balls 배열의 내용을 섞기
		for (int i = 0; i < 1000; i++) {
			int f = (int) (Math.random() * 45);
			int t = (int) (Math.random() * 45);
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
			lotto[i] = balls[i];

			// 버블정렬
		}
		System.out.println("\nlotto 번호를 정렬하여 출력하기");
		for (int i = 0; i < lotto.length; i++) {
			boolean change = false;
			for (int j = 0; j < lotto.length - i - 1; j++) {
				if (lotto[j] > lotto[j + 1]) {
					int tmp = lotto[j];
					lotto[j] = lotto[j + 1];
					lotto[j + 1] = tmp;
					change = true;
				}
			}
			if (!change)
				break;
		}
		for (int l : lotto)
			System.out.print(l + " ");
		System.out.println();
	}

}
