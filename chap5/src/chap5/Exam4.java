package chap5;
/*
 * 배열에 1부터 10까지의 임의의 수를 10개 저장하기
 * 배열에 저장된 수만큼 * 출력하기
 * int arr[] = new int[10];
 * arr[0] = 1~10 임의의수
 * ...
 * arr = {2,3,6,8,...}
 * 2: **
 * 3: ***
 * 8: ********
 * 
 * 1.배열에 10의 1 ~10까지 임의의수를 저장
 * 2.배열에 저장된 수만큼 *를 출력하기
 * 
 */
public class Exam4 {

	public static void main(String[] args) {
		//처음 짠것
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

		//두번째 수정
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
