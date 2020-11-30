package chap12;
/*
 * ThreadEx5.java 소스를  Runnable 구현 방식으로 수정
 */
class PrintRunnable2 implements Runnable{
	char ch;
	PrintRunnable2(char ch){
		this.ch=ch;
	}
	static Object Lock = new Object();
	@Override 
	public void run() {
		for(int i = 0;i<20;i++) {
			synchronized(Lock) {
				for(int j = 0; j <80;j++)System.out.print(ch);
				System.out.println();
			}
		}
	}
}

public class Exam2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new PrintRunnable2('A'));
		Thread t2 = new Thread(new PrintRunnable2('B'));
		Thread t3 = new Thread(new PrintRunnable2('C'));
		t1.start();
		t2.start();
		t3.start();
	}
}
