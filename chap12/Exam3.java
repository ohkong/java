package chap12;
/*
 * ThreadEx6.java 소스를  Runnable 구현 방식으로 수정
 */
class PrintRunnable3 implements Runnable{
	Printer ptr;
	char ch;
	PrintRunnable3(Printer ptr,char ch){
		this.ptr=ptr;
		this.ch=ch;
	}
	static Object Lock = new Object();
	public void run() {
		for(int i = 0;i<20;i++) {
			ptr.printChar(ch);
		}
	}
}

public class Exam3 {
	public static void main(String[] args) {
		Printer ptr = new Printer();
//		Thread t1 = new Thread (new PrintRunnable3(ptr,'A'));
//		Thread t2 = new Thread (new PrintRunnable3(ptr,'B'));
//		Thread t3 = new Thread (new PrintRunnable3(ptr,'C'));
		Thread t1 = new Thread (new PrintRunnable3(new Printer(),'A'));
		Thread t2 = new Thread (new PrintRunnable3(new Printer(),'B'));
		Thread t3 = new Thread (new PrintRunnable3(new Printer(),'C'));
		t1.start();
		t2.start();
		t3.start();
	}
}
