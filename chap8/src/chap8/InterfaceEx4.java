package chap8;
/*
 * �������̽��� ��ü �����ϱ�
 */
interface Action{
	void action();
}
abstract class Abs{
	abstract void method();
}
public class InterfaceEx4 {

	public static void main(String[] args) {
		//�̸����� ���� Ŭ���� => ��ȸ�� ��ü�� �����ǰ� ����.
		Action a = new Action(){
			@Override
			public void action() {
				System.out.println("Action �������̽���ü");
			}
		};
		a.action();
		
		a = new Action() {
			@Override
			public void action() {
				System.out.println("Action �������̽���ü 2");
			}
		};
		a.action();
		
		Abs a1=new Abs() {
			@Override
			void method() {
				System.out.println("Abs �߻�Ŭ������ü");
			}
		};
		a1.method();
		//���� ������� �����ϱ� => �������̽��� ����. jdk8 ����
		a = ()->System.out.println("Action �������̽� ��ü�� ���ٷ� ����");
		a.action();
	}

}
