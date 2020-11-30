package chap12;
class ATM implements Runnable{
	private int money = 100000;
	public void run() {
		try {
			Thread.sleep((int)(Math.random()*1000));
		}catch(InterruptedException e) {}
		synchronized(this) {
			while(true) {
				if(money<=0)break;
				withdraw();
			}
		}
	}
	private void withdraw() {
		if(money<=0)return;
		money-=10000;
		System.out.println(Thread.currentThread().getName()+"Ãâ±Ý, ÀÜ¾×:"+money);
	}
}
public class ThreadEx10 {
	public	static void main(String[] args) {
		ATM atm = new ATM();
		Thread mother = new Thread(atm,"Mother");
		Thread son = new Thread(atm,"SON");
		mother.start();
		son.start();
	}
}
