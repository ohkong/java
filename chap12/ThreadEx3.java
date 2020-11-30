package chap12;
/*
 * Thread �켱���� : �����ٷ����� ���� ������ ������ �ֵ��� �켱���� ����������.
 * 	�켱������ ���ٰ� ������ ���� ���õǴ� ���� �ƴ�. �ٸ� Ȯ���� ����
 * 	1  : ���� ���� �켱����
 * 	~5 : �⺻ �켱����
 * 	10 : ���� ���� �켱����
 */
class ThreadPriority extends Thread{
	ThreadPriority(String name){
		this(name,Thread.NORM_PRIORITY);
	}
	ThreadPriority(String name,int p){
		super(name); //�������� �̸� ����
		this.setPriority(p);//�켱 ���� ����
	}
	@Override
	public void run() {
		try {
			sleep(20);
		}catch(InterruptedException e) {}
		for(int i =0;i<5;i++) {
			System.out.println(this.toString());
			/*
			 *   Thread[First,1,main] : ThreadŬ������ toString() ȣ��
			 *   		First : ������ �̸�
			 *   		1 	  : �켱����
			 *   		main  : ������ �׷�
			 */
		}
	}
}
public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println("���� �켱����:" + Thread.MAX_PRIORITY);
		System.out.println("�⺻ �켱����:" + Thread.NORM_PRIORITY);
		System.out.println("���� �켱����:" + Thread.MIN_PRIORITY);
		Thread t1 = new ThreadPriority("First",1); //���� �켱���� ������
		Thread t2 = new ThreadPriority("Second"); //�O�� �켱���� ������
		Thread t3 = new ThreadPriority("Third",10);//���� �켱���� ������
		t1.start();
		t2.start();
		t3.start();
		System.out.println("main ����");
	}
}