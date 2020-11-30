package chap12;

class JoinThread2 extends Thread{
	int a,b;
	JoinThread2(int a,int b){
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
public class test2 {
	public static void main(String[] args) {
		System.out.println("스레드를 이용하여 1000까지의 합 구하기");
		JoinThread2 t1 = new JoinThread2(1,200);
		JoinThread2 t2 = new JoinThread2(201,400);
		JoinThread2 t3 = new JoinThread2(401,600);
		JoinThread2 t4 = new JoinThread2(601,800);
		JoinThread2 t5 = new JoinThread2(801,1000);
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
		System.out.println("결과:"+JoinThread2.tsum);
	}

}
