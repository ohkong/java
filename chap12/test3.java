package chap12;
class JoinRunnable implements Runnable{
	int a,b;
	
	JoinRunnable(int a,int b){
		this.a=a;
		this.b=b;
	}
	long sum = 0;
	static long tsum=0;
	public void run() {
		for(int i=a;i<=b;i++) sum +=i;
		tsum+=sum;
	}
}
public class test3 {

	public static void main(String[] args) {
		System.out.println("스레드를 이용하여 1000까지의 합 구하기");
		Thread t1 = new Thread(new JoinRunnable(1,200));
		Thread t2 = new Thread(new JoinRunnable(201,400));
		Thread t3 = new Thread(new JoinRunnable(401,600));
		Thread t4 = new Thread(new JoinRunnable(601,800));
		Thread t5 = new Thread(new JoinRunnable(801,1000));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch(InterruptedException e) {}
		System.out.println("결과:"+JoinRunnable.tsum);
	}
}
