package chap14;
/*
 * LambdaInterface3 �������̽��� �̿��Ͽ� ���ٹ������ 
 * �Էµ� ���ڱ����� ���� ����ϴ� ���α׷� �����ϱ�
 */

public class Exam1 {
	public static void main(String[] args) {
		LambdaInterface3 f = (a) -> {
			int sum = 0;
			for(int i = 1;i<=a;i++)sum+=i;
			System.out.println(sum);
		};
		f.method(4); 	//10
		f.method(10);   //55
		f.method(100);  //5050
	}
}
