package chap12;
/*
 * join() 메서드 : 스레드가 종료할때 까지 대기
 */
class JoinThread extends Thread{
	long sum = 0;
	public void run() {
		for(int i=1;i<=100;i++) sum +=i;
	}
}
public class ThreadEx7 {
	public static void main(String[] args) {
		System.out.println("스레드를 이용하여 100까지의 합 구하기");
		JoinThread t1 = new JoinThread();
		t1.start();
		try {
			t1.join();//t1 스레드가 종료시까지 main 메서드가 대기
		}catch(InterruptedException e) {}
		System.out.println("결과:"+t1.sum);
	}
}
