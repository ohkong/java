package chap12;
/*
 * join() �޼��� : �����尡 �����Ҷ� ���� ���
 */
class JoinThread extends Thread{
	long sum = 0;
	public void run() {
		for(int i=1;i<=100;i++) sum +=i;
	}
}
public class ThreadEx7 {
	public static void main(String[] args) {
		System.out.println("�����带 �̿��Ͽ� 100������ �� ���ϱ�");
		JoinThread t1 = new JoinThread();
		t1.start();
		try {
			t1.join();//t1 �����尡 ����ñ��� main �޼��尡 ���
		}catch(InterruptedException e) {}
		System.out.println("���:"+t1.sum);
	}
}
