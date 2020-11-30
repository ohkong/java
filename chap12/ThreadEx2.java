package chap12;
/*
 * Runnable �������̽��� �̿��� ������ ��ü ����
 */
class Runnable1 implements Runnable{
	@Override
	public void run() { //Runnable �������̽��� �߻�޼���
		for(int i =1;i<=5;i++) {
			System.out.println(i+"="+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		//Thread.currentThread() : ���� ���� ���� ������ ��ü
		System.out.println(Thread.currentThread().getName() + "������ ����");
		Runnable1 r = new Runnable1();
		//t1 �����尡 �����ؾ��� run() �޼���� r��ü�� run() ������.
		Thread t1 = new Thread(r,"First"); // new����
		Thread t2 = new Thread(r,"Second");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + "������ ����");
	}
}
