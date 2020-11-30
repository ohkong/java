package chap14;
/*
 * Runnable �������̽��� �̿��Ͽ� ������ �����ϱ�
 * void run(){...}
 */
public class LambdaEx2 {
	public static void main(String[] args) {
		System.out.println("main ����");
		Runnable r = ()-> {
			int sum = 0;
			for(int i=1;i<=100;i++) sum+=i;
			System.out.println("1~100������ �� : "+sum);
		};
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(()->{
		int sum = 0;
		for(int i=1;i<=100;i++) sum+=i;
		System.out.println("1~100������ �� : "+sum);
	});
		t1.start();t2.start();
		System.out.println("main ����");
	}
}
