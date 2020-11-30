package chap12;

class RunnablePriority implements Runnable {
	@Override
	public void run() {
			try {
				Thread.sleep(20);
			}catch(InterruptedException e) {}
			for(int i =1;i<=5;i++) {
				System.out.println(i+"="+Thread.currentThread().getName());
		}
	}
}
public class test1 {
	public static void main(String[] args) {
		System.out.println("���� �켱����:" + Thread.MAX_PRIORITY);
		System.out.println("�⺻ �켱����:" + Thread.NORM_PRIORITY);
		System.out.println("���� �켱����:" + Thread.MIN_PRIORITY);
		RunnablePriority r = new RunnablePriority();
		Thread t1 = new Thread(r,"First"); //���� �켱���� ������
		Thread t2 = new Thread(r,"Second"); //�O�� �켱���� ������
		Thread t3 = new Thread(r,"Third");//���� �켱���� ������
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main ����");
	}
}
