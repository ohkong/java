package chap5;
/*
 * �迭�� 1���� 10������ ������ ���� 10�� �����ϱ�
 * �迭�� ����� ����ŭ * ����ϱ�
 * int arr[] = new int[10];
 * arr[0] = 1~10 �����Ǽ�
 * ...
 * arr = {2,3,6,8,...}
 * 2: **
 * 3: ***
 * 8: ********
 * 
 * 1.�迭�� 10�� 1 ~10���� �����Ǽ��� ����
 * 2.�迭�� ����� ����ŭ *�� ����ϱ�
 * 
 */
public class Exam4 {

	public static void main(String[] args) {
		//ó�� §��
//		int arr[] = new int [10];
//		for(int i=0;i<10;i++ ) {
//			arr[i]=(int) (Math.random()*10+1);
//		}
//		for(int i=0;i<10;i++) {
//			System.out.print(arr[i] + " : ");
//			for(int j=0;j<arr[i];j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		//�ι�° ����
		int arr[] = new int [10];
		for(int i=0;i<10;i++ ) {
			arr[i]=(int) (Math.random()*10+1);
			System.out.print(arr[i] + " : ");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	

	}

}
