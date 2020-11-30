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
		System.out.println("높은 우선순위:" + Thread.MAX_PRIORITY);
		System.out.println("기본 우선순위:" + Thread.NORM_PRIORITY);
		System.out.println("낮은 우선순위:" + Thread.MIN_PRIORITY);
		RunnablePriority r = new RunnablePriority();
		Thread t1 = new Thread(r,"First"); //낮은 우선순위 스레드
		Thread t2 = new Thread(r,"Second"); //즁간 우선순위 스레드
		Thread t3 = new Thread(r,"Third");//높은 우선순위 스레드
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main 종료");
	}
}
