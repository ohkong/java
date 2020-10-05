package chap5;

/*
 * �迭�� �ζ� ��ȣ �����ϱ�
 */
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] balls = new int[45];
		int[] lotto = new int[6];
		// balls 1���� 45������ ���� �����ϱ�
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		// balls �迭�� ������ ����
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

			// ��������
		}
		System.out.println("\nlotto ��ȣ�� �����Ͽ� ����ϱ�");
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
