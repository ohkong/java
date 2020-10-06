package chap8;
/* 
 * �������̽� ����
 * 
 * �������̽�
 * 1.�������̽��� ����� ���, �߻�޼���, default�޼���, static�޼��常 ������. 
 * 		�������̽��� ��� ����� public �����.
 * 		��� : (public static final)�ڷ��� �����;
 * 			   int NUM = 100; (o)
 * 			   static int NUM = 100; (o)
 * 			   final int NUM = 100; (o)
 * 			   protected int NUM = 100; (x)
 * 		�߻�޼��� : (public abstract) ����Ÿ�� �޼����(�Ű�����);
 * 				int getA(); (o)
 * 				abstract int getA(); (o)
 * 		default �޼��� : jdk8 ���� �������� ��밡��. ������ ����
 * 				public default ����Ÿ�� �޼����(�Ű�����) {...}
 *		static �޼��� : jdk8 ���� �������� ��밡��. ������ ����
 *				public static ����Ÿ�� �޼����(�Ű�����) {...}
 * 2. ��üȭ �Ұ� => ����Ŭ������ ��üȭ�� ���ؼ� ��üȭ ����
 * 3. Ŭ������ �������̽����� �������� ǥ���Ѵ�. implements ����� ���.
 * 	  => ���� ������ ������. 
 * 4. �������̽����� ����� ������. => ���� ����� ������.
 */
interface Printerable {
//	(public static final) int INK = 100;
	int INK = 100; //���
	// (public abstract) print();
	void print(); //�߻�޼���
}
interface Scannerable{
	void scan();
}
interface Faxable{
	String FAX_NO = "02-1234-5678";
	void send(String tel);
	void receive(String tel);
}
interface Complexerable
	extends Printerable,Scannerable,Faxable{}
//����Ŭ���� : �������̽��� ������ Ŭ����
class Complexer implements Complexerable{
	int ink;
	Complexer(){
		this.ink =INK;
	}
	@Override
	public void print() {
		System.out.println("���̿� ����մϴ�. ���� ��ũ�� " + --ink);
	}
	@Override
	public void scan() {
		System.out.println("�̹����� ��ĵ�Ͽ� ���Ͽ� �����մϴ�.");
	}
	@Override
	public void send(String tel) {
		System.out.println(FAX_NO + "����"+ tel + "��ȣ�� FAX�� �����մϴ�.");
	}
	@Override
	public void receive(String tel) {
		System.out.println(tel + "����"+ FAX_NO + "�� FAX�� �޾ҽ��ϴ�.");
	}
}
public class InterfaceEx1 {
	public static void main(String[] args) {
		Complexer com = new Complexer();
		System.out.println("�⺻��ũ�� : "+ Printerable.INK);
		System.out.println("�⺻��ũ�� : "+ Complexerable.INK);
		System.out.println("�⺻��ũ�� : "+ Complexer.INK);
		System.out.println("FAX ��ȣ : "+ Faxable.FAX_NO);
		System.out.println("FAX ��ȣ : "+ Complexerable.FAX_NO);
		System.out.println("FAX ��ȣ : "+ Complexer.FAX_NO);
		com.print();
		com.scan();
		com.receive("02-5678-1234");
		com.send("02-5678-1234");
		if(com instanceof Complexer) {
			System.out.println("com ��ü�� Complexer ��ü��");
		}
		if(com instanceof Complexerable) {
			System.out.println("com ��ü�� Complexerable ��ü��");
		}
		if(com instanceof Printerable) {
			System.out.println("com ��ü�� Printerable ��ü��");
			Printerable p =com;
			System.out.println(p.INK);
			p.print();
		}
		if(com instanceof Scannerable) {
			System.out.println("com ��ü�� Scannerable ��ü��");
			Scannerable s = com;
			s.scan();
		}
		if(com instanceof Faxable) {
			System.out.println("com ��ü�� Faxable ��ü��");
			Faxable f = com;
			System.out.println(f.FAX_NO);
			f.send("02-111");
			f.receive("02-222");
		}
	}

}
