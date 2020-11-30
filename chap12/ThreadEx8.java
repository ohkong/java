package chap12;
/*
 * ���� ������
 *   1. �Ϲݽ������� ���������� �����. ���ѹݺ�ó����.
 *      �������ݷ��� : ���󽺷���
 *   2. �Ϲݽ����尡 ����Ǹ� ���󽺷��嵵 ����
 *   3. setDaemon(true)
 *      => New ���¿����� ������ ����.
 */
class DaemonThread extends Thread{
	public void run() {
		while(true) {
			System.out.println(this);
			try {
				sleep(100);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx8 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new DaemonThread();
		Thread t2 = new DaemonThread();
		t1.setDaemon(true);t2.setDaemon(true); //���󽺷��� ����
		t1.start();
		t2.start();
		Thread.sleep(2000);
		System.out.println("main ������ ����");
		}
}
