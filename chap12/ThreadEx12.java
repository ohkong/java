package chap12;
/*
 *  ������ ������, �Һ��� ������ ����
 * 
 * ������ �Ƶ��� �ϳ��� ���¸� �����Ѵ�.
 * ���¿� �ܾ��� 0�̸� �Ƶ��� wait() ���·� ����.
 * ���¿� �ܾ��� �ִ� ��� ������ wait() ���·� ����
 * ������ �ܾ��� 0���� ��� 10000,20000,30000�� �� �ݾ��� ���¿� �Ա��Ѵ�.
 * �ܾ��� 0���� ��� ������ ���� �Ա��ϰ� �Ƶ��� �����.
 * �ܾ��� �ִ� ��� �Ƶ��� ���� 0������ ����� ������ �����.
 * ���� 0~3000���� sleep
 * �Ƶ� 0~1000���� sleep
 */
class Account {
	int money;
	//����ȭ �޼��� output,input
	synchronized void output() { //���
		while (money == 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "�� ���");
		money = 0;
	}
	
	synchronized void input() { //�Ա�
		while (money > 0) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		money = ((int) (Math.random() * 3) + 1) * 10000;
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "�� �Ա�");
	}
}

class Mother extends Thread {
	Account account;
	Mother(Account account) {
		super("����������");
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
		super("�Ƶ齺����");
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
		System.out.println("���� �ܾ�:" + acc.money);
	}
}