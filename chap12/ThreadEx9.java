package chap12;
/*
 * InterruptedExceeption ���ܹ��
 * �����忡�� ���Ǵ� �ֿ� �޼���
 * 1.start() : ����ȭ ���, run()�޼��� ȣ��
 * 				new����  => Runnable(���డ��)����
 * 2.run() : �����尡 �����ϴ� �޼���. �������̵� �ؾ���
 * 3.setPriority(1~10) : �켱���� ����
 * 4.sleep(�и���) : �и��� ���� ������
 * 5.join() : �����尡 �����Ҷ����� ���
 * 6.setDaemon(boolean) : ���󽺷ε�� ����
 * 						  new ���¿����� �����.
 * 7.interrupt() : InterruptedException �߻�
 * 8.yield() : ���� ���� �����带 ���డ�� ���·� ����
 * 9.stop() : ������ ���� ����. ������� �ʵ��� �ǰ�  
 * 
 * ����ȭ ���� : synchronized
 * 	  ����ȭ�� : lock ����. ������ü�� lock ����
 * 	  ����ȭ�޼��� : ������ü�� �޼��忩����.
 */
class InterruptThread extends Thread{
	public void run() {
		System.out.println("�ڰ��ֽ��ϴ� �ƿ���������");
		try{
			sleep(10000000);
		}catch(InterruptedException e) {
			System.out.println("���� �ƿ���?");
			e.printStackTrace();
		}
}
}
public class ThreadEx9 {
	public static void main(String[] args) throws InterruptedException {
		InterruptThread t1 = new InterruptThread();
		t1.start();
		Thread.sleep(2000);
		t1.interrupt(); //t1 �������� InterruptedException �߻�
	}
}
