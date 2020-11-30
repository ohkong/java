package chap12;
/*
 *  생상자 스레드, 소비자 스레드 예제
 * 
 * 엄마와 아들은 하나의 계좌를 공유한다.
 * 계좌에 잔액이 0이면 아들은 wait() 상태로 변경.
 * 계좌에 잔액이 있는 경우 엄마는 wait() 상태로 변경
 * 엄마는 잔액이 0원인 경우 10000,20000,30000원 중 금액을 계좌에 입금한다.
 * 잔액이 0원인 경우 엄마는 돈을 입금하고 아들을 깨운다.
 * 잔액이 있는 경우 아들은 돈을 0원으로 만들고 엄마를 깨운다.
 * 엄마 0~3000동안 sleep
 * 아들 0~1000동안 sleep
 */
class Account {
	int money;
	//동기화 메서드 output,input
	synchronized void output() { //출금
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 출금");
		money = 0;
	}
	
	synchronized void input() { //입금
		while (money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		money = ((int) (Math.random() * 3) + 1) * 10000;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 입금");
	}
}

class Mother extends Thread {
	Account account;
	Mother(Account account) {
		super("엄마스레드");
		this.account = account;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.input();
			try {
				sleep((int) (Math.random() * 3000));
			} catch (InterruptedException e) {}
		}
	}
}

class Son extends Thread {
	Account account;
	Son(Account account) {
		super("아들스레드");
		this.account = account;
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			account.output();
			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {}
		}
	}
}
public class ThreadEx12 {
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account();
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		m.start();
		s.start();
		m.join();
		s.join();
		System.out.println("계좌 잔액:" + acc.money);
	}
}