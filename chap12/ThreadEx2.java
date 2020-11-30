package chap12;
/*
 * Runnable 인터페이스를 이용한 스레드 객체 생성
 */
class Runnable1 implements Runnable{
	@Override
	public void run() { //Runnable 인터페이스의 추상메서드
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
		//Thread.currentThread() : 현재 실행 중인 스레드 객체
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		Runnable1 r = new Runnable1();
		//t1 스레드가 실행해야할 run() 메서드는 r객체의 run() 실행함.
		Thread t1 = new Thread(r,"First"); // new상태
		Thread t2 = new Thread(r,"Second");
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}
}
