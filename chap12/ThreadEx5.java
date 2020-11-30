package chap12;
/*
 * ����ȭ ���� : synchronized ����� �����
 * 	   ����ȭ �� ����
 * 	   ����ȭ�޼��� : Thread safe�� �޼���
 */
class PrintThread2 extends Thread{
	char ch;
	PrintThread2(char ch){
		this.ch=ch;
	}
	//lock ��ü�� ��� �����尡 �����ϴ� ��ü���� ��. 
	//lock ��ü�� ��ü������. => �⺻���� ��� �Ұ�
	static Object Lock = new Object();
//	static String Lock = new String("a");  //����
//	static int Lock = 0;  //error
//	static Integer Lock = 0;   //����
	@Override
	public void run() {
		for(int i =0;i<20;i++) {
			synchronized(Lock) {  //����ȭ����(����ȭ��)
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
