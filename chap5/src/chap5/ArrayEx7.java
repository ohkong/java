package chap5;
/*
 * ���� �迭  : ������ �迭������ ������.
 *         ù��° �迭�� ������ �ݵ�� �����ؾ���.
 */
public class ArrayEx7 {

	public static void main(String[] args) {
		int arr[][] = new int[3][];// �����迭�� ����� �ʱ�ȭ
		arr[0] = new int[] {10,20};
		arr[1] = new int[] {30,40,50};
		arr[2] = new int[] {60};
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("arr[%d][%d]=%3d\t",i,j,arr[i][j]);
			}
			System.out.println();
		}
	}

}
