package chap12;
/*
 * 동기화 영역 : synchronized 예약어 사용함
 * 	   동기화 블럭 예제
 * 	   동기화메서드 : Thread safe한 메서드
 */
class PrintThread2 extends Thread{
	char ch;
	PrintThread2(char ch){
		this.ch=ch;
	}
	//lock 객체는 모든 스레드가 공유하는 객체여야 함. 
	//lock 객체는 객체여야함. => 기본형은 사용 불가
	static Object Lock = new Object();
//	static String Lock = new String("a");  //가능
//	static int Lock = 0;  //error
//	static Integer Lock = 0;   //가능
	@Override
	public void run() {
		for(int i =0;i<20;i++) {
			synchronized(Lock) {  //동기화영역(동기화블럭)
				for(int j =0;j<80;j++) { 
					System.out.print(ch);
				}
				System.out.println();
			}
		}
	}
}
public class ThreadEx5 {
	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A');
		PrintThread2 t2 = new PrintThread2('B');
		PrintThread2 t3 = new PrintThread2('C');
		t1.start();
		t2.start();
		t3.start();
	}
}
